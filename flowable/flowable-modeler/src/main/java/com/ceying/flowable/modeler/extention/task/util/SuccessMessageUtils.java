package com.ceying.flowable.modeler.extention.task.util;

import org.apache.kafka.common.utils.CopyOnWriteMap;

import java.util.Map;

/**
 * @author: fej
 * @date: 2018/5/22
 * @description :
 * @version: 2.0
 */
public class SuccessMessageUtils {

    private static ThreadLocal<Map<String,Object>> local = new ThreadLocal<Map<String,Object>>(){
        @Override
        protected Map<String,Object> initialValue() {
            return null;
        }
    };

    public static void set(Map<String,Object> map){
        local.set(map);
    }

    public static Map<String,Object> get(){
        Map<String,Object> map = local.get();
        remove();
        return map;
    }

    public static void remove(){
        local.remove();
    }
}
