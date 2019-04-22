package com.ceying.chx.cpi.base.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ceying.chx.cpi.base.config.IPBlack;
import com.ceying.chx.cpi.base.util.IPUtil;
import com.ceying.chx.cpi.base.util.response.RespJsonFactory;
import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 功能说明: IP拦截器，拦截指定IP的访问者<br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/14 20:04<br>
 * <br>
 */
//@Component
public class IPInterceptor  extends HandlerInterceptorAdapter{

    /**
     * 根据IpConfig.properties中得到IP黑名单集合
     */
//    @Value("#{configProperties['ip.blacklist.list']}")
//    private List<String> list = new ArrayList<String>();

//    @Resource
//    private Environment env;
//
//    @Resource
//    private IPBlack ipBlack;

      @Resource
      private IPBlack ipBlack;

//    @Value("${ip.blacklist}")
//    private ArrayList<String> blacklist;
//
//    @Value("${ip.port}")
//    private String port;

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入IPInterceptor拦截器");
//        List blacklist = new ArrayList<>();

//        blacklist =  ipBlack.getBlacklist();
        System.out.println("黑名单目录："+IPBlack.blacklist);
        System.out.println("端口号："+IPBlack.port);
//        System.out.println(R.);
        String ipAdress = IPUtil.getIp(request);
        for (String ip : IPBlack.blacklist){
            if(ipAdress.equals(ip)){
                response.getWriter().write(JSONObject.toJSONString(RespJsonFactory.buildNotLogin(), SerializerFeature.WriteMapNullValue));
                return false;
            }
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
//        System.out.println("controller执行之后渲染页面之前进入postHander拦截器");
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub
//        System.out.println("渲染页面之后进入afterCompletion拦截器");
    }
}
