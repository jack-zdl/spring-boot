package com.ceying.chx.cpi.biz.rm.agreement.controller;

import com.alibaba.fastjson.JSONObject;
import com.ceying.chx.cpi.biz.exception.ParamException;
import com.ceying.chx.cpi.biz.rm.agreement.service.TriAgreementTempService;
import com.ceying.chx.cpi.biz.util.response.RespJson;
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
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: jh
 * 开发时间: 2017/11/15<br>
 * <br>
 */
@RestController
@RequestMapping("/cpi/biz/agreementTemp")
public class TriAgreementTempController {

    @Resource
    private TriAgreementTempService triAgreementTempServiceImpl;

    @ApiOperation(value = "三方协议模板的API接口")
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public RespJson selectListAgreementTemp(HttpServletRequest request) throws ParamException {
        Map<String,Object> params = getParams(request);
        RespJson respJson = triAgreementTempServiceImpl.list(params);
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
