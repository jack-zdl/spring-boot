package com.ceying.eagleeye.consumer.controller;

import com.ceying.common.util.properties.MessageUtil;
import com.ceying.common.util.response.BaseReturnResult;
import com.ceying.eagleeye.consumer.service.MessageService;
import com.ceying.eagleeye.consumer.websocket.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/6/20<br>
 * <br>
 */
@RestController
@RequestMapping("/message")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @Autowired
    private WebSocketService webSocketService;
    @RequestMapping("/read")
    public BaseReturnResult read(String urid){
        try {
            messageService.read(urid);
            return MessageUtil.Success();
        } catch (Exception e) {
            return MessageUtil.Exception(e);
        }
    }
}
