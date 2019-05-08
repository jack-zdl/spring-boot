package com.ceying.flowable.modeler.extention.task.init;

import com.ceying.common.util.zookeeper.SimpleZkClient;
import org.I0Itec.zkclient.ZkClient;
import org.apache.zookeeper.CreateMode;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author: fej
 * @date: 2018/6/12
 * @description :
 * @version: 2.0
 */
@Component
@DependsOn("simpleZkClient")
public class ZookeeperInitialBean implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        ZkClient zkClient = SimpleZkClient.createZkClientConnection();
        try {
            if (!SimpleZkClient.existsZkNode(zkClient, "/scyp")) {
                SimpleZkClient.createNode(zkClient, "/scyp", null, CreateMode.PERSISTENT);
            }
            if (!SimpleZkClient.existsZkNode(zkClient, "/scyp/scyp-workflow")) {
                SimpleZkClient.createNode(zkClient, "/scyp/scyp-workflow", null, CreateMode.PERSISTENT);
            }
            if (!SimpleZkClient.existsZkNode(zkClient, "/scyp/scyp-workflow/delegate")) {
                SimpleZkClient.createNode(zkClient, "/scyp/scyp-workflow/delegate", null, CreateMode.PERSISTENT);
            }
        }catch (Exception e){

        }finally {
            SimpleZkClient.releaseConnection(zkClient);
        }
    }
}
