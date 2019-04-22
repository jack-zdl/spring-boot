package com.ceying.chx.cpi.base.filter;

//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.GenericFilterBean;
//import org.springframework.security.core.Authentication;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/28 16:50<br>
 * <br>
 */

public class JWTAuthenticationFilter  { //extends GenericFilterBean
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain) throws IOException, ServletException {
//
//        Authentication authentication = TokenAuthenticationService
//                .getAuthentication((HttpServletRequest)request);
//
//        SecurityContextHolder.getContext()
//                .setAuthentication(authentication);
//        filterChain.doFilter(request,response);
//    }
}
