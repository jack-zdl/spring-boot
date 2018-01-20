package com.ceying.chx.cpi.base.rm.login.vo;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 功能说明:模拟登录对象 <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/13 22:09<br>
 * <br>
 */

public class LoginVO implements Serializable{

    //序列化ID
    private static final long serialVersionUID = -5809782578272943999L;
    /**
     * 用户名称
     */
    @NotNull
    private String username;

    /**
     * 用户密码
     */
    @NotNull
    private String password;

    /**
     * 获得用户名称
     * @return
     */
    public
    String getUsername() {
        return username;
    }

    /**
     * 设置用户名称
     * @param username
     * @return
     */
    public
    LoginVO setUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 获得用户密码
     * @return
     */
    public
    String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     * @param password
     * @return
     */
    public
    LoginVO setPassword(String password) {
        this.password = password;
        return this;
    }

    public
    LoginVO() {
    }

    @Override
    public
    String toString() {
        return "LoginVO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
