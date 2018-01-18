package com.ceying.chx.cpi.customer.rm.erp.controller;

import com.alibaba.fastjson.JSONObject;
import com.ceying.chx.cpi.customer.rm.erp.entity.SysUser;
import com.ceying.chx.cpi.customer.rm.erp.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by cyp on 2017/12/4.
 */
@Controller
@RequestMapping("/cpi/customer/erpmanager")
public class ErpController {

    @Resource
    private UserService userServiceImpl;

    @RequestMapping("/erpquery")
    public void query(SysUser sysUserReq, HttpServletRequest request, HttpServletResponse response){

        response.setContentType("text/html;charset=utf-8");
        SysUser sysUser = (SysUser)userServiceImpl.get(sysUserReq);
        if(sysUser==null){
            String defaultValue="未知";
            sysUser=new SysUser();
            sysUser.setUser_name(defaultValue);
            sysUser.setExt_field_3(defaultValue);
            sysUser.setExt_field_4(defaultValue);
            sysUser.setExt_field_5(defaultValue);
        }
        String json= JSONObject.toJSONString(sysUser);
        //json = "{'user_name':'测试'}";
        try {
            //json = "callback(" + json + ")";
            response.getWriter().print(json);
        }catch (Exception e){

        }
    }
}
