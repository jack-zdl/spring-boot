package com.ceying.chx.cpi.base.rm.login.dto;

import org.springframework.data.annotation.Id;

import java.util.Collection;
import java.util.Date;
import java.util.List;

//@Data
public class User  {
//    @Id
    private String id;

//    @Indexed(unique=true, direction= IndexDirection.DESCENDING, dropDups=true)
    private String username;

    private String password;
    private String email;
    private Date lastPasswordResetDate;
    private List<String> roles;

    public
    String getId() {
        return id;
    }

    public
    User setId(String id) {
        this.id = id;
        return this;
    }

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

    public
    String getEmail() {
        return email;
    }

    public
    User setEmail(String email) {
        this.email = email;
        return this;
    }

    public
    Date getLastPasswordResetDate() {
        return lastPasswordResetDate;
    }

    public
    User setLastPasswordResetDate(Date lastPasswordResetDate) {
        this.lastPasswordResetDate = lastPasswordResetDate;
        return this;
    }

    public
    List<String> getRoles() {
        return roles;
    }

    public
    User setRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }
}
