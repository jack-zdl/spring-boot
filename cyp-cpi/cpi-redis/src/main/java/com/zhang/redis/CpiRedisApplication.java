package com.zhang.redis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CpiRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpiRedisApplication.class, args);
	}
}
