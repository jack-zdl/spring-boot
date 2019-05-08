package com.ceying.flowable.modeler.extention.task.vo;

import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateDetailEntity;

import java.util.Date;
import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/29
 * @description :
 * @version: 2.0
 */
public class ExtDelegateVO {

    private String id;
    private String userId;
    private String delegateUserId;
    private String startTime;
    private String endTime;
    private String delegateType;
    private String taskState;
    private Integer withdrawTask;
    private String doAsDelegator;

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

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDelegateType() {
        return delegateType;
    }

    public void setDelegateType(String delegateType) {
        this.delegateType = delegateType;
    }

    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public Integer getWithdrawTask() {
        return withdrawTask;
    }

    public void setWithdrawTask(Integer withdrawTask) {
        this.withdrawTask = withdrawTask;
    }

    public String getDoAsDelegator() {
        return doAsDelegator;
    }

    public void setDoAsDelegator(String doAsDelegator) {
        this.doAsDelegator = doAsDelegator;
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
