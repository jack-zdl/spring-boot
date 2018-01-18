package com.ceying.chx.cpi.biz.rm.accountspayable.service.impl;

import com.ceying.chx.cpi.biz.rm.accountspayable.dao.AccountsPayableDao;
import com.ceying.chx.cpi.biz.rm.accountspayable.entity.AccountsPayable;
import com.ceying.chx.cpi.biz.rm.accountspayable.service.AccountsPayableService;
import com.ceying.chx.cpi.biz.util.response.RespJson;
import com.ceying.chx.cpi.biz.util.response.RespJsonFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2017/10/25<br>
 * <br>
 */
@Service
public class AccountsPayableServiceImpl implements AccountsPayableService {
    @Resource
    private AccountsPayableDao accountsPayableDao;
    @Override
    public RespJson list(Map<String,Object> params) {
        List<AccountsPayable> list = accountsPayableDao.list(params);
        int total = accountsPayableDao.countTotal(params);

        return RespJsonFactory.buildInfo(total,null,null,list);
    }
    @Override
    public
    RespJson get(String id) {
        return null;
    }
}
