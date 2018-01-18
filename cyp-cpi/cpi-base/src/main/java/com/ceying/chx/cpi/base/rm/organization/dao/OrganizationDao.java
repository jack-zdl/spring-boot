package com.ceying.chx.cpi.base.rm.organization.dao;

import com.ceying.chx.cpi.base.rm.base.CrudDao;
import com.ceying.chx.cpi.base.rm.organization.entity.OrganizationDto;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * 功能说明: 运营系统调用查询平台信息组织<br>
 * 系统版本: 1.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2017/11/1<br>
 * <br>
 */
@Repository
public interface OrganizationDao extends CrudDao<OrganizationDto> {
    int countTotal(Map<String,Object> map);
    int contactCount(Map<String,Object> map);
    List<OrganizationDto> contact(Map<String,Object> map);
}
