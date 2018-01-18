package com.ceying.chx.cpi.base.rm.base;

import javax.validation.constraints.NotNull;

/**
 * 功能说明: 对于md5或者其他加密的传输对象，代理的传输对象<br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/16 22:08<br>
 * <br>
 */

public class ProxyVo<T> {

    /**
     * 要传入的vo对象
     */
    private T jsonObject;

    /**
     * 对要传入的vo对象的加密字符串
     */
    @NotNull
    private String ciphertext;

    /**
     * 获得传入的vo对象
     * @return
     */
    public T getJsonObject() {
        return jsonObject;
    }

    /**
     * 设置传入的vo对象
     * @param jsonObject
     * @return
     */
    public ProxyVo setJsonObject(T jsonObject) {
        this.jsonObject = jsonObject;
        return this;
    }

    /**
     * 获得加密字符串
     * @return
     */
    public String getCiphertext() {
        return ciphertext;
    }

    /**
     * 设置加密字符串
     * @param ciphertext
     * @return
     */
    public ProxyVo setCiphertext(String ciphertext) {
        this.ciphertext = ciphertext;
        return this;
    }

    public
    ProxyVo(T jsonObject, String ciphertext) {
        this.jsonObject = jsonObject;
        this.ciphertext = ciphertext;
    }

    public
    ProxyVo() {
    }

    @Override
    public
    String toString() {
        return "ProxyVo{" +
                "jsonObject=" + jsonObject +
                ", ciphertext='" + ciphertext + '\'' +
                '}';
    }
}
