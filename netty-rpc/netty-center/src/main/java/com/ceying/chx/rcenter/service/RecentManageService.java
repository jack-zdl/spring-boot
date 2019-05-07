package com.ceying.chx.rcenter.service;


import com.ceying.chx.rcenter.bean.NotifyTaskBean;
import com.ceying.chx.rcenter.bean.Url;

import java.util.List;

/**
 * 功能说明: 注册中心管理serivce <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/2/2<br>
 * <br>
 */
public interface RecentManageService {
    List<Url> getAllServerList();
    List<NotifyTaskBean> getNotifyList();
    List<NotifyTaskBean> getNotifyTimeList(List<NotifyTaskBean>list);

}
