package com.ceying.chx.rcenter.bean;

import java.io.Serializable;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/2<br>
 * <br>
 */
public class PageBean implements Serializable{
    private Integer page=1;
    private Integer rows=10;

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
