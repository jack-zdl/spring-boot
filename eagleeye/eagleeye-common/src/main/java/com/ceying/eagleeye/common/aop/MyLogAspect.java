package com.ceying.eagleeye.common.aop;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ceying.eagleeye.common.bean.LogMessage;
import com.ceying.eagleeye.common.config.MyLogConfig;
import com.ceying.eagleeye.common.producer.KafkaMsgProducer;
import com.ceying.eagleeye.common.utils.ByteValueFilter;
import com.ceying.eagleeye.common.utils.MylogRegExUtil;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * 功能说明:
 * 通过@Aspect注解使该类成为切面类
 * 通过@Pointcut 指定切入点 ，这里指定的切入点为MyLog注解类型，也就是被@MyLog注解修饰的方法，进入该切入点。
 * @Before 前置通知：在某连接点之前执行的通知，但这个通知不能阻止连接点之前的执行流程（除非它抛出一个异常）。
 * @Around 环绕通知：可以实现方法执行前后操作，需要在方法内执行point.proceed(); 并返回结果。
 * @AfterReturning 后置通知：在某连接点正常完成后执行的通知：例如，一个方法没有抛出任何异常，正常返回。
 * @AfterThrowing 异常通知：在方法抛出异常退出时执行的通知。
 * @After 后置通知：在某连接点正常完成后执行的通知：例如，一个方法没有抛出任何异常，正常返回。
 * <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/27<br>
 * <br>
 */
@Aspect //AOP 切面
@Component
public class MyLogAspect implements Ordered {
    private String RESULT=null;
    private String EXCEPTION=null;
    private String START="方法开始执行";

    @Autowired
    private KafkaMsgProducer kafkaMsgProducer;
    @Autowired
    private MyLogConfig myLogConfig;

    private static final Logger log = LoggerFactory.getLogger(MyLogAspect.class);

    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void controllerPoint(){}
    @Pointcut("execution(* org.flowable.engine.common.*.persistence.entity.EntityManager+.*(..))")
    public void flowDaoPoint(){}

    @Pointcut("execution(* com.ceying.common.util.mybatis.MyMapper+.*(..))")
    public void daoPoint(){}

    /**
     * 在方法执行前
     * @param point
     * @return
     */
    @Before("controllerPoint()||daoPoint()||flowDaoPoint()")
    public void before(JoinPoint point) throws Throwable {
        try {
            if(myLogConfig.getNologName()!=null&&Arrays.asList(myLogConfig.getNologName()).contains(myLogConfig.getServerName())){
                return;
            }
            String method=((MethodSignature) point.getSignature()).toString();
            if(method.contains("com.ceying.common.util.mybatis.MyMapper")){
                method = ((MethodInvocationProceedingJoinPoint)point).getTarget().getClass().getInterfaces()[0].getName()+"."+((MethodSignature) point.getSignature()).getMethod().getName();
            }
            if(startLogRegEx(method)){//是否在要记录的日志中
                if(startRegEx(method)){//是否在不要记录的日志中
                    return;
                }
                LogMessage logMessage=createMsg(point,null,null);
                logMessage.setDescription(START);
                kafkaMsgProducer.sendMessage(logMessage);
            }
        } catch (Exception e) {
            log.debug("构建用户日志错误，不影响主流程",e);
        }
    }


    /**
     * 方法执行后
     *
     * @param joinPoint
     * @param result
     * @return
     */
    @AfterReturning(value = "controllerPoint()||daoPoint()||flowDaoPoint()", returning = "result")
    public Object after(JoinPoint point, Object result) {
        try {
            if(myLogConfig.getNologName()!=null&& Arrays.asList(myLogConfig.getNologName()).contains(myLogConfig.getServerName())){
                return result;
            }
            String method=((MethodSignature) point.getSignature()).toString();
            if(method.contains("com.ceying.common.util.mybatis.MyMapper")){
                method = ((MethodInvocationProceedingJoinPoint)point).getTarget().getClass().getInterfaces()[0].getName()+"."+((MethodSignature) point.getSignature()).getMethod().getName();
            }
            if(endLogRegEx(method)){//需要记录执行之后的日志
                if(!endRegEx(method)){//打印结束日志
                    if(!endRetrueRegEx(method)){//打印返回结果
                        LogMessage logMessage=createMsg(point,result,null);
                        kafkaMsgProducer.sendMessage(logMessage);
                    }else {// 不打印返回结果
                        LogMessage logMessage=createMsg(point,null,null);
                        kafkaMsgProducer.sendMessage(logMessage);
                    }
                }
            }
        } catch (Exception e) {
            log.debug("构建用户日志错误，不影响主流程",e);
        }finally {
            return result;
        }
    }
    /**
     * 方法执行后 并抛出异常
     *
     * @param joinPoint
     * @param ex
     */
    @AfterThrowing(value = "controllerPoint()||daoPoint()||flowDaoPoint()", throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        try {
            LogMessage logMessage=createMsg(joinPoint,RESULT,ex);
            kafkaMsgProducer.sendMessage(logMessage);
        } catch (Exception e) {
            log.debug("构建用户异常日志错误，不影响主流程",e);
        }
    }
    private LogMessage createMsg(JoinPoint point,Object result,Object exception){
        LogMessage logMessage=new LogMessage();
        logMessage.setServiceName(myLogConfig.getServerName());
        logMessage.setServicePort(myLogConfig.getPort());
        logMessage.setResult(objToJson(result));
        logMessage.setException(objToJson(exception));
//        logMessage.setClassName(((MethodSignature) point.getSignature()).getMethod().getDeclaringClass().toString());
        logMessage.setMethod(((MethodSignature) point.getSignature()).toString());
        logMessage.setType(((MethodSignature) point.getSignature()).getMethod().getName());
        logMessage.setUser(getUser());
        List param=new ArrayList();
        boolean isLogin=isLogin();
        int i=0;
        for(Object o:point.getArgs()){
            try {
                if(o==null){
                    param.add("param"+i+" type_"+null+"&value_"+o);
                }else if(o instanceof HttpServletResponse||o instanceof HttpServletRequest){

                }
                else if(isLogin&&Class.forName(myLogConfig.getLoginParamClass()).isInstance(o)){
                    //登录只记录用户名 为安全 不记录其他信息  例如：密码
                    JSONObject jsonObject= (JSONObject) JSON.toJSON(o);
                    String user= (String) jsonObject.get(myLogConfig.getLoginParamkey());
                    param.add("param"+i+" type_"+o.getClass().toString()+"&value_"+user);
                    logMessage.setUser(user);
                }else{
                    param.add("param"+i+" type_"+o.getClass().toString()+"&value_"+objToJson(o));
                }
            } catch (Exception e) {
                log.debug("构建用户日志错误，不影响主流程",e);
            } finally {
                i++;
            }
        }
        logMessage.setParam(param);
        return logMessage;
    }
    private Object objToJson(Object o){
        Object value=null;
        try {
            if(o instanceof Collection){
                value=JSONArray.parseArray(JSONArray.toJSONString(o, new ByteValueFilter()));
            }else{
                value=JSONObject.parseObject(JSONObject.toJSONString(o, new ByteValueFilter()));
            }
        } catch (Exception e) {
            value=o.toString();
        } finally {
            return value;
        }
    }
    private String getUser(){
        String userId =null;
        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            if(request!=null){
                HttpSession session = request.getSession();
                if(session!=null){
                    JSONObject json= (JSONObject) JSON.toJSON(session.getAttribute(myLogConfig.getSessionKye()));
                    if(json!=null){
                        userId=json.get(myLogConfig.getUserKey()).toString();
                    }
                }
            }
        } catch (Exception e) {
            log.debug("构建用户日志错误，不影响主流程",e);
        } finally {
            return userId;
        }
    }

    /**
     * 判断该请求是否是login
     * @return
     */
    private boolean isLogin(){
        boolean islogin=false;
        try {
            HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
            if(request!=null){
                String url = request.getRequestURI();
                if (url.contains("login")){
                    islogin=true;
                }
            }
        } catch (Exception e) {
            log.debug("构建用户日志错误，不影响主流程",e);
        } finally {
            return islogin;
        }
    }
    /**
     * 将自己的 apo提前   否则 可能AfterThrowing 不生效 被spring 拦截掉了
     * @return
     */
    @Override
    public int getOrder() {
        return 0;
    }
    /**
     * 是否在开始 日志中被过滤
     * @param method
     * @return
     */
    public boolean startRegEx(String method){
        return MylogRegExUtil.stringRegEx(method,myLogConfig.getStartPackage());
    }
    /**
     * 是否在介绍时 结果被过滤
     * @param method
     * @return
     */
    public boolean endRegEx(String method){
        return MylogRegExUtil.stringRegEx(method,myLogConfig.getEndPackage());
    }
    /**
     * 是否在介绍时 结果被过滤
     * @param method
     * @return
     */
    public boolean endRetrueRegEx(String method){
        return MylogRegExUtil.stringRegEx(method,myLogConfig.getEndReturn());
    }

    /**
     * 是否在开始  记录日志
     * @param method
     * @return
     */
    public boolean startLogRegEx(String method){
        return MylogRegExUtil.stringRegEx(method,myLogConfig.getStartLogPackage());
    }
    /**
     * 是否在结束时  记录日志
     * @param method
     * @return
     */
    public boolean endLogRegEx(String method){
        return MylogRegExUtil.stringRegEx(method,myLogConfig.getEndLogPackage());
    }

}
