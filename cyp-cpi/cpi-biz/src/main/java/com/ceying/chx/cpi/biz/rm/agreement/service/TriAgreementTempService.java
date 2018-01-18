package com.ceying.chx.cpi.biz.rm.agreement.service;

import com.ceying.chx.cpi.biz.util.response.RespJson;

import java.util.Map;

/**
 * Created by jh on 2017/11/15.
 */
public interface TriAgreementTempService {

    /**
     * 查询到所有三方协议模板的集合
     * @return
     */
    RespJson list(Map<String,Object> params);
}
