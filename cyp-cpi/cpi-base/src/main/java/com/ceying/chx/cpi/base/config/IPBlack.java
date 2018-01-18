package com.ceying.chx.cpi.base.config;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 功能说明: 映射配置参数的实体类<br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/14 22:10<br>
 * <br>
 */

@Component
@ConfigurationProperties(prefix="ip")
public class IPBlack {

    /**
     * 黑名单集合
     */

//    @Value("${port}")
//    private String port;
    @NotEmpty
    public static ArrayList<String> blacklist = new ArrayList<String>();
//   private List blacklist ;

    /**
     * 端口
     */
    public static String port;

    /**
     * 获得黑名单集合
     * @return
     */
    public
    ArrayList<String> getBlacklist() {
        return blacklist;
    }

    /**
     * 设置黑名单集合
     * @param blacklist
     * @return
     */
    public
    IPBlack setBlacklist(ArrayList<String> blacklist) {
        this.blacklist = blacklist;
        return this;
    }

    public static
    String getPort() {
        return port;
    }

    public static
    void setPort(String port) {
        IPBlack.port = port;
    }
}
