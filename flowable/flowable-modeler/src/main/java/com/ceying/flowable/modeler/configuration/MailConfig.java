package com.ceying.flowable.modeler.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author: fej
 * @date: 2018/5/14
 * @description :
 * @version: 2.0
 */
@Configuration
@ConfigurationProperties(prefix = "mail")
public class MailConfig {

    private String mailServerHost;
    private Integer mailServerPort;
    private String mailServerDefaultFrom;
    private String mailServerUsername;
    private String mailServerPassword;
    private Boolean mailServerUseSSL;
    private Boolean mailServerUseTLS;

    public String getMailServerHost() {
        return mailServerHost;
    }

    public void setMailServerHost(String mailServerHost) {
        this.mailServerHost = mailServerHost;
    }

    public Integer getMailServerPort() {
        return mailServerPort;
    }

    public void setMailServerPort(Integer mailServerPort) {
        this.mailServerPort = mailServerPort;
    }

    public String getMailServerDefaultFrom() {
        return mailServerDefaultFrom;
    }

    public void setMailServerDefaultFrom(String mailServerDefaultFrom) {
        this.mailServerDefaultFrom = mailServerDefaultFrom;
    }

    public String getMailServerUsername() {
        return mailServerUsername;
    }

    public void setMailServerUsername(String mailServerUsername) {
        this.mailServerUsername = mailServerUsername;
    }

    public String getMailServerPassword() {
        return mailServerPassword;
    }

    public void setMailServerPassword(String mailServerPassword) {
        this.mailServerPassword = mailServerPassword;
    }

    public Boolean getMailServerUseSSL() {
        return mailServerUseSSL;
    }

    public void setMailServerUseSSL(Boolean mailServerUseSSL) {
        this.mailServerUseSSL = mailServerUseSSL;
    }

    public Boolean getMailServerUseTLS() {
        return mailServerUseTLS;
    }

    public void setMailServerUseTLS(Boolean mailServerUseTLS) {
        this.mailServerUseTLS = mailServerUseTLS;
    }
}
