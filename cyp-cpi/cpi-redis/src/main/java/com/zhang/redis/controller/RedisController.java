package com.zhang.redis.controller;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2018/1/20 20:33<br>
 */
@RestController
@RequestMapping("cpi/redis")
public class RedisController {

    @GetMapping(value = "cache")
    @Cacheable("redis-key")
    public String redis(){
        System.out.println("没走缓存");
        return "cache";
    }
}
