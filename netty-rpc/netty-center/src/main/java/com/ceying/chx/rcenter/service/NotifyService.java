package com.ceying.chx.rcenter.service;

import com.ceying.chx.rcenter.bean.NotifyTaskBean;

import java.util.List;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/5<br>
 * <br>
 */
public interface NotifyService {
    /**
     * 添加任务
     * @param regist
     * @param address
     * @param name
     */
    public void add(String regist,String address,String name);

    /**
     * 添加任务
     * @param list
     */
    public void addAll(List<NotifyTaskBean> list);
    /**
     *
     * @param regist
     * @param address
     * @param name
     * @param times
     */
    public void add(String regist,String address,String name,int times);

    /**
     *
     * @param bean
     */
    public void add(NotifyTaskBean bean);
    public Long size();

    /**
     * 获取第一个任务
     * @return
     */
    public NotifyTaskBean poll();

    /**
     * 获取所有待通知任务
     * @return
     */
    public List getList();

    /**
     * 主动发送 cache中数据，同时对cache进行更新
     * @param id
     */
    public void sendWithCache(String id);

    /**
     * 移除待通知任务
     * @param id
     */
    public void remove(String id);

    /**
     * 发送数据
     * @param bean
     * @return
     */
    public boolean send(NotifyTaskBean bean);

    /**
     * 注册中心过来注册 ,
     * 1通知其他注册中心
     * 2同步数据回去
     * @param address
     * @param name
     * @param map
     */
    public void notifyAndSend(String address,String name,Map<Object,Object> map);

    /**
     * 通知注册中心
     * @param address
     * @param name
     */
    public void notifyReCenter(String address,String name);
}
