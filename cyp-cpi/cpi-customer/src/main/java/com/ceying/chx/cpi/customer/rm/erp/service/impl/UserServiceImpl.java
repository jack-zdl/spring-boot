package com.ceying.chx.cpi.customer.rm.erp.service.impl;

import com.ceying.chx.cpi.customer.rm.erp.dao.UserServiceDao;
import com.ceying.chx.cpi.customer.rm.erp.entity.SysUser;
import com.ceying.chx.cpi.customer.rm.erp.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by cyp on 2017/12/4.
 */
@Service
public class UserServiceImpl implements UserService<SysUser> {

    @Resource
    private UserServiceDao userServiceDao;

    @Override
    public SysUser get(SysUser sysUser) {
        SysUser retSysUser = userServiceDao.get(sysUser.getUser_id());
        return retSysUser;
    }
}
