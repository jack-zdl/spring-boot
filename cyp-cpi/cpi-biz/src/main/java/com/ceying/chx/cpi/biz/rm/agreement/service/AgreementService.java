package com.ceying.chx.cpi.biz.rm.agreement.service;

import com.ceying.chx.cpi.biz.util.response.RespJson;

import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl
 * 开发时间: 2017/11/9 14:31<br>
 * <br>
 */
public interface AgreementService {

    /**
     * 查询到所有三方协议的集合
     * @return
     */
    RespJson list(Map<String,Object>params);

    /**
     * 查询到指定ID的三方协议
     * @return
     */
    RespJson get(String id);
}
