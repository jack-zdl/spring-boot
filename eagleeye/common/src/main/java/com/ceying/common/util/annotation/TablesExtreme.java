package com.ceying.common.util.annotation;

import java.lang.annotation.*;

/**
 * @author : Meow
 * @date : 2018-4-3
 * @description : 联表查询极值注解
 */
@Retention(RetentionPolicy.RUNTIME) // 注解会在class字节码文件中存在，在运行时可以通过反射获取到
@Target({ElementType.FIELD})//定义注解的作用目标**作用范围字段、枚举的常量/方法
@Documented//说明该注解将被包含在javadoc中
public @interface TablesExtreme {
    /**
     * 表名，多表查询需指定表名,表有别名则配置为别名
     */
    String table();

    /**
     * 最值类型
     */
    int type();

    /**
     * vo类属性名和表字段名不匹配时指定
     */
    String column() default "";
}
