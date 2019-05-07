package com.ceying.chx.rcenter.service.impl;

import com.ceying.chx.rcenter.bean.NotifyTaskBean;
import com.ceying.chx.rcenter.bean.Url;
import com.ceying.chx.rcenter.enums.RedisKeyEnums;
import com.ceying.chx.rcenter.service.NotifyService;
import com.ceying.chx.rcenter.service.RecentManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/5<br>
 * <br>
 */
@Service
public class RecentManagerServiceImpl implements RecentManageService {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private NotifyService reNotifyTaskService;
    @Override
    public List<Url> getAllServerList() {
        Map<Object, Object> map=stringRedisTemplate.opsForHash().entries(RedisKeyEnums.SERVICEMAPKEY.getValue());
        List<Url> resultList=new ArrayList<>();
        for(Object obj:map.keySet()){
            resultList.add(new Url(obj.toString(),map.get(obj).toString()));
        }
        return resultList;
    }

    @Override
    public List<NotifyTaskBean> getNotifyList() {
        List<NotifyTaskBean> resultList= reNotifyTaskService.getList();
        return resultList;
    }

    @Override
    public List<NotifyTaskBean> getNotifyTimeList(List<NotifyTaskBean> list) {
        for(NotifyTaskBean bean:list){

        }
        return null;
    }
}
