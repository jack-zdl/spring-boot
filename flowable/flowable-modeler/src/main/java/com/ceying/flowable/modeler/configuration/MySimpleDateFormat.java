package com.ceying.flowable.modeler.configuration;

import com.ceying.flowable.modeler.common.DateConvert;

import java.text.*;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author: fej
 * @date: 2018/5/31
 * @description :
 * @version: 2.0
 */
public class MySimpleDateFormat extends SimpleDateFormat {

    public MySimpleDateFormat(String pattern) {
        super(pattern);
    }

    public MySimpleDateFormat(String pattern, Locale locale) {
        super(pattern, locale);
    }

    public MySimpleDateFormat(String pattern, DateFormatSymbols formatSymbols) {
        super(pattern, formatSymbols);
    }

    @Override
    public Date parse(String text, ParsePosition pos) {
        /**
         * 设置处理长度,不设置处理长度会报解析报错
         */
        pos.setIndex(text.length());
        DateConvert dateConvert = new DateConvert();
        return dateConvert.convert(text);
    }
}
