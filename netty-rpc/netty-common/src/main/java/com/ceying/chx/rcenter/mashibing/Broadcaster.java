package com.ceying.chx.rcenter.mashibing;

import io.netty.channel.Channel;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.util.concurrent.GlobalEventExecutor;

/**
 * 广播源
 */
public class Broadcaster {

    /**
     * 客户端信道数组,一定要使用static f否则无法实现群发
     */
    static private final ChannelGroup _channelGroup = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    private Broadcaster() {

    }

    /**
     * 增加信道
     * @param channel
     */
    static public void addChannel(Channel channel){
        _channelGroup.add(channel);
    }

    /**
     * 移除信道
     * @param channel
     */
    static public void removeChannel(Channel channel){
        _channelGroup.remove(channel);
    }

    /**
     * 广播消息
     * @param msg
     */
    static public void broadcast(Object msg){
        if(null == msg){
            return;
        }
        _channelGroup.writeAndFlush(msg);
    }

}
