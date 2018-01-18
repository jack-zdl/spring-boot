package com.ceying.chx.cpi.base.rm.base.dto;

import java.io.Serializable;
import java.util.Date;

public class TaTemplateOperationsEntity implements Serializable {
    private String urid;

    private String tatemplateId;

    private String operator;

    private String operateOrgId;

    private Date operateDate;

    private String operateFlag;

    private String signature;

    private String createdby;

    private Date createdon;

    private String lastmodifiedby;

    private Date lastmodifiedon;

    private Integer rowversion;

    private String description;

    private String relateoperateId;

    private String blockchainaddress;

    private static final long serialVersionUID = 1L;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid == null ? null : urid.trim();
    }

    public String getTatemplateId() {
        return tatemplateId;
    }

    public void setTatemplateId(String tatemplateId) {
        this.tatemplateId = tatemplateId == null ? null : tatemplateId.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getOperateOrgId() {
        return operateOrgId;
    }

    public void setOperateOrgId(String operateOrgId) {
        this.operateOrgId = operateOrgId == null ? null : operateOrgId.trim();
    }

    public Date getOperateDate() {
        return operateDate;
    }

    public void setOperateDate(Date operateDate) {
        this.operateDate = operateDate;
    }

    public String getOperateFlag() {
        return operateFlag;
    }

    public void setOperateFlag(String operateFlag) {
        this.operateFlag = operateFlag == null ? null : operateFlag.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby == null ? null : createdby.trim();
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby == null ? null : lastmodifiedby.trim();
    }

    public Date getLastmodifiedon() {
        return lastmodifiedon;
    }

    public void setLastmodifiedon(Date lastmodifiedon) {
        this.lastmodifiedon = lastmodifiedon;
    }

    public Integer getRowversion() {
        return rowversion;
    }

    public void setRowversion(Integer rowversion) {
        this.rowversion = rowversion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getRelateoperateId() {
        return relateoperateId;
    }

    public void setRelateoperateId(String relateoperateId) {
        this.relateoperateId = relateoperateId == null ? null : relateoperateId.trim();
    }

    public String getBlockchainaddress() {
        return blockchainaddress;
    }

    public void setBlockchainaddress(String blockchainaddress) {
        this.blockchainaddress = blockchainaddress == null ? null : blockchainaddress.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", urid=").append(urid);
        sb.append(", tatemplateId=").append(tatemplateId);
        sb.append(", operator=").append(operator);
        sb.append(", operateOrgId=").append(operateOrgId);
        sb.append(", operateDate=").append(operateDate);
        sb.append(", operateFlag=").append(operateFlag);
        sb.append(", signature=").append(signature);
        sb.append(", createdby=").append(createdby);
        sb.append(", createdon=").append(createdon);
        sb.append(", lastmodifiedby=").append(lastmodifiedby);
        sb.append(", lastmodifiedon=").append(lastmodifiedon);
        sb.append(", rowversion=").append(rowversion);
        sb.append(", description=").append(description);
        sb.append(", relateoperateId=").append(relateoperateId);
        sb.append(", blockchainaddress=").append(blockchainaddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}