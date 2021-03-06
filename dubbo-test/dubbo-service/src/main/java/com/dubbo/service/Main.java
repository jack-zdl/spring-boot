package com.dubbo.service;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo()
public class Main {

    public static void main(String[] args) {
//        com.alibaba.dubbo.container.Main.main(args);
        SpringApplication.run(Main.class, args);
    }
}
