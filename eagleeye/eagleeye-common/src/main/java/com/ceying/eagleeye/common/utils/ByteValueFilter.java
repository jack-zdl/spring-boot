package com.ceying.eagleeye.common.utils;

import com.alibaba.fastjson.serializer.ValueFilter;

/**
 * 功能说明: fastjson 序列化过滤器 遇到byte[] 直接跳过  <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/6/15<br>
 * <br>
 */
public class ByteValueFilter implements ValueFilter {
    @Override
    public Object process(Object src, String name, Object value) {
        if(value instanceof byte[]){
            return null;
        }
        return value;
    }
}
