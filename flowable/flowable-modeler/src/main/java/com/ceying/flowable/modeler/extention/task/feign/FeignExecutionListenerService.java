package com.ceying.flowable.modeler.extention.task.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: cyp
 * Date: 2018-03-12
 * Time: 15:51
 */
@FeignClient("scyp-biz")
public interface FeignExecutionListenerService {
    @RequestMapping(value="/workflow/execution/listener/after.do",method = RequestMethod.POST)
     Map executionListenerAfter(@RequestBody Map<String, Object> variables);
}
