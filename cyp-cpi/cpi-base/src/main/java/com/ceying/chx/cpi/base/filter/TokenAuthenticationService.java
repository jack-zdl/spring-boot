package com.ceying.chx.cpi.base.filter;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ceying.chx.cpi.base.rm.login.vo.LoginVO;
import com.ceying.chx.cpi.base.util.response.RespJsonFactory;
import com.ceying.chx.cpi.base.util.token.JWT;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

import static java.util.Collections.emptyList;

/**
 * 功能说明: <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/28 17:23<br>
 * <br>
 */

public
class TokenAuthenticationService {
    static final long EXPIRATIONTIME = 1000*60*60*24*1; // 1 days
    static final String SECRET = "ThisIsASecret";
    static final String TOKEN_PREFIX = "Bearer";
    static final String HEADER_STRING = "Authorization";

    static void addAuthentication(HttpServletResponse res, String username) {
        String JWT = Jwts.builder()
                .setSubject(username)
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATIONTIME))
                .signWith(SignatureAlgorithm.HS512, SECRET)
                .compact();
        res.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + JWT);
    }

//    static Authentication getAuthentication(HttpServletRequest request) {
//        String token = request.getHeader(HEADER_STRING);
//        String user = null;
//        if (token != null) {
//            String loginId = request.getParameter("loginId");
//            LoginVO login = JWT.unsign(token, LoginVO.class);
//            //解密token后的loginId与用户传来的loginId不一致，一般都是token过期
//            if(null != loginId && null != token && null != login) {
//                if (loginId.equals(login.getUserName())) {
//                    user = loginId;
//                }
//            } else{
//                user = null;
//                }
//            // parse the token.
////            String user = Jwts.parser()
////                    .setSigningKey(SECRET)
////                    .parseClaimsJws(token.replace(TOKEN_PREFIX, ""))
////                    .getBody()
////                    .getSubject();
//
//            return user != null ? new UsernamePasswordAuthenticationToken(login, null, emptyList()) : null;
//        }
//        return null;
//    }
}
