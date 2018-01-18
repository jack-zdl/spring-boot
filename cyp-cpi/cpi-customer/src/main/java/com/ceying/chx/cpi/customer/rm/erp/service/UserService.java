package com.ceying.chx.cpi.customer.rm.erp.service;

import com.ceying.chx.cpi.customer.rm.erp.entity.SysUser;

/**
 * Created by cyp on 2017/12/4.
 */
public interface UserService<T> {

    T get(T sysUser);
}
