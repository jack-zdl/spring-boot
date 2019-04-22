package com.ceying.chx.cpi.base.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * 功能说明: 自制监听器 <br>
 * 系统版本: 2.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/12/28 16:01<br>
 * <br>
 */
//@WebListener  这个注解必须通过注解方式启动
public class CustomListener implements ServletRequestListener {

    @Override
    public
    void requestInitialized(ServletRequestEvent servletRequestEvent) {
        System.out.println("------ CustomListener ------");
    }

    @Override
    public
    void requestDestroyed(ServletRequestEvent servletRequestEvent) {

    }


}
