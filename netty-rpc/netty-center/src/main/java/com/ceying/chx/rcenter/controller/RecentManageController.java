package com.ceying.chx.rcenter.controller;

import com.alibaba.fastjson.JSON;
import com.ceying.chx.rcenter.bean.NotifyTaskBean;
import com.ceying.chx.rcenter.bean.PageBean;
import com.ceying.chx.rcenter.bean.Url;
import com.ceying.chx.rcenter.enums.RedisKeyEnums;
import com.ceying.chx.rcenter.redis.FastJsonRedisTemplate;
import com.ceying.chx.rcenter.redis.HessianRedisTemplate;
import com.ceying.chx.rcenter.service.HealthServce;
import com.ceying.chx.rcenter.service.NotifyService;
import com.ceying.chx.rcenter.service.impl.RecentManagerServiceImpl;
import com.ceying.chx.rcenter.service.impl.RegistServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 功能说明:注册中心相关的管理 <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/2<br>
 * <br>
 */
@RestController
@RequestMapping("/recent")
public class RecentManageController {
    private Logger LOGGER = LoggerFactory.getLogger(RegistServiceImpl.class);

    @Autowired
    private HealthServce healthServce;
    /*@Autowired
    private StringRedisTemplate stringRedisTemplate;*/
    @Autowired
    private RecentManagerServiceImpl recentManagerService;
    @Autowired
    private NotifyService reNotifyTaskService;
/*    @Autowired
    private FastJsonRedisTemplate fastJsonRedisTemplate;
    @Autowired
    private HessianRedisTemplate hessianRedisTemplate;*/
    @RequestMapping(value="/serviceList")
    public Map<String,Object> serviceList(PageBean pageBean){
        List<Url> resultList=recentManagerService.getAllServerList();
        return  toPage(resultList,pageBean.getPage(),pageBean.getRows());
    }
    @RequestMapping(value="/serviceHealthList")
    public Map<String,Object> serviceHealthList(PageBean pageBean){
        List<Url> resultList=recentManagerService.getAllServerList();
        Map<String,Object> map=toPage(resultList,pageBean.getPage(),pageBean.getRows());
        List<Url> list= (List<Url>) map.get("rows");
        for(Url url:list){
            url.setPingTime(healthServce.getPingTime(url));
        }
        return  toPage(resultList,pageBean.getPage(),pageBean.getRows());
    }
    @RequestMapping(value="/notifyList")
    public Map<String,Object> notifyList(PageBean pageBean){
        List<NotifyTaskBean> resultList=recentManagerService.getNotifyList();
        return  toPage(resultList,pageBean.getPage(),pageBean.getRows());
    }

    /**
     * 手动通知 失败数据
     * @param ids
     * @return
     */
    @RequestMapping(value="/aysNotify")
    public String aysNotify(String ids){
        try {
            String[] idList=ids.split(",");
            for(String id:idList){
                reNotifyTaskService.sendWithCache(id);
            }
        } catch (Exception e) {
            LOGGER.error("手动通知失败",e);
        }
        return "success";
    }

    /**
     * 移除通知失败数据
     * @param ids
     * @return
     */
    @RequestMapping(value="/deletNotify")
    public String deletNotify(String ids){
        try {
            String[] idList=ids.split(",");
            for(String id:idList){
                reNotifyTaskService.remove(id);
            }
        } catch (Exception e) {
            LOGGER.error("手动通知失败",e);
        }
        return "success";
    }
   /* @RequestMapping(value="/get")
    public Object get(){
        PageBean pageBean =JSON.parseObject(stringRedisTemplate.opsForHash().get("asdasda","key1").toString(),PageBean.class);
        pageBean =JSON.parseObject(fastJsonRedisTemplate.opsForHash().get("fast","key1").toString(),PageBean.class);
        pageBean= (PageBean) hessianRedisTemplate.opsForHash().get("hessian","key1");
        Map<Object, Object> map=stringRedisTemplate.opsForHash().entries(RedisKeyEnums.SERVICEMAPKEY.getValue());
        return  pageBean;
    }
*/
    /**
     * 将list 转成grid 的格式
     * @param list
     * @param page
     * @param rows
     * @return
     */
    private Map<String,Object> toPage(List list,int page,int rows){
        int total=list.size();
        int totalpage= (int) Math.ceil(total/page);
        int start=((page-1)>0?(page-1):0)*rows;
        int end=total<(page*rows)?total:(page*rows);
        List<Object>  realList=list.subList(start,end);
        Map<String,Object>map =new HashMap<>();
        map.put("page",page);
        map.put("rows",realList);
        map.put("total",list.size());
        map.put("totalpage",totalpage);
        return map;
    }
    private Map<String,Object> toPage(List<Object>list){
        return toPage(list,1,10);
    }
}
