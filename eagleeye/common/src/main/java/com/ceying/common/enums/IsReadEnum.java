package com.ceying.common.enums;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/6/19<br>
 * <br>
 */
public enum IsReadEnum implements BaseEnum<IsReadEnum, String> {

    /**
     * 未读【0】
     */
    NO("0","未读"),
    /**
     * 已读【1】
     */
    YES("1","已读");
    String key;
    String value;

    IsReadEnum(String key,String value){
        this.key=key;
        this.value=value;
    }
    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public String getValue() {
        return this.value;
    }

}
