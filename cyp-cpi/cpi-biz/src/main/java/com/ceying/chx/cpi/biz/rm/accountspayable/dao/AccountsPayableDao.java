package com.ceying.chx.cpi.biz.rm.accountspayable.dao;

import com.ceying.chx.cpi.biz.rm.accountspayable.entity.AccountsPayable;
import com.ceying.chx.cpi.biz.rm.base.CrudDao;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 功能说明: 根据核心企业ID、应付账款编号查询应付账款信息.
 * 系统版本: 1.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2017/10/26<br>
 * <br>
 */
@Repository
public interface AccountsPayableDao extends CrudDao<AccountsPayable> {
    public int countTotal(Map<String,Object> params);
}
