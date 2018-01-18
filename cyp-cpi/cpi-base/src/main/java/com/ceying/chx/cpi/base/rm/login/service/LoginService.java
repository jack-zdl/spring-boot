package com.ceying.chx.cpi.base.rm.login.service;

import com.ceying.chx.cpi.base.exception.ParamException;
import com.ceying.chx.cpi.base.rm.login.vo.LoginVO;
import com.ceying.chx.cpi.base.util.response.RespJson;

import java.util.Map;

/**
 * 功能说明:  <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/9 18:41<br>
 * <br>
 */
public interface LoginService {

    RespJson login(LoginVO loginVO) throws ParamException;
}
