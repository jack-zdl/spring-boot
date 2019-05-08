package com.ceying.eagleeye.consumer.service;

import com.ceying.common.base.CypRowSet;
import com.ceying.common.entity.MessageEntity;
import com.ceying.eagleeye.consumer.vo.MessageVo;


/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/6/19<br>
 * <br>
 */
public interface MessageService {
    void notify(MessageEntity entity) throws Exception;
    void save(MessageEntity entity) throws Exception;
    CypRowSet<MessageEntity> listMsg(MessageVo msg) throws Exception;
    void read(String urid) throws Exception;
}
