package com.ceying.flowable.modeler.extention.task.feign;

import com.alibaba.fastjson.JSONObject;
import com.ceying.common.entity.UserEntity;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: cyp
 * Date: 2018-03-27
 * Time: 9:49
 */
@FeignClient("scyp-system")
public interface FeignRemoteIdmService {

    @RequestMapping(value = "/workflow/getAllUser", method = RequestMethod.POST)
    public List<Map<String,String>> getAllUser();

    @RequestMapping(value = "/workflow/getAllRoler", method = RequestMethod.POST)
    public List<Map<String,String>> getAllRole();

    @RequestMapping(value = "/workflow/getAllRolerUser", method = RequestMethod.POST)
    public Map<String,List<Map<String,String>>> getAllRoleUser();

    /**
     * @Description: 获取单个组织信息,部分字段翻译成中文，不推荐使用
     * @Param: [orgId]
     * @return: com.alibaba.fastjson.JSONObject
     * @Author: zhangdl
     * @Date: 2018/4/4
     */
    @RequestMapping(value = "/organization/get", method = RequestMethod.POST)
    JSONObject get(@RequestParam(value = "orgId") String orgId);

    /**
     * 查询单个组织信息，字段未翻译
     * @return
     */
    @RequestMapping(value = "/organization/getByOrgId", method = RequestMethod.GET)
     JSONObject getByOrgId(@RequestParam(value = "orgId")String orgId);

    /**
     * 根据urid 获取用户
     * @return
     */
    @RequestMapping(value = "/sysuser/getUserById",method = RequestMethod.POST)
    UserEntity getUserById(@RequestParam("userId") String userId);
}
