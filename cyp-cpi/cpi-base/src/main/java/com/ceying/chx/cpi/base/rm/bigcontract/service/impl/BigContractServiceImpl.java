package com.ceying.chx.cpi.base.rm.bigcontract.service.impl;

import com.ceying.chx.cpi.base.rm.bigcontract.dao.BigContractDao;
import com.ceying.chx.cpi.base.rm.bigcontract.entity.BigContractDto;
import com.ceying.chx.cpi.base.rm.bigcontract.service.BigContractService;
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
public class BigContractServiceImpl implements BigContractService {

    @Resource
    private BigContractDao bigContractDao;

    @Override
    public RespJson list(Map<String,Object> params ) {
        List<BigContractDto> list = bigContractDao.list(params);
        int result = bigContractDao.countTotal(params);
        return RespJsonFactory.buildInfo(result,null,null,list);
    }
}
