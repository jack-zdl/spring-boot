package com.ceying.chx.cpi.base.rm.org.controller;

import com.ceying.chx.cpi.base.exception.ParamException;
import com.ceying.chx.cpi.base.exception.RedisConnectException;
import com.ceying.chx.cpi.base.rm.org.dao.OrgDao;
import com.ceying.chx.cpi.base.rm.org.service.OrgService;
import com.ceying.chx.cpi.base.rm.org.service.impl.OrgServiceImpl;
import com.ceying.chx.cpi.base.util.response.RespJson;
import com.ceying.chx.cpi.base.util.response.RespJsonFactory;
//import com.ceying.chx.cpi.base.vo.agreement.TripartiteAgreementVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
//import org.springframework.security.access.annotation.Secured;
//import org.springframework.security.access.annotation.Secured;
//import org.springframework.security.access.prepost.PreAuthorize;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * 功能说明: 组织相关的controller，不仅仅局限于组织类，组织关系等相关的操作<br>
 * 系统版本: 1.0 <br>
 * 开发人员: zhangdl
 * 开发时间: 2017/11/9 10:59<br>
 * <br>
 */
@Configuration
@RequestMapping("/cpi/base/org")
@RestController
public class OrgController {

    @Resource
    private OrgService orgServiceImpl;


//    @Secured({"admin"})//此方法只允许 ROLE_ADMIN 和ROLE_USER 角色 访问
    @ApiOperation(value = "组织的API接口")
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
//    @PreAuthorize("hasAnyRole('admin')")
//    @PreAuthorize("hasPermission('order','date_read')")
    public RespJson selectListOrg(HttpServletRequest request) throws ParamException, RedisConnectException {
        RespJson respJson = orgServiceImpl.list();
        return respJson;
    }

    @ApiOperation(value = "组织的API接口")
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET)
    public RespJson selectOrg(HttpServletRequest request){
        RespJson respJson = orgServiceImpl.get();
        return respJson;
    }

    @ApiOperation(value="swagger的标题")
//    @ApiImplicitParam(name = "TripartiteAgreementVo", value = "三方协议VO类", required = true)
    @ResponseBody
    @RequestMapping(method = RequestMethod.POST)
    public RespJson insertOrg(HttpServletRequest request ) throws ParamException {  //@Valid @RequestBody TripartiteAgreementVo tripartiteAgreementVo, Errors errors
//        if (errors.hasErrors()) {
//            throw new ParamException();
//        }
        RespJson respJson = RespJsonFactory.buildSuccess();
        return respJson;
    }


}
