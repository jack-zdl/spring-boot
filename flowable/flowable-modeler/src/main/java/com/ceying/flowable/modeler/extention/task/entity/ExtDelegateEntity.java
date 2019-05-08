package com.ceying.flowable.modeler.extention.task.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/18
 * @description :
 * @version: 2.0
 */
public class ExtDelegateEntity {

    private String id;
    private String userId;
    private String delegateUserId;
    private Date startTime;
    private Date endTime;
    private String delegateType;
    private String delegateTypeName;
    private String taskState;
    private String taskStateName;
    private Integer withdrawTask;
    private String withdrawTaskName;
    private String doAsDelegator;
    private String doAsDelegatorName;

    private List<ExtDelegateDetailEntity> extDelegateDetailEntityList;

    private Integer page;
    private Integer rows;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getDelegateUserId() {
        return delegateUserId;
    }

    public void setDelegateUserId(String delegateUserId) {
        this.delegateUserId = delegateUserId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDelegateType() {
        return delegateType;
    }

    public void setDelegateType(String delegateType) {
        this.delegateType = delegateType;
    }

    public String getDelegateTypeName() {
        return delegateTypeName;
    }

    public void setDelegateTypeName(String delegateTypeName) {
        this.delegateTypeName = delegateTypeName;
    }

    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public String getTaskStateName() {
        return taskStateName;
    }

    public void setTaskStateName(String taskStateName) {
        this.taskStateName = taskStateName;
    }

    public Integer getWithdrawTask() {
        return withdrawTask;
    }

    public void setWithdrawTask(Integer withdrawTask) {
        this.withdrawTask = withdrawTask;
    }

    public String getWithdrawTaskName() {
        return withdrawTaskName;
    }

    public void setWithdrawTaskName(String withdrawTaskName) {
        this.withdrawTaskName = withdrawTaskName;
    }

    public String getDoAsDelegator() {
        return doAsDelegator;
    }

    public void setDoAsDelegator(String doAsDelegator) {
        this.doAsDelegator = doAsDelegator;
    }

    public String getDoAsDelegatorName() {
        return doAsDelegatorName;
    }

    public void setDoAsDelegatorName(String doAsDelegatorName) {
        this.doAsDelegatorName = doAsDelegatorName;
    }

    public List<ExtDelegateDetailEntity> getExtDelegateDetailEntityList() {
        return extDelegateDetailEntityList;
    }

    public void setExtDelegateDetailEntityList(List<ExtDelegateDetailEntity> extDelegateDetailEntityList) {
        this.extDelegateDetailEntityList = extDelegateDetailEntityList;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }
}
