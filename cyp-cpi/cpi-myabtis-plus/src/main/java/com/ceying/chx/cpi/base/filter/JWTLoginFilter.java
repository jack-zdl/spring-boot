package com.ceying.chx.cpi.base.filter;



import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 功能说明:  实现Filter并在添加 @WebFilter 注解，在主类中添加@ServletComponentScan  就可以启动这个自定义filter<br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/28 16:55<br>
 * <br>
 */

@WebFilter(urlPatterns = "/*")
public class JWTLoginFilter  implements Filter {    // extends AbstractAuthenticationProcessingFilter
    @Override
    public
    void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public
    void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("------ CustomFilter Annotation ------");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public
    void destroy() {

    }

//    public JWTLoginFilter(String url, AuthenticationManager authManager) {
//        super(new AntPathRequestMatcher(url));
//        setAuthenticationManager(authManager);
//    }
//
//    @Override
//    public Authentication attemptAuthentication(
//            HttpServletRequest req, HttpServletResponse res)
//            throws AuthenticationException, IOException, ServletException {
//        LoginVO creds = new ObjectMapper()
//                .readValue(req.getInputStream(), LoginVO.class);
//        return getAuthenticationManager().authenticate(
//                new UsernamePasswordAuthenticationToken(
//                        creds.getUserName(),
//                        creds.getPassword(),
//                        Collections.emptyList()
//                )
//        );
//    }
//
//        @Override
//        protected void successfulAuthentication(
//                HttpServletRequest req,
//                HttpServletResponse res, FilterChain chain,
//                Authentication auth) throws IOException, ServletException {
//            TokenAuthenticationService.addAuthentication(res, auth.getName());
//        }
}
