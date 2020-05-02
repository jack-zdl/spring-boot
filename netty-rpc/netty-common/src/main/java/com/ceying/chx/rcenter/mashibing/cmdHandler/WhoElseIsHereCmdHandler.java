package com.ceying.chx.rcenter.mashibing.cmdHandler;

import com.ceying.chx.rcenter.GameMsgProtocol;
import com.ceying.chx.rcenter.mashibing.model.User;
import com.ceying.chx.rcenter.mashibing.model.UserManager;
import io.netty.channel.ChannelHandlerContext;

public class WhoElseIsHereCmdHandler implements ICmdHandler<GameMsgProtocol.WhoElseIsHereCmd>{

    @Override
    public void handle(ChannelHandlerContext channelHandlerContext,GameMsgProtocol.WhoElseIsHereCmd msg){
        GameMsgProtocol.WhoElseIsHereResult.Builder  resultBuilder = GameMsgProtocol.WhoElseIsHereResult.newBuilder();
        for (User curruser: UserManager.listUser()){
            if(null == curruser){
                continue;
            }
            GameMsgProtocol.WhoElseIsHereResult.UserInfo.Builder userInfoBuilder = GameMsgProtocol.WhoElseIsHereResult.UserInfo.newBuilder();
            userInfoBuilder.setUserId(curruser.userId);
            userInfoBuilder.setHeroAvatar(curruser.heroAvator);
            resultBuilder.addUserInfo(userInfoBuilder);

        }
        GameMsgProtocol.WhoElseIsHereResult newResult = resultBuilder.build();
        channelHandlerContext.writeAndFlush(newResult);
    }
}
