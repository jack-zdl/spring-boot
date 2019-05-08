package com.ceying.eagleeye.consumer.vo;

import com.ceying.common.constant.ConditionTypeConstant;
import com.ceying.common.enums.IsReadEnum;
import com.ceying.common.util.annotation.Condition;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/6/20<br>
 * <br>
 */
public class MessageVo {
    private int rows=50;
    private int page=1;
    @Condition()
    private String isRead=IsReadEnum.NO.getKey();;
    @Condition(type = ConditionTypeConstant.LIKE)
    private String userid;

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
