package com.ceying.chx.cpi.biz.rm.agreement.service.impl;

import com.ceying.chx.cpi.biz.rm.agreement.dao.TriAgreementTempDao;
import com.ceying.chx.cpi.biz.rm.agreement.entity.TriAgreementTemp;
import com.ceying.chx.cpi.biz.rm.agreement.service.TriAgreementTempService;
import com.ceying.chx.cpi.biz.util.response.RespJson;
import com.ceying.chx.cpi.biz.util.response.RespJsonFactory;
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
public class TriAgreementTempServiceImpl implements TriAgreementTempService {

    @Resource
    private TriAgreementTempDao triAgreementTempDao;

    @Override
    public RespJson list(Map<String,Object> params) {
        List<TriAgreementTemp> list = triAgreementTempDao.list(params);
        int result=triAgreementTempDao.listCount(params);
        return RespJsonFactory.buildSuccess(list);
    }

}
