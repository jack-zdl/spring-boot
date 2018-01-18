package com.ceying.chx.cpi.biz.rm.agreement.vo;

import javax.validation.constraints.NotNull;

/**
 * 三方协议签约或者否决VO类
 * @author zhangdl
 * @version class v1.0
 * @date 2017/7/18 17:51
 */
public class TripartiteAgreementContractVO {

    /**
     * 三方协议id
     */
    @NotNull
    private String tripartiteagreementid;

    /**
     * 描述
     */

    private String description;

    /**
     * 签名
     */
    private String signs;
    /**
     * 获得三方协议ID
     * @return
     */
    public
    String getTripartiteagreementid() {
        return tripartiteagreementid;
    }

    /**
     * 设置三方协议ID
     * @param tripartiteagreementid
     */
    public
    void setTripartiteagreementid(String tripartiteagreementid) {
        this.tripartiteagreementid = tripartiteagreementid;
    }

    /**
     * 获得描述
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

    public
    TripartiteAgreementContractVO() {
    }

}
