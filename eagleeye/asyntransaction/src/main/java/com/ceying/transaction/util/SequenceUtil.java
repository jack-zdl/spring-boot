package com.ceying.transaction.util;

import org.apache.commons.lang.StringUtils;

import java.util.UUID;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/7/3<br>
 * <br>
 */
public class SequenceUtil {
    public static String UUID(){
        String uuid = UUID.randomUUID().toString();
        return StringUtils.replace(uuid, "-", "");
    }
}
