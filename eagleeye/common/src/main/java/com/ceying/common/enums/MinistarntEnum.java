package com.ceying.common.enums;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author: mzq
 * @date: 2018/6/11
 * @description :辅助查询
 * @version: 2.0
 */
public enum MinistarntEnum implements BaseEnum<MinistarntEnum, String> {
    BANKS("BANKS","银行"),
    AREAS("AREAS","区域"),
    BANKLOCATIONS("BANKLOCATIONS","开户银行"),
    WARNINGOBJECT("WARNINGOBJECT","预警对象"),
    DICTIONARY("DICTIONARY","查询字典");
    String key;
    String value;

    private MinistarntEnum(String key, String value) {
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
    public static final Map<String, String> map = new TreeMap<String, String>();
}
