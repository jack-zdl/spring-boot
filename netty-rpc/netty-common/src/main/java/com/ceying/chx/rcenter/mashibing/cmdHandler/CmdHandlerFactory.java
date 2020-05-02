package com.ceying.chx.rcenter.mashibing.cmdHandler;

import com.ceying.chx.rcenter.GameMsgProtocol;
import com.google.protobuf.GeneratedMessageV3;

import java.util.HashMap;
import java.util.Map;

/**
 * 指令处理器工厂
 */
public final class CmdHandlerFactory {

    static private Map<Class<?>, ICmdHandler<? extends GeneratedMessageV3>> _handlerMap = new HashMap<>();

    private CmdHandlerFactory(){

    }

    static public void init(){
        _handlerMap.put(GameMsgProtocol.UserEntryCmd.class, new UserEntryCmdHandler());
        _handlerMap.put(GameMsgProtocol.WhoElseIsHereCmd.class, new WhoElseIsHereCmdHandler());
        _handlerMap.put(GameMsgProtocol.UserMoveToCmd.class, new UserMoveToCmdHandler());
    }

    static public ICmdHandler<? extends GeneratedMessageV3> create(Class<?> msgClass){
        if(null == msgClass){
            return null;
        }
        return _handlerMap.get(msgClass);
    }
}
