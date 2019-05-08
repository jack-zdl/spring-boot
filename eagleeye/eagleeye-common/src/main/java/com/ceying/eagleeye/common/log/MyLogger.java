package com.ceying.eagleeye.common.log;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ceying.eagleeye.common.bean.LogMessage;
import com.ceying.eagleeye.common.config.MyLogConfig;
import com.ceying.eagleeye.common.producer.KafkaMsgProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 功能说明: 日志<br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/28<br>
 * <br>
 */
@Component
public class MyLogger {
    @Autowired
    private KafkaMsgProducer kafkaMsgProducer;
    @Autowired
    private MyLogConfig myLogConfig;

    private static final Logger log = LoggerFactory.getLogger(MyLogger.class);
    private String DEFAULT="null";
    public void info(String msg){
        String method= null;
        String className= null;
        try {
            StackTraceElement[] temp=Thread.currentThread().getStackTrace();
            StackTraceElement a=(StackTraceElement)temp[2];
            method = a.getMethodName();
            className = a.getClassName();
            LogMessage logMessage=new LogMessage();
            logMessage.setDescription(msg);
            logMessage.setClassName(className);
            logMessage.setMethod(method);
            logMessage.setUser(getUser());
            info(logMessage);
        } catch (Exception e) {
            log.debug("推送消息失败",e);
        }
    }
    public void info(LogMessage msg){
        try {
            kafkaMsgProducer.sendMessage(msg);
        } catch (Exception e) {
            log.debug("推送消息失败",e);
        }
    }
    public void error(String msg){
        String method= null;
        String className= null;
        try {
            StackTraceElement[] temp=Thread.currentThread().getStackTrace();
            StackTraceElement a=(StackTraceElement)temp[2];
            method = a.getMethodName();
            className = a.getClassName();
            LogMessage logMessage=new LogMessage();
            logMessage.setDescription(msg);
            logMessage.setClassName(className);
            logMessage.setMethod(method);
            logMessage.setUser(getUser());
            logMessage.setException(objToJson(new Exception(msg)));
            info(logMessage);
        } catch (Exception e) {
            log.debug("推送消息失败",e);
        }
    }
    public void error(String msg,Exception ex){
        String method= null;
        String className= null;
        try {
            StackTraceElement[] temp=Thread.currentThread().getStackTrace();
            StackTraceElement a=(StackTraceElement)temp[2];
            method = a.getMethodName();
            className = a.getClassName();
            LogMessage logMessage=new LogMessage();
            logMessage.setDescription(msg);
            logMessage.setClassName(className);
            logMessage.setMethod(method);
            logMessage.setUser(getUser());
            logMessage.setException(objToJson(ex));
            info(logMessage);
        } catch (Exception e) {
            log.debug("推送消息失败",e);
        }
    }
    private String getUser(){
        String user="";
        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            if(request!=null){
                HttpSession session = request.getSession();
                if(session!=null){
                    JSONObject json= (JSONObject) JSON.toJSON(session.getAttribute(myLogConfig.getSessionKye()));
                    if(json!=null){
                        user=json.get(myLogConfig.getUserKey()).toString();
                    }
                }
            }
        } catch (Exception e) {
            log.debug("构建用户日志,获取session错误",e);
        } finally {
            return user;
        }
    }
    private Object objToJson(Object o){
        Object value=null;
        try {
            value= (JSONObject) JSON.toJSON(o);
        } catch (Exception e) {
            value=o.toString();
        } finally {
            return value;
        }
    }
}
