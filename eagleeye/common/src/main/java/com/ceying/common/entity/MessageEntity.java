package com.ceying.common.entity;

import com.ceying.common.enums.IsReadEnum;
import com.ceying.common.enums.MessageTypeEnum;
import com.ceying.common.enums.PriorityEnum;
import com.ceying.common.util.annotation.EnumConver;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/6/19<br>
 * <br>
 */
@Table(name = "t_sys_message")
public class MessageEntity implements Serializable {
    @Id
    @Column(name="urid")
    private String urid;
    /**
     * 消息标题
     */
    private String title;
    /**
     * 内容
     */
    private String content;
    /**
     * url 路径
     */
    private String url;
    /**
     * 优先级：0-重要；1-普通
     */
    @EnumConver(enumType = PriorityEnum.class)
    private String priority= PriorityEnum.Normal.getKey();
    /**
     * 接收人id
     */
    private String userid;
    /**
     * 是否已读 :0—未读；1—已读
     */
    @EnumConver(enumType = IsReadEnum.class)
    private String isRead=IsReadEnum.NO.getKey();
    /**
     * MessageEnum 101—应付账款导入执行消息；102-三方协议审批消息 MessageEnum
     */
    @EnumConver(enumType = MessageTypeEnum.class)
    private String type;

    private String createdby;
    private Date createdon=new Date();
    private String lastmodifiedby;
    private Date lastmodifiedon;
    private Integer rowversion;

    public String getUrid() {
        return urid;
    }

    public void setUrid(String urid) {
        this.urid = urid;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public Date getCreatedon() {
        return createdon;
    }

    public void setCreatedon(Date createdon) {
        this.createdon = createdon;
    }

    public String getLastmodifiedby() {
        return lastmodifiedby;
    }

    public void setLastmodifiedby(String lastmodifiedby) {
        this.lastmodifiedby = lastmodifiedby;
    }

    public Date getLastmodifiedon() {
        return lastmodifiedon;
    }

    public void setLastmodifiedon(Date lastmodifiedon) {
        this.lastmodifiedon = lastmodifiedon;
    }

    public Integer getRowversion() {
        return rowversion;
    }

    public void setRowversion(Integer rowversion) {
        this.rowversion = rowversion;
    }

}
