package com.ceying.chx.cpi.biz.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 功能说明:日志切面<br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl
 * 开发时间: 2017/11/8 9:19<br>
 * <br>
 */
@Aspect
@Component
public class LogAspect {

    @Pointcut("execution(public * com.cyp.chx.service.*.*(..))")
    public void pointCut() {
    }

    @Before("pointCut()")
    public void beforeMethod(JoinPoint joinPoint) {
        Object[] objects = joinPoint.getArgs();
        for (Object o : objects){
            System.out.println("参数："+o);
        }
    }
}
