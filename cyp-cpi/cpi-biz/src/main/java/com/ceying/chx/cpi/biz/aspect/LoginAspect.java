package com.ceying.chx.cpi.biz.aspect;

import com.ceying.chx.cpi.biz.constant.SysConstants;
import com.ceying.chx.cpi.biz.util.response.RespJsonFactory;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * 功能说明: 登陆检查<br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl
 * 开发时间: 2017/11/8 9:22<br>
 * <br>
 */
@Order(1)
@Component("login")
@Aspect
public class LoginAspect {
        @Pointcut("execution(public * com.cyp.chx.controller.*.*(..))")
    public void pointcut() {
    }

//     @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        HttpServletRequest request = null;
        String methodName = pjp.getSignature().getName();
        List<Object> list = Arrays.asList(pjp.getArgs());
        /**
         * 得到用户的token token就是这样使用的
         * 1 无法得到token
         */
        HttpServletRequest httpServletRequest = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes())
                .getRequest();
        String token = getUserToken(httpServletRequest);
        if (!token.equalsIgnoreCase("123456")) {
              System.out.println( "错误, 权限不合法!");
        } else {
             System.out.println("正确，权限合法");
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof HttpServletRequest) {
                request = (HttpServletRequest) list.get(i);
            }
        }
        if (request != null && request.getSession().getAttribute(SysConstants.SESSION_USER) == null) {
            return RespJsonFactory.buildWarning("用户未登录");
        } else {
            return pjp.proceed();
        }

    }

    private String getUserToken(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        if (cookies == null) {
            return "";
        }
        for (Cookie cookie : cookies) {
            if (cookie.getName().equalsIgnoreCase("user_token")) {
                return cookie.getValue();
            }
        }
        return "";
    }
}
