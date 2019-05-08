package com.ceying.eagleeye.consumer.kafka;

import com.ceying.common.entity.MessageEntity;
import com.ceying.eagleeye.common.config.MyLogConfig;
import com.ceying.eagleeye.common.constant.TopicConstants;
import com.ceying.eagleeye.common.service.MylogService;
import com.ceying.eagleeye.consumer.service.MessageService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 功能说明:通知消息 消费者 <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/21<br>
 * <br>
 */
@Component
public class NotifyMsgConsumer {
    private static final Logger log = LoggerFactory.getLogger(NotifyMsgConsumer.class);
    @Autowired
    private MessageService messageService;

    @KafkaListener(topics =TopicConstants.NOTIFYMSG)
    public void listenLog(ConsumerRecord<?, MessageEntity> cr) throws Exception {
        messageService.notify(cr.value());
    }
}
