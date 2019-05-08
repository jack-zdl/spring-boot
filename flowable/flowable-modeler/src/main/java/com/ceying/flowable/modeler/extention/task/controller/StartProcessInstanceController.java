package com.ceying.flowable.modeler.extention.task.controller;

import com.ceying.flowable.modeler.app.task.model.runtime.ProcessInstanceRepresentation;
import com.ceying.flowable.modeler.app.task.service.runtime.FlowableProcessInstanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: cyp
 * Date: 2018-03-08
 * Time: 15:48
 */
@Controller
@RequestMapping("/workflow")
public class StartProcessInstanceController {

    @Autowired
    private FlowableProcessInstanceService flowableProcessInstanceService;

    @ResponseBody
    @RequestMapping("/start/processInstance/byKey.do")
    public Map startProcessInstanceByKey(@RequestParam("processDefinitionKey") String processDefinitionKey,@RequestParam("businessKey") String businessKey,
                                         @RequestBody(required = false) Map map){
        ProcessInstanceRepresentation processInstanceRepresentation = flowableProcessInstanceService.startNewProcessInstanceByKey(processDefinitionKey,businessKey,map);
        Map<String,Object> retMap = new HashMap<>();
        retMap.put("processInstanceId",processInstanceRepresentation.getId());
        return retMap;
    }

    @ResponseBody
    @RequestMapping("/start/processInstance/byId.do")
    public Map startProcessInstanceById(@RequestParam("processDefinitionId") String processDefinitionId,
                                        @RequestBody(required = false) Map map){
        ProcessInstanceRepresentation processInstanceRepresentation = flowableProcessInstanceService.startNewProcessInstanceById(processDefinitionId,map);
        Map<String,Object> retMap = new HashMap<>();
        retMap.put("processInstanceId",processInstanceRepresentation.getId());
        return retMap;
    }
}
