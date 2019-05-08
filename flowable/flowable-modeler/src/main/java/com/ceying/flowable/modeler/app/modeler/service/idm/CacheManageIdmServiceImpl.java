package com.ceying.flowable.modeler.app.modeler.service.idm;

import com.ceying.common.constant.CacheKeyConstant;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: cyp
 * Date: 2018-03-26
 * Time: 15:42
 */
@Component
public class CacheManageIdmServiceImpl {

    @Cacheable(value = CacheKeyConstant.ALLUSER)
    public List<Map<String,String>> getAllUser(){
        return null;
    };

    @Cacheable(value = CacheKeyConstant.ALLROLE)
    public List<Map<String,String>> getAllRole(){
        return null;
    };

    @Cacheable(value = CacheKeyConstant.ALLROLEUSER)
    public Map<String,List<Map<String,String>>> getAllRoleUser(){
        return null;
    };

}
