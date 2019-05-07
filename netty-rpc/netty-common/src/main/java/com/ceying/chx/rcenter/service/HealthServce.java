package com.ceying.chx.rcenter.service;

import com.ceying.chx.rcenter.bean.Url;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/5<br>
 * <br>
 */
public interface HealthServce {
    /**
     * 检测连通性
     */
    void ping();
    Long getPingTime(Url url);
}
