package com.ceying.flowable.modeler.extention.task.timer;

import com.ceying.common.util.zookeeper.SimpleZkClient;
import com.ceying.flowable.modeler.extention.task.init.ZookeeperInitialBean;
import com.ceying.flowable.modeler.extention.task.service.ExtDelegateCommentService;
import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author: fej
 * @date: 2018/6/7
 * @description :
 * @version: 2.0
 */
@Component
@DependsOn("simpleZkClient")
public class DelegateExpireHandlerTimer {

    @Autowired
    private ExtDelegateCommentService extDelegateCommentService;

    @Scheduled(cron = "0 */5 * * * ?")
    public void timerExecute(){
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>委托过期作废定时器开始执行>>>>>>>>>>>>>>>>>>>>>");
        ZkClient zkClient = SimpleZkClient.createZkClientConnection();
        try{
            SimpleZkClient.createNode(zkClient, "/scyp/scyp-workflow/delegate/expire", null, CreateMode.EPHEMERAL);
            extDelegateCommentService.timerDelegateExecute();
        }catch (Exception e){
            System.out.println("未获取到执行权限");
        }finally {
            SimpleZkClient.releaseConnection(zkClient);
        }
    }
}
