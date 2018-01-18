package com.ceying.chx.cpi.base.rm.bigcontract.service;

import com.ceying.chx.cpi.base.util.response.RespJson;

import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: jh
 * 开发时间: 2017/11/15<br>
 * <br>
 */
public interface BigContractService {

    /**
     * 查询到所有供应商的集合
     * @return
     */
    RespJson list(Map<String, Object> params);
}
