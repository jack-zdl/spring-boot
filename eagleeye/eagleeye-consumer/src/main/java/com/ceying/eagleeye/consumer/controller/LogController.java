package com.ceying.eagleeye.consumer.controller;

import com.alibaba.fastjson.JSONObject;
import com.ceying.eagleeye.consumer.service.LogService;
import com.ceying.eagleeye.consumer.vo.AllUserVO;
import com.ceying.eagleeye.consumer.vo.MyLogVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/3/20<br>
 * <br>
 */
@RestController
@RequestMapping("/customer")
public class LogController {

    @Autowired
    private LogService logService;

    @RequestMapping("/page")
    public JSONObject getLogPage(MyLogVo vo){

        return logService.getLogPage(vo);
    }

    @RequestMapping("/allUser")
    public JSONObject allUser(AllUserVO vo){
        return logService.allUser(vo);
    }
}
