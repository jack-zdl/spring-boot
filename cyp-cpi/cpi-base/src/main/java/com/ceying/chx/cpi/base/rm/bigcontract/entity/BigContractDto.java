package com.ceying.chx.cpi.base.rm.bigcontract.entity;

import com.ceying.chx.cpi.base.rm.base.CommonBaseObject;

import java.io.Serializable;

/**
 * 功能说明: 运营系统调用查询大合同管理信息<br><br>
 * 系统版本: 1.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2017/11/2<br>
 * <br>
 */
public class BigContractDto extends CommonBaseObject implements Serializable {
    public String getTableName() {
        return "T_BIGCONTRACTS";
    }
    private String request_type;
    private String request_time;
    private String start;
    private String limit;
    private String corecompanyid;
    private String corecompanyidname;
    private String bankid;
    private String bankidname;
    private String contractid;
    private String priority;
    private String lastoperationid;
    private String lastoperationidname;
    private String quotetemplate;
    private String creditlimits;
    private String nonrecoursediscount;
    private String nonrecourseinterestrate;
    private String recoursediscount;
    private String recourseinterestrate;
    private String description;
    private String l_storageid;
    private String c_filename;
    private String d_createdate;
    private String c_creator;

    public String getLastoperationidname() {
        return lastoperationidname;
    }

    public void setLastoperationidname(String lastoperationidname) {
        this.lastoperationidname = lastoperationidname;
    }

    public String getCorecompanyidname() {
        return corecompanyidname;
    }

    public void setCorecompanyidname(String corecompanyidname) {
        this.corecompanyidname = corecompanyidname;
    }

    public String getBankidname() {
        return bankidname;
    }

    public void setBankidname(String bankidname) {
        this.bankidname = bankidname;
    }

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

    public String getCorecompanyid() {
        return corecompanyid;
    }

    public void setCorecompanyid(String corecompanyid) {
        this.corecompanyid = corecompanyid;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public String getContractid() {
        return contractid;
    }

    public void setContractid(String contractid) {
        this.contractid = contractid;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getLastoperationid() {
        return lastoperationid;
    }

    public void setLastoperationid(String lastoperationid) {
        this.lastoperationid = lastoperationid;
    }

    public String getQuotetemplate() {
        return quotetemplate;
    }

    public void setQuotetemplate(String quotetemplate) {
        this.quotetemplate = quotetemplate;
    }

    public String getCreditlimits() {
        return creditlimits;
    }

    public void setCreditlimits(String creditlimits) {
        this.creditlimits = creditlimits;
    }

    public String getNonrecoursediscount() {
        return nonrecoursediscount;
    }

    public void setNonrecoursediscount(String nonrecoursediscount) {
        this.nonrecoursediscount = nonrecoursediscount;
    }

    public String getNonrecourseinterestrate() {
        return nonrecourseinterestrate;
    }

    public void setNonrecourseinterestrate(String nonrecourseinterestrate) {
        this.nonrecourseinterestrate = nonrecourseinterestrate;
    }

    public String getRecoursediscount() {
        return recoursediscount;
    }

    public void setRecoursediscount(String recoursediscount) {
        this.recoursediscount = recoursediscount;
    }

    public String getRecourseinterestrate() {
        return recourseinterestrate;
    }

    public void setRecourseinterestrate(String recourseinterestrate) {
        this.recourseinterestrate = recourseinterestrate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getL_storageid() {
        return l_storageid;
    }

    public void setL_storageid(String l_storageid) {
        this.l_storageid = l_storageid;
    }

    public String getC_filename() {
        return c_filename;
    }

    public void setC_filename(String c_filename) {
        this.c_filename = c_filename;
    }

    public String getD_createdate() {
        return d_createdate;
    }

    public void setD_createdate(String d_createdate) {
        this.d_createdate = d_createdate;
    }

    public String getC_creator() {
        return c_creator;
    }

    public void setC_creator(String c_creator) {
        this.c_creator = c_creator;
    }
}
