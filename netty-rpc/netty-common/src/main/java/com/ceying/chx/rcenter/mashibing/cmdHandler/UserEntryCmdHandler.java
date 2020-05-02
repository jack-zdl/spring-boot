package com.ceying.chx.rcenter.mashibing.cmdHandler;

import com.ceying.chx.rcenter.GameMsgProtocol;
import com.ceying.chx.rcenter.mashibing.Broadcaster;
import com.ceying.chx.rcenter.mashibing.model.User;
import com.ceying.chx.rcenter.mashibing.model.UserManager;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.AttributeKey;

public class UserEntryCmdHandler implements ICmdHandler<GameMsgProtocol.UserEntryCmd>{

    @Override
    public void handle(ChannelHandlerContext channelHandlerContext, GameMsgProtocol.UserEntryCmd msg) {
        // 从指令中获取用户信息
        GameMsgProtocol.UserEntryCmd cmd = msg;
        int userId = cmd.getUserId();
        String heroAvatar = cmd.getHeroAvatar();
        System.out.println("参数userId= " + userId + "++++" + heroAvatar);
        GameMsgProtocol.UserEntryResult.Builder resultBuilder = GameMsgProtocol.UserEntryResult.newBuilder();
        resultBuilder.setUserId(userId);
        resultBuilder.setHeroAvatar(heroAvatar);

        /**
         * 将用户添加到字典
         */
        User newUser = new User();
        newUser.userId = userId;
        newUser.heroAvator = heroAvatar;
        UserManager.addUser(newUser);
        //将用户id附着Channel
        channelHandlerContext.channel().attr(AttributeKey.valueOf("userId")).set(userId);

        GameMsgProtocol.UserEntryResult newResult = resultBuilder.build();
        Broadcaster.broadcast(newResult);
    }


}
