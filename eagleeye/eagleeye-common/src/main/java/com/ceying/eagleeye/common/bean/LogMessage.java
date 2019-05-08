package com.ceying.eagleeye.common.bean;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/27<br>
 * <br>
 */
public class LogMessage implements Serializable{

    /**
     * 用户
     */
    @JSONField(ordinal=1)
    private String user;
    /**
     * 操作类型
     */
    @JSONField(ordinal=2)
    private String type;
    /**
     * 方法名
     */
    @JSONField(ordinal=3)
    private String method;
    /**
     * 源对象
     */
    @JSONField(ordinal=4)
    private Object param;
    /**
     * 操作后对象
     */
    @JSONField(ordinal=5)
    private Object result;
    /**
     * 异常信息
     */
    @JSONField(ordinal=6)
    private Object exception;
    /**
     * 服务名称
     */
    @JSONField(ordinal=7)
    private String serviceName;
    /**
     * 服务ip
     */
    @JSONField(ordinal=8)
    private String serviceIp;
    /**
     * 服务端口
     */
    @JSONField(ordinal=9)
    private String servicePort;
    /**
     * 发生时间
     */
    @JSONField(format="yyyy-MM-dd HH:mm:ss",ordinal=10)
    private Date date=new Date();
    /**
     * 调用的类名
     */
    @JSONField(ordinal=11)
    private String className;
    /**
     *描述信息
     */
    @JSONField(ordinal=12)
    private String description;

    public LogMessage(){

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServicePort() {
        return servicePort;
    }

    public void setServicePort(String servicePort) {
        this.servicePort = servicePort;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getException() {
        return exception;
    }

    public void setException(Object exception) {
        this.exception = exception;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getServiceIp() {
        return serviceIp;
    }

    public void setServiceIp(String serviceIp) {
        this.serviceIp = serviceIp;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
