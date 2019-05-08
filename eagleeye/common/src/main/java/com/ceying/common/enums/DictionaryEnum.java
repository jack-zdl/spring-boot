package com.ceying.common.enums;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author: mzq
 * @date: 2018/6/11
 * @description :字典
 * @version: 2.0
 */
public enum DictionaryEnum implements BaseEnum<DictionaryEnum, String> {
    YES_OR_NO("YES_OR_NO","是否(√/×)"),
    ORG_CATE("ORG_CATE","组织分类"),
    ORG_LEVEL("ORG_LEVEL","组织级别"),
    CONNACT_CATE("CONNACT_CATE","联系人类别");
    String key;
    String value;

    private DictionaryEnum(String key, String value) {
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
