/*
 * Copyright (c) 2017 CeYing and/or its affiliates. All rights reserved.
 * CeYing PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

package com.ceying.chx.cpi.biz.rm.agreement.entity;

import com.ceying.chx.cpi.biz.rm.base.CommonBaseObject;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by jh on 2017/11/2.
 */

/**
 * 三方协议查询实体类 对应三方协议表
 * @author zhangdl
 * @version v1.0
 * @since 1.1  可以指定那些方法是新增的
 * @date 2017/11/2
 */
public class TripartiteAgreement extends CommonBaseObject implements Serializable {


    private static final long serialVersionUID = 7204523372272588673L;

    public String getTableName() {
        return "T_TRIPARTITEAGREEMENT";
    }

    /**
     * 主键ID
     */
    private String urid;

    /**
     * 租户ID
     */
    private Integer tenantid;

    /**
     * 三方协议模板ID
     */
    private String tatemplateid;

    /**
     * 应付账款ID
     */
    private String accountspayableid;

    /**
     * 应付账款报价ID
     */
    private String accountspayablequoteid;

    /**
     * 三方协议编码
     */
    private String tacontractid;

    /**
     * 银行ID
     */
    private String bankid;
    private String bankidname;

    /**
     * 核心企业ID
     */
    private String corecompanyid;
    private String corecompanyidname;

    /**
     * 供应商ID
     */
    private String supplierid;
    private String supplieridname;
    /**
     * 供应商专户ID
     */
    private String supplieraccountid;

    /**
     * 融资金额
     */
    private BigDecimal financingamount;

    /**
     * 融资期限
     */
    private Date financingdate;

    /**
     * 有追无追
     */
    private String isrecourse;

    /**
     * 利率
     */
    private BigDecimal interestrate;

    /**
     * 放款日期
     */
    private Date lendingdate;

    /**
     * 预计还款日期
     */
    private Date estimatereturndate;

    /**
     * 还款日期
     */
    private Date returndate;

    /**
     * 平台向供应商收取的总费率
     */
    private BigDecimal supplierrate;

    /**
     * 平台付给核心企业的费率
     */
    private BigDecimal corecompanyrate;

    /**
     * 应付账款转让三方协议 文本
     */
    private byte[] signaturecontent;

    /**
     * 是否有效
     */
    private String isactive;

    /**
     * 审批状态
     */
    private String description;

    /**
     * 供应商最后一次操作标识
     */
    private String supplastoperateflag;

    /**
     * 核心企业最后一次操作标识
     */
    private String corelastoperateflag;

    /**
     * 银行最后一次操作标识
     */
    private String banklastoperateflag;

    /**
     * 放款后操作标志
     */
    private String lendingafterflag;

    /**
     *审批状态
     */
    private String approvestate;

    //新增返回查询
    private String invoicenumber;

    private String contractid;

    private String payableno;

    private BigDecimal amount;

    public String getInvoicenumber() {
        return invoicenumber;
    }

    public void setInvoicenumber(String invoicenumber) {
        this.invoicenumber = invoicenumber;
    }

    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid;
    }

    public String getPayableno() {
        return payableno;
    }

    public void setPayableno(String payableno) {
        this.payableno = payableno;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 得到主键ID
     * @return
     */
    public
    String getUrid() {
        return urid;
    }

    /**
     * 设置主键ID
     * @param urid
     */
    public
    void setUrid(String urid) {
        this.urid = urid;
    }

    /**
     * 得到租户ID
     * @return
     */
    public
    Integer getTenantid() {
        return tenantid;
    }

    /**
     * 设置租户ID
     * @param tenantid
     */
    public
    void setTenantid(Integer tenantid) {
        this.tenantid = tenantid;
    }

    /**
     * 得到三方协议模板ID
     * @return
     */
    public
    String getTatemplateid() {
        return tatemplateid;
    }

    /**
     * 设置三方协议模板ID
     * @param tatemplateid
     */
    public
    void setTatemplateid(String tatemplateid) {
        this.tatemplateid = tatemplateid;
    }

    /**
     * 得到应付账款ID
     * @return
     */
    public
    String getAccountspayableid() {
        return accountspayableid;
    }

    /**
     * 设置应付账款ID
     * @param accountspayableid
     */
    public
    void setAccountspayableid(String accountspayableid) {
        this.accountspayableid = accountspayableid;
    }

    /**
     * 获得应付账款报价ID
     * @return
     */
    public
    String getAccountspayablequoteid() {
        return accountspayablequoteid;
    }

    /**
     * 设置应付账款报价ID
     * @param accountspayablequoteid
     */
    public
    void setAccountspayablequoteid(String accountspayablequoteid) {
        this.accountspayablequoteid = accountspayablequoteid;
    }

    /**
     * 得到三方协议编号
     * @return
     */
    public
    String getTacontractid() {
        return tacontractid;
    }

    /**
     * 设置三方协议编号
     * @param tacontractid
     */
    public
    void setTacontractid(String tacontractid) {
        this.tacontractid = tacontractid;
    }

    /**
     * 得到银行ID
     * @return
     */
    public
    String getBankid() {
        return bankid;
    }

    /**
     * 设置银行ID
     * @param bankid
     */
    public
    void setBankid(String bankid) {
        this.bankid = bankid;
    }

    /**
     * 得到核心企业ID
     * @return
     */
    public
    String getCorecompanyid() {
        return corecompanyid;
    }

    /**
     * 设置核心企业id
     * @param corecompanyid
     */
    public
    void setCorecompanyid(String corecompanyid) {
        this.corecompanyid = corecompanyid;
    }

    /**
     * 得到供应商ID
     * @return
     */
    public
    String getSupplierid() {
        return supplierid;
    }

    /**
     * 设置供应商ID
     * @param supplierid
     */
    public
    void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    /**
     * 得到供应商专户ID
     * @return
     */
    public
    String getSupplieraccountid() {
        return supplieraccountid;
    }

    /**
     * 设置供应商专户ID
     * @param supplieraccountid
     */
    public
    void setSupplieraccountid(String supplieraccountid) {
        this.supplieraccountid = supplieraccountid;
    }

    /**
     * 得到融资金额
     * @return
     */
    public
    BigDecimal getFinancingamount() {
        return financingamount;
    }

    /**
     * 设置融资金额
     * @param financingamount
     */
    public
    void setFinancingamount(BigDecimal financingamount) {
        this.financingamount = financingamount;
    }

    /**
     * 设置融资金额
     * @return
     */
    public
    Date getFinancingdate() {
        return financingdate;
    }

    /**
     * 设置融资期限
     * @param financingdate
     */
    public
    void setFinancingdate(Date financingdate) {
        this.financingdate = financingdate;
    }

    /**
     * 得到有追无追
     * @return
     */
    public
    String getIsrecourse() {
        return isrecourse;
    }

    /**
     * 设置有追无追
     * @param isrecourse
     */
    public
    void setIsrecourse(String isrecourse) {
        this.isrecourse = isrecourse;
    }

    /**
     * 得到利率
     * @return
     */
    public
    BigDecimal getInterestrate() {
        return interestrate;
    }

    /**
     * 设置利率
     * @param interestrate
     */
    public
    void setInterestrate(BigDecimal interestrate) {
        this.interestrate = interestrate;
    }

    /**
     * 得到放款日期
     * @return
     */
    public
    Date getLendingdate() {
        return lendingdate;
    }

    /**
     * 设置放款日期
     * @param lendingdate
     */
    public
    void setLendingdate(Date lendingdate) {
        this.lendingdate = lendingdate;
    }

    /**
     * 获得预计还款日期
     * @return
     */
    public
    Date getEstimatereturndate() {
        return estimatereturndate;
    }

    /**
     * 设置预计还款日期
     * @param estimatereturndate
     */
    public
    void setEstimatereturndate(Date estimatereturndate) {
        this.estimatereturndate = estimatereturndate;
    }

    /**
     * 得到还款日期
     * @return
     */
    public
    Date getReturndate() {
        return returndate;
    }

    /**
     * 设置还款日期
     * @param returndate
     */
    public
    void setReturndate(Date returndate) {
        this.returndate = returndate;
    }

    /**
     * 得到平台向供应商收取的总费率
     * @return
     */
    public
    BigDecimal getSupplierrate() {
        return supplierrate;
    }

    /**
     * 设置平台向供应商收取的总费率
     * @param supplierrate
     */
    public
    void setSupplierrate(BigDecimal supplierrate) {
        this.supplierrate = supplierrate;
    }

    /**
     * 得到平台付给核心企业的费率
     * @return
     */
    public
    BigDecimal getCorecompanyrate() {
        return corecompanyrate;
    }

    /**
     * 设置平台付给核心企业的费率
     * @param corecompanyrate
     */
    public
    void setCorecompanyrate(BigDecimal corecompanyrate) {
        this.corecompanyrate = corecompanyrate;
    }

    /**
     * 获得应付账款转让三方协议
     * @return
     */
    public
    byte[] getSignaturecontent() {
        return signaturecontent;
    }

    /**
     * 设置应付账款转让三方协议
     * @param signaturecontent
     * @return
     */
    public void setSignaturecontent(byte[] signaturecontent) {
        this.signaturecontent = signaturecontent;
    }

    /**
     * 得到是否有效
     * @return
     */
    public
    String getIsactive() {
        return isactive;
    }

    /**
     * 设置是否有效
     * @param isactive
     */
    public
    void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    /**
     * 得到描述
     * @return
     */
    public
    String getDescription() {
        return description;
    }

    /**
     * 设置描述
     * @param description
     */
    public
    void setDescription(String description) {
        this.description = description;
    }

    /**
     * 得到供应商最后一次操作标志
     * @return
     */
    public
    String getSupplastoperateflag() {
        return supplastoperateflag;
    }

    /**
     * 设置供应商最后一次操作标志
     * @param supplastoperateflag
     */
    public
    void setSupplastoperateflag(String supplastoperateflag) {
        this.supplastoperateflag = supplastoperateflag;
    }

    /**
     * 得到核心企业最后一次操作标识
     * @return
     */
    public
    String getCorelastoperateflag() {
        return corelastoperateflag;
    }

    /**
     * 设置供应商最后一次操作标识
     * @param corelastoperateflag
     */
    public
    void setCorelastoperateflag(String corelastoperateflag) {
        this.corelastoperateflag = corelastoperateflag;
    }

    /**
     * 得到银行最后一次操作标识
     * @return
     */
    public
    String getBanklastoperateflag() {
        return banklastoperateflag;
    }

    /**
     * 设置银行最后一次操作标识
     * @param banklastoperateflag
     */
    public
    void setBanklastoperateflag(String banklastoperateflag) {
        this.banklastoperateflag = banklastoperateflag;
    }

    /**
     * 获得放款后操作标志
     * @return
     */
    public
    String getLendingafterflag() {
        return lendingafterflag;
    }

    /**
     * 设置放款后操作标志
     * @param lendingafterflag
     * @return
     */
    public TripartiteAgreement setLendingafterflag(String lendingafterflag) {
        this.lendingafterflag = lendingafterflag;
        return this;
    }

    /**
     * 得到审批状态
     * @return
     */
    public
    String getApprovestate() {
        return approvestate;
    }

    /**
     * 设置审批状态
     * @param approvestate
     */
    public
    void setApprovestate(String approvestate) {
        this.approvestate = approvestate;
    }


    /**
     * 无参构造函数
     */
    public TripartiteAgreement() {
    }

    public String getBankidname() {
        return bankidname;
    }

    public void setBankidname(String bankidname) {
        this.bankidname = bankidname;
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
