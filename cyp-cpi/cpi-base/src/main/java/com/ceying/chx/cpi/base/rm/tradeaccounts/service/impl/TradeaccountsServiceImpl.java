package com.ceying.chx.cpi.base.rm.tradeaccounts.service.impl;

import com.ceying.chx.cpi.base.rm.tradeaccounts.dao.TradeaccountsDao;
import com.ceying.chx.cpi.base.rm.tradeaccounts.entity.TradeAccountsDto;
import com.ceying.chx.cpi.base.rm.tradeaccounts.service.TradeaccountsService;
import com.ceying.chx.cpi.base.util.response.RespJson;
import com.ceying.chx.cpi.base.util.response.RespJsonFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2017/11/2<br>
 * <br>
 */
@Service
public class TradeaccountsServiceImpl implements TradeaccountsService {
    @Resource
    private TradeaccountsDao tradeaccountsDao;

    @Override
    public RespJson list(Map<String,Object> params) {
        List<TradeAccountsDto> list = tradeaccountsDao.list(params);
        int result = tradeaccountsDao.listCountTotal(params);
        return RespJsonFactory.buildInfo(result,null,null,list);
    }
    @Override
    public RespJson tradeTransaction(Map<String,Object> params) {
        List<TradeAccountsDto> list = tradeaccountsDao.queryDetail(params);
        int result = tradeaccountsDao.queryDetailCountTotal(params);
        return RespJsonFactory.buildInfo(result,null,null,list);
    }
    @Override
    public RespJson tradeBalance(Map<String,Object> params) {
        List<TradeAccountsDto> list = tradeaccountsDao.queryBalance(params);
        int result = tradeaccountsDao.queryBalanceCountTotal(params);
        return RespJsonFactory.buildInfo(result,null,null,list);
    }
}