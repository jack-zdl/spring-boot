package com.ceying.chx.baseController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by cyp on 2017/12/5.
 */
@Controller
@RequestMapping("/test")
public class BaseController {

    @RequestMapping("/dotest")
    public String forward(){
        return "index";
    }
}
