package com.ceying.eagleeye.common.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/28<br>
 * <br>
 */
@Component
@Configuration
@ConfigurationProperties(prefix = "eagleeye")
@RefreshScope
public class MyLogConfig {

    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String serverName;

    /**
     * 日志存储位置
     */
    private String filePath;
    /**
     * 日志文件名
     */
    private String fileName;
    /**
     * session 中存用户信息的ｋｅｙ
     */
    private String sessionKye="LOGINSUSER";
    /**
     * 向那个topic 推送消息
     */
    private String topic="MYLOGTOPIC";
    private String loginParamClass;
    private String loginParamkey;
    /**
     * session 中 user id  的字段名
     */
    private String userKey="userId";
    /**
     * 方法执行开始时 不记录的日志
     */
    private String[] startPackage;
    /**
     * 方法执行结束时不记录的日志
     */
    private String[] endPackage;
    /**
     * 不记录执行结果的日志
     */
    private String[] endReturn;
    private boolean isLogNulUser=false;
    private String[] nologName;

    /**
     * 方法执行前 需要记录的日志
     */
    private String[] startLogPackage;
    /**
     * 方法执行结束后需要执行的 日志
     */
    private String[] endLogPackage;
    /**
     * 日志文件大小 超过此大小 将分成多个文件
     */
    private Integer fileSize=20;
    public String getPort() {
        return port;
    }

    public String getServerName() {
        return serverName;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getSessionKye() {
        return sessionKye;
    }

    public void setSessionKye(String sessionKye) {
        this.sessionKye = sessionKye;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getUserKey() {
        return userKey;
    }

    public void setUserKey(String userKey) {
        this.userKey = userKey;
    }

    public String[] getStartPackage() {
        return startPackage;
    }

    public void setStartPackage(String[] startPackage) {
        this.startPackage = startPackage;
    }

    public String[] getEndPackage() {
        return endPackage;
    }

    public void setEndPackage(String[] endPackage) {
        this.endPackage = endPackage;
    }

    public String[] getEndReturn() {
        return endReturn;
    }

    public void setEndReturn(String[] endReturn) {
        this.endReturn = endReturn;
    }

    public String getLoginParamClass() {
        return loginParamClass;
    }

    public void setLoginParamClass(String loginParamClass) {
        this.loginParamClass = loginParamClass;
    }

    public String getLoginParamkey() {
        return loginParamkey;
    }

    public void setLoginParamkey(String loginParamkey) {
        this.loginParamkey = loginParamkey;
    }

    public boolean isLogNulUser() {
        return isLogNulUser;
    }

    public void setLogNulUser(boolean logNulUser) {
        isLogNulUser = logNulUser;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String[] getNologName() {
        return nologName;
    }

    public void setNologName(String[] nologName) {
        this.nologName = nologName;
    }

    public String[] getStartLogPackage() {
        return startLogPackage;
    }

    public void setStartLogPackage(String[] startLogPackage) {
        this.startLogPackage = startLogPackage;
    }

    public String[] getEndLogPackage() {
        return endLogPackage;
    }

    public void setEndLogPackage(String[] endLogPackage) {
        this.endLogPackage = endLogPackage;
    }

    public Integer getFileSize() {
        return fileSize;
    }

    public void setFileSize(Integer fileSize) {
        this.fileSize = fileSize;
    }
}
