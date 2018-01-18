package com.ceying.chx.cpi.base.rm.organization.service.impl;

import com.ceying.chx.cpi.base.rm.organization.dao.OrganizationDao;
import com.ceying.chx.cpi.base.rm.organization.entity.OrganizationDto;
import com.ceying.chx.cpi.base.rm.organization.service.OrganizationService;
import com.ceying.chx.cpi.base.util.response.RespJson;
import com.ceying.chx.cpi.base.util.response.RespJsonFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2017/11/1<br>
 * <br>
 */
@Service
public class OrganizationServiceImpl implements OrganizationService {
    @Resource
    private OrganizationDao organizationDao;

    @Override
    public RespJson list(Map<String, Object> params) {
        List<OrganizationDto> list = organizationDao.list(params);
        int result = organizationDao.countTotal(params);
        return RespJsonFactory.buildInfo(result,null,null,list);
    }
    @Override
    public RespJson contact(Map<String, Object> params) {
        List<OrganizationDto> list = organizationDao.contact(params);
        int result = organizationDao.contactCount(params);
        return RespJsonFactory.buildInfo(result,null,null,list);
    }
}
