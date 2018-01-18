package com.ceying.chx.cpi.base.rm.base.dto;

import java.io.Serializable;

public class SubTransEntity implements Serializable {
    private String transCode;

    private String subTransCode;

    private String subTransName;

    private String relServ;

    private String relUrl;

    private String ctrlFlag;

    private String loginFlag;

    private String remark;

    private String extField1;

    private String extField2;

    private String extField3;

    private static final long serialVersionUID = 1L;

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode == null ? null : transCode.trim();
    }

    public String getSubTransCode() {
        return subTransCode;
    }

    public void setSubTransCode(String subTransCode) {
        this.subTransCode = subTransCode == null ? null : subTransCode.trim();
    }

    public String getSubTransName() {
        return subTransName;
    }

    public void setSubTransName(String subTransName) {
        this.subTransName = subTransName == null ? null : subTransName.trim();
    }

    public String getRelServ() {
        return relServ;
    }

    public void setRelServ(String relServ) {
        this.relServ = relServ == null ? null : relServ.trim();
    }

    public String getRelUrl() {
        return relUrl;
    }

    public void setRelUrl(String relUrl) {
        this.relUrl = relUrl == null ? null : relUrl.trim();
    }

    public String getCtrlFlag() {
        return ctrlFlag;
    }

    public void setCtrlFlag(String ctrlFlag) {
        this.ctrlFlag = ctrlFlag == null ? null : ctrlFlag.trim();
    }

    public String getLoginFlag() {
        return loginFlag;
    }

    public void setLoginFlag(String loginFlag) {
        this.loginFlag = loginFlag == null ? null : loginFlag.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getExtField1() {
        return extField1;
    }

    public void setExtField1(String extField1) {
        this.extField1 = extField1 == null ? null : extField1.trim();
    }

    public String getExtField2() {
        return extField2;
    }

    public void setExtField2(String extField2) {
        this.extField2 = extField2 == null ? null : extField2.trim();
    }

    public String getExtField3() {
        return extField3;
    }

    public void setExtField3(String extField3) {
        this.extField3 = extField3 == null ? null : extField3.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", transCode=").append(transCode);
        sb.append(", subTransCode=").append(subTransCode);
        sb.append(", subTransName=").append(subTransName);
        sb.append(", relServ=").append(relServ);
        sb.append(", relUrl=").append(relUrl);
        sb.append(", ctrlFlag=").append(ctrlFlag);
        sb.append(", loginFlag=").append(loginFlag);
        sb.append(", remark=").append(remark);
        sb.append(", extField1=").append(extField1);
        sb.append(", extField2=").append(extField2);
        sb.append(", extField3=").append(extField3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}