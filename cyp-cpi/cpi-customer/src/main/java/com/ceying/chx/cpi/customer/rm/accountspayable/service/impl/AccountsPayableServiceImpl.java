package com.ceying.chx.cpi.customer.rm.accountspayable.service.impl;

import com.ceying.chx.cpi.customer.rm.accountspayable.dao.AccountsPayableDao;
import com.ceying.chx.cpi.customer.rm.accountspayable.entity.AccountsInfoDto;
import com.ceying.chx.cpi.customer.rm.accountspayable.service.AccountsPayableService;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

/**
 * Created by cyp on 2017/12/4.
 */
@Service
public class AccountsPayableServiceImpl implements AccountsPayableService<AccountsInfoDto> {

    @Resource
    private AccountsPayableDao accountsPayableDao;

    @Override
    public AccountsInfoDto get(String payableno) {
        if(!StringUtils.hasText(payableno)){
            return null;
        }
        AccountsInfoDto accountsInfoDto = accountsPayableDao.get(payableno);
        return accountsInfoDto;
    }
}
