package com.ceying.chx.cpi.base.rm.login.vo;

import javax.validation.constraints.NotNull;

/**
 * 功能说明:模拟登录对象 <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/13 22:09<br>
 * <br>
 */

public class LoginEntity {

    /**
     * 组织ID
     */
    @NotNull
    private String orgId;

    /**
     * 获得组织ID
     * @return
     */
    public
    String getOrgId() {
        return orgId;
    }

    /**
     * 设置组织ID
     * @param orgId
     * @return
     */
    public
    LoginEntity setOrgId(String orgId) {
        this.orgId = orgId;
        return this;
    }

    public
    LoginEntity() {
    }

    @Override
    public
    String toString() {
        return "LoginEntity{" +
                "orgId='" + orgId + '\'' +
                '}';
    }

}
