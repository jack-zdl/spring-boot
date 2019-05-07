package com.ceying.chx.rcenter.service.impl;

import com.ceying.chx.rcenter.bean.NotifyTaskBean;
import com.ceying.chx.rcenter.bean.Url;
import com.ceying.chx.rcenter.client.RpcServiceFactory;
import com.ceying.chx.rcenter.config.RpcConfig;
import com.ceying.chx.rcenter.enums.RedisKeyEnums;
import com.ceying.chx.rcenter.redis.HessianRedisTemplate;
import com.ceying.chx.rcenter.regist.RegistService;
import com.ceying.chx.rcenter.service.NotifyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.TaskExecutor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * 需要重新通知的数据的集合
 * @Author：huanghaiyun
 * @Date:2018/1/4
 */
@Service
public class NotifyServiceImpl implements NotifyService {
    private Logger LOGGER = LoggerFactory.getLogger(RegistServiceImpl.class);

    String listKey=RedisKeyEnums.NOTIFYLISTKEY.getValue();
    String notifyKey=RedisKeyEnums.NOTIFYVALUEKEY.getValue();
    @Autowired
    private RpcConfig rpcConfig;
    @Autowired
    private RpcServiceFactory rpcServiceFactory;
    @Autowired
    private HessianRedisTemplate hessianRedisTemplate;
    @Autowired
    private TaskExecutor taskExecutor;

    /**
     * 添加任务
     * @param regist
     * @param address
     * @param name
     */
    @Override
    public void add(String regist,String address,String name){
        add(regist,address,name,0);
    }

    /**
     * 添加任务
     * @param list
     */
    @Override
    public void addAll(List<NotifyTaskBean> list){
        for(NotifyTaskBean bean:list){
            add(bean);
        }
    }
    /**
     *
     * @param regist
     * @param address
     * @param name
     * @param times
     */
    @Override
    public void add(String regist,String address,String name,int times){
        NotifyTaskBean bean=new NotifyTaskBean(regist,address,name,times);
        add(bean);
    }

    /**
     *
     * @param bean
     */
    @Override
    public void add(NotifyTaskBean bean){
        String id=bean.getId().toString();
        remove(id);//先删除再添加
        hessianRedisTemplate.opsForList().rightPush(listKey,id);
        hessianRedisTemplate.opsForHash().put(notifyKey,id,bean);
    }
    @Override
    public Long size() {
        return hessianRedisTemplate.opsForList().size(listKey);
    }

    /**
     * 获取第一个任务
     * @return
     */
    @Override
    public NotifyTaskBean poll(){
        if(size()>0){
            String id= (String) hessianRedisTemplate.opsForList().leftPop(listKey);
            NotifyTaskBean bean= (NotifyTaskBean) hessianRedisTemplate.opsForHash().get(notifyKey,id);
            hessianRedisTemplate.opsForHash().delete(notifyKey,id);
            return  bean;
        }
        return null;
    }
    @Override
    public List getList(){
        List list= hessianRedisTemplate.opsForHash().values(notifyKey);
        return list;
    }

    @Override
    public void sendWithCache(String id) {
        NotifyTaskBean bean= (NotifyTaskBean) hessianRedisTemplate.opsForHash().get(notifyKey,id);
        taskExecutor.execute(new AsyNotifyTask(bean));
    }

    @Override
    public void remove(String id) {
        hessianRedisTemplate.opsForList().remove(listKey,1,id);
        hessianRedisTemplate.opsForHash().delete(notifyKey,id);
    }

    @Override
    public boolean send(NotifyTaskBean bean){
        while (true){
            try {
                RegistService service=rpcServiceFactory.createByUrl(RegistService.class,bean.getRegist());
                service.registNotify(bean.getAddress(),bean.getName());
                return true;
            } catch (Exception e) {
                bean.setTimes(bean.getTimes()+1);
                LOGGER.info("通知失败\t:"+bean,e);
                if(bean.getTimes()%3==0){
                    return false;
                }
            }
        }
    }

    @Override
    public void notifyAndSend(String address, String name, Map<Object, Object> map) {
        taskExecutor.execute(new RegistNotifyTask(address,name,map));
    }

    @Override
    public void notifyReCenter(String address, String name) {
        taskExecutor.execute(new RegistNotifyTask(address,name));

    }
    /**
     * 通知失败数据异步主动通知
     */
    private class AsyNotifyTask implements Runnable {
        private NotifyTaskBean bean;
        public AsyNotifyTask(NotifyTaskBean bean){
            this.bean=bean;
        };
        public void run() {
            LOGGER.info("手动通知");
            try {
                if(send(bean)){
                    remove(bean.getId().toString());
                }else{
                    add(bean);
                }
            } catch (Exception e) {
                LOGGER.error("手动通知数据失败",e);
            }
            LOGGER.info("手动通知结束");
        }
    }
    /**
     *  注册中心 同步数据线程
     */
    private class RegistNotifyTask implements Runnable {
        private NotifyTaskBean bean;
        private String address;
        private String name;
        private Map<Object,Object> map;
        public RegistNotifyTask(String address,String name){
            this.address=address;
            this.name=name;
        };
        public RegistNotifyTask(NotifyTaskBean bean){
            this.address=bean.getAddress();
            this.name=bean.getName();
            this.bean=bean;
        };
        public RegistNotifyTask(String address,String name,Map<Object,Object> map){
            this.address=address;
            this.name=name;
            this.map=map;
        };
        public void run() {
            LOGGER.info("开始主动通知");
            Url localUrl=new Url(rpcConfig.getLocalAddress());
            CopyOnWriteArrayList<String> readList=new CopyOnWriteArrayList<String>(rpcConfig.getRegistAddress());
            for(String regist:readList){
                Url remoteUrl=new Url(regist);
                if(localUrl.getAddress().equals(remoteUrl.getAddress())){//被通知对象为自己时 不通知
                    continue;
                }
                try {
                    RegistService service=rpcServiceFactory.createByUrl(RegistService.class,regist);
                    service.registNotify(address,name);
                } catch (Exception e) {
                    add(regist,address,name);
                    LOGGER.info("主动通知出错\turl:"+regist,e);
                }
            }
            if(map!=null){
                RegistService service=rpcServiceFactory.createByUrl(RegistService.class,address);
                service.registNotify(map);
            }
            LOGGER.info("主动通知结束");
        }
    }
}
