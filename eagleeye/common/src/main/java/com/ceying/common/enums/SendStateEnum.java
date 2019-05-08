package com.ceying.common.enums;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author: mzq
 * @date: 2018/6/11
 * @description :短信发送状态
 * @version: 2.0
 */
public enum SendStateEnum implements BaseEnum<SendStateEnum, String> {
    NOTSEND("1","未发送"),
    SENDED("2","已发送"),
    SENDFAILURE("3","发送失败"),
    SENDING("4","发送中");
    String key;
    String value;

    private SendStateEnum(String key, String value) {
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
