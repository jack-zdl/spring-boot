package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhang on 2017/5/7.
 */
@RestController
public class MainController {
    @RequestMapping("/")
    public String helloSpringBoot(){
        return "hello";
    }
}
