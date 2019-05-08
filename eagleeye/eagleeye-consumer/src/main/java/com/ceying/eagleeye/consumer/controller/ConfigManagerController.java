package com.ceying.eagleeye.consumer.controller;

import com.alibaba.fastjson.JSONObject;
import com.ceying.common.util.properties.MessageUtil;
import com.ceying.common.util.response.BaseReturnResult;
import com.ceying.eagleeye.common.config.MyLogConfig;
import com.ceying.eagleeye.common.utils.MylogRegExUtil;
import com.ceying.eagleeye.consumer.entity.PropertiesEntity;
import com.ceying.eagleeye.consumer.service.PropertiesServcie;
import com.ceying.eagleeye.consumer.vo.PropertiesVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/4/20<br>
 * <br>
 */
@RestController
@RequestMapping("/configManager")
public class ConfigManagerController {
    @Autowired
    private PropertiesServcie propertiesServcie;
    @Autowired
    private MyLogConfig myLogConfig;
    /**
     *
     * @param vo
     * @return
     */
    @RequestMapping(value = "/list", method = RequestMethod.POST)
    public JSONObject list(PropertiesVo vo) {

        return propertiesServcie.list(vo).getJsonObject();
    }
    /**
     *
     * @param entity
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public BaseReturnResult save(PropertiesEntity entity) {
        try {
            propertiesServcie.save(entity);
            return MessageUtil.Success();
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.Exception(e);
        }
    }
    /**
     *
     * @param entity
     * @return
     */
    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public BaseReturnResult edit(PropertiesEntity entity) {
        try {
            propertiesServcie.edit(entity);
            return MessageUtil.Success();
        } catch (Exception e) {
            e.printStackTrace();
            return MessageUtil.Exception(e);
        }
    }
    /**
     *
     * @param vo
     * @return
     */
    @RequestMapping(value = "/remove", method = RequestMethod.POST)
    public BaseReturnResult remove(PropertiesVo vo) {
        try {
            propertiesServcie.remove(vo);
            return MessageUtil.Success();
        } catch (Exception e) {
            return MessageUtil.Exception(e);
        }
    }

    /**
     *
     * @param method 方法名
     * @param regex 表达式
     * @return
     */
    @RequestMapping(value = "/check", method = RequestMethod.POST)
    public JSONObject check(String method,String regex) {
        JSONObject jsonObject=new JSONObject();
        boolean reg=MylogRegExUtil.stringRegEx(method,regex);
        boolean endPackage=MylogRegExUtil.stringRegEx(method,myLogConfig.getEndLogPackage())&&!MylogRegExUtil.stringRegEx(method,myLogConfig.getEndPackage());
        boolean endReturn=MylogRegExUtil.stringRegEx(method,myLogConfig.getEndReturn());
        boolean start=MylogRegExUtil.stringRegEx(method,myLogConfig.getStartLogPackage())&&!MylogRegExUtil.stringRegEx(method,myLogConfig.getStartPackage());
        jsonObject.put("reg",reg);
        jsonObject.put("endPackage",endPackage);
        jsonObject.put("endReturn",endReturn);
        jsonObject.put("start",start);
        return jsonObject;
    }
}
