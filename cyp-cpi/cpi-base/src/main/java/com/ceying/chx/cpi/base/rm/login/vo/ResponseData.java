package com.ceying.chx.cpi.base.rm.login.vo;

/**
 * 功能说明: 登录后返回的数据对象<br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/13 21:58<br>
 * <br>
 */

public
class ResponseData {

    /**
     * 登录ID
     */
    private String userId;

    /**
     * token字符串
     */
    private String token;

    /**
     * 获得登录ID
     * @return
     */
    public
    String getUserId() {
        return userId;
    }

    /**
     * 设置登录ID
     * @param userId
     * @return
     */
    public
    ResponseData setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 获得token
     * @return
     */
    public
    String getToken() {
        return token;
    }

    /**
     * 设置token
     * @param token
     * @return
     */
    public
    ResponseData setToken(String token) {
        this.token = token;
        return this;
    }

    public
    ResponseData() {
    }

    @Override
    public
    String toString() {
        return "ResponseData{" +
                "loginId='" + userId + '\'' +
                ", token='" + token + '\'' +
                '}';
    }
}
