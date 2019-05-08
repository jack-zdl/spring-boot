package com.ceying.flowable.modeler.extention.task.vo;

/**
 * @author: fej
 * @date: 2018/5/30
 * @description :
 * @version: 2.0
 */
public class ProcessDefinitionVO {

    private String delegateId;
    private String userId;

    private Integer page = 1;
    private Integer rows = 50;

    public String getDelegateId() {
        return delegateId;
    }

    public void setDelegateId(String delegateId) {
        this.delegateId = delegateId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
