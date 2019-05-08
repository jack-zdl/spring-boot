package com.ceying.flowable.modeler.extention.task.service.impl;

import com.ceying.flowable.modeler.extention.task.feign.FeignQueryUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: cyp
 * Date: 2018-03-12
 * Time: 11:09
 */
@Service("UserQueryService")
public class QueryUserServiceImpl {

    @Autowired
    private FeignQueryUserService feignQueryUserService;
    @Autowired
    private RestTemplate restTemplate;

    public List<String> getUserByOrgAndRole(String orgId, String roleId){
        return feignQueryUserService.getUserByOrgAndRole(orgId, roleId);
    }

    public String getOneUserByOrgAndRole(String orgId, String roleId){
        return this.getUserByOrgAndRole(orgId,roleId).get(0);
    }

    public List<String> getBankUsersByPayableParams(String priorityQuoteStatus,String companyId,String supplierId,String bussinessType,String roleId){

        Map<String,Object> requestData = new HashMap<>();
        requestData.put("priorityQuoteStatus", priorityQuoteStatus);
        requestData.put("companyId", companyId);
        requestData.put("supplierId",supplierId);
        requestData.put("bussinessType", bussinessType);
        requestData.put("roleId",roleId);
        HttpEntity<Map<String,Object>> httpEntity1 = new HttpEntity<Map<String,Object>>(requestData, getHeaders());
        ResponseEntity<List> response = restTemplate.postForEntity("http://scyp-system/workflow/query/bankUsers", httpEntity1, List.class);
        List<String> result = response.getBody();
        return result;
    }

    private HttpHeaders getHeaders(){
        HttpHeaders headers = new HttpHeaders();
        List<String> contentType = new ArrayList<>();
        contentType.add(MediaType.APPLICATION_JSON_UTF8_VALUE);
        headers.put(HttpHeaders.CONTENT_TYPE,contentType);
        return  headers;
    }
}
