package com.ceying.common.system.commonquery;

import com.ceying.common.feign.AddFeignClient;
import com.ceying.common.feign.BizFeignClient;
import com.ceying.common.feign.KeyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * @author: mzq
 * @date: 2018/7/11
 * @description :
 * @version: 2.0
 */
@Component
public class CommonQuery {
    @Autowired
    private BizFeignClient bizFeignClient;
    @Autowired
    private AddFeignClient addFeignClient;
    @Autowired
    private KeyFeignClient keyFeignClient;

    public List<Map<String, Object>> QueryBiz(String sql){
        List<Map<String, Object>> list = bizFeignClient.queryForWarning(sql);
        return list;
    }
    public List<Map<String, Object>> QueryKey(String sql){
        List<Map<String, Object>> list = keyFeignClient.queryForWarning(sql);
        return list;
    }
    public List<Map<String, Object>> QueryAdd(String sql){
        List<Map<String, Object>> list = addFeignClient.queryForWarning(sql);
        return list;
    }
}
