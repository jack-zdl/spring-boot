package com.ceying.chx.rcenter.mashibing.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserManager  {

    /**
     * 用户字典
     */
    static private final Map<Integer, User> _userMap = new HashMap<>();


    private UserManager() {
    }

    static public void addUser(User user){
        if(null != user){
            _userMap.put(user.userId,user);
        }
    }

    static public void removeUserById(int userId){
        _userMap.remove(userId);
    }

    /**
     * 列表
     * @return
     */
    static public Collection<User> listUser(){
        return _userMap.values();
    }


}
