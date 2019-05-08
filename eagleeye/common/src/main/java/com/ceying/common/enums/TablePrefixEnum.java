package com.ceying.common.enums;

/*
 * @description 表前缀
 * @author mzq
 * @date 2018/7/11
 * @param
 * @return
 */
public enum TablePrefixEnum implements BaseEnum<TablePrefixEnum, String>{

    SYSTEM("t_sys","scyp-system"),

    KEY("t_key","scyp-key"),

    BIZ("t_biz","scyp-biz"),

    ADDITION("t_add","scyp-addition");

    String key;
    String value;

    private TablePrefixEnum(String key, String value) {
        this.key=key;
        this.value=value;
    }

    @Override
    public String getKey() {
        return key;
    }
    public void setKey(String key) {
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
