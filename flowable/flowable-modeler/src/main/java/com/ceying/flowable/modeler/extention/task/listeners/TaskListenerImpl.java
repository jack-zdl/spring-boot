package com.ceying.flowable.modeler.extention.task.listeners;

import com.ceying.flowable.modeler.extention.task.feign.FeignTaskListenerService;
import com.ceying.flowable.modeler.app.modeler.security.SecurityUtils;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.bpmn.model.FlowElement;
import org.flowable.bpmn.model.Process;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.common.api.delegate.Expression;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: cyp
 * Date: 2018-01-18
 * Time: 11:06
 */
@Component("taskListener")
public class TaskListenerImpl implements TaskListener {

    private Expression fieldName;

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private RepositoryService repositoryService;

    @Autowired
    private FeignTaskListenerService feignTaskListenerService;

    public void notify(DelegateTask delegateTask) {
        Object beanName = fieldName.getValue(delegateTask);
        if(beanName == null){
            return;
        }
        Map<String,Object> variables = runtimeService.getVariables(delegateTask.getExecutionId());
        variables.put("eventName",delegateTask.getEventName());
        variables.put("currUserId", SecurityUtils.getCurrentUserId());
        variables.put("userId", SecurityUtils.getCurrentUserId());
        variables.put("orgId",SecurityUtils.getSysUserLoginDto().getOrgId());
        //String nodeName = getNodeName(delegateTask.getProcessDefinitionId(),delegateTask.getTaskDefinitionKey());
        variables.put("nodeName", delegateTask.getName());
        feignTaskListenerService.taskListenerAfter(beanName.toString(),variables);
    }

    private String getNodeName(String processDefinitionId,String taskDefinitionKey){
        BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinitionId);
        List<Process> processList = bpmnModel.getProcesses();
        for(Process process : processList){
            Collection<FlowElement> flowElements = process.getFlowElements();
            for(FlowElement flowElement : flowElements){
                if(flowElement.getId().equals(taskDefinitionKey)){
                    return flowElement.getName();
                }
            }
        }
        return null;
    }

    public Expression getFieldName() {
        return fieldName;
    }

    public void setFieldName(Expression fieldName) {
        this.fieldName = fieldName;
    }
}
