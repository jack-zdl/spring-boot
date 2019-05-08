package com.ceying.eagleeye.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 功能说明<br>
 * mylog 用到的 正则表达式匹配 工具类 <br>
 * 用于过滤，那些方法不需要打印日志 <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/4/17<br>
 * <br>
 */
public class MylogRegExUtil {

    private static final Logger log = LoggerFactory.getLogger(MylogRegExUtil.class);
    /**
     * 匹配正则表达式
     * @param method
     * @param regEx
     * @return
     */
    public static boolean  stringRegEx(String method, String[] regEx){
        if(regEx!=null){
            for(String re:regEx){
                if(stringRegEx(method,re)){
                    return true;
                }
            }
        }
        return false;
    }
    /**
     * 匹配正则表达式
     * @param method
     * @param regEx
     * @return
     */
    public static boolean stringRegEx(String method, String regEx){
        boolean result= false;
        try {
            if(method==null||regEx==null){
                return false;
            }
            if(method.equals(regEx)||method.contains(regEx)){
                result=true;
                return result;
            }
            Pattern p=Pattern.compile(regEx);
            Matcher m=p.matcher(method);
            result = m.find();
        } catch (Exception e) {
            log.debug("校验错误",e);
        } finally {
            return  result;
        }
    }

}
