package com.ceying.chx.cpi.base.rm.tradeaccounts.controller;

import com.alibaba.fastjson.JSONObject;
import com.ceying.chx.cpi.base.exception.ParamException;
import com.ceying.chx.cpi.base.rm.tradeaccounts.service.TradeaccountsService;
import com.ceying.chx.cpi.base.util.response.RespJson;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: mzq
 * 开发时间: 2017/11/15<br>
 * <br>
 */
@RestController
@RequestMapping("/cpi/base/tradeaccounts")
public class TradeaccountsController {
    @Resource
    private TradeaccountsService tradeaccountsServiceImpl;

    @ApiOperation(value = "交易账户的API接口")
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public RespJson selectTradeaccounts(HttpServletRequest request) throws ParamException {
        JSONObject map = getParams(request);
        RespJson respJson = tradeaccountsServiceImpl.list(map);
        return respJson;
    }
    @ResponseBody
    @RequestMapping(value = "/transaction",method = RequestMethod.POST)
    public RespJson selectTradeTransaction(HttpServletRequest request) throws ParamException {
        JSONObject map = getParams(request);
        RespJson respJson = tradeaccountsServiceImpl.tradeTransaction(map);
        return respJson;
    }
    @ResponseBody
    @RequestMapping(value = "/balance",method = RequestMethod.POST)
    public RespJson selectBalance(HttpServletRequest request) throws ParamException {
        JSONObject map = getParams(request);
        RespJson respJson = tradeaccountsServiceImpl.tradeBalance(map);
        return respJson;
    }
    //获取参数并返回
    public JSONObject getParams(HttpServletRequest request){
        JSONObject json=null;
        try{
            InputStream is = request.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String lines;
            StringBuffer sb = new StringBuffer("");
            while ((lines = reader.readLine()) != null) {
                lines = new String(lines.getBytes(), "utf-8");
                sb.append(lines);
            }
            json=JSONObject.parseObject(sb.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        return json;
    }
}
