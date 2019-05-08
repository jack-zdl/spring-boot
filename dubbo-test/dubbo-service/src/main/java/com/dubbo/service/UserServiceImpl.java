package com.dubbo.service;

import com.dubbo.api.UserService;

public class UserServiceImpl implements UserService {
    public String sayHi(String name) {
        return "hello " + name + "!";
    }
}
