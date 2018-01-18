package com.ceying.chx.cpi.base.rm.base.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TripartiteagreementTemplateEntity implements Serializable {
    private String urid;

    private String tenantId;

    private String tatemplateCode;

    private Integer tatemplateVersion;

    private String bankId;

    private String corecompanyId;

    private BigDecimal creditLimit;

    private String isresourse;

    private String isactive;

    private String createby;

    private Date createdon;

    private String lastModifiedby;

    private Date lastModifiedon;

    private BigDecimal rowversion;

    private String description;

    private String lastOperateflag;

    private String businesstype;

    private byte[] templateContent;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public String getTatemplateCode() {
        return tatemplateCode;
    }

    public void setTatemplateCode(String tatemplateCode) {
        this.tatemplateCode = tatemplateCode == null ? null : tatemplateCode.trim();
    }

    public Integer getTatemplateVersion() {
        return tatemplateVersion;
    }

    public void setTatemplateVersion(Integer tatemplateVersion) {
        this.tatemplateVersion = tatemplateVersion;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public String getCorecompanyId() {
        return corecompanyId;
    }

    public void setCorecompanyId(String corecompanyId) {
        this.corecompanyId = corecompanyId == null ? null : corecompanyId.trim();
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getIsresourse() {
        return isresourse;
    }

    public void setIsresourse(String isresourse) {
        this.isresourse = isresourse == null ? null : isresourse.trim();
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive == null ? null : isactive.trim();
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getLastModifiedby() {
        return lastModifiedby;
    }

    public void setLastModifiedby(String lastModifiedby) {
        this.lastModifiedby = lastModifiedby == null ? null : lastModifiedby.trim();
    }

    public Date getLastModifiedon() {
        return lastModifiedon;
    }

    public void setLastModifiedon(Date lastModifiedon) {
        this.lastModifiedon = lastModifiedon;
    }

    public BigDecimal getRowversion() {
        return rowversion;
    }

    public void setRowversion(BigDecimal rowversion) {
        this.rowversion = rowversion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLastOperateflag() {
        return lastOperateflag;
    }

    public void setLastOperateflag(String lastOperateflag) {
        this.lastOperateflag = lastOperateflag == null ? null : lastOperateflag.trim();
    }

    public String getBusinesstype() {
        return businesstype;
    }

    public void setBusinesstype(String businesstype) {
        this.businesstype = businesstype == null ? null : businesstype.trim();
    }

    public byte[] getTemplateContent() {
        return templateContent;
    }

    public void setTemplateContent(byte[] templateContent) {
        this.templateContent = templateContent;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urid=").append(urid);
        sb.append(", tenantId=").append(tenantId);
        sb.append(", tatemplateCode=").append(tatemplateCode);
        sb.append(", tatemplateVersion=").append(tatemplateVersion);
        sb.append(", bankId=").append(bankId);
        sb.append(", corecompanyId=").append(corecompanyId);
        sb.append(", creditLimit=").append(creditLimit);
        sb.append(", isresourse=").append(isresourse);
        sb.append(", isactive=").append(isactive);
        sb.append(", createby=").append(createby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastModifiedby=").append(lastModifiedby);
        sb.append(", lastModifiedon=").append(lastModifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", lastOperateflag=").append(lastOperateflag);
        sb.append(", businesstype=").append(businesstype);
        sb.append(", templateContent=").append(templateContent);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}