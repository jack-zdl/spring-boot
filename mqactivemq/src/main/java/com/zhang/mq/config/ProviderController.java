package com.zhang.mq.config;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Topic;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@RestController
public class ProviderController {
    @Autowired
    private QueueProducer queueProducer;

    @Autowired
    private Topic topic;


    //注入存放消息的队列，用于下列方法一

    @GetMapping("/value")
    public String value() {
        String queueName="QUEUE_MY"; //自定义队列名称
        String student = "我是小明-";
        List list = new ArrayList(10000);
        IntStream.range(0,10).forEach(x ->{
            System.out.println("是不是异步执行"+x);
            queueProducer.sendObjectMessage(queueName, student+x);   //发送到MQS
        });
//
//        for (int i = 0; i< 10000;i++){
//            queueProducer.sendObjectMessage(queueName, student+i);   //发送到MQS
//        }
        return "消息已经发送";
    }

    @GetMapping("/top")
    public String top() {
        String student = "我是小明";;
        queueProducer.sendObjectMessage(topic, student);   //发送到MQS
        return "消息已经发送";
    }
}
