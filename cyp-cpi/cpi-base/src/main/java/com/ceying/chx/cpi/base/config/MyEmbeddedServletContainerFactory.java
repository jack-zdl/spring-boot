package com.ceying.chx.cpi.base.config;

import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.context.embedded.EmbeddedServletContainer;
//import org.springframework.boot.context.embedded.ServletContextInitializer;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.stereotype.Component;
/**
 * 功能说明:设置tomcat最大连接数，设置一些内嵌的tomcat的属性 <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/15 15:01<br>
 * <br>
 */

public
class MyEmbeddedServletContainerFactory //extends TomcatEmbeddedServletContainerFactory
{
//    public EmbeddedServletContainer getEmbeddedServletContainer(ServletContextInitializer... initializers)
//    {
//        //设置端口
//        this.setPort(7901);
//        return super.getEmbeddedServletContainer(initializers);
//    }
//
//    protected void customizeConnector(Connector connector)
//    {
//        super.customizeConnector(connector);
//        Http11NioProtocol protocol = (Http11NioProtocol)connector.getProtocolHandler();
//        //设置最大连接数
//        protocol.setMaxConnections(2000);
//        //设置最大线程数
//        protocol.setMaxThreads(2000);
////        protocol.setConnectionTimeout(2)
//    }
}
