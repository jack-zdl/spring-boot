package com.ceying.chx.cpi.base.rm.tradeaccounts.dao;

import com.ceying.chx.cpi.base.rm.base.CrudDao;
import com.ceying.chx.cpi.base.rm.tradeaccounts.entity.TradeAccountsDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 功能说明: 运营系统调用查询平台信息组织<br>
 * 系统版本: 1.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2017/11/1<br>
 * <br>
 */
@Repository
public interface TradeaccountsDao extends CrudDao<TradeAccountsDto> {
    int listCountTotal(Map<String,Object> map);
    int queryDetailCountTotal(Map<String,Object> map);
    List<TradeAccountsDto> queryDetail(Map<String, Object> param);
    List<TradeAccountsDto> queryBalance(Map<String, Object> param);
    int queryBalanceCountTotal(Map<String,Object> map);
}
