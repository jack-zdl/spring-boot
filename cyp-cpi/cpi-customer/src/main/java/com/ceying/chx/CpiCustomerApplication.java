package com.ceying.chx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.ceying.chx.cpi.customer.rm")
public class CpiCustomerApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(CpiCustomerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(CpiCustomerApplication.class);
	}
}
