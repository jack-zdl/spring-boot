package com.ceying.chx.cpi.biz.rm.agreement.dao;


import com.ceying.chx.cpi.biz.rm.agreement.entity.TriAgreementTemp;
import com.ceying.chx.cpi.biz.rm.base.CrudDao;
import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: jh
 * 开发时间: 2017/11/6 16:42<br>
 * <br>
 */
@Repository
public interface TriAgreementTempDao extends CrudDao<TriAgreementTemp> {
    int listCount(Map<String,Object> map);
}
