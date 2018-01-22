package com.zhang.redis.controller;

import com.zhang.redis.entity.User;
import com.zhang.redis.service.RedisService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2018/1/20 20:33<br>
 */
@RestController
@RequestMapping("cpi/redis")
public class RedisController {

    @Resource
    private RedisService redisServiceImpl;
    @GetMapping(value = "/cache")
    @Cacheable("redis-key")
    public String redis(){
        System.out.println("没走缓存");
        return "cache";
    }

    @RequestMapping("/string")
    public String getCache(Integer id){
        switch (id){
            case 1:
                String a = redisServiceImpl.stringCache();
                System.out.println("1="+a);
                break;
            case 2:
                String b = redisServiceImpl.stringCache("1");
                System.out.println("2="+b);
                break;
            case 3:
                String c = redisServiceImpl.updateStringCache("1");
                System.out.println("3="+c);
                break;
            case 4:
                String d = redisServiceImpl.delStringCache("1");
                System.out.println("4="+d);
                break;
            case 5:
                User e = redisServiceImpl.objectCache("1");
                System.out.println("5="+e);
                break;
            case 6:
                User f = redisServiceImpl.updateCache("1");
                System.out.println("6="+f);
                break;
            case 7:
                User g = redisServiceImpl.delCache("1");
                System.out.println("7="+g);
                break;
        }
        return "ok";
    }
}
