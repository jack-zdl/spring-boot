package com.ceying.eagleeye.consumer.entity;

import com.ceying.common.enums.ApplicationNameEnum;
import com.ceying.common.enums.ConfigTypeEnum;
import com.ceying.common.util.annotation.EnumConver;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/4/19<br>
 * <br>
 */
@Table(name = "t_sys_properties")
public class PropertiesEntity {
    @Id
    private String urid;
    @Column(name = "key_name")
    private String keyName;
    @Column(name = "value_val")
    private String valueVal;

    @EnumConver(enumType = ApplicationNameEnum.class)
    private String application;

    @EnumConver(enumType = ConfigTypeEnum.class)
    private String profile;
    private String lable="trunk";

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid;
    }

    public String getKeyName() {
        return keyName;
    }

    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getValueVal() {
        return valueVal;
    }

    public void setValueVal(String valueVal) {
        this.valueVal = valueVal;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }
}
