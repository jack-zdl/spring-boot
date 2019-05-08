package com.ceying.common.enums;

/**
 * 功能说明:消息 优先级<br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/7/13<br>
 * <br>
 */
public enum PriorityEnum implements BaseEnum<IsReadEnum, String> {

    /**
     * 重要【0】
     */
    Important("0","重要"),
    /**
     * 已读【1】
     */
    Normal("1","普通");
    String key;
    String value;

    PriorityEnum(String key,String value){
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
