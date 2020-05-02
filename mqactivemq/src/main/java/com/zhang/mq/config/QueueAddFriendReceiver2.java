package com.zhang.mq.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class QueueAddFriendReceiver2 {

    @JmsListener(destination = "mytopic", containerFactory = "topicListener") //红色为监听的队列名称
    public void receiveAddFriend(String student) {
        System.out.println("topic2="+student);
    }
}
