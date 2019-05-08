package com.ceying.flowable.modeler.extention.task.feign;

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
 * Date: 2018-03-12
 * Time: 11:09
 */
@FeignClient("scyp-system")
public interface FeignQueryUserService {

    /**
     * 获取组织名称
     * @return
     */
    @RequestMapping(value = "/organization/getOrgNameMapCache",method = RequestMethod.POST)
    Map<String,String> getOrgNameMapCache();

    @RequestMapping(value="/workflow/query/users",method = RequestMethod.POST)
     List<String> getUserByOrgAndRole(@RequestParam("orgId") String orgId, @RequestParam("roleId") String roleId);

    /**
     * 获取支持该应付账款的银行经办用户
     * @param companyId
     * @param supplierId
     * @param bussinessType
     * @param roleId
     * @return
     */
    @RequestMapping(value = "/workflow/query/bankUsers",method = RequestMethod.POST)
    List<String> getBankUsersByPayableParams(@RequestParam("companyId") String companyId,@RequestParam("supplierId") String supplierId,
                                  @RequestParam("bussinessType") String bussinessType,@RequestParam("roleId") String roleId);


    /**
     * 根据对方组织和类型获取己方组织code
     * @param oppOrgid
     * @param category
     * @return
     */
    @RequestMapping(value = "/orgrelation/getOurorgCode", method = RequestMethod.GET)
     List<String> getOurorgCode(@RequestParam("oppOrgid") String oppOrgid, @RequestParam("category") String category);
}
