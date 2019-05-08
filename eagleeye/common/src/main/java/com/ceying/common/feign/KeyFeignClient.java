package com.ceying.common.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

/**
 * @author: mzq
 * @date: 2018/7/11
 * @description :
 * @version: 2.0
 */
@FeignClient(name = "scyp-key")
public interface KeyFeignClient {
    @RequestMapping(value = "/common/queryForWarning",method = RequestMethod.POST)
    List<Map<String, Object>> queryForWarning(@RequestParam("sql") String sql);
}
