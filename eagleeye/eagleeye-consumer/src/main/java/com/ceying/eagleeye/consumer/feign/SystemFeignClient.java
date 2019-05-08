package com.ceying.eagleeye.consumer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/4/11<br>
 * <br>
 */
@FeignClient("scyp-system")
public interface SystemFeignClient {
    @RequestMapping(value = "/workflow/getAllUser", method = RequestMethod.POST)
    public List<Map<String,String>> getAllUser();
}
