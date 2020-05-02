package com.dubbo.service.consumer;

//import com.dubbo.api.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;

import com.dubbo.service.dubbo.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class UserController {

    @Reference(version = "1.0.0",group = "ls") //, url = "dubbo://192.168.1.107:666"
    UserService userService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(String name) {
        System.out.println(name+"000000000000");
        String welcome = userService.sayHi(name);
        System.out.println(name+"2222222222");
        return welcome;
    }
}
