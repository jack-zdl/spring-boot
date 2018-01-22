package com.zhang.redis.entity;

/**
 * 功能说明:用户实体类 <br>
 * 系统版本: 2.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2018/1/22 20:46<br>
 */
public class User {
    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    public
    String getUsername() {
        return username;
    }

    public
    User setUsername(String username) {
        this.username = username;
        return this;
    }

    public
    String getPassword() {
        return password;
    }

    public
    User setPassword(String password) {
        this.password = password;
        return this;
    }

    public User() {
        System.out.println("父类初始化");
    }

    public
    User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
