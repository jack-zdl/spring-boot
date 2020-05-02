package com.ceying.chx.rcenter.mashibing;


import com.ceying.chx.rcenter.GameMsgProtocol;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;

/**
 * 解码
 */
public class GameMsgDecoder extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx,Object msg)throws Exception{
        if(!(msg instanceof BinaryWebSocketFrame )){
            return;
        }
        // 因为用的websocket
        BinaryWebSocketFrame f = (BinaryWebSocketFrame)msg;
        ByteBuf b = f.content();
        b.readShort();// 读取消息的长度
        int msgCode = b.readShort();// 读取消息编号

        // 必须写这
        Message.Builder msgBuilder = GameMsgRecognizer.getBuilderByMsgCode(msgCode);
        // 没有消息就不读了
        if(null == msgBuilder){
            return;
        }

        byte[] msgBody = new byte[b.readableBytes()];
        b.readBytes(msgBody);

        GeneratedMessageV3 cmd = null;

        msgBuilder.clear();
        msgBuilder.mergeFrom(msgBody);

        Message newMsg = msgBuilder.build();

        if(null != newMsg){
            ctx.fireChannelRead(newMsg);
        }
    }

}
