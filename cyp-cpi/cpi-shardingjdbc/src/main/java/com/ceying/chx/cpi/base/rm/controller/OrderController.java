package com.ceying.chx.cpi.base.rm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2018/2/27 16:50<br>
 */

@RestController
@RequestMapping("/cpi")
public class OrderController {

    @GetMapping("/test")
    public String test(){
        return "test mysql";
    }


}
