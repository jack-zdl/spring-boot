package com.ceying.chx.cpi.biz.rm.accountspayable.entity;

import com.ceying.chx.cpi.biz.rm.base.CommonBaseObject;

import java.io.Serializable;
/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2017/10/26<br>
 * <br>
 */
public class AccountsPayable extends CommonBaseObject implements Serializable {

    public String getTableName() {
        return "T_ACCOUNTSPAYABLE";
    }
    //分页起始
    private String start;
    private String limit;
    //请求类型
    private String request_type;
    //请求时间
    private String request_time;

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    /**
     * 主键ID
     */
    private String urid;//           VARCHAR2(32) not null,

    /**
     * 租户ID
     */
    private String tenantid;//       NUMBER not null,

    /**
     * 最后一个操作标识
     */
    private String payableno;

    /**
     * 合同编号
     */
    private String contractid;//     VARCHAR2(32) not null,

    /**
     * 核心企业ID
     */
    private String corecompanyid;//  VARCHAR2(32) not null,
    /**
     * 核心企业ID对应name
     */
    private String corecompanyidname;
    /**
     * 供应商ID
     */
    private String supplierid;     //VARCHAR2(32) not null,
    /**
     * 供应商ID对应name
     */
    private String supplieridname;
    /**
     * 优先银行ID
     */
    private String bankid;

    /**
     * 入账时间
     */
    private String billdate;

    /**
     * 金额
     */
    private String amount;//         FLOAT not null,

    /**
     * 保理到期日
     */
    private String payabledate;//  Date not null,


    /**
     * 最后一个操作标识
     */
    private String lastoperationflag;

    /**
     * 特有lihs
     */
    private String operateflag;

    /**
     * 融资金额
     */
    private String financingamount;//         FLOAT not null,

    /**
     * 冻结供应商融资服务费
     */
    private String freezeamount;

    /**
     * 核心企业向供应商收取的费率
     */
    private String corecompanysupplierrate;

    /**
     * 融资期限
     */
    private String financingDate;

    /**
     * 扩展字段1
     */
    private String attribute1;

    /**
     * 扩展字段2
     */
    private String attribute2;

    /**
     * 是否有效
     */
    private String isactive;

    /**
     * 创建人
     */
    private String createdby;//      VARCHAR2(32) not null,

    /**
     * 创建时间
     */
    //private String createdon;//      DATE default sysdate not null,

    /**
     * 修改人
     */
    private String lastmodifiedby;// VARCHAR2(32) not null,

    /**
     * 修改时间
     */
   // private String lastmodifiedon;// DATE default sysdate not null,

    /**
     * 版本
     */
    private String rowversion;//     NUMBER(4) default 1 not null,

    /**
     * 描述
     */
    private String description;//   VARCHAR2(256)

    /**
     * 是否是第一次融资
     */
    private String isfirstfinance;

    /**
     * 冻结供应商融资服务费保证金
     */
    private String securitydeposit;

    /**
     * 发票号
     */
    private String invoicenumber;

    /**
     * 冻结供应商融资服务费保证金
     */
    private String expiringdate;

    /**
     * 融资意向书
     */
    private byte[] signaturecontent;

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }

    public String getRequest_time() {
        return request_time;
    }

    public void setRequest_time(String request_time) {
        this.request_time = request_time;
    }

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid;
    }

    public String getTenantid() {
        return tenantid;
    }

    public void setTenantid(String tenantid) {
        this.tenantid = tenantid;
    }

    public String getPayableno() {
        return payableno;
    }

    public void setPayableno(String payableno) {
        this.payableno = payableno;
    }

    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid;
    }

    public String getCorecompanyid() {
        return corecompanyid;
    }

    public void setCorecompanyid(String corecompanyid) {
        this.corecompanyid = corecompanyid;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public String getBilldate() {
        return billdate;
    }

    public void setBilldate(String billdate) {
        this.billdate = billdate;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getPayabledate() {
        return payabledate;
    }

    public void setPayabledate(String payabledate) {
        this.payabledate = payabledate;
    }

    public String getLastoperationflag() {
        return lastoperationflag;
    }

    public void setLastoperationflag(String lastoperationflag) {
        this.lastoperationflag = lastoperationflag;
    }

    public String getOperateflag() {
        return operateflag;
    }

    public void setOperateflag(String operateflag) {
        this.operateflag = operateflag;
    }

    public String getFinancingamount() {
        return financingamount;
    }

    public void setFinancingamount(String financingamount) {
        this.financingamount = financingamount;
    }

    public String getFreezeamount() {
        return freezeamount;
    }

    public void setFreezeamount(String freezeamount) {
        this.freezeamount = freezeamount;
    }

    public String getCorecompanysupplierrate() {
        return corecompanysupplierrate;
    }

    public void setCorecompanysupplierrate(String corecompanysupplierrate) {
        this.corecompanysupplierrate = corecompanysupplierrate;
    }

    public String getFinancingDate() {
        return financingDate;
    }

    public void setFinancingDate(String financingDate) {
        this.financingDate = financingDate;
    }

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }




    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby;
    }




    public void setRowversion(String rowversion) {
        this.rowversion = rowversion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsfirstfinance() {
        return isfirstfinance;
    }

    public void setIsfirstfinance(String isfirstfinance) {
        this.isfirstfinance = isfirstfinance;
    }

    public String getSecuritydeposit() {
        return securitydeposit;
    }

    public void setSecuritydeposit(String securitydeposit) {
        this.securitydeposit = securitydeposit;
    }

    public String getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber;
    }

    public String getExpiringdate() {
        return expiringdate;
    }

    public void setExpiringdate(String expiringdate) {
        this.expiringdate = expiringdate;
    }

    public byte[] getSignaturecontent() {
        return signaturecontent;
    }

    public void setSignaturecontent(byte[] signaturecontent) {
        this.signaturecontent = signaturecontent;
    }

    public String getCorecompanyidname() {
        return corecompanyidname;
    }

    public void setCorecompanyidname(String corecompanyidname) {
        this.corecompanyidname = corecompanyidname;
    }

    public String getSupplieridname() {
        return supplieridname;
    }

    public void setSupplieridname(String supplieridname) {
        this.supplieridname = supplieridname;
    }
}
