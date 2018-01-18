package com.ceying.chx.cpi.base.rm.supplieraccount.service.impl;

import com.ceying.chx.cpi.base.rm.supplieraccount.dao.SupplierAccountDao;
import com.ceying.chx.cpi.base.rm.supplieraccount.entity.SupplierAccount;
import com.ceying.chx.cpi.base.rm.supplieraccount.service.SupplierAccountService;
import com.ceying.chx.cpi.base.util.response.RespJson;
import com.ceying.chx.cpi.base.util.response.RespJsonFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: jh
 * 开发时间: 2017/11/15<br>
 * <br>
 */
@Service
public class SupplierAccountServiceImpl implements SupplierAccountService {

    @Resource
    private SupplierAccountDao supplierAccountDao;

    @Override
    public RespJson list(Map<String,Object> params) {
        List<SupplierAccount> list = supplierAccountDao.list(params);
        int result=supplierAccountDao.listCount(params);
        return RespJsonFactory.buildInfo(result,null,null,list);
    }
}
