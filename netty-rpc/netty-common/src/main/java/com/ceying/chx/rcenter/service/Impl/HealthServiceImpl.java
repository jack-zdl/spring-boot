package com.ceying.chx.rcenter.service.Impl;

import com.ceying.chx.rcenter.bean.Url;
import com.ceying.chx.rcenter.client.RpcServiceFactory;
import com.ceying.chx.rcenter.server.RpcService;
import com.ceying.chx.rcenter.service.HealthServce;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/5<br>
 * <br>
 */
@RpcService(HealthServce.class)
@Service
public class HealthServiceImpl implements HealthServce {
    private Logger LOGGER = LoggerFactory.getLogger(HealthServiceImpl.class);
    @Autowired
    private RpcServiceFactory rpcServiceFactory;
    @Override
    public void ping() {
        return;
    }

    @Override
    public Long getPingTime(Url url) {
        HealthServce servce= rpcServiceFactory.createByUrl(HealthServce.class,url.getUrl());
        long start=System.currentTimeMillis();
        try {
            servce.ping();
        } catch (Exception e) {
            LOGGER.error("服务健康检测",e);
            return -1L;
        }
        long end=System.currentTimeMillis();
        return end-start;
    }
}
