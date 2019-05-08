package com.ceying.flowable.modeler.extention.task.service;

import com.ceying.common.workflow.vo.FlowableTasksVo;
import com.ceying.flowable.modeler.app.task.model.runtime.TaskRepresentation;
import com.ceying.flowable.modeler.extention.task.query.TaskInfoQuery;
import org.flowable.task.service.impl.persistence.entity.TaskEntityImpl;

import java.util.List;
import java.util.Map;

/**
 * @author: fej
 * @date: 2018/4/16
 * @description :
 * @version: 2.0
 */
public interface FlowableStatisticsService {

    List<Map<String,Object>> listStatistics(String userId, List<String> groupIds, String groupByKeyName, String processDefinitionKey);

    List<Map<String,Object>> listStatisticsBySubProcess(String userId, List<String> groupIds, String groupByKeyName, String processDefinitionKey);

    /**
     * 再根据操作标识添加数据
     * @param userId
     * @param groupIds
     * @param groupByKeyName
     * @param processDefinitionKey
     * @param lastOperationFlag
     * @return
     */
    List<Map<String,Object>> listStatisticsByOperationFlag(String userId, List<String> groupIds, String groupByKeyName, String processDefinitionKey,String operationKey,String lastOperationFlag);

    List<Map<String,Object>> listStatisticsByOperationFlagAndSubProcess(String userId, List<String> groupIds, String groupByKeyName, String processDefinitionKey,String operationKey,String lastOperationFlag);

    Map<String,TaskInfoQuery>  listStatisticsDetail(FlowableTasksVo flowableTasksVo);

    Map<String,TaskInfoQuery> selectTaskByOperationFlag(FlowableTasksVo flowableTasksVo);

    String getBusinessKey(String taskId);

    String getProcessInstanceIdByBusinessKey(String businessKey);
}
