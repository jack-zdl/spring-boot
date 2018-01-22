package com.zhang.redis.service.impl;

import com.zhang.redis.entity.User;
import com.zhang.redis.service.RedisService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2018/1/22 20:56<br>
 */
@Service
public class RedisServiceImpl implements RedisService {


    @Override
    @Cacheable(value = "string")
    public
    String stringCache() {
        System.out.println("StringCache没有进入缓存");
        return "无参String";
    }

    /**
     * 如果你传递的是对象，那么你可以选择 @CachePut(value = "user", key = "'user'.concat(#user.id.toString())")
     * @param id
     * @return
     */
    @Override
    @Cacheable(value = "cache",key = "'cache'.concat(#id)")
    public
    String stringCache(String id) {
        System.out.println("StringCache有参没有进入缓存");
        return id;
    }

    /**
     * @CachePut 是每次都进入方法中，并将结果缓存到redis中
     * @param id
     * @return
     */
    @Override
    @CachePut(value = "cache", key = "'cache'.concat(#id)")
    public
    String updateStringCache(String id) {
        System.out.println("StringCache有参更新没有进入缓存");
        return "更新"+id;
    }

    /**
     * 每次都进入方法中，并将该redis中的key删除
     * @param id
     * @return
     */
    @Override
    @CacheEvict(value="cache",key="'cache'.concat(#id)")
    public String delStringCache(String id) {
        System.out.println("StringCache有参删除没有进入缓存");
        return "删除"+id;
    }

    /**
     * 保存到数据中  [
     "com.zhang.redis.entity.User",
     {
     "username": "username",
     "password": "password"
     }
     ]
     * @param id
     * @return
     */
    @Override
    @Cacheable(value = "user",key = "'user'.concat(#id)")
    public User objectCache(String id) {
        System.out.println("StringCache有参查询没有进入缓存");
        User user = new User("username","password");
        return user;
    }

    @Override
    @CachePut(value = "user", key = "'user'.concat(#id)")
    public User updateCache(String id) {
        System.out.println("StringCache有参更新没有进入缓存");
        User user = new User("user","pass");
        return user;
    }

    @Override
    @CacheEvict(value = "user", key = "'user'.concat(#id)")
    public User delCache(String id) {
        System.out.println("StringCache有参删除没有进入缓存");
        User user = new User("null","null");
        return user;
    }
}
