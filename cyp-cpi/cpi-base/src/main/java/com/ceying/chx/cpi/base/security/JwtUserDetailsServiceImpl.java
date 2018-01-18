package com.ceying.chx.cpi.base.security;


import com.ceying.chx.cpi.base.rm.login.dto.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class JwtUserDetailsServiceImpl  { //implements UserDetailsService

//
//    @Override
//    public
//    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = new User();
//        List roles = new ArrayList();
//        roles.add("admin");
//        user.setId("1");
//        user.setUsername("aa");
//        user.setPassword("123456");
//        user.setRoles(roles);
//        user.setLastPasswordResetDate(new Date());
//        user.setEmail("111@gmail.com");
//
//        if (user == null) {
//            throw new UsernameNotFoundException(String.format("No user found with username '%s'.", username));
//        } else {
//            return null;
//        }
//    }
}
