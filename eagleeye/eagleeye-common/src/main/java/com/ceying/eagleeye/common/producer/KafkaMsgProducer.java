package com.ceying.eagleeye.common.producer;

import com.alibaba.fastjson.JSONObject;
import com.ceying.eagleeye.common.bean.LogMessage;
import com.ceying.eagleeye.common.config.MyLogConfig;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.ProducerListener;
import org.springframework.stereotype.Component;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/21<br>
 * <br>
 */
@Component
public class KafkaMsgProducer {

    private static final Logger log = LoggerFactory.getLogger(KafkaMsgProducer.class);

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;
    @Autowired
    private MyLogConfig myLogConfig;

    public void sendMessage(String topicName, Object data) {
//        log.debug("向kafka推送数据:[{}{}]",topicName, data);
//        try {
//            kafkaTemplate.send(topicName, data);
//        } catch (Exception e) {
//            log.debug("发送数据出错！！！{}{}", topicName, data);
//            log.debug("发送数据出错=====>", e);
//        }
//
//        //消息发送的监听器，用于回调返回信息
//        kafkaTemplate.setProducerListener(new ProducerListener<String, Object>() {
//            @Override
//            public void onSuccess(String topic, Integer partition, String key, Object value, RecordMetadata recordMetadata) {
//                log.debug("数据发送成功");
//            }
//
//            @Override
//            public void onError(String topic, Integer partition, String key, Object value, Exception exception) {
//                log.error("数据发送失败",exception);
//            }
//
//            @Override
//            public boolean isInterestedInSuccess() {
//                log.debug("数据发送完毕");
//                return false;
//            }
//        });
    }
    public void sendMessage(String topicName,String key, Object data) {
//        log.debug("向kafka推送数据:[{}]", data);
//        try {
//            kafkaTemplate.send(topicName, key,data);
//        } catch (Exception e) {
//            log.debug("发送数据出错！！！{}{}", topicName, data);
//            log.debug("发送数据出错=====>", e);
//        }
//
//        //消息发送的监听器，用于回调返回信息
//        kafkaTemplate.setProducerListener(new ProducerListener<String, Object>() {
//            @Override
//            public void onSuccess(String topic, Integer partition, String key, Object value, RecordMetadata recordMetadata) {
//                log.debug("数据发送成功");
//            }
//
//            @Override
//            public void onError(String topic, Integer partition, String key, Object value, Exception exception) {
//                log.error("数据发送失败",exception);
//            }
//
//            @Override
//            public boolean isInterestedInSuccess() {
//                log.debug("数据发送完毕");
//                return false;
//            }
//        });
    }

    /**
     * 发送日志数据
     * @param logMessage
     */
    public void sendMessage(LogMessage logMessage) {
        sendMessage(myLogConfig.getTopic(),logMessage.getUser(),JSONObject.toJSONString(logMessage));
    }
}
