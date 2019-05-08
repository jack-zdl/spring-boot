package com.dubbo.consumer;

import com.dubbo.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/demo")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String sayHello(String name) {
        String welcome = userService.sayHi(name);
        return welcome;
    }
}
