package com.ceying.common.util.zookeeper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author: fej
 * @date: 2018/6/11
 * @description :
 * @version: 2.0
 */
@Configuration
public class ZkConfig {

    @Value("${spring.cloud.stream.kafka.binder.zkNodes}")
    private String zkNodes;

    @Value("${spring.cloud.stream.kafka.binder.defaultZkPort}")
    private Integer defaultZkPort;

    public String getZkNodes() {
        return zkNodes;
    }

    public void setZkNodes(String zkNodes) {
        this.zkNodes = zkNodes;
    }

    public Integer getDefaultZkPort() {
        return defaultZkPort;
    }

    public void setDefaultZkPort(Integer defaultZkPort) {
        this.defaultZkPort = defaultZkPort;
    }
}
