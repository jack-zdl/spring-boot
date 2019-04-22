package com.ceying.chx.cpi.base;

import com.ceying.chx.cpi.base.config.IPBlack;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement  // 事物配置
@MapperScan("com.ceying.chx.cpi.base.dao")
@EnableConfigurationProperties({IPBlack.class})
@EnableCaching
public class CpiBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpiBaseApplication.class, args);
	}

}
