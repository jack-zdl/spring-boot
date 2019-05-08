package com.ceying.eagleeye.consumer.service;

import com.alibaba.fastjson.JSONObject;
import com.ceying.eagleeye.consumer.vo.AllUserVO;
import com.ceying.eagleeye.consumer.vo.MyLogVo;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/4/12<br>
 * <br>
 */
public interface LogService {
    JSONObject getLogPage(MyLogVo vo);
    JSONObject allUser(AllUserVO vo);
}
