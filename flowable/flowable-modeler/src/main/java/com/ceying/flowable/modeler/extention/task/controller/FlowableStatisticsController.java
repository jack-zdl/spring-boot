package com.ceying.flowable.modeler.extention.task.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.ceying.common.workflow.vo.FlowableTasksVo;
import com.ceying.flowable.modeler.app.modeler.model.common.RemoteGroup;
import com.ceying.flowable.modeler.app.modeler.model.common.RemoteUser;
import com.ceying.flowable.modeler.app.modeler.security.SecurityUtils;
import com.ceying.flowable.modeler.app.modeler.service.exception.NotFoundException;
import com.ceying.flowable.modeler.extention.task.feign.FeignQueryUserService;
import com.ceying.flowable.modeler.extention.task.query.TaskInfoQuery;
import com.ceying.flowable.modeler.extention.task.service.FlowableStatisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: fej
 * @date: 2018/4/16
 * @description :
 * @version: 2.0
 */
@RestController
@RequestMapping("/workflow")
public class FlowableStatisticsController {

    @Autowired
    private FlowableStatisticsService flowableStatisticsService;
    @Autowired
    private FeignQueryUserService feignQueryUserService;

    /**
     *
     * @param userId
     * @param keyName
     * @param processDefinitionKey
     * @return List<Map<String,Object>>
     *     Map key 包括
     *          total 记录数
     *          name
     */
    @RequestMapping("/list/statistics.do")
    public JSONObject listStatistics(@RequestParam(value = "userId",required = false) String userId,
                                        @RequestParam("keyName")String keyName,
                                        @RequestParam("processDefinitionKey")String processDefinitionKey){
        if(!StringUtils.hasText(userId)){
            userId = SecurityUtils.getCurrentUserId();
        }
        RemoteUser remoteUser = SecurityUtils.getRemoteUser(userId);
        if(remoteUser == null){
            throw new NotFoundException("current user is not found");
        }
        List<String> groupIds = new ArrayList<>();
        for(RemoteGroup remoteGroup : remoteUser.getGroups()){
            groupIds.add(remoteGroup.getId());
        }
        List<Map<String,Object>> list = flowableStatisticsService.listStatistics(userId,groupIds,keyName,processDefinitionKey);
        Map orgmap = feignQueryUserService.getOrgNameMapCache();
        for (int i=0;i<list.size();i++){
            String orgid = list.get(i).get("name").toString();
            list.get(i).put("orgid",orgid);
            list.get(i).put("orgname",orgmap.get(orgid));
        }
        JSONArray jsonArray = (JSONArray)JSONObject.toJSON(list);
        JSONObject json =  new JSONObject();
        json.put("rows",jsonArray);
        return json;
    }

    @RequestMapping("/list/link/process/statistics.do")
    public JSONObject listStatisticsBySubProcess(@RequestParam(value = "userId",required = false) String userId,
                                     @RequestParam("keyName")String keyName,
                                     @RequestParam("processDefinitionKey")String processDefinitionKey){
        if(!StringUtils.hasText(userId)){
            userId = SecurityUtils.getCurrentUserId();
        }
        RemoteUser remoteUser = SecurityUtils.getRemoteUser(userId);
        if(remoteUser == null){
            throw new NotFoundException("current user is not found");
        }
        List<String> groupIds = new ArrayList<>();
        for(RemoteGroup remoteGroup : remoteUser.getGroups()){
            groupIds.add(remoteGroup.getId());
        }
        List<Map<String,Object>> list = flowableStatisticsService.listStatisticsBySubProcess(userId,groupIds,keyName,processDefinitionKey);
        Map orgmap = feignQueryUserService.getOrgNameMapCache();
        for (int i=0;i<list.size();i++){
            String orgid = list.get(i).get("name").toString();
            list.get(i).put("orgid",orgid);
            list.get(i).put("orgname",orgmap.get(orgid));
        }
        JSONArray jsonArray = (JSONArray)JSONObject.toJSON(list);
        JSONObject json =  new JSONObject();
        json.put("rows",jsonArray);
        return json;
    }

    @RequestMapping("/list/statistics/by/operation-flag.do")
    public JSONObject listStatisticsByOperationFlag(@RequestParam(value = "userId",required = false) String userId,
                                                        @RequestParam("keyName")String keyName,
                                                        @RequestParam("processDefinitionKey")String processDefinitionKey,
                                                        @RequestParam("operationKey")String operationKey,
                                                        @RequestParam("operationFlag")String operationFlag){
        if(!StringUtils.hasText(userId)){
            userId = SecurityUtils.getCurrentUserId();
        }
        RemoteUser remoteUser = SecurityUtils.getRemoteUser(userId);
        if(remoteUser == null){
            throw new NotFoundException("current user is not found");
        }
        List<String> groupIds = new ArrayList<>();
        for(RemoteGroup remoteGroup : remoteUser.getGroups()){
            groupIds.add(remoteGroup.getId());
        }
        List<Map<String,Object>> list = flowableStatisticsService.listStatisticsByOperationFlag(userId,groupIds,keyName,processDefinitionKey,operationKey,operationFlag);
        Map orgmap = feignQueryUserService.getOrgNameMapCache();
        for (int i=0;i<list.size();i++){
            String orgid = list.get(i).get("name").toString();
            list.get(i).put("orgid",orgid);
            list.get(i).put("orgname",orgmap.get(orgid));
        }
        JSONArray jsonArray = (JSONArray)JSONObject.toJSON(list);
        JSONObject json =  new JSONObject();
        json.put("rows",jsonArray);
        return json;
    }

    @RequestMapping("/list/link/process/statistics/by/operation-flag.do")
    public JSONObject listStatisticsByOperationFlagAndSubProcess(@RequestParam(value = "userId",required = false) String userId,
                                                    @RequestParam("keyName")String keyName,
                                                    @RequestParam("processDefinitionKey")String processDefinitionKey,
                                                    @RequestParam("operationKey")String operationKey,
                                                    @RequestParam("operationFlag")String operationFlag){
        if(!StringUtils.hasText(userId)){
            userId = SecurityUtils.getCurrentUserId();
        }
        RemoteUser remoteUser = SecurityUtils.getRemoteUser(userId);
        if(remoteUser == null){
            throw new NotFoundException("current user is not found");
        }
        List<String> groupIds = new ArrayList<>();
        for(RemoteGroup remoteGroup : remoteUser.getGroups()){
            groupIds.add(remoteGroup.getId());
        }
        List<Map<String,Object>> list = flowableStatisticsService.listStatisticsByOperationFlagAndSubProcess(userId,groupIds,keyName,processDefinitionKey,operationKey,operationFlag);
        Map orgmap = feignQueryUserService.getOrgNameMapCache();
        for (int i=0;i<list.size();i++){
            String orgid = list.get(i).get("name").toString();
            list.get(i).put("orgid",orgid);
            list.get(i).put("orgname",orgmap.get(orgid));
        }
        JSONArray jsonArray = (JSONArray)JSONObject.toJSON(list);
        JSONObject json =  new JSONObject();
        json.put("rows",jsonArray);
        return json;
    }

    @RequestMapping(value = "/statistics/detail.do",method = {RequestMethod.GET,RequestMethod.POST})
    public Map<String,TaskInfoQuery> statisticsDetail(@RequestBody FlowableTasksVo flowableTasksVo){
        return flowableStatisticsService.listStatisticsDetail(flowableTasksVo);
    }

    @RequestMapping(value = "/select/task/by/operation-flag.do",method = {RequestMethod.GET,RequestMethod.POST})
    public Map<String,TaskInfoQuery> selectTaskByOperationFlag(FlowableTasksVo flowableTasksVo){
        return flowableStatisticsService.selectTaskByOperationFlag(flowableTasksVo);
    }

    @RequestMapping(value = "/get/process-instance/by/business-key.do",method = RequestMethod.GET)
    public String getProcessInstanceIdByBusinessKey(@RequestParam("businessKey") String businessKey){
        return flowableStatisticsService.getProcessInstanceIdByBusinessKey(businessKey);
    }
}
