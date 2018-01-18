/*
 * Copyright (c) 2017 CeYing and/or its affiliates. All rights reserved.
 * CeYing PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */
package com.ceying.chx.cpi.biz.rm.agreement.vo;

/**
 * 三方协议新增VO类
 * @author zhangdl
 * @version class v1.0
 * @date 2017/7/17 10:51
 */
public class UDTripartiteAgreementVO {

    /**
     * 应付账款信息实体类ID
     */
//    @NotNull
    private String accountspayableid;

    /**
     * 应付账款报价实体类ID
     */
//    @NotNull
    private String accountspayablequoteid;

    /**
     * 当前应付账款报价的版本号
     */
    private String version;

    /**
     * 状态（用来判断是否满足申请融资大于折扣后的金额）
     */
//    @NotNull
    private Boolean status;
    /**
     * 签名
     */
    private String signs;

    /**
     * 模板内容
     */
    private String context;
    /**
     * 获得应付账款信息实体类ID
     * @return
     */
    public
    String getAccountspayableid() {
        return accountspayableid;
    }

    /**
     * 设置应付账款信息实体类ID
     * @param accountspayableid
     */
    public
    void setAccountspayableid(String accountspayableid) {
        this.accountspayableid = accountspayableid;
    }

    /**
     * 获得当前应付账款报价的版本号
     * @return
     */
    public
    String getVersion() {
        return version;
    }

    /**
     * 设置当前应付账款报价的版本号
     * @param version
     * @return
     */
    public
    UDTripartiteAgreementVO setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 获得应付账款报价实体类ID
     * @return
     */
    public
    String getAccountspayablequoteid() {
        return accountspayablequoteid;
    }

    /**
     * 设置应付账款报价实体类ID
     * @param accountspayablequoteid
     */
    public
    void setAccountspayablequoteid(String accountspayablequoteid) {
        this.accountspayablequoteid = accountspayablequoteid;
    }

    /**
     * 获得状态
     * @return
     */
    public
    Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态
     * @param status
     */
    public
    void setStatus(Boolean status) {
        this.status = status;
    }
    /**
     * 获得签名
     * @return
     */
    public String getSigns() {
        return signs;
    }

    /**
     * 设置签名
     * @param signs
     */
    public void setSigns(String signs) {
        this.signs = signs;
    }

    /**
     * 获得模板内容
     * @return
     */
    public
    String getContext() {
        return context;
    }

    /**
     * 设置模板内容
     * @param context
     * @return
     */
    public
    UDTripartiteAgreementVO setContext(String context) {
        this.context = context;
        return this;
    }

    public
    UDTripartiteAgreementVO() {
    }

    @Override
    public
    String toString() {
        return "TripartiteAgreementVo{" +
                "accountspayableid='" + accountspayableid + '\'' +
                ", accountspayablequoteid='" + accountspayablequoteid + '\'' +
                '}';
    }
}
