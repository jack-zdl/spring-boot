package com.ceying.eagleeye.consumer.vo;

import com.ceying.common.constant.ConditionTypeConstant;
import com.ceying.common.util.annotation.Condition;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/4/20<br>
 * <br>
 */
public class PropertiesVo {
    @Condition
    private String urid;
    @Condition(type = ConditionTypeConstant.LIKE)
    private String keyName;
    @Condition
    private String valueVal;
    @Condition
    private String application;
    @Condition
    private String profile;
    @Condition
    private String lable;

    //批量操作的ids
    private String ids;

    //排序字段
    private String sidx;
    //排序类型(降序,升序)
    private String sord;
    //页码
    private Integer page=1;
    //行数
    private Integer rows=50;

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

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }
}
