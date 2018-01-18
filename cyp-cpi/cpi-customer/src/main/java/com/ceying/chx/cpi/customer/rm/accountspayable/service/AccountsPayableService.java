package com.ceying.chx.cpi.customer.rm.accountspayable.service;

import com.ceying.chx.cpi.customer.rm.accountspayable.entity.AccountsInfoDto;

/**
 * Created by cyp on 2017/12/4.
 */
public interface AccountsPayableService<T> {

    T get(String payableno);
}
