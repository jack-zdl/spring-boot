package com.ceying.chx.rcenter.mashibing.cmdHandler;

import com.ceying.chx.rcenter.GameMsgProtocol;
import com.ceying.chx.rcenter.mashibing.Broadcaster;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

public class UserMoveToCmdHandler implements ICmdHandler<GameMsgProtocol.UserMoveToCmd>{

    @Override
    public void handle(ChannelHandlerContext channelHandlerContext, GameMsgProtocol.UserMoveToCmd msg) {
        Integer userId = (Integer) channelHandlerContext.channel().attr(AttributeKey.valueOf("userId")).get();

        if(null ==  userId){
            return;
        }
        GameMsgProtocol.UserMoveToCmd cmd = msg;
        GameMsgProtocol.UserMoveToResult.Builder resultBuilder = GameMsgProtocol.UserMoveToResult.newBuilder();
        resultBuilder.setMoveUserId(userId);
        resultBuilder.setMoveToPosX(cmd.getMoveToPosX());
        resultBuilder.setMoveToPosY(cmd.getMoveToPosY());

        GameMsgProtocol.UserMoveToResult newResult = resultBuilder.build();
        Broadcaster.broadcast(newResult);
    }
}
