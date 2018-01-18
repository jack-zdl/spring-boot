package com.ceying.chx.cpi.base.rm.tradeaccounts.entity;

import com.ceying.chx.cpi.base.rm.base.CommonBaseObject;

import java.io.Serializable;
/**
 * 功能说明: 运营系统调用查询交易账户信息<br>
 * 系统版本: 1.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2017/11/1<br>
 * <br>
 */
public class TradeAccountsDto extends CommonBaseObject implements Serializable {
    public String getTableName(){return "T_TRADEACCOUNTS";}
    private String request_type;
    private String request_time;
    private String start;
    private String limit;
    private String accountnumber;
    private String accountname;
    private String accountcategory;
    private String accountcategoryvalue;
    private String accountstate;
    private String orgid;
    private String operateflag;
    private String ledgeramount;
    private String balance;
    private String availablebalance;
    private String closingbalance;
    private String postdatetime;
    private String payableno;
    private String approvestate;
    private String accountcategoryname;
    private String accountstatename;
    private String orgname;
    private String operateflagname;
    private String approvestatename;
//    private TradeaBalanceDto tradeaBalanceDto;
//    private TradeaTransactionsDto tradeaTransactionsDto;
//
//    public TradeaBalanceDto getTradeaBalanceDto() {
//        return tradeaBalanceDto;
//    }
//
//    public void setTradeaBalanceDto(TradeaBalanceDto tradeaBalanceDto) {
//        this.tradeaBalanceDto = tradeaBalanceDto;
//    }
//
//    public TradeaTransactionsDto getTradeaTransactionsDto() {
//        return tradeaTransactionsDto;
//    }
//
//    public void setTradeaTransactionsDto(TradeaTransactionsDto tradeaTransactionsDto) {
//        this.tradeaTransactionsDto = tradeaTransactionsDto;
//    }

    public String getAccountcategoryname() {
        return accountcategoryname;
    }

    public void setAccountcategoryname(String accountcategoryname) {
        this.accountcategoryname = accountcategoryname;
    }

    public String getAccountstatename() {
        return accountstatename;
    }

    public void setAccountstatename(String accountstatename) {
        this.accountstatename = accountstatename;
    }

    public String getOrgname() {
        return orgname;
    }

    public void setOrgname(String orgname) {
        this.orgname = orgname;
    }

    public String getOperateflagname() {
        return operateflagname;
    }

    public void setOperateflagname(String operateflagname) {
        this.operateflagname = operateflagname;
    }

    public String getApprovestatename() {
        return approvestatename;
    }

    public void setApprovestatename(String approvestatename) {
        this.approvestatename = approvestatename;
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

    public String getAccountcategoryvalue() {
        return accountcategoryvalue;
    }

    public void setAccountcategoryvalue(String accountcategoryvalue) {
        this.accountcategoryvalue = accountcategoryvalue;
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

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getAccountcategory() {
        return accountcategory;
    }

    public void setAccountcategory(String accountcategory) {
        this.accountcategory = accountcategory;
    }

    public String getAccountstate() {
        return accountstate;
    }

    public void setAccountstate(String accountstate) {
        this.accountstate = accountstate;
    }

    public String getOrgid() {
        return orgid;
    }

    public void setOrgid(String orgid) {
        this.orgid = orgid;
    }

    public String getOperateflag() {
        return operateflag;
    }

    public void setOperateflag(String operateflag) {
        this.operateflag = operateflag;
    }

    public String getLedgeramount() {
        return ledgeramount;
    }

    public void setLedgeramount(String ledgeramount) {
        this.ledgeramount = ledgeramount;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getAvailablebalance() {
        return availablebalance;
    }

    public void setAvailablebalance(String availablebalance) {
        this.availablebalance = availablebalance;
    }

    public String getClosingbalance() {
        return closingbalance;
    }

    public void setClosingbalance(String closingbalance) {
        this.closingbalance = closingbalance;
    }

    public String getPostdatetime() {
        return postdatetime;
    }

    public void setPostdatetime(String postdatetime) {
        this.postdatetime = postdatetime;
    }

    public String getPayableno() {
        return payableno;
    }

    public void setPayableno(String payableno) {
        this.payableno = payableno;
    }

    public String getApprovestate() {
        return approvestate;
    }

    public void setApprovestate(String approvestate) {
        this.approvestate = approvestate;
    }
}
