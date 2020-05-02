package com.ceying.chx.rcenter.mashibing;

import com.google.protobuf.GeneratedMessageV3;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;

/**
 * 编码
 */
public class GameMsgEncoder extends ChannelOutboundHandlerAdapter {
    @Override
    public void write(ChannelHandlerContext ctx, Object msg, ChannelPromise promise) throws Exception {
        if(null == msg ||
                !(msg instanceof GeneratedMessageV3)){
            super.write(ctx,msg,promise);
            return;
        }
        int msgCode = GameMsgRecognizer.getMsgCodeByMsgClazz(msg.getClass());
        if(msgCode == -1){
            return;
        }
        byte[] bytes = ((GeneratedMessageV3)msg).toByteArray();
        ByteBuf byteBuf = ctx.alloc().buffer();
        byteBuf.writeShort((short)0);
        byteBuf.writeShort(msgCode);

        byteBuf.writeBytes(bytes);
        BinaryWebSocketFrame frame = new BinaryWebSocketFrame(byteBuf);
        super.write(ctx,frame,promise);
    }

}
