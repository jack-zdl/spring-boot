package com.ceying.chx.cpi.biz.rm.agreement.entity;

import com.ceying.chx.cpi.biz.rm.base.CommonBaseObject;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 三方协议模板实体类 pojo类——辅助类 属性名全部小写
 * 对应的数据库的T_TRIPARTITEAGREEMENTTEMPLETE（三方协议模板表）
 * @author lidf
 * @version v1.0
 * @date 2017/6/20 9:55
 */
public class TriAgreementTemp extends CommonBaseObject implements Serializable {

    @Override
    public String getTableName() {
        return "T_TRIPARTITEAGREEMENTTEMPLATE";
    }

    /**
     * 三方协议模板ID
     */
    private String urid;

    /**
     * 租户ID
     */
    private BigDecimal tenantid;

    /**
     * 三方协议模板编号
     */
    private String tatemplatecode;

    /**
     * 三方协议模板版本
     */
    private BigDecimal tatemplateversion;

    /**
     * 银行ID
     */
    private String bankid;

    /**
     * 核心企业ID
     */
    private String corecompanyid;

    /**
     * 授信额度
     */
    private BigDecimal creditlimits;

    /**
     * 有追无追
     */
    private String isrecourse;

    /**
     * 模板内容
     */
        private byte[] templatecontent;

    /**
     * 最后一个操作ID
     */
    private String  lastoperateflag;
    /**

     * 是否有效
     */
    private String isactive;


    /**
     * 描述
     */
    private String description;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid;
    }

    public BigDecimal getTenantid() {
        return tenantid;
    }

    public void setTenantid(BigDecimal tenantid) {
        this.tenantid = tenantid;
    }

    public String getTatemplatecode() {
        return tatemplatecode;
    }

    public void setTatemplatecode(String tatemplatecode) {
        this.tatemplatecode = tatemplatecode;
    }

    public BigDecimal getTatemplateversion() {
        return tatemplateversion;
    }

    public void setTatemplateversion(BigDecimal tatemplateversion) {
        this.tatemplateversion = tatemplateversion;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public String getCorecompanyid() {
        return corecompanyid;
    }

    public void setCorecompanyid(String corecompanyid) {
        this.corecompanyid = corecompanyid;
    }

    public BigDecimal getCreditlimits() {
        return creditlimits;
    }

    public void setCreditlimits(BigDecimal creditlimits) {
        this.creditlimits = creditlimits;
    }

    public String getIsrecourse() {
        return isrecourse;
    }

    public void setIsrecourse(String isrecourse) {
        this.isrecourse = isrecourse;
    }

    public byte[] getTemplatecontent() {
        return templatecontent;
    }

    public void setTemplatecontent(byte[] templatecontent) {
        this.templatecontent = templatecontent;
    }

    public String getLastoperateflag() {
        return lastoperateflag;
    }

    public void setLastoperateflag(String lastoperateflag) {
        this.lastoperateflag = lastoperateflag;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
