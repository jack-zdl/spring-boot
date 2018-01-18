package com.ceying.chx.cpi.base.rm.appeal.service.impl;

import com.ceying.chx.cpi.base.rm.appeal.dao.AppealDao;
import com.ceying.chx.cpi.base.rm.appeal.entity.Appeal;
import com.ceying.chx.cpi.base.rm.appeal.service.AppealService;
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
public class AppealServiceImpl implements AppealService {

    @Resource
    private AppealDao appealDao;

    @Override
    public RespJson list(Map<String,Object> params) {
        List<Appeal> list = appealDao.list(params);
        int result = appealDao.listCount(params);
        return RespJsonFactory.buildInfo(result,null,null,list);
    }
}
