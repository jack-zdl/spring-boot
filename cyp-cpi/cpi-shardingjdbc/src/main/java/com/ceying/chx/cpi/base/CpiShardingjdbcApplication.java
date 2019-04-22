package com.ceying.chx.cpi.base;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class CpiShardingjdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(CpiShardingjdbcApplication.class, args);
	}

}
