package com.ceying.chx.rcenter.mashibing;

import com.ceying.chx.rcenter.GameMsgProtocol;
import com.ceying.chx.rcenter.mashibing.cmdHandler.*;
import com.ceying.chx.rcenter.mashibing.model.User;
import com.ceying.chx.rcenter.mashibing.model.UserManager;
import com.google.protobuf.GeneratedMessageV3;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.AttributeKey;
import io.netty.util.NetUtil;

/**
 * 自定义的消息处理器
 */
public class GameMsgHandler extends SimpleChannelInboundHandler {




    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        Broadcaster.addChannel(ctx.channel());
    }

    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
        super.handlerRemoved(ctx);

        Broadcaster.removeChannel(ctx.channel());
        Integer userId = (Integer)ctx.channel().attr(AttributeKey.valueOf("userId")).get();
        if(null == userId){
            return;
        }
        UserManager.removeUserById(userId);

        GameMsgProtocol.UserQuitResult.Builder resultBuilder = GameMsgProtocol.UserQuitResult.newBuilder();
        resultBuilder.setQuitUserId(userId);
        GameMsgProtocol.UserQuitResult newResult = resultBuilder.build();
        Broadcaster.broadcast(newResult);
    }


    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object msg) throws Exception {
        System.out.println("收到客户端消息,msgClass= "+msg.getClass().getName()+"，msg = "+msg);
        ICmdHandler<? extends GeneratedMessageV3> cmdHandler = CmdHandlerFactory.create(msg.getClass());
        if(null != cmdHandler){
            cmdHandler.handle(channelHandlerContext,cast(msg));
        }
    }


    /**
     * 转型消息对象
     * @param msg
     * @param <TCmd>
     * @return
     */
    static private <TCmd extends GeneratedMessageV3> TCmd cast(Object msg){
        if(null == msg){
            return null;
        }else{
            return (TCmd) msg;
        }
    }


}
