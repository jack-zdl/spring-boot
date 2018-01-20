package com.ceying.chx.cpi.base;

import com.ceying.chx.cpi.base.config.IPBlack;
import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.annotations.Cacheable;

import java.io.IOException;

@SpringBootApplication
@EnableTransactionManagement  // 事物配置
//@EnableScheduling   //启动计划任务
@MapperScan("com.ceying.chx.cpi.base.rm")
//@ServletComponentScan   // 这个注解可以让自制的listener或者filter 或者 servlet 有效
@EnableConfigurationProperties({IPBlack.class})
public class CpiBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpiBaseApplication.class, args);
	}

	//启动类这块加上了一个httpConnector，为了支持https访问和http访问
//	@Bean
//	public
//	EmbeddedServletContainerFactory tomcatEmbeddedServletContainerFactory() throws IOException {
//		TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
//		tomcat.addAdditionalTomcatConnectors(httpConnector());
//		return tomcat;
//	}
//
//	public Connector httpConnector() throws IOException {
//		Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//		Http11NioProtocol http11NioProtocol = (Http11NioProtocol) connector.getProtocolHandler();
//		connector.setPort(8089);
//		//设置最大线程数
//		http11NioProtocol.setMaxThreads(100);
//		//设置初始线程数  最小空闲线程数
//		http11NioProtocol.setMinSpareThreads(20);
//		//设置超时
//		http11NioProtocol.setConnectionTimeout(5000);
//		return connector;
//	}
}
