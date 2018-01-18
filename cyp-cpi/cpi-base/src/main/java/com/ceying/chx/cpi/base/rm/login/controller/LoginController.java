package com.ceying.chx.cpi.base.rm.login.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ceying.chx.cpi.base.exception.ParamException;
import com.ceying.chx.cpi.base.rm.base.ProxyVo;
import com.ceying.chx.cpi.base.rm.login.service.LoginService;
import com.ceying.chx.cpi.base.rm.login.vo.LoginVO;
import com.ceying.chx.cpi.base.util.response.RespJson;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Map;

/**
 * 功能说明:登录Controller层 <br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl <br>
 * 开发时间: 2017/11/9 18:42<br>
 * <br>
 */
@Configuration
@RestController
@RequestMapping("/cpi/base/login")
public class LoginController {

    @Resource
    private LoginService loginServiceImpl;

    /**
     *
     * 这里使用ModelAttribute来指定某一块对象参数为某一个对象
     * @param request
//     * @param loginEntity
//     * @param errors
     * @return
     * @throws ParamException
     */
//    @Secured({"ROLE_ADMIN","ROLE_USER"})//此方法只允许 ROLE_ADMIN 和ROLE_USER 角色 访问 LoginEntity loginEntity  ProxyVo<LoginEntity> proxyVo, @ModelAttribute("jsonObject")
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public RespJson login(HttpServletRequest request,  @Valid @RequestBody LoginVO loginVO, BindingResult aErrors) throws ParamException { //@AuthenticationPrincipal
        if (aErrors.hasErrors()) {
            System.out.println("输入信息错误");
        }
//        if(bErrors.hasErrors()){
//            System.out.println("输入信息错误");
//        }
//        String json = JSON.toJSONString(loginEntity, SerializerFeature.WriteMapNullValue);
        RespJson respJson = loginServiceImpl.login(loginVO);
//        RespJson respJson = null;
        return respJson;
    }
}
