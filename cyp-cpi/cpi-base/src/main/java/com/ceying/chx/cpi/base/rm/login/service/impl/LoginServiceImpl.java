package com.ceying.chx.cpi.base.rm.login.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ceying.chx.cpi.base.exception.ParamException;
import com.ceying.chx.cpi.base.rm.login.entity.LoginEntity;
import com.ceying.chx.cpi.base.rm.login.service.LoginService;
import com.ceying.chx.cpi.base.rm.login.vo.LoginVO;
import com.ceying.chx.cpi.base.rm.login.vo.ResponseData;
//import com.ceying.chx.cpi.base.security.JwtTokenUtil;
import com.ceying.chx.cpi.base.rm.org.entity.User;
import com.ceying.chx.cpi.base.security.JwtUserDetailsServiceImpl;
import com.ceying.chx.cpi.base.util.response.RespJson;
import com.ceying.chx.cpi.base.util.response.RespJsonFactory;
import com.ceying.chx.cpi.base.util.token.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/9 18:45<br>
 * <br>
 */
@Service
public class LoginServiceImpl  implements LoginService  {


//    private AuthenticationManager authenticationManager;
//    private UserDetailsService userDetailsService;
//    @Resource
//    private AuthenticationManager authenticationManager;
//
//    private UserDetailsService userDetailsService;

//    @Resource
//    private JwtTokenUtil jwtTokenUtil;

    @Value("${user.username}")
    private String username;

    @Value("${user.password}")
    private String password;

    @Value("${token.time}")
    private long time;

//    @Autowired
//    private JwtTokenUtil jwtTokenUtil;
//    private UserRepository userRepository;


//    public RespJson login(LoginVO loginVO) throws ParamException {
//        RespJson respJson ;
//        CustomUserServiceImpl customUserService = new CustomUserServiceImpl();
//        ResponseData responseData = new ResponseData();
//        if("admin".equals(loginVO.getUserName())){
////           LoginEntity loginEntity = (LoginEntity) customUserService.loadUserByUsername(loginVO.getUserName());
//            String token = JWT.sign(loginVO, 60L* 1000L*30L);//60分-1000毫秒-30分
//
//            responseData.setUserId(loginVO.getUserName());
//            responseData.setToken(token);
//            respJson = RespJsonFactory.buildSuccess(responseData);
//        }else {
//            throw new ParamException("用户登录异常");
//        }
//        return respJson;
//    }

    public RespJson login(LoginVO loginVO) throws ParamException {
        RespJson respJson ;
//        CustomUserServiceImpl customUserService = new CustomUserServiceImpl();

        ResponseData responseData = new ResponseData();
        checkParam();
        if(username.equals(loginVO.getUsername()) && password.equals(loginVO.getPassword())){
//            UsernamePasswordAuthenticationToken upToken = new UsernamePasswordAuthenticationToken(loginVO.getUserName(), loginVO.getPassword());
//            final Authentication authentication = authenticationManager.authenticate(upToken);
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//
//            final UserDetails userDetails = userDetailsService.loadUserByUsername(username);
//            final String token = jwtTokenUtil.generateToken(userDetails);

//      LoginEntity loginEntity = (LoginEntity) customUserService.loadUserByUsername(loginVO.getUserName());
//            String token = JWT.sign(loginVO, time);//60分-1000毫秒-30分
//            UsernamePasswordAuthenticationToken upToken = new UsernamePasswordAuthenticationToken(loginVO.getUserName(), loginVO.getPassword());
//            final Authentication authentication = authenticationManager.authenticate(upToken);
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//
//            final UserDetails userDetails = this.loadUserByUsername(loginVO.getUserName());
//            final String token = JWT.sign(userDetails,60L* 1000L*30L);

            responseData.setUserId(loginVO.getUsername());

//            responseData.setToken(token);
            respJson = RespJsonFactory.buildSuccess(responseData);
        }else {
            throw new ParamException("用户登录异常");
        }
        return respJson;
    }

    @Override
    @Cacheable(value = "role")
    public String cache(int id) {
        System.out.println("没进入缓存cache");
        return "cache";
    }

    /**
     * 验证配置文件参数
     */
    private void checkParam() throws ParamException {
        if(username == null){
            throw new ParamException();
        }else if(password == null){
            throw new ParamException();
        }else if(time<0){
            throw new ParamException();
        }
    }

//    @Override
//    public
//    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
//        authorities.add(new SimpleGrantedAuthority("admin"));
//        return new org.springframework.security.core.userdetails.User("admin",
//                "123456", authorities);
////        new JwtUser(
////                user.getId(),
////                user.getUsername(),
////                user.getPassword(),
////                user.getEmail(),
////                mapToGrantedAuthorities(user.getRoles()),
////                user.getLastPasswordResetDate()
////        );
//    }
}
