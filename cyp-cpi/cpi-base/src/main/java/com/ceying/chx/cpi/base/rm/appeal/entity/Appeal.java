package com.ceying.chx.cpi.base.rm.appeal.entity;

import com.ceying.chx.cpi.base.rm.base.CommonBaseObject;

import java.io.Serializable;
import java.util.Date;

/**
 * 功能说明: 申诉信息实体类 对应申诉信息表
 * 系统版本: 1.0
 * 开发人员: jh
 * 开发时间: 2017/11/3
 */
public class Appeal extends CommonBaseObject implements Serializable{

    @Override
    public String getTableName() {
        return "T_APPEAL";
    }

    private String urid;    //主键id
    private String appealtypeid;    //申诉类型
    private String appealperson;    //申诉人
    private String appealdate;    //申诉时间
    private String respondent;  //应诉人
    private String arbitrator;  //仲裁人
    private String title;   //主题
    private String content; //内容
    private String nodecode;    //关联单据编号
    private String dealresult;  //处理状态:1-未处理,2-处理中,3-已处理（申诉人确认）
    private String isactive;    //是否有效 :0—无效；1—有效
    private String createdby;   //创建人
    private Date createdon; //创建日期
    private String lastmodifiedby;  //修改人
    private Date lastmodifiedon;    //修改日期
    private Integer rowversion; //修改版本
    private String description; //描述


    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid;
    }

    public String getAppealtypeid() {
        return appealtypeid;
    }

    public void setAppealtypeid(String appealtypeid) {
        this.appealtypeid = appealtypeid;
    }

    public String getAppealperson() {
        return appealperson;
    }

    public void setAppealperson(String appealperson) {
        this.appealperson = appealperson;
    }

    public String getAppealdate() {
        return appealdate;
    }

    public void setAppealdate(String appealdate) {
        this.appealdate = appealdate;
    }

    public String getRespondent() {
        return respondent;
    }

    public void setRespondent(String respondent) {
        this.respondent = respondent;
    }

    public String getArbitrator() {
        return arbitrator;
    }

    public void setArbitrator(String arbitrator) {
        this.arbitrator = arbitrator;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getNodecode() {
        return nodecode;
    }

    public void setNodecode(String nodecode) {
        this.nodecode = nodecode;
    }

    public String getDealresult() {
        return dealresult;
    }

    public void setDealresult(String dealresult) {
        this.dealresult = dealresult;
    }

    public String getIsactive() {
        return isactive;
    }

    public void setIsactive(String isactive) {
        this.isactive = isactive;
    }

    @Override
    public String getCreatedby() {
        return createdby;
    }

    @Override
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    @Override
    public Date getCreatedon() {
        return createdon;
    }

    @Override
    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    @Override
    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    @Override
    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby;
    }

    @Override
    public Date getLastmodifiedon() {
        return lastmodifiedon;
    }

    @Override
    public void setLastmodifiedon(Date lastmodifiedon) {
        this.lastmodifiedon = lastmodifiedon;
    }

    @Override
    public Integer getRowversion() {
        return rowversion;
    }

    @Override
    public void setRowversion(Integer rowversion) {
        this.rowversion = rowversion;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
