package com.ceying.flowable.modeler.extention.task.dao;

import com.ceying.flowable.modeler.extention.task.query.TaskInfoQuery;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.flowable.task.service.impl.TaskQueryImpl;
import org.flowable.task.service.impl.persistence.entity.TaskEntityImpl;

import java.util.List;
import java.util.Map;

/**
 * @author: fej
 * @date: 2018/4/16
 * @description :
 * @version: 2.0
 */
public interface FlowableStatisticsDao {

    List<Map<String,Object>> listStatistics(@Param("userId") String userId, @Param("groupIds") List<String> groupIds, @Param("groupByKeyName") String groupByKeyName, @Param("processDefinitionKey") String processDefinitionKey);

    List<Map<String,Object>> listStatisticsBySubProcess(@Param("userId") String userId, @Param("groupIds") List<String> groupIds, @Param("groupByKeyName") String groupByKeyName, @Param("processDefinitionKeys") List<String> processDefinitionKeys);

    List<Map<String,Object>> listStatisticsByOperationFlag(@Param("userId") String userId, @Param("groupIds") List<String> groupIds, @Param("groupByKeyName") String groupByKeyName, @Param("processDefinitionKey") String processDefinitionKey,
                                                  @Param("operationKey") String operationKey, @Param("flags") String[] flags);

    List<Map<String,Object>> listStatisticsByOperationFlagAndSubProcess(@Param("userId") String userId, @Param("groupIds") List<String> groupIds, @Param("groupByKeyName") String groupByKeyName, @Param("processDefinitionKeys") List<String> processDefinitionKeys,
                                                           @Param("operationKey") String operationKey, @Param("flags") String[] flags);

    List<? extends TaskInfoQuery> selectTaskByoperationFlag(@Param("userId") String userId,
                                                                @Param("groupIds") List<String> groupIds,
                                                                @Param("keyName") String keyName,
                                                                @Param("keyValue") String keyValue,
                                                                @Param("processDefinitionKey") String processDefinitionKey,
                                                                @Param("operationKey") String operationKey,
                                                                @Param("flags") String[] flags,
                                                                @Param("offset") Integer offset,
                                                                @Param("rows") Integer rows);
}
