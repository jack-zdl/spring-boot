package com.ceying.chx.cpi.base.rm.login.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ceying.chx.cpi.base.exception.ParamException;
import com.ceying.chx.cpi.base.exception.RedisConnectException;
import com.ceying.chx.cpi.base.rm.base.ProxyVo;
import com.ceying.chx.cpi.base.rm.login.service.LoginService;
import com.ceying.chx.cpi.base.rm.login.vo.LoginVO;
import com.ceying.chx.cpi.base.util.redis.RedisUtils;
import com.ceying.chx.cpi.base.util.response.RespJson;
import com.ceying.chx.cpi.base.util.response.RespJsonFactory;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.Cacheable;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.HashMap;
import java.util.Map;

/**
 * 功能说明:登录Controller层 <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/9 18:42<br>
 * <br>
 */
@RestController
@RequestMapping("/cpi/base/login")
public class LoginController {

    @Resource
    private LoginService loginServiceImpl;

    @Resource
    private RedisUtils redisUtils;

    /**
     *
     * 这里使用ModelAttribute来指定某一块对象参数为某一个对象
     * @param request
//     * @param loginEntity
//     * @param errors
     * @return
     * @throws ParamException
     */
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public RespJson login(HttpServletRequest request,  @Valid @RequestBody LoginVO loginVO, BindingResult aErrors) throws ParamException { //@AuthenticationPrincipal
        if (aErrors.hasErrors()) {
            System.out.println("输入信息错误");
        }
        System.out.println("没有进入缓存");
//        String json = JSON.toJSONString(loginEntity, SerializerFeature.WriteMapNullValue);
        RespJson respJson = loginServiceImpl.login(loginVO);
        HttpSession session = request.getSession();
        session.setAttribute("user_session",loginVO);
        return respJson;
    }


    @GetMapping("/cache")
    @Cacheable(value = "info")
    public String  cache(HttpServletRequest request) throws ParamException, RedisConnectException { //@AuthenticationPrincipal
        System.out.println("没有进入缓存");
//        Map<String,Object> map = new HashMap<String,Object>();
//        JSONObject param = new JSONObject();
////        param.put("admin","admin");
//        map.put("test","cache");
//        redisUtils.save(map,100);
        return "cache";
    }
}
