package com.ceying.chx.cpi.base.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;


import javax.annotation.Resource;
import java.util.Collections;

/**
 * 功能说明: security的配置类<br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/16 7:38<br>
 * <br>
 */

//@Configuration
//@EnableWebSecurity// @EnableWebMvcSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)// 控制权限注解？
public class WebSecurityConfig { // extends WebSecurityConfigurerAdapter
//
//    @Bean
//    JwtUserDetailsServiceImpl jwtUserDetailsService() {
//        return new JwtUserDetailsServiceImpl();
//    }
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder();
//    }
//////
//    @Autowired
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(jwtUserDetailsService()); //.passwordEncoder(new BCryptPasswordEncoder())
//    }
////
//////    protected void registerAuthentication(AuthenticationManagerBuilder auth)  throws Exception {
//////        auth
//////                .inMemoryAuthentication()
//////                .withUser("user") // #1
//////                .password("password")
//////                .roles("USER")
//////                .and()
//////                .withUser("admin") // #2
//////                .password("password")
//////                .roles("ADMIN","USER");
//////    }
////
//////
////    /**
////     * 在内存中创建两个用户
////     * @param
////     * @throws Exception
////     */
//////    @Autowired
//////    public void globalUserDetails(AuthenticationManagerBuilder auth) throws Exception {
//////        auth.inMemoryAuthentication()
//////                .withUser("admin").password("123").roles("admin");
//////    }
////
////
//    protected void configure(HttpSecurity http) throws Exception {
//        http
                    // 跨域处理的代码
//                .csrf().disable()  // 由于使用的是JWT，我们这里不需要csrf
//                // 基于token，所以不需要session
////                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
//
////                .authorizeUrls()
//                .authorizeRequests()
//                // 允许对于网站静态资源的无授权访问
////                .antMatchers(
////                        HttpMethod.GET,
////                        "/",
////                        "/*.html",
////                        "/favicon.ico",
////                        "/**/*.html",
////                        "/**/*.css",
////                        "/**/*.js"
////                ).permitAll()
//                // 对于获取token的rest api要允许匿名访问
////                .antMatchers("/cpi/base/login") //base/org/list
////                .authenticated()
//                .antMatchers("/cpi/base/login")
////                .authenticated()
////                .antMatchers("/cpi/base/org/list")
//////                .authenticated()
//////                .antMatchers(HttpMethod.PUT)
//////                .authenticated()
//////                .antMatchers(HttpMethod.DELETE)
////                .authenticated()
////                .antMatchers(HttpMethod.POST,"/login")
////                .authenticated()
//                .permitAll()
////                .antMatchers("/cpi/base/org/list").hasRole("admin")
////                .expressionHandler()  //httpSecurityExpressionHander()
//        // 除上面外的所有请求全部需要鉴权认证
//                .anyRequest().authenticated();
////                .antMatchers("/cpi/base/org/list").hasRole("admin");
////                .and()
////                .formLogin()
////                .defaultSuccessUrl("/cpi/base/login")
////                .permitAll()
////                .and()
////                .logout()
////                .permitAll();
////                .and()
//////
////                .addFilterBefore(new JWTAuthenticationFilter(),
////                        UsernamePasswordAuthenticationFilter.class)
////                .sessionManagement()
////                .and()
////                .httpBasic();
//        // 禁用缓存
////        http.headers().cacheControl();
//    }


//    @Override
//    protected
//    void configure(HttpSecurity http) throws Exception {
//        // 这是以一种form表单的形式来访问
//        http
//
//                .formLogin()
//                .loginPage("/base-login.html")
//                .loginProcessingUrl("/cpi/base/login")
//        // 以basic的形式来访问，是以弹出框的形式来进行访问
////        http.httpBasic()
//            .and()
//
//                .authorizeRequests()
//                .antMatchers("/base-login.html").permitAll()
//                .antMatchers("/cpi/base/login").permitAll()
//                .anyRequest()
//                .authenticated();
//    }
}
