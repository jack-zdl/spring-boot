package com.ceying.chx.cpi.base.rm.login.entity;

//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.List;

/**
 * 功能说明:模拟登录对象 ，这个实体类继承UserDatails，可以有权限这个东西<br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/13 22:09<br>
 * <br>
 */

public
class LoginEntity{ // implements UserDetails 用于登录时 @AuthenticationPrincipal 标签取值

    private Integer id;
    private String loginId;
    private String username;
    @JsonIgnore
    private String password;
    private String rawPassword;

    @JsonIgnore
    private List<String> roles;
//    private List<? extends GrantedAuthority> authorities;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public
    String getLoginId() {
        return loginId;
    }

    public
    LoginEntity setLoginId(String loginId) {
        this.loginId = loginId;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRawPassword() {
        return rawPassword;
    }

    public void setRawPassword(String rawPassword) {
        this.rawPassword = rawPassword;
    }

    public
    List<String> getRoles() {
        return roles;
    }

    public
    LoginEntity setRoles(List<String> roles) {
        this.roles = roles;
        return this;
    }

//    public
//    LoginEntity setAuthorities(List<? extends GrantedAuthority> authorities) {
//        this.authorities = authorities;
//        return this;
//    }

//    @JsonIgnore
//    @Override
//    public boolean isAccountNonExpired() {
//        return true;
//    }
//
//    @JsonIgnore
//    @Override
//    public boolean isAccountNonLocked() {
//        return true;
//    }
//
//    @JsonIgnore
//    @Override
//    public boolean isCredentialsNonExpired() {
//        return true;
//    }
//
//
//    @JsonIgnore
//    @Override
//    public boolean isEnabled() {
//        return true;
//    }
//
//    @JsonIgnore
//    @Override
//    public Collection<? extends GrantedAuthority> getAuthorities() {
//        return authorities;
//    }
//
//    public void setGrantedAuthorities(List<? extends GrantedAuthority> authorities) {
//        this.authorities = authorities;
//    }

//    /**
//     * 组织ID
//     */
//    @NotNull
//    private String orgId;
//
//    /**
//     * 获得组织ID
//     * @return
//     */
//    public
//    String getOrgId() {
//        return orgId;
//    }
//
//    /**
//     * 设置组织ID
//     * @param orgId
//     * @return
//     */
//    public
//    LoginEntity setOrgId(String orgId) {
//        this.orgId = orgId;
//        return this;
//    }
//
//    public
//    LoginEntity() {
//    }
//
//    @Override
//    public
//    String toString() {
//        return "LoginEntity{" +
//                "orgId='" + orgId + '\'' +
//                '}';
//    }


}
