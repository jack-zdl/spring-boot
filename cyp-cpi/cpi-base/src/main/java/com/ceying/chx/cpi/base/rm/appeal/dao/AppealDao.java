package com.ceying.chx.cpi.base.rm.appeal.dao;


import com.ceying.chx.cpi.base.rm.appeal.entity.Appeal;
import com.ceying.chx.cpi.base.rm.base.CrudDao;
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
public interface AppealDao extends CrudDao<Appeal> {
    int listCount(Map<String,Object> map);
}
