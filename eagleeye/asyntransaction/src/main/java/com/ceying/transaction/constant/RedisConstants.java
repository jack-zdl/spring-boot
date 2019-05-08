package com.ceying.transaction.constant;

/**
 * 功能说明: 自定义redis key <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/6/12<br>
 * <br>
 */
public class RedisConstants {
    /**
     * 分布式事务 在redis 中的key
     */
    public static final String MYTRANSACTION="MyTransaction:";
    /**
     * 回滚失败的 事物
     */
    public static final String FAIlTRANSACTION="failTransaction:";
}
