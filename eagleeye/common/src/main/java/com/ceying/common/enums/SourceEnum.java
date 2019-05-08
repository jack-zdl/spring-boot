package com.ceying.common.enums;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author: mzq
 * @date: 2018/6/11
 * @description :数据来源
 * @version: 2.0
 */
public enum SourceEnum implements BaseEnum<SourceEnum, String> {
    HAND("1","手工录入"),
    FILELOAD("2","文件导入"),
    SYSTEM("3","系统生成"),
    SYSTEMINTERFACE("4","对接系统"),
    RONGHUI("5","融汇平台"),
    DIRECTBANK("6","银企直联"),
    INTERNALINTEREST("7","内部计息");
    String key;
    String value;

    private SourceEnum(String key, String value) {
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
