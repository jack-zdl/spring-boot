package com.ceying.chx.rcenter.service.impl;

import com.ceying.chx.rcenter.config.RpcConfig;
import com.ceying.chx.rcenter.enums.RedisKeyEnums;
import com.ceying.chx.rcenter.regist.RegistService;
import com.ceying.chx.rcenter.client.RpcServiceFactory;
import com.ceying.chx.rcenter.bean.Url;
import com.ceying.chx.rcenter.server.RpcService;
import com.ceying.chx.rcenter.service.NotifyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.List;
import java.util.Map;

/**
 * @Author：huanghaiyun
 * @Date:2017/12/18
 */
@RpcService(RegistService.class)
public class RegistServiceImpl implements RegistService {

    private Logger LOGGER = LoggerFactory.getLogger(RegistServiceImpl.class);
    @Autowired
    private RpcConfig rpcConfig;
    @Autowired
    private StringRedisTemplate redisTemplate;

    @Autowired
    private RpcServiceFactory rpcServiceFactory;
    @Autowired
    private NotifyService reNotifyTaskService;

//    private static final String serviceKey="serviceMapKey";//普通服务 缓存

    @Override
    public List<String> regist(String address, String name) {
        List<String> list=registService(address,name);
        Url url=new Url(address);
        if(url.isRegistCenter()){//注册中心 注册 需要将本地数据全部同步过去  同时通知其他注册中心
            Map<Object,Object> map=redisTemplate.opsForHash().entries(RedisKeyEnums.SERVICEMAPKEY.getValue());
            reNotifyTaskService.notifyAndSend(address,name,map);
        }else{//非注册中心注册 只需要通知其他注册中心
            reNotifyTaskService.notifyReCenter(address,name);
        }
        return list;
    }

    @Override
    public long clean(String name) {
        return redisTemplate.opsForHash().delete(RedisKeyEnums.SERVICEMAPKEY.getValue(),name);
    }

    @Override
    public String getUrl(String name) {
        return (String) redisTemplate.opsForHash().get(RedisKeyEnums.SERVICEMAPKEY.getValue(),name);
    }

    @Override
    public void registNotify(String address, String name) {
        Url url=new Url(address);
        if(url.isRegistCenter()){
            rpcConfig.addRegist(url);
        }
        redisTemplate.opsForHash().put(RedisKeyEnums.SERVICEMAPKEY.getValue(),name,address);
    }

    @Override
    public void registNotify(Map<Object, Object> map) {
        redisTemplate.opsForHash().putAll(RedisKeyEnums.SERVICEMAPKEY.getValue(),map);
    }

    @Override
    public long getState() {
        Url url=new Url(rpcConfig.getLocalAddress());
        long weight=Integer.valueOf(url.getParam("weight"));
        return weight;
    }

    private  List<String> registService(String address, String name){
        Url url=new Url(address);
        if(url.isRegistCenter()){
            rpcConfig.addRegist(url);
        }
        redisTemplate.opsForHash().put(RedisKeyEnums.SERVICEMAPKEY.getValue(),name,address);
        return rpcConfig.getRegistAddress();
    }

}
