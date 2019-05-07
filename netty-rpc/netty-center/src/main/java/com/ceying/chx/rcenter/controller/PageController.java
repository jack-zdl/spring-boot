package com.ceying.chx.rcenter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/2<br>
 * <br>
 */
@Controller
public class PageController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
