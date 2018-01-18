package com.ceying.chx.cpi.base.rm.tradeaccounts.service;

import com.ceying.chx.cpi.base.util.response.RespJson;

import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2017/11/1<br>
 * <br>
 */
public interface TradeaccountsService {
    RespJson list(Map<String, Object> params);
    RespJson tradeTransaction(Map<String, Object> params);
    RespJson tradeBalance(Map<String, Object> params);
}
