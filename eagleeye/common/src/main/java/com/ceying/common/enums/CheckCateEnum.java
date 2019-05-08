package com.ceying.common.enums;

/**
 * @author: mzq
 * @date: 2018/4/12
 * @description :重启检查类型
 * @version: 2.0
 */
public enum CheckCateEnum implements BaseEnum <CheckCateEnum, String>{
    TASK("1","定时任务"),
    MYTRANSACTION_ROLLBACK_FAIL("2","分布式事务回滚失败");

    String key;
    String value;

    private CheckCateEnum(String key, String value) {
        this.key=key;
        this.value=value;
    }

    @Override
    public String getKey() {
        return key;
    }
    public void setKey(String value) {
        this.key = key;
    }

    @Override
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
}
