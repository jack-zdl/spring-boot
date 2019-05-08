package com.ceying.eagleeye.consumer.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ceying.common.base.CypRowSet;
import com.ceying.common.entity.MessageEntity;
import com.ceying.common.enums.IsReadEnum;
import com.ceying.common.util.bean.SpringUtil;
import com.ceying.common.util.convert.ConvertApi;
import com.ceying.common.util.sequence.SequenceUtil;
import com.ceying.common.util.user.GetUserUtil;
import com.ceying.eagleeye.consumer.dao.MessageDao;
import com.ceying.eagleeye.consumer.service.MessageService;
import com.ceying.eagleeye.consumer.vo.MessageVo;
import com.ceying.eagleeye.consumer.websocket.WebSocketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/6/19<br>
 * <br>
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageDao messageDao;
    @Autowired
    private WebSocketService webSocketService;

    @Override
    public void notify(MessageEntity entity) throws Exception {
        save(entity);
        webSocketService.sendMessage(entity);
    }

    @Override
    public void save(MessageEntity entity) throws Exception {
        if(entity!=null){
            if(entity.getUrid()==null){
                entity.setUrid(SequenceUtil.UUID());
            }
            messageDao.insertSelectiveStrictly(entity);
        }

    }

    @Override
    public CypRowSet<MessageEntity> listMsg(MessageVo msg) throws Exception {
        CypRowSet<MessageEntity> cypRowSet = new CypRowSet<>();
        List<MessageEntity> list = messageDao.selectByExampleAuto(msg, MessageEntity.class);
        cypRowSet.setList(list);
        return cypRowSet;
    }

    @Override
    public void read(String urid) throws Exception {
        MessageEntity entity= messageDao.selectByPrimaryKey(urid);
        entity.setIsRead(IsReadEnum.YES.getKey());
        entity.setLastmodifiedon(new Date());
        entity.setCreatedby(GetUserUtil.getLoginUser().getUserId());
        messageDao.updateByPrimaryKeySelectiveStrictly(entity);
    }

}
