package com.ceying.flowable.modeler.extention.task.listeners;

import com.ceying.flowable.modeler.extention.task.feign.FeignExecutionListenerService;
import org.flowable.bpmn.model.*;
import org.flowable.engine.HistoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.common.api.delegate.Expression;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.ExecutionListener;
import org.flowable.task.api.history.HistoricTaskInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: cyp
 * Date: 2018-01-17
 * Time: 17:22
 */
@Component("jobExecutionListener")
public class JobExecutionListenerImpl implements ExecutionListener {

    private Expression fieldName;

    @Autowired
    private FeignExecutionListenerService feignExecutionListenerService;

    @Autowired
    private HistoryService historyService;

    @Override
    public void notify(DelegateExecution execution) {
        Object beanName = fieldName.getValue(execution);
        if(beanName == null){
            return;
        }
        Map<String,Object> variables = execution.getVariables();
        //添加执行ID，后置事件可进行动态添加流程变量
        variables.put("executionId",execution.getParentId());
        variables.put("eventName",execution.getEventName());
        FlowElement flowElement = execution.getCurrentFlowElement();
        variables.put("urid",execution.getProcessInstanceBusinessKey());

        Map<String,Object> timeInfoMap = this.getTimeInfo(((SequenceFlow)execution.getCurrentFlowElement()).getSourceFlowElement(),execution.getProcessInstanceId(),execution.getId());
        variables.putAll(timeInfoMap);

        if(flowElement instanceof SequenceFlow){
            variables.put("nodeName",((SequenceFlow)flowElement).getSourceFlowElement().getName());
            variables.put("condition",((SequenceFlow)flowElement).getConditionExpression());
        }
        //扩展使用字段，每一次使用都会默认覆盖前一次保存的值
        Object extendVariable = variables.get("extendVariable");
        if(extendVariable != null && extendVariable instanceof Map){
            variables.putAll((Map<String, Object>) extendVariable);
        }
        Map<String,Object> requestData = new HashMap<>();
        requestData.put("beanName", beanName.toString());
        requestData.put("variables",variables);
        Map<String,Object> result = feignExecutionListenerService.executionListenerAfter(requestData);
        if(result != null){
            for(String name : result.keySet()){
                execution.setVariable(name, result.get(name));
            }
        }
    }

    public Expression getFieldName() {
        return fieldName;
    }

    public void setFieldName(Expression fieldName) {
        this.fieldName = fieldName;
    }

    /**
     * 获取前一节点一些属性信息
     * @param flowElement
     * @param processInstanceId
     * @param executionId
     * @return
     */
    private Map<String,Object> getTimeInfo(FlowElement flowElement,String processInstanceId, String executionId){
        Map<String,Object> map = new HashMap();
        String taskDefinitionKey = flowElement.getId();
        List<HistoricTaskInstance> list = historyService.createHistoricTaskInstanceQuery().processInstanceId(processInstanceId).executionId(executionId).taskDefinitionKey(taskDefinitionKey).list();
        if(list != null && list.size() > 0){
            Date startTime = this.getMinDate(list);
            map.put("startTime",startTime==null?null:new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(startTime));
        }
        if(flowElement instanceof UserTask){
            List<BoundaryEvent> events = ((UserTask) flowElement).getBoundaryEvents();
            if(events != null && events.size() > 0) {
                for (BoundaryEvent boundaryEvent : events) {
                    List<EventDefinition> eventDefinitions = boundaryEvent.getEventDefinitions();
                    if(eventDefinitions != null && eventDefinitions.size() > 0) {
                        for (EventDefinition eventDefinition : eventDefinitions) {
                            if (eventDefinition instanceof TimerEventDefinition) {
                                String timeDuration = ((TimerEventDefinition) eventDefinition).getTimeDuration();
                                map.put("timeDuration", timeDuration);
                                break;
                            }
                        }
                    }
                }
            }
        }
        return map;
    }

    private Date getMinDate(List<HistoricTaskInstance> list){
        HistoricTaskInstance historicTaskInstance = null;
        if(list != null && list.size() > 0){
            historicTaskInstance = Collections.min(list, new Comparator<HistoricTaskInstance>() {
                @Override
                public int compare(HistoricTaskInstance o1, HistoricTaskInstance o2) {
                    return o1.getStartTime().compareTo(o2.getStartTime());
                }
            });
        }
        return historicTaskInstance.getStartTime();
    }
}
