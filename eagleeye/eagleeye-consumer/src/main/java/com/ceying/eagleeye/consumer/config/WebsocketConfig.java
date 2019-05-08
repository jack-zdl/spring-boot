package com.ceying.eagleeye.consumer.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/6/14<br>
 * <br>
 */
@Configuration
@ConfigurationProperties(prefix = "websocket")
public class WebsocketConfig {
    private Integer port=8888;

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }
}
