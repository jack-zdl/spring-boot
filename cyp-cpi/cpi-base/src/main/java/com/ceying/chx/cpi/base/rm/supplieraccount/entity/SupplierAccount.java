package com.ceying.chx.cpi.base.rm.supplieraccount.entity;

import com.ceying.chx.cpi.base.rm.base.CommonBaseObject;

import java.io.Serializable;
import java.sql.Date;

/**
 * Created by jh on 2017/11/3
 */
public class SupplierAccount extends CommonBaseObject implements Serializable {

    @Override
    public String getTableName() {
        return "T_SUPPLIERACCOUNTS";
    }

    private String urid;
    private String accountname;
    private String accountnumber;
    private String bankid;
    private String bankidname;
    private String banklocationid;
    private String description;
    private String isactive;

    private String supplierid;
    private String supplieridname;

    private String banklocationbankid;

    private String areaid;

    public String getBanklocationbankid() {
        return banklocationbankid;
    }

    public void setBanklocationbankid(String banklocationbankid) {
        this.banklocationbankid = banklocationbankid;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    @Override
    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }


    public void setLastmodifiedon(Date lastmodifiedon) {
        this.lastmodifiedon = lastmodifiedon;
    }

    public String getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(String supplierid) {
        this.supplierid = supplierid;
    }

    public String getBanklocationid() {
        return banklocationid;
    }

    public void setBanklocationid(String banklocationid) {
        this.banklocationid = banklocationid;
    }

    @Override
    public String toString() {
        return "SupplierAccount{" +
                "urid='" + urid + '\'' +
                ", accountname='" + accountname + '\'' +
                ", accountnumber='" + accountnumber + '\'' +
                ", bankid='" + bankid + '\'' +
                ", description='" + description + '\'' +
                ", isactive='" + isactive + '\'' +
                ", supplierid='" + supplierid + '\'' +
                '}';
    }
}

