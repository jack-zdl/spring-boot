package com.ceying.eagleeye.consumer;

import com.ceying.common.util.convert.DateConvert;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Strings;
import feign.RequestInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.web.HttpMessageConverters;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.convert.converter.Converter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.RequestContextHolder;
import tk.mybatis.spring.annotation.MapperScan;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ThreadPoolExecutor;

@EnableEurekaClient
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = -1)
@EnableHystrix
@SpringBootApplication
@MapperScan("com.ceying.eagleeye.consumer.dao")
@ComponentScan(basePackages={"com.ceying.common,com.ceying.eagleeye"})
@EnableFeignClients(basePackages = {"com.ceying.common","com.ceying.eagleeye"})
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	@Bean
	@LoadBalanced
	RestTemplate restTemplate() {
//		SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
//		requestFactory.setConnectTimeout(1000);
//		requestFactory.setReadTimeout(1000);
//		return new RestTemplate(requestFactory);
		return new RestTemplate();
	}

	@Bean
	ThreadPoolTaskExecutor myTaskExecutor(){
		ThreadPoolTaskExecutor taskExecutor=new ThreadPoolTaskExecutor();
		taskExecutor.setCorePoolSize(30);//核心线程数
		taskExecutor.setMaxPoolSize(100);//最大线程数
		taskExecutor.setQueueCapacity(1000);//队列最大长度
		taskExecutor.setKeepAliveSeconds(60);//线程池维护线程所允许的空闲时间
		taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());//线程池对拒绝任务(无线程可用)的处理策略
		return taskExecutor;
	}

	/**
	 * 前端传后端时间格式的转换
	 *
	 * @return
	 */
	@Bean
	public Converter<String, Date> addNewConvert() {
		return new Converter<String, Date>() {
			@Override
			public Date convert(String source) {
				DateConvert sdf = new DateConvert();
				Date date = null;
				date = sdf.convert((String) source);
				return date;
			}
		};
	}

	/**
	 * 后端传前端时间格式的转换
	 *
	 * @return
	 */
	@Bean
	public HttpMessageConverters customConverters() {
		Collection<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
		MappingJackson2HttpMessageConverter bean = new MappingJackson2HttpMessageConverter();
		ObjectMapper mapper = new ObjectMapper();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		mapper.setDateFormat(format);
		bean.setObjectMapper(mapper);
		messageConverters.add(bean);
		return new HttpMessageConverters(true, messageConverters);
	}

}