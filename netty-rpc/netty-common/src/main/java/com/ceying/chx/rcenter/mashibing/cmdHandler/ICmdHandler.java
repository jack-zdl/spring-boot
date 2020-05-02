package com.ceying.chx.rcenter.mashibing.cmdHandler;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.channel.ChannelHandlerContext;


/**
 * 指令处理器接口
 * @param <TCmd>
 */
public interface ICmdHandler<TCmd extends GeneratedMessageV3> {

    public void handle(ChannelHandlerContext channelHandlerContext,TCmd cmd);
}
