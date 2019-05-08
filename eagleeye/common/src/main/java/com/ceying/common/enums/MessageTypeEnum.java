package com.ceying.common.enums;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/6/19<br>
 * <br>
 */
public enum MessageTypeEnum implements BaseEnum<MessageTypeEnum, String>  {
    /**
     * 应付账款导入执行消息
     */
    PAYABLEMSG("101","应付账款导入执行消息"),
    /**
     * 三方协议审批消息
     */
    TRIPAGREEMENTMSG("102","三方协议审批消息");

    String key;
    String value;

    MessageTypeEnum(String key, String value){
        this.key=key;
        this.value=value;
    }
    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
