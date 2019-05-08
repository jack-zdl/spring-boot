package com.ceying.eagleeye.consumer.kafka;

import com.ceying.eagleeye.common.config.MyLogConfig;
import com.ceying.eagleeye.common.service.MylogService;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 功能说明:日志消息 消费者 <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/21<br>
 * <br>
 */
@Component
public class LogMsgConsumer {
    private static final Logger log = LoggerFactory.getLogger(LogMsgConsumer.class);
    @Autowired
    private MylogService mylogService;
    @Autowired
    private MyLogConfig myLogConfig;
    @KafkaListener(topics = "MYLOGTOPIC")
    public void listenLog(ConsumerRecord<?, ?> cr) throws Exception {
        String key="";
        String value="";
        if(cr.key() instanceof  byte[]){
            key=new String((byte[]) cr.key());
        }else{
            key= (String) cr.key();
        }
        if(cr.value() instanceof  byte[]){
            value=new String((byte[]) cr.value());
        }else{
            value= (String) cr.value();
        }
        log.info("{"+cr.topic()+"} - {"+key+"} : {"+ value+"}");
        String user="";
        String data="";
        if(key==null&&!myLogConfig.isLogNulUser()){
            return;
        }
        if(key!=null){
            user=key;
        }
        if(value!=null){
            data=value;
        }
        mylogService.writrFile(user,data);
    }
}
