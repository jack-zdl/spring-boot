package com.ceying.chx.cpi.customer.rm.accountspayable.controller;

import com.alibaba.fastjson.JSONObject;
import com.ceying.chx.cpi.customer.rm.accountspayable.entity.AccountsInfoDto;
import com.ceying.chx.cpi.customer.rm.accountspayable.service.AccountsPayableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by cyp on 2017/12/4.
 */
@Controller
@RequestMapping("/cpi/customer/accountsManage")
public class AccountsPayableController {

    @Resource
    private AccountsPayableService accountsPayableServiceImpl;

    @RequestMapping(value="/getAccounts")
    public void accountsInfo(@RequestParam(value="id",required = false,defaultValue = "") String id,
                               HttpServletRequest request, HttpServletResponse response){
        System.out.println(id);
        AccountsInfoDto accountsInfoDto = (AccountsInfoDto)accountsPayableServiceImpl.get(id);
        if(accountsInfoDto != null){
            String json =  "{\"items\":" + JSONObject.toJSONString(accountsInfoDto) + "}";
            System.out.println(json);
            try {
                response.getOutputStream().write(json.getBytes("utf-8"));
                response.flushBuffer();
            }catch (Exception e){

            }
        }
    }
}
