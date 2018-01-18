package com.ceying.chx.cpi.customer.rm.erp.entity;

import java.io.Serializable;

/**
 * Created by cyp on 2017/12/4.
 */
public class SysUser implements Serializable{

    // 用户代码
    private String user_id = "";
    // 用户名称
    private String user_name = "";
    // 用户密码
    private String user_pwd = "";
    // 组织Id
    private String org_id = "";
    // 用户分类
    private String user_type = "";
    // 用户状态
    private String user_status = "";
    // 锁定状态
    private String lock_status = "";
    // 创建时间
    private Integer create_date = null;
    // 最后修改时间
    private Integer modify_date = null;
    // 密码修改时间
    private Integer pass_modify_date = null;
    // 手机号
    private String mobile = "";
    // 邮箱地址
    private String email = "";
    // 扩展标识
    private String ext_flag = "";
    // 备注
    private String remark = "";
    // 扩展字段1【VPNKEY】
    private String ext_field_1 = "";
    // 扩展字段2【暂未使用】
    private String ext_field_2 = "";
    // 扩展字段3【保存前三次使用过的密码】
    private String ext_field_3 = "";
    // 扩展字段4【暂未使用】
    private String ext_field_4 = "";
    // 扩展字段5【暂未使用】
    private String ext_field_5 = "";
    // 用户排序字段
    private Integer user_order;

    private String c_identitytype;// 证件类型
    private String c_identityno;// 证件号码
    private String c_credentials;// 资格证书

    private Integer create_time = null;// 创建时间
    private Integer modify_time;// 修改时间
    // 租户
    private Integer tenant_id;

    public SysUser(){

    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_pwd() {
        return user_pwd;
    }

    public void setUser_pwd(String user_pwd) {
        this.user_pwd = user_pwd;
    }

    public String getOrg_id() {
        return org_id;
    }

    public void setOrg_id(String org_id) {
        this.org_id = org_id;
    }

    public String getUser_type() {
        return user_type;
    }

    public void setUser_type(String user_type) {
        this.user_type = user_type;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getLock_status() {
        return lock_status;
    }

    public void setLock_status(String lock_status) {
        this.lock_status = lock_status;
    }

    public Integer getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Integer create_date) {
        this.create_date = create_date;
    }

    public Integer getModify_date() {
        return modify_date;
    }

    public void setModify_date(Integer modify_date) {
        this.modify_date = modify_date;
    }

    public Integer getPass_modify_date() {
        return pass_modify_date;
    }

    public void setPass_modify_date(Integer pass_modify_date) {
        this.pass_modify_date = pass_modify_date;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExt_flag() {
        return ext_flag;
    }

    public void setExt_flag(String ext_flag) {
        this.ext_flag = ext_flag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getExt_field_1() {
        return ext_field_1;
    }

    public void setExt_field_1(String ext_field_1) {
        this.ext_field_1 = ext_field_1;
    }

    public String getExt_field_2() {
        return ext_field_2;
    }

    public void setExt_field_2(String ext_field_2) {
        this.ext_field_2 = ext_field_2;
    }

    public String getExt_field_3() {
        return ext_field_3;
    }

    public void setExt_field_3(String ext_field_3) {
        this.ext_field_3 = ext_field_3;
    }

    public String getExt_field_4() {
        return ext_field_4;
    }

    public void setExt_field_4(String ext_field_4) {
        this.ext_field_4 = ext_field_4;
    }

    public String getExt_field_5() {
        return ext_field_5;
    }

    public void setExt_field_5(String ext_field_5) {
        this.ext_field_5 = ext_field_5;
    }

    public Integer getUser_order() {
        return user_order;
    }

    public void setUser_order(Integer user_order) {
        this.user_order = user_order;
    }

    public String getC_identitytype() {
        return c_identitytype;
    }

    public void setC_identitytype(String c_identitytype) {
        this.c_identitytype = c_identitytype;
    }

    public String getC_identityno() {
        return c_identityno;
    }

    public void setC_identityno(String c_identityno) {
        this.c_identityno = c_identityno;
    }

    public String getC_credentials() {
        return c_credentials;
    }

    public void setC_credentials(String c_credentials) {
        this.c_credentials = c_credentials;
    }

    public Integer getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Integer create_time) {
        this.create_time = create_time;
    }

    public Integer getModify_time() {
        return modify_time;
    }

    public void setModify_time(Integer modify_time) {
        this.modify_time = modify_time;
    }

    public Integer getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(Integer tenant_id) {
        this.tenant_id = tenant_id;
    }
}
