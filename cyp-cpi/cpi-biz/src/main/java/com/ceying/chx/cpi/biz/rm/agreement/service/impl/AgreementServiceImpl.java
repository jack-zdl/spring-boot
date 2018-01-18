package com.ceying.chx.cpi.biz.rm.agreement.service.impl;

import com.ceying.chx.cpi.biz.rm.agreement.dao.TripartiteAgreementDao;
import com.ceying.chx.cpi.biz.rm.agreement.entity.TripartiteAgreement;
import com.ceying.chx.cpi.biz.rm.agreement.service.AgreementService;
import com.ceying.chx.cpi.biz.util.response.RespJson;
import com.ceying.chx.cpi.biz.util.response.RespJsonFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/9 18:11<br>
 * <br>
 */

@Service
public class AgreementServiceImpl implements AgreementService{

    @Resource
    private TripartiteAgreementDao tripartiteAgreementDao;

    @Override
    public
    RespJson list(Map<String,Object> params) {
        List<TripartiteAgreement> list = tripartiteAgreementDao.list(params);
        int result = tripartiteAgreementDao.listCount(params);
        return RespJsonFactory.buildSuccess(list);
    }

    @Override
    public
    RespJson get(String id) {
        return null;
    }
}
