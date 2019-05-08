package com.ceying.flowable.modeler.extention.task.controller;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.repository.ProcessDefinition;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: fej
 * @date: 2018/6/5
 * @description :
 * @version: 2.0
 */
@RestController
@RequestMapping("/workflow")
public class CheckProcessDefinitionController {

    @Autowired
    private RepositoryService repositoryService;

    @RequestMapping(value = "/check/process-definition.do", method = {RequestMethod.GET,RequestMethod.POST})
    public boolean checkProcessDefinition(@RequestParam("processDefinitionKey") String processDefinitionKey){
        ProcessDefinition list = repositoryService.createProcessDefinitionQuery().processDefinitionKey(processDefinitionKey).latestVersion().singleResult();
        return list == null?false:true;
    }
}
