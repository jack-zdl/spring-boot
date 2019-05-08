package com.ceying.flowable.modeler.extention.task.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.ceying.common.entity.OrganizationEntity;
import com.ceying.common.workflow.vo.FlowableTasksVo;
import com.ceying.flowable.modeler.app.modeler.domain.editor.Model;
import com.ceying.flowable.modeler.app.modeler.model.common.RemoteGroup;
import com.ceying.flowable.modeler.app.modeler.model.common.RemoteUser;
import com.ceying.flowable.modeler.app.modeler.repository.editor.ModelRepository;
import com.ceying.flowable.modeler.app.modeler.security.SecurityUtils;
import com.ceying.flowable.modeler.app.modeler.service.exception.BadRequestException;
import com.ceying.flowable.modeler.app.modeler.service.exception.InternalServerErrorException;
import com.ceying.flowable.modeler.extention.task.dao.FlowableStatisticsDao;
import com.ceying.flowable.modeler.extention.task.feign.FeignQueryUserService;
import com.ceying.flowable.modeler.extention.task.feign.FeignRemoteIdmService;
import com.ceying.flowable.modeler.extention.task.query.TaskInfoQuery;
import com.ceying.flowable.modeler.extention.task.service.FlowableStatisticsService;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.flowable.cmmn.api.CmmnHistoryService;
import org.flowable.cmmn.api.CmmnRepositoryService;
import org.flowable.cmmn.api.CmmnRuntimeService;
import org.flowable.engine.*;
import org.flowable.engine.common.impl.cmd.CustomSqlExecution;
import org.flowable.engine.impl.cmd.AbstractCustomSqlExecution;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.*;

/**
 * @author: fej
 * @date: 2018/4/16
 * @description :
 * @version: 2.0
 */
@Service
public class FlowableStatisticsServiceImpl implements FlowableStatisticsService {

    public static final String RELATIONAL = "relational";

    @Autowired
    protected ManagementService managementService;

    @Autowired
    protected RuntimeService runtimeService;

    @Autowired
    protected TaskService taskService;

    @Autowired
    protected CmmnRuntimeService cmmnRuntimeService;

    @Autowired
    protected HistoryService historyService;

    @Autowired
    protected CmmnHistoryService cmmnHistoryService;

    @Autowired
    protected RepositoryService repositoryService;

    @Autowired
    protected CmmnRepositoryService cmmnRepositoryService;

    @Autowired
    protected ModelRepository modelRepository;

    @Autowired
    protected ObjectMapper objectMapper;

    @Autowired
    protected FeignQueryUserService feignQueryUserService;

    @Autowired
    private FeignRemoteIdmService feignRemoteIdmService;

    @Override
    public List<Map<String, Object>> listStatistics(final String userId, final List<String> groupIds, final String groupByKeyName, final String processDefinitionKey) {
        CustomSqlExecution<FlowableStatisticsDao, List<Map<String, Object>>> customSqlExecution =
                new AbstractCustomSqlExecution<FlowableStatisticsDao, List<Map<String,Object>>>(FlowableStatisticsDao.class) {

                    public List<Map<String, Object>> execute(FlowableStatisticsDao customMapper) {
                        return customMapper.listStatistics(userId,groupIds,groupByKeyName,processDefinitionKey);
                    }

                };
        return managementService.executeCustomSql(customSqlExecution);
    }

    @Override
    public List<Map<String, Object>> listStatisticsBySubProcess(String userId, List<String> groupIds, String groupByKeyName, String processDefinitionKey) {
        if(!StringUtils.hasText(processDefinitionKey)){
            throw new BadRequestException("processDefinitionKey " + processDefinitionKey + " is must needed");
        }
        List<Model> modelList = modelRepository.findByKeyAndType(processDefinitionKey, Model.MODEL_TYPE_BPMN);
        if(modelList == null || modelList.size() == 0){
            throw new InternalServerErrorException("Error reading processDefinition info " + processDefinitionKey);
        }
        Model model = Collections.max(modelList, new Comparator<Model>() {
            @Override
            public int compare(Model o1, Model o2) {
                return o1.getVersion() - o2.getVersion();
            }
        });
        List<String> processDefinitionKeys = new ArrayList<>();
        processDefinitionKeys.add(processDefinitionKey);
        try {
            ObjectNode editorJsonNode = (ObjectNode) objectMapper.readTree(model.getModelEditorJson());
            JsonNode jsonNode = editorJsonNode.get("properties").get("process_author");
            JSONObject jsonObject = feignRemoteIdmService.getByOrgId(feignRemoteIdmService.getUserById(userId).getOrgId());
            OrganizationEntity organizationEntity = JSONObject.toJavaObject(jsonObject, OrganizationEntity.class);
            if(jsonNode!=null&&RELATIONAL.equals(jsonNode.asText())){
                List<String> result = feignQueryUserService.getOurorgCode(organizationEntity.getOrgId(), organizationEntity.getOrgCate());
                for(String s : result){
                    processDefinitionKeys.add(processDefinitionKey + s);
                }
            } else {
                processDefinitionKeys.add(processDefinitionKey + organizationEntity.getOrgCode());
            }
        } catch (Exception e) {
            throw new InternalServerErrorException("Error reading editor json " + model.getId());
        }
        CustomSqlExecution<FlowableStatisticsDao, List<Map<String, Object>>> customSqlExecution =
            new AbstractCustomSqlExecution<FlowableStatisticsDao, List<Map<String,Object>>>(FlowableStatisticsDao.class) {
                public List<Map<String, Object>> execute(FlowableStatisticsDao customMapper) {
                    return customMapper.listStatisticsBySubProcess(userId,groupIds,groupByKeyName,processDefinitionKeys);
                }
            };
        return managementService.executeCustomSql(customSqlExecution);
    }

    @Override
    public List<Map<String, Object>> listStatisticsByOperationFlag(String userId, List<String> groupIds, String groupByKeyName, String processDefinitionKey, String operationKey, String lastOperationFlag) {
        CustomSqlExecution<FlowableStatisticsDao, List<Map<String, Object>>> customSqlExecution =
                new AbstractCustomSqlExecution<FlowableStatisticsDao, List<Map<String,Object>>>(FlowableStatisticsDao.class) {

                    public List<Map<String, Object>> execute(FlowableStatisticsDao customMapper) {
                        return customMapper.listStatisticsByOperationFlag(userId,groupIds,groupByKeyName,processDefinitionKey,operationKey,lastOperationFlag.split(","));
                    }

                };
        return managementService.executeCustomSql(customSqlExecution);
    }

    @Override
    public List<Map<String, Object>> listStatisticsByOperationFlagAndSubProcess(String userId, List<String> groupIds, String groupByKeyName, String processDefinitionKey, String operationKey, String lastOperationFlag) {
        if(!StringUtils.hasText(processDefinitionKey)){
            throw new BadRequestException("processDefinitionKey " + processDefinitionKey + " is must needed");
        }
        List<Model> modelList = modelRepository.findByKeyAndType(processDefinitionKey, Model.MODEL_TYPE_BPMN);
        if(modelList == null || modelList.size() == 0){
            throw new InternalServerErrorException("Error reading processDefinition info " + processDefinitionKey);
        }
        Model model = Collections.max(modelList, new Comparator<Model>() {
            @Override
            public int compare(Model o1, Model o2) {
                return o1.getVersion() - o2.getVersion();
            }
        });
        List<String> processDefinitionKeys = new ArrayList<>();
        processDefinitionKeys.add(processDefinitionKey);
        try {
            ObjectNode editorJsonNode = (ObjectNode) objectMapper.readTree(model.getModelEditorJson());
            JsonNode jsonNode = editorJsonNode.get("properties").get("process_author");
            JSONObject jsonObject = feignRemoteIdmService.getByOrgId(feignRemoteIdmService.getUserById(userId).getOrgId());
            OrganizationEntity organizationEntity = JSONObject.toJavaObject(jsonObject, OrganizationEntity.class);
            if(RELATIONAL.equals(jsonNode.asText())){
                List<String> result = feignQueryUserService.getOurorgCode(organizationEntity.getOrgId(), organizationEntity.getOrgCate());
                for(String s : result){
                    processDefinitionKeys.add(processDefinitionKey + s);
                }
            } else {
                processDefinitionKeys.add(processDefinitionKey + organizationEntity.getOrgCode());
            }
        } catch (Exception e) {
            throw new InternalServerErrorException("Error reading editor json " + model.getId());
        }
        CustomSqlExecution<FlowableStatisticsDao, List<Map<String, Object>>> customSqlExecution =
            new AbstractCustomSqlExecution<FlowableStatisticsDao, List<Map<String,Object>>>(FlowableStatisticsDao.class) {
                public List<Map<String, Object>> execute(FlowableStatisticsDao customMapper) {
                    return customMapper.listStatisticsByOperationFlagAndSubProcess(userId,groupIds,groupByKeyName,processDefinitionKeys,operationKey,lastOperationFlag.split(","));
                }
            };
        return managementService.executeCustomSql(customSqlExecution);
    }

    @Override
    public Map<String,TaskInfoQuery> listStatisticsDetail(FlowableTasksVo flowableTasksVo) {
        if(!StringUtils.hasText(flowableTasksVo.getUserId())){
            flowableTasksVo.setUserId(SecurityUtils.getCurrentUserId());
        }
        List<String> groupIds = new ArrayList<>();
        RemoteUser remoteUser = SecurityUtils.getRemoteUser(flowableTasksVo.getUserId());
        if(remoteUser.getGroups() != null) {
            for (RemoteGroup group : remoteUser.getGroups()) {
                groupIds.add(group.getId());
            }
        }
        if(flowableTasksVo.getPage() != null && flowableTasksVo.getRows() != null){
            flowableTasksVo.setPage((flowableTasksVo.getPage() - 1) * flowableTasksVo.getRows());
        }
        final FlowableTasksVo finalFlowableTasksVo = flowableTasksVo;
        final List<String> finalGroupIds = groupIds;
        CustomSqlExecution<FlowableStatisticsDao, List<? extends TaskInfoQuery>> customSqlExecution =
            new AbstractCustomSqlExecution<FlowableStatisticsDao, List<?extends TaskInfoQuery>>(FlowableStatisticsDao.class) {
                public List<?extends TaskInfoQuery> execute(FlowableStatisticsDao customMapper) {
                    return customMapper.selectTaskByoperationFlag(finalFlowableTasksVo.getUserId(),finalGroupIds,finalFlowableTasksVo.getKeyName(),finalFlowableTasksVo.getKeyValue(),finalFlowableTasksVo.getProcessDefinitionKey(),
                                                                    finalFlowableTasksVo.getOperationKey(),finalFlowableTasksVo.getOperationFlags() == null || finalFlowableTasksVo.getOperationFlags() == "" ?null:finalFlowableTasksVo.getOperationFlags().split(","),
                                                                    finalFlowableTasksVo.getPage(),finalFlowableTasksVo.getRows());
                }
            };
        List<? extends TaskInfoQuery> tasks = managementService.executeCustomSql(customSqlExecution);
        if(tasks != null && tasks.size() > 0){
            Map<String,TaskInfoQuery> listTask = new HashMap<>();
            for(TaskInfoQuery task : tasks){
                listTask.put(task.getBusinessKey(),task);
            }
            return listTask;
        }
        return null;
    }

    @Override
    public Map<String,TaskInfoQuery> selectTaskByOperationFlag(FlowableTasksVo flowableTasksVo) {
        if(!StringUtils.hasText(flowableTasksVo.getUserId())){
            flowableTasksVo.setUserId(SecurityUtils.getCurrentUserId());
        }
        List<String> groupIds = new ArrayList<>();
        RemoteUser remoteUser = SecurityUtils.getRemoteUser(flowableTasksVo.getUserId());
        if(remoteUser.getGroups() != null) {
            for (RemoteGroup group : remoteUser.getGroups()) {
                groupIds.add(group.getId());
            }
        }
        if(flowableTasksVo.getPage() != null && flowableTasksVo.getRows() != null){
            flowableTasksVo.setPage((flowableTasksVo.getPage() - 1) * flowableTasksVo.getRows());
        }
        final FlowableTasksVo finalFlowableTasksVo = flowableTasksVo;
        final List<String> finalGroupIds = groupIds;
        CustomSqlExecution<FlowableStatisticsDao, List<? extends TaskInfoQuery>> customSqlExecution =
            new AbstractCustomSqlExecution<FlowableStatisticsDao, List<?extends TaskInfoQuery>>(FlowableStatisticsDao.class) {
                public List<?extends TaskInfoQuery> execute(FlowableStatisticsDao customMapper) {
                    return customMapper.selectTaskByoperationFlag(finalFlowableTasksVo.getUserId(),finalGroupIds,finalFlowableTasksVo.getKeyName(),finalFlowableTasksVo.getKeyValue(),finalFlowableTasksVo.getProcessDefinitionKey(),
                            finalFlowableTasksVo.getOperationKey(),finalFlowableTasksVo.getOperationFlags() == null || finalFlowableTasksVo.getOperationFlags() == ""?null:finalFlowableTasksVo.getOperationFlags().split(","),
                            finalFlowableTasksVo.getPage(),finalFlowableTasksVo.getRows());
                }
            };
        List<? extends TaskInfoQuery> tasks = managementService.executeCustomSql(customSqlExecution);
        if(tasks != null && tasks.size() > 0){
            Map<String,TaskInfoQuery> listTask = new HashMap<>();
            for(TaskInfoQuery task : tasks){
                listTask.put(task.getBusinessKey(),task);
            }
            return listTask;
        }
        return null;
    }

    @Override
    public String getBusinessKey(String taskId) {
        Task task = taskService.createTaskQuery().taskId(taskId).singleResult();
        ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceId(task.getProcessInstanceId()).singleResult();
        return processInstance.getBusinessKey();
    }

    @Override
    public String getProcessInstanceIdByBusinessKey(String businessKey) {
        ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceBusinessKey(businessKey).singleResult();
        if(processInstance != null){
            return processInstance.getProcessInstanceId();
        }
        return null;
    }
}
