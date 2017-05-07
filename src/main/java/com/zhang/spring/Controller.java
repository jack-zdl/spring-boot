package com.zhang.spring;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zhang on 2017/5/7.
 */
@RestController
@RequestMapping("/SpringBoot")
public class Controller {

    @RequestMapping(value = "/hello",method = RequestMethod.GET,produces = {MediaType.APPLICATION_JSON_VALUE})
    public String helloSpringBoot(){
        return "hello";
    }
}
