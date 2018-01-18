package com.ceying.chx.cpi.base.rm.org.service;

import com.ceying.chx.cpi.base.exception.ParamException;
import com.ceying.chx.cpi.base.exception.RedisConnectException;
import com.ceying.chx.cpi.base.util.response.RespJson;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl
 * 开发时间: 2017/11/9 11:05<br>
 * <br>
 */

public interface OrgService {

    /**
     * 查询到所有组织的集合
     * @return
     */
    RespJson list() throws ParamException, RedisConnectException;

    /**
     * 查询到指定ID的组织
     * @return
     */
    RespJson get();
}
