package com.ceying.chx.rcenter.mashibing;


import com.ceying.chx.rcenter.GameMsgProtocol;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Message;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class GameMsgRecognizer {



    private GameMsgRecognizer(){
    }

    /**
     * 消息代码和消息体字典
     */
    static private  Map<Integer, GeneratedMessageV3> _msgCodeAndMsgBodyMap = new ConcurrentHashMap<>();

    static private  Map<Class<?>,Integer> _msgClazzAndMsgBodyMap  = new ConcurrentHashMap<>();

    /**
     * 可以利用反射优化代码
     */
    static public void init(){
        Class<?>[] innerClazzArray = GameMsgProtocol.class.getDeclaredClasses();
        for (Class<?> innerClazz : innerClazzArray){
            if(!GeneratedMessageV3.class.isAssignableFrom(innerClazz)){
                continue;
            }
            String clazzName = innerClazz.getSimpleName();
            clazzName = clazzName.toLowerCase();
            for (GameMsgProtocol.MsgCode msgCode : GameMsgProtocol.MsgCode.values()){
                String strMsgCode = msgCode.name();
                strMsgCode = strMsgCode.replaceAll("_","");
                strMsgCode = strMsgCode.toLowerCase();

                if(!strMsgCode.startsWith(clazzName)){
                    continue;
                }

                try {
                    Object returnObject = innerClazz.getDeclaredMethod("getDefaultInstance").invoke(innerClazz);

                    _msgCodeAndMsgBodyMap.put(msgCode.getNumber(),(GeneratedMessageV3)returnObject);

                    _msgClazzAndMsgBodyMap.put(innerClazz,msgCode.getNumber());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        _msgCodeAndMsgBodyMap.put(GameMsgProtocol.MsgCode.USER_ENTRY_CMD_VALUE,GameMsgProtocol.UserEntryCmd.getDefaultInstance());
//        _msgCodeAndMsgBodyMap.put(GameMsgProtocol.MsgCode.WHO_ELSE_IS_HERE_CMD_VALUE,GameMsgProtocol.WhoElseIsHereCmd.getDefaultInstance());
//        _msgCodeAndMsgBodyMap.put(GameMsgProtocol.MsgCode.USER_MOVE_TO_CMD_VALUE,GameMsgProtocol.UserMoveToCmd.getDefaultInstance());
//
        _msgClazzAndMsgBodyMap.put(GameMsgProtocol.UserEntryResult.class,GameMsgProtocol.MsgCode.USER_ENTRY_RESULT_VALUE);
//        _msgClazzAndMsgBodyMap.put(GameMsgProtocol.WhoElseIsHereResult.class,GameMsgProtocol.MsgCode.WHO_ELSE_IS_HERE_RESULT_VALUE);
//        _msgClazzAndMsgBodyMap.put(GameMsgProtocol.UserMoveToResult.class,GameMsgProtocol.MsgCode.USER_MOVE_TO_RESULT_VALUE);
//        _msgClazzAndMsgBodyMap.put(GameMsgProtocol.UserQuitResult.class,GameMsgProtocol.MsgCode.USER_QUIT_RESULT_VALUE);
    }

    static public Message.Builder getBuilderByMsgCode(int msgCode){
        if(msgCode < 0){
            return null;
        }
        GeneratedMessageV3 messageV3 = _msgCodeAndMsgBodyMap.get(msgCode);
        if(null == messageV3){
            return null;
        }
        return messageV3.newBuilderForType();
    }

    static public int getMsgCodeByMsgClazz(Class<?> msg){
        if(null == msg){
            System.out.println("错误消息类型");
            return -1;
        }
        Integer msgCode =  _msgClazzAndMsgBodyMap.get(msg);
        if(null != msgCode){
            return msgCode.intValue();
        }else {
            return -1;
        }

    }
}
