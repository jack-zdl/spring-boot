/*
 * Copyright (c) 2017 CeYing and/or its affiliates. All rights reserved.
 * CeYing PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */

package com.ceying.chx.cpi.biz.rm.agreement.entity;

import com.ceying.chx.cpi.biz.rm.base.CommonBaseObject;
import com.ceying.chx.cpi.biz.util.PrimaryKeyUtils;
import com.ceying.chx.cpi.biz.util.date.DateUtil;

import java.io.Serializable;
import java.util.Date;

/**
 * 三方协议操作实体类 对应三方协议操作表
 * @author zhangdl
 * @version v1.0
 * @date 2017/7/13
 */
public class TripartiteAgreementOperations extends CommonBaseObject implements Serializable {

    public String getTableName() {
        return "T_TAOPERATIONS";
    }

    /**
     * 主键ID
     */
    private String urid;

    /**
     * 三方协议ID
     */
    private String tripartiteagreementid;

    /**
     * 操作员KEY
     */
    private String operator;

    /**
     * 操作组织ID
     */
    private String operateorgid;

    /**
     * 操作日期
     */
    private Date operatedate;

    /**
     * 操作标识
     */
    private String operateflag;

    /**
     * 签名信息
     */
    private String signature;

    /**
     * 区块链地址
     */
    private String blockChainAddress;

    /**
     * 描述
     */
    private String description;

    /**
     * 关联操作ID
     */
    private String relateoperateid;

    /**
     * 得到主键ID
     * @return
     */
    public String getUrid() {
        return urid;
    }

    /**
     * 设置主键ID
     * @param urid
     */
    public void setUrid(String urid) {
        this.urid = urid;
    }

    /**
     * 得到三方协议ID
     * @return
     */
    public String getTripartiteagreementid() {
        return tripartiteagreementid;
    }

    /**
     * 设置三方协议ID
     * @param tripartiteagreementid
     */
    public void setTripartiteagreementid(String tripartiteagreementid) {
        this.tripartiteagreementid = tripartiteagreementid;
    }

    /**
     * 得到操作员KEY
     * @return
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作员KEY
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }

    /**
     * 得到操作组织ID
     * @return
     */
    public String getOperateorgid() {
        return operateorgid;
    }

    /**
     * 设置操作组织ID
     * @param operateorgid
     */
    public void setOperateorgid(String operateorgid) {
        this.operateorgid = operateorgid;
    }

    /**
     * 得到操作日期
     * @return
     */
    public Date getOperatedate() {
        return operatedate;
    }

    /**
     * 设置操作日期
     * @param operatedate
     */
    public void setOperatedate(Date operatedate) {
        this.operatedate = operatedate;
    }

    /**
     * 得到操作标识
     * @return
     */
    public String getOperateflag() {
        return operateflag;
    }

    /**
     * 设置操作标识
     * @param operateflag
     */
    public void setOperateflag(String operateflag) {
        this.operateflag = operateflag;
    }

    /**
     * 得到签名信息
     * @return
     */
    public String getSignature() {
        return signature;
    }

    /**
     * 设置签名信息
     * @param signature
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * 得到描述
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置描述
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 得到关联操作ID
     * @return
     */
    public String getRelateoperateid() {
        return relateoperateid;
    }

    /**
     * 设置关联操作ID
     * @param relateoperateid
     */
    public void setRelateoperateid(String relateoperateid) {
        this.relateoperateid = relateoperateid;
    }

    /**
     * 获得区块链地址
     * @return
     */
    public
    String getBlockChainAddress() {
        return blockChainAddress;
    }

    /**
     * 设置区块链地址
     * @param blockChainAddress
     */
    public
    void setBlockChainAddress(String blockChainAddress) {
        this.blockChainAddress = blockChainAddress;
    }

    public
    TripartiteAgreementOperations() {
    }

    /**
     * 全参构造函数
     * @param createdby 创建人

     * @param tripartiteagreementid 三方协议ID
     * @param operator 操作员KEY
     * @param operateorgid 操作组织ID
     * @param operateflag 操作标识
     * @param signature 签名信息
     * @param blockChainAddress 区块链地址
     * @param description 描述
     * @param relateoperateid 关联操作id
     */
    public
    TripartiteAgreementOperations(String createdby,
                                  String tripartiteagreementid, String operator, String operateorgid,
                                  String operateflag, String signature, String blockChainAddress, String description, String relateoperateid) {
        super(createdby, DateUtil.getCurrentDateTime(), 1);
        this.urid = PrimaryKeyUtils.uniqueId();
        this.tripartiteagreementid = tripartiteagreementid;
        this.operator = operator;
        this.operateorgid = operateorgid;
        this.operatedate = DateUtil.getCurrentDateTime();
        this.operateflag = operateflag;
        this.signature = signature;
        this.blockChainAddress = blockChainAddress;
        this.description = description;
        this.relateoperateid = relateoperateid;
    }

    @Override
    public String toString() {
        return "TripartiteAgreementOperations{" +
                "createdby='" + createdby + '\'' +
                ", createdon=" + createdon +
                ", lastmodifiedby='" + lastmodifiedby + '\'' +
                ", lastmodifiedon=" + lastmodifiedon +
                ", rowversion=" + rowversion +
                ", urid='" + urid + '\'' +
                ", tripartiteagreementid='" + tripartiteagreementid + '\'' +
                ", operator='" + operator + '\'' +
                ", operateorgid='" + operateorgid + '\'' +
                ", operatedate=" + operatedate +
                ", operateflag='" + operateflag + '\'' +
                ", signature='" + signature + '\'' +
                ", description='" + description + '\'' +
                ", relateoperateid='" + relateoperateid + '\'' +
                '}';
    }
}
