package com.ceying.chx.rcenter.enums;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/2<br>
 * <br>
 */
public enum  RedisKeyEnums {
    /**
     * rpc服务对应的列表
     */
    SERVICEMAPKEY("serviceMapKey"),
    /**
     * 待通知服务 列表key
     */
    NOTIFYLISTKEY("noifyListKey"),
    /**
     * 待通知服务key
     */
    NOTIFYVALUEKEY("noifyvalue"),;

    private String value;

    RedisKeyEnums(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
