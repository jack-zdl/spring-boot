package com.ceying.transaction.util;

import com.alibaba.fastjson.JSONObject;
import com.ceying.transaction.treeData.TreeLink;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/5/8<br>
 * <br>
 */
@Component
public class RestTemplateClient {

    private static final Logger log = LoggerFactory.getLogger(RestTemplateClient.class);
    @Autowired
    RestTemplate restTemplate;

    public void rollBack(TreeLink data){
        JSONObject result=new JSONObject();
        String httpMethod= data.getMethod();
        StringBuilder url=new StringBuilder("http://");
        url.append(data.getServiceName());
        url.append(data.getRollbackUrl());
        if(data.getQueries()!=null){
            Map<String, Collection<String>> map=data.getQueries();
            url.append("?");
            for(String key:map.keySet()){
                ArrayList<String> list= (ArrayList<String>) map.get(key);
                url.append(key).append("=").append(list.get(0)).append("&");
            }
        }
        log.debug("rollbackUrl:"+url);
        HttpEntity httpEntity = new HttpEntity(data.getBody(), getHeaders(data));
        if(httpMethod!=null){
            switch (httpMethod){
                case "POST":{
//                    ResponseEntity<Void> response= restTemplate.postForEntity(url, httpEntity,Void.class);
                    ResponseEntity response = restTemplate.postForEntity(url.toString(), httpEntity, Void.class);
                    if (response.getStatusCode().is2xxSuccessful()){
                        break;
                    }else{
                        //TODO
                        log.error("回滚数据失败：status"+response.getStatusCode());
                        log.error("回滚数据失败：body"+response.getBody());
                    }
                }
                case "GET":{

                    ResponseEntity response=restTemplate.exchange(url.toString(),HttpMethod.GET, httpEntity, Void.class);

                    if (response.getStatusCode().is2xxSuccessful()){
                        result= (JSONObject) response.getBody();
                        break;
                    }else{
                        //TODO
                        log.error("回滚数据失败：status"+response.getStatusCode());
                        log.error("回滚数据失败：body"+response.getBody());
                    }
                }
            }
        }
    }
    private HttpHeaders getHeaders(TreeLink data){
        HttpHeaders headers = new HttpHeaders();
        if(data.getHeaders()!=null){
            Map<String, Collection<String>> map=data.getHeaders();
            for(String key:map.keySet()){
                ArrayList<String> list= (ArrayList<String>) map.get(key);
                headers.put(key,list);
            }
        }
        return  headers;
    }
}
