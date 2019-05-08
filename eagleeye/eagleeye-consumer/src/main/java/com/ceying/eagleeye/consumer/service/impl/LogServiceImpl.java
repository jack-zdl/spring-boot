package com.ceying.eagleeye.consumer.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ceying.common.entity.UserLoginEntity;
import com.ceying.common.util.user.GetUserUtil;
import com.ceying.eagleeye.common.config.MyLogConfig;
import com.ceying.eagleeye.common.service.MylogService;
import com.ceying.eagleeye.consumer.feign.SystemFeignClient;
import com.ceying.eagleeye.consumer.kafka.LogMsgConsumer;
import com.ceying.eagleeye.consumer.service.LogService;
import com.ceying.eagleeye.consumer.vo.AllUserVO;
import com.ceying.eagleeye.consumer.vo.MyLogVo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/3/20<br>
 * <br>
 */
@Service
public class LogServiceImpl implements LogService {
    private static final Logger log = LoggerFactory.getLogger(LogMsgConsumer.class);
    @Autowired
    private MyLogConfig myLogConfig;
    @Autowired
    private MylogService mylogService;
    @Autowired
    private SystemFeignClient systemFeignClient;

    public JSONObject getLogPage(MyLogVo vo){
        String user=vo.getUserId();
        if(StringUtils.isBlank(user)){
            UserLoginEntity userLoginEntity=GetUserUtil.getLoginUser();
            if(userLoginEntity!=null){
                user= userLoginEntity.getUserId();
            }
        }
        int rows=vo.getRows();
        int page=vo.getPage();
        String date=vo.getDate();
        if(StringUtils.isBlank(date)){
            date= LocalDate.now().toString();
        }
        JSONObject json=new JSONObject();
        try {
            String path=myLogConfig.getFilePath();
            String fileName=myLogConfig.getFileName();
            path=path.replaceAll("\\{yyyy-MM-dd\\}",date);
            path=path.replaceAll("\\{user\\}",user);
            fileName=fileName.replaceAll("\\{yyyy-MM-dd\\}",date);
            fileName=fileName.replaceAll("\\{user\\}",user);
//            String file=path+ File.separator+fileName;
            json=mylogService.readFile(path,fileName,rows,page);
        } catch (Exception e) {
            log.debug("文件读写错误",e);
        }
        return json;
    }


    public JSONObject allUser(AllUserVO vo) {
        int page=vo.getPage();
        int rows=vo.getRows();
        List<Map<String,String>> list=systemFeignClient.getAllUser();
        for (Map<String,String> map:list){
            map.put("id-name",map.get("userId")+map.get("userName"));
        }
        JSONObject jsonObject=new JSONObject();
        int allTotal=list.size();
        int totalpage= (int) Math.ceil(allTotal/(double)rows);
        int startRows=(page-1)*rows>allTotal?allTotal:(page-1)*rows;
        int endRows=(page)*rows>allTotal?allTotal:(page)*rows;
        List<Map<String,String>> result=list.subList(startRows,endRows);
        jsonObject.put("page",page);
        jsonObject.put("rows",result);
        jsonObject.put("total",result.size());
        jsonObject.put("totalpage",totalpage);
        return jsonObject;
    }

}
