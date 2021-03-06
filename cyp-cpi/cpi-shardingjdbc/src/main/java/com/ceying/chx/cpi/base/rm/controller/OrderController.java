package com.ceying.chx.cpi.base.rm.controller;

import com.ceying.chx.cpi.base.rm.dao.OrderMapper;
import com.ceying.chx.cpi.base.rm.entity.TOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2018/2/27 16:50<br>
 */

@RestController
@RequestMapping("/cpi")
public class OrderController {

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/test")
    public String test(){
        return "test mysql";
    }

    @GetMapping("/tOrder")
    @Transactional
    public List tOrder(){
        TOrder tOrder = new TOrder();
        tOrder.setOrderId(1);
        tOrder.setUserId(1);
        orderMapper.insert(tOrder);
        TOrder tOrder1 = new TOrder();
        tOrder.setOrderId(1);
        tOrder.setUserId(2);
        orderMapper.insert(tOrder1);
        TOrder tOrder2 = new TOrder();
        tOrder.setOrderId(2);
        tOrder.setUserId(1);
        orderMapper.insert(tOrder2);
        TOrder tOrder3 = new TOrder();
        tOrder.setOrderId(2);
        tOrder.setUserId(2);
        orderMapper.insert(tOrder3);
        return Arrays.asList(tOrder,tOrder1,tOrder2,tOrder3);
    }

    @GetMapping("/tOrder1")
    public TOrder tOrder1(){
        TOrder tOrder = new TOrder();
        tOrder.setOrderId(1);
        tOrder.setUserId(2);
        orderMapper.insert(tOrder);
        return new TOrder();
    }
}
