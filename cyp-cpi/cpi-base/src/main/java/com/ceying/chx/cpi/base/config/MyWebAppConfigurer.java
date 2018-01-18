package com.ceying.chx.cpi.base.config;

import com.ceying.chx.cpi.base.interceptor.CommonInterceptor;
import com.ceying.chx.cpi.base.interceptor.IPInterceptor;
import com.ceying.chx.cpi.base.interceptor.TokenInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 功能说明: 为了使自定义的拦截器生效，需要注册拦截器到spring容器中，
 *          具体的做法是继承WebMvcConfigurerAdapter类，覆盖其addInterceptors(InterceptorRegistry registry)方法。
 *          最后别忘了把Bean注册到Spring容器中，可以选择@Component 或者 @Configuration。
 *          <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/13 22:27<br>
 * <br>
 */

@Configuration
@EnableWebMvc
public class MyWebAppConfigurer   {  //extends WebMvcConfigurerAdapter

//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        // 注册拦截器
//        InterceptorRegistration ir = registry.addInterceptor(new TokenInterceptor());
//        // 配置拦截的路径
//        ir.addPathPatterns("/**");
//        // 配置不拦截的路径
//        ir.excludePathPatterns("/cpi/base/login");


//        registry.addInterceptor(new CommonInterceptor()).addPathPatterns("/**");
//        registry.addInterceptor(new IPInterceptor()).addPathPatterns("/**");
////        registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/**").excludePathPatterns("/cpi/base/login");
////        registry.addInterceptor(new TokenInterceptor()).addPathPatterns("/**").excludePathPatterns("/login");
//        super.addInterceptors(registry);
//    }
}
