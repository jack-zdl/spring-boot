package com.ceying.transaction.aop;


import java.lang.annotation.*;

/**
 * 功能说明: 本地方法通过  分布式事物进行 事物管理使用的注解<br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/7/2<br>
 * <br>
 */
@Retention(RetentionPolicy.RUNTIME) // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Target({ElementType.METHOD})//定义注解的作用目标作用范围 方法
@Documented//说明该注解将被包含在javadoc中
public @interface MyLocalTransaction {
    String rollbackUrl();
    String serviceName();
    String rollbackMethodType() default "GET";

    /**
     * 仅当  rollbackMethodType 为get 生效
     * @return
     */
    String[] paramName() default {};
}
