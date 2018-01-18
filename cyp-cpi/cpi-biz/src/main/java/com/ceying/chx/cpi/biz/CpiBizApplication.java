package com.ceying.chx.cpi.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 功能说明:cpi<br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl
 * 开发时间: 2017/11/8 9:19<br>
 * <br>
 */

@SpringBootApplication
@EnableDiscoveryClient
public class CpiBizApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpiBizApplication.class, args);
	}
}
