package com.ceying.chx.cpi.biz.rm.accountspayable.service;

import com.ceying.chx.cpi.biz.util.response.RespJson;

import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2017/10/26<br>
 * <br>
 */
public interface AccountsPayableService {
    RespJson list(Map<String,Object> params);
    RespJson get(String id);
}
