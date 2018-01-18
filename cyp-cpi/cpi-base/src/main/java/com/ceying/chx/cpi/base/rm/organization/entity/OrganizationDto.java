package com.ceying.chx.cpi.base.rm.organization.entity;

import com.ceying.chx.cpi.base.rm.base.CommonBaseObject;

import java.io.Serializable;

/**
 * 功能说明: 运营系统调用查询平台信息组织<br>
 * 系统版本: 1.0 <br>
 * 开发人员: miaozhenqing
 * 开发时间: 2017/11/1<br>
 * <br>
 */
public class OrganizationDto extends CommonBaseObject implements Serializable{
    public String getTableName(){return "TSYS_ORGANIZATION";}
    private String request_type;
    private String request_time;
    private String start;
    private String limit;
    private String org_code;
    private String org_name;
    private String org_cate;
    private String orgcatename;
    private String org_level;
    private String orglevelname;
    private String status;
    private String statusname;
    private String areaid;
    private String areaname;
    private String parent_id;
    private String parentidname;
    private String manage_id;
    private String manageidname;
    private String legalperson;
    private String address;
    private String corecompanysupplierrate;
    private String amountlimits;
    private String platformsupplierrate;
    private String contactcategory;
    private String contactcategoryname;
    private String contactname;
    private String cellphone;
    private String telephone;
    private String email;
    private String contactaddress;

    public String getOrgcatename() {
        return orgcatename;
    }

    public void setOrgcatename(String orgcatename) {
        this.orgcatename = orgcatename;
    }

    public String getOrglevelname() {
        return orglevelname;
    }

    public void setOrglevelname(String orglevelname) {
        this.orglevelname = orglevelname;
    }

    public String getStatusname() {
        return statusname;
    }

    public void setStatusname(String statusname) {
        this.statusname = statusname;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getParentidname() {
        return parentidname;
    }

    public void setParentidname(String parentidname) {
        this.parentidname = parentidname;
    }

    public String getManageidname() {
        return manageidname;
    }

    public void setManageidname(String manageidname) {
        this.manageidname = manageidname;
    }

    public String getContactcategoryname() {
        return contactcategoryname;
    }

    public void setContactcategoryname(String contactcategoryname) {
        this.contactcategoryname = contactcategoryname;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public String getCorecompanysupplierrate() {
        return corecompanysupplierrate;
    }

    public void setCorecompanysupplierrate(String corecompanysupplierrate) {
        this.corecompanysupplierrate = corecompanysupplierrate;
    }

    public String getAmountlimits() {
        return amountlimits;
    }

    public void setAmountlimits(String amountlimits) {
        this.amountlimits = amountlimits;
    }

    public String getPlatformsupplierrate() {
        return platformsupplierrate;
    }

    public void setPlatformsupplierrate(String platformsupplierrate) {
        this.platformsupplierrate = platformsupplierrate;
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



    public String getOrg_code() {
        return org_code;
    }

    public void setOrg_code(String org_code) {
        this.org_code = org_code;
    }

    public String getOrg_name() {
        return org_name;
    }

    public void setOrg_name(String org_name) {
        this.org_name = org_name;
    }

    public String getOrg_cate() {
        return org_cate;
    }

    public void setOrg_cate(String org_cate) {
        this.org_cate = org_cate;
    }

    public String getOrg_level() {
        return org_level;
    }

    public void setOrg_level(String org_level) {
        this.org_level = org_level;
    }

    public String getLegalperson() {
        return legalperson;
    }

    public void setLegalperson(String legalperson) {
        this.legalperson = legalperson;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



    public String getContactcategory() {
        return contactcategory;
    }

    public void setContactcategory(String contactcategory) {
        this.contactcategory = contactcategory;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactaddress() {
        return contactaddress;
    }

    public void setContactaddress(String contactaddress) {
        this.contactaddress = contactaddress;
    }



    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getParent_id() {
        return parent_id;
    }

    public void setParent_id(String parent_id) {
        this.parent_id = parent_id;
    }

    public String getManage_id() {
        return manage_id;
    }

    public void setManage_id(String manage_id) {
        this.manage_id = manage_id;
    }
}
