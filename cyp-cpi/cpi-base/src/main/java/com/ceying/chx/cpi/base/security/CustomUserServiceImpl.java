package com.ceying.chx.cpi.base.security;

import com.ceying.chx.cpi.base.rm.login.entity.LoginEntity;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;


/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/16 7:58<br>
 * <br>
 */
@Component
public class CustomUserServiceImpl { //implements UserDetailsService

//    @Autowired
//    UserDao userDao;
//
    private static final org.slf4j.Logger logger = LoggerFactory.getLogger(CustomUserServiceImpl.class);

//    @Autowired
//    private PasswordEncoder passwordEncoder;
////
//    /**
//     * 返回特定的实体类，
//     * @param username
//     * @return
//     */
//    public
//    UserDetails loadUserByUsername(String username) { //重写loadUserByUsername 方法获得 userdetails 类型用户
//        logger.info("登录用户名："+username);
//        LoginEntity loginEntity = new LoginEntity();
//        List<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        List roles = new ArrayList<>();
//        if("admin".equals(username)){
//            //用于添加用户的权限。只要把用户权限添加到authorities 就万事大吉。
//            loginEntity.setId(1);
//
//            roles.add("admin");
//            authorities.add(new SimpleGrantedAuthority("admin"));
//            logger.info("loadUserByUsername: " + username);
//        }else {
//            throw new UsernameNotFoundException("用户名不存在");
//        }
//        loginEntity.setAuthorities(authorities);
//        loginEntity.setUsername("admin");
//        loginEntity.setLoginId("admin");
//        loginEntity.setPassword("123");
//        loginEntity.setRoles(roles);
//        loginEntity.setGrantedAuthorities(authorities);

        //根据查找到的用户信息判断用户是否被冻结
//        String password = passwordEncoder.encode("123456");
//        logger.info("password="+password);
//        return new User(username,password,
//                true,true,true,true,
//                AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
//    }
}
