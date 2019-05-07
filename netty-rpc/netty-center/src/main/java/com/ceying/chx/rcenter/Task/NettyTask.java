package com.ceying.chx.rcenter.Task;

import com.ceying.chx.rcenter.bean.NotifyTaskBean;
import com.ceying.chx.rcenter.bean.Url;
import com.ceying.chx.rcenter.client.RpcServiceFactory;
import com.ceying.chx.rcenter.config.RpcConfig;
import com.ceying.chx.rcenter.regist.RegistService;
import com.ceying.chx.rcenter.service.NotifyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 注册中心之间的 定时任务
 * @Author：huanghaiyun
 * @Date:2018/1/4
 */
@Component
public class NettyTask {

    private Logger LOGGER = LoggerFactory.getLogger(NettyTask.class);
    @Autowired
    private RpcConfig rpcConfig;
    @Autowired
    private RpcServiceFactory rpcServiceFactory;
    @Autowired
    private NotifyService reNotifyTaskService;

    /**
     * 保持注册中心心跳 同时更新他的权重
     */
    @Scheduled(cron="0 0/3 * * * ?")//每3分钟一个心跳
    public void sendHeart(){
        for(int i=0;i<rpcConfig.getRegistAddress().size();i++){
            try {
                String regist=rpcConfig.getRegistAddress().get(i);
                RegistService service=rpcServiceFactory.createByUrl(RegistService.class,regist);
                Url url=new Url(regist);
                long weight=service.getState();
                url.setParam("weight",weight);
                rpcConfig.getRegistAddress().set(i,url.encode());
            } catch (Exception e) {
                LOGGER.error("发送心跳异常",e);
            }
        }
    }
    @Scheduled(cron="0 0/30 * * * ? ")//每半小时一次重发
    public void ressend(){
        Long size=reNotifyTaskService.size();
        LOGGER.info("开始异常通知 需要通知的数量："+size);
        while (size>0) {
            NotifyTaskBean bean=reNotifyTaskService.poll();
            if(!reNotifyTaskService.send(bean)){//发送失败
                reNotifyTaskService.add(bean);
            }
            size--;
        }
        LOGGER.info("异常通知结束 剩余需要通知的数量："+reNotifyTaskService.size());
    }

}
