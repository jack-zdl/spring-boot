package com.dubbo.service.dubbo.impl;

import com.dubbo.service.dubbo.UserService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(version = "1.0.0",group = "ls")//,timeout = 10000,interfaceClass = UserService.class
@Component
public class UserServiceImpl implements UserService {

    public String sayHi(String name) {
        System.out.println(name+"111111111111");
        return "hello " + name + "!";
    }
}
