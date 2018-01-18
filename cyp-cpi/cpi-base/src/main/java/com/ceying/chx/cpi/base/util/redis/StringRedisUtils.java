package com.ceying.chx.cpi.base.util.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

/**
 * 功能说明: 使用StringRedis操作<br>
 * 系统版本: 2.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2018/1/18 23:20<br>
 */

public class StringRedisUtils {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
}
