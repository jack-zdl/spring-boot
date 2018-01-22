package com.zhang.redis.service;

import com.zhang.redis.entity.User;

import javax.jws.soap.SOAPBinding;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2018/1/22 20:38<br>
 */
public interface RedisService {
    /**
     * 无参缓存方法
     * @return String
     */
    public String stringCache();

    /**
     * 有参缓存方法
     * @param id
     * @return
     */
    public String stringCache(String id);

    /**
     * 更新有参缓存方法
     * @return
     */
    public String updateStringCache(String id);

    /**
     * 删除有参缓存方法
     * @return
     */
    public String delStringCache(String id);
    /**
     * 有参对象缓存方法
     * @param id
     * @return
     */
    public User objectCache(String id);

    /**
     * 更新有参对象缓存方法
     * @param id
     * @return
     */
    public User updateCache(String id);

    /**
     * 删除有参对象缓存方法
     * @param id
     * @return
     */
    public User delCache(String id);
}
