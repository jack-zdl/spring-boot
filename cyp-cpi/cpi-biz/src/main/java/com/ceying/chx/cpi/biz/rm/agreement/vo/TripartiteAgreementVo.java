/*
 * Copyright (c) 2017 CeYing and/or its affiliates. All rights reserved.
 * CeYing PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 */
package com.ceying.chx.cpi.biz.rm.agreement.vo;

//import javax.validation.constraints.NotNull;

import javax.validation.constraints.NotNull;

/**
 * 三方协议新增VO类
 * @author zhangdl
 * @version class v1.0
 * @date 2017/7/17 10:51
 */
public class TripartiteAgreementVo {

    /**
     * 银行ID
     */
    @NotNull
    private String bankId;

    /**
     * 应付账款ID
     */
    @NotNull
    private String accountspayableId;

    /**
     * 获得银行ID
     * @return
     */
    public
    String getbankId() {
        return bankId;
    }

    /**
     * 设置银行ID
     * @param bankId
     */
    public
    void setbankId(String bankId) {
        this.bankId = bankId;
    }

    /**
     * 获得应付账款ID
     * @return
     */
    public
    String getaccountspayableId() {
        return accountspayableId;
    }

    /**
     * 设置应付账款ID
     * @param accountspayableId
     */
    public
    void setaccountspayableId(String accountspayableId) {
        this.accountspayableId = accountspayableId;
    }

    public
    TripartiteAgreementVo() {
    }

    @Override
    public
    String toString() {
        return "TripartiteAgreementVo{" +
                "bankId='" + bankId + '\'' +
                ", accountspayableId='" + accountspayableId + '\'' +
                '}';
    }
}
