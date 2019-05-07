package com.ceying.chx.rcenter.bean;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @Author：huanghaiyun
 * @Date:2018/1/4
 */
public class NotifyTaskBean implements Serializable{
    //java 提供的自增长计数器
    private static final AtomicLong INVOKE_ID = new AtomicLong(0);
    //请求的id
    private Long id=newId();;
    private String regist;//注册中心
    private String address;//需要通知的数据
    private String name;//需要通知的数据
    private int times=0;
    public NotifyTaskBean(String regist,String address,String name){
        this.regist=regist;
        this.address=address;
        this.name=name;
    }
    public NotifyTaskBean(String regist,String address,String name,int times){
        this.regist=regist;
        this.address=address;
        this.name=name;
        this.times=times;
    }
    public String getRegist() {
        return regist;
    }

    public void setRegist(String regist) {
        this.regist = regist;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private static long newId() {
        // getAndIncrement()增长到MAX_VALUE时，再增长会变为MIN_VALUE，负数也可以做为ID
        return INVOKE_ID.getAndIncrement();
    }
    @Override
    public String toString() {
        return JSONObject.toJSONString(this);
    }
}
