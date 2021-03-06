/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ceying.flowable.modeler.app.task.service.runtime;

import com.ceying.flowable.modeler.app.modeler.security.SecurityUtils;
import com.ceying.flowable.modeler.app.modeler.service.exception.BadRequestException;
import com.ceying.flowable.modeler.app.modeler.service.exception.NotFoundException;
import com.ceying.flowable.modeler.app.modeler.service.exception.NotPermittedException;
import com.ceying.flowable.modeler.app.task.model.runtime.CreateProcessInstanceRepresentation;
import com.ceying.flowable.modeler.app.task.model.runtime.ProcessInstanceRepresentation;
import org.apache.commons.lang3.StringUtils;
import org.flowable.content.api.ContentService;
import org.flowable.engine.HistoryService;
import org.flowable.engine.IdentityService;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.history.HistoricProcessInstance;
import org.flowable.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.form.api.FormRepositoryService;
import org.flowable.form.api.FormService;
import org.flowable.form.model.FormModel;
import org.flowable.idm.api.IdmIdentityService;
import org.flowable.idm.api.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author Tijs Rademakers
 */
@Service
@Transactional
public class FlowableProcessInstanceService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlowableProcessInstanceService.class);

    @Autowired
    protected RepositoryService repositoryService;

    @Autowired
    protected HistoryService historyService;

    @Autowired
    protected RuntimeService runtimeService;

    @Autowired
    protected FormService formService;

    @Autowired
    protected FormRepositoryService formRepositoryService;

    @Autowired
    protected PermissionService permissionService;

    @Autowired
    protected ContentService contentService;

    @Autowired
    protected FlowableCommentService commentService;

    @Autowired
    protected IdmIdentityService idmIdentityService;

    @Autowired
    protected IdentityService identityService;

    public ProcessInstanceRepresentation getProcessInstance(String processInstanceId, HttpServletResponse response) {

        HistoricProcessInstance processInstance = historyService.createHistoricProcessInstanceQuery().processInstanceId(processInstanceId).singleResult();

        if (!permissionService.hasReadPermissionOnProcessInstance(SecurityUtils.getCurrentUserObject(), processInstance, processInstanceId)) {
            throw new NotFoundException("Process with id: " + processInstanceId + " does not exist or is not available for this user");
        }

        ProcessDefinitionEntity processDefinition = (ProcessDefinitionEntity) repositoryService.getProcessDefinition(processInstance.getProcessDefinitionId());

        User userRep = null;
        if (processInstance.getStartUserId() != null) {
            userRep = SecurityUtils.getRemoteUser(processInstance.getStartUserId());
        }

        ProcessInstanceRepresentation processInstanceResult = new ProcessInstanceRepresentation(processInstance, processDefinition, processDefinition.isGraphicalNotationDefined(), userRep);

        if (processDefinition.hasStartFormKey()) {
            FormModel formModel = runtimeService.getStartFormModel(processInstance.getProcessDefinitionId(), processInstance.getId());
            if (formModel != null) {
                processInstanceResult.setStartFormDefined(true);
            }
        }

        return processInstanceResult;
    }

    public FormModel getProcessInstanceStartForm(String processInstanceId, HttpServletResponse response) {

        HistoricProcessInstance processInstance = historyService.createHistoricProcessInstanceQuery().processInstanceId(processInstanceId).singleResult();

        if (!permissionService.hasReadPermissionOnProcessInstance(SecurityUtils.getCurrentUserObject(), processInstance, processInstanceId)) {
            throw new NotFoundException("Process with id: " + processInstanceId + " does not exist or is not available for this user");
        }

        return runtimeService.getStartFormModel(processInstance.getProcessDefinitionId(), processInstance.getId());
    }

    public ProcessInstanceRepresentation startNewProcessInstance(CreateProcessInstanceRepresentation startRequest) {

        if (StringUtils.isEmpty(startRequest.getProcessDefinitionId())) {
            throw new BadRequestException("Process definition id is required");
        }

        ProcessDefinition processDefinition = repositoryService.getProcessDefinition(startRequest.getProcessDefinitionId());

        if (!permissionService.canStartProcess(SecurityUtils.getCurrentUserObject(), processDefinition)) {
            throw new NotPermittedException("User is not listed as potential starter for process definition with id: " + processDefinition.getId());
        }

        ProcessInstance processInstance = runtimeService.startProcessInstanceWithForm(startRequest.getProcessDefinitionId(),
                startRequest.getOutcome(), startRequest.getValues(), startRequest.getName());

        User user = null;
        if (processInstance.getStartUserId() != null) {
            user = SecurityUtils.getRemoteUser(processInstance.getStartUserId());
        }
        return new ProcessInstanceRepresentation(processInstance, processDefinition,
                ((ProcessDefinitionEntity) processDefinition).isGraphicalNotationDefined(), user);

    }

    public ProcessInstanceRepresentation startNewProcessInstanceByKey(String processDefinitionKey,String businessKey, Map<String,Object> variables){
        if (StringUtils.isEmpty(processDefinitionKey)) {
            throw new BadRequestException("Process definition key is required");
        }

        ProcessDefinition processDefinition = repositoryService.createProcessDefinitionQuery()
                                                                .processDefinitionKey(processDefinitionKey)
                                                                .latestVersion().singleResult();
        if (!permissionService.canStartProcess(SecurityUtils.getCurrentUserObject(), processDefinition)) {
            throw new NotPermittedException("User is not listed as potential starter for process definition with id: " + processDefinition.getId());
        }
        //添加startUserId信息
        identityService.setAuthenticatedUserId(SecurityUtils.getCurrentUserId());
        ProcessInstance processInstance = null;
        if(variables != null) {
            processInstance = runtimeService.startProcessInstanceByKey(processDefinitionKey,businessKey, variables);
        }else {
            processInstance = runtimeService.startProcessInstanceByKey(processDefinitionKey);
        }

        User user = null;
        if (processInstance.getStartUserId() != null) {
            user = SecurityUtils.getRemoteUser(processInstance.getStartUserId());
        }
        return new ProcessInstanceRepresentation(processInstance, processDefinition,
                ((ProcessDefinitionEntity) processDefinition).isGraphicalNotationDefined(), user);
    }

    public ProcessInstanceRepresentation startNewProcessInstanceById(String processDefinitionId, Map<String,Object> variables){
        if (StringUtils.isEmpty(processDefinitionId)) {
            throw new BadRequestException("Process definition key is required");
        }

        ProcessDefinition processDefinition = repositoryService.getProcessDefinition(processDefinitionId);
        if (!permissionService.canStartProcess(SecurityUtils.getCurrentUserObject(), processDefinition)) {
            throw new NotPermittedException("User is not listed as potential starter for process definition with id: " + processDefinition.getId());
        }
        //添加startUserId信息
        identityService.setAuthenticatedUserId(SecurityUtils.getCurrentUserId());
        ProcessInstance processInstance = null;
        if(variables != null) {
            processInstance = runtimeService.startProcessInstanceById(processDefinitionId, variables);
        }else {
            processInstance = runtimeService.startProcessInstanceById(processDefinitionId);
        }

        User user = null;
        if (processInstance.getStartUserId() != null) {
            user = SecurityUtils.getRemoteUser(processInstance.getStartUserId());
        }
        return new ProcessInstanceRepresentation(processInstance, processDefinition,
                ((ProcessDefinitionEntity) processDefinition).isGraphicalNotationDefined(), user);
    }

    /**
     * 不进行权限校验进行删除流程实例
     * @param processInstanceId
     */
    public void deleteProcessInstance(String processInstanceId) {
        HistoricProcessInstance processInstance = historyService.createHistoricProcessInstanceQuery()
                .processInstanceId(processInstanceId)
                .singleResult();

        if (processInstance == null) {
            throw new NotFoundException("Process with id: " + processInstanceId + " does not exist");
        }

        if (processInstance.getEndTime() != null) {

            // Delete all content related to the process instance
            contentService.deleteContentItemsByProcessInstanceId(processInstanceId);

            // Delete all comments on tasks and process instances
            commentService.deleteAllCommentsForProcessInstance(processInstanceId);

            // Finally, delete all history for this instance in the engine
            historyService.deleteHistoricProcessInstance(processInstanceId);

        } else {
            runtimeService.deleteProcessInstance(processInstanceId, "Cancelled by " + SecurityUtils.getCurrentUserId());
        }
    }

    /**
     * 严格校验权限，判断是否能进行删除流程实例操作
     * @param processInstanceId
     */
    public void deleteProcessInstanceStrictly(String processInstanceId){
        User currentUser = SecurityUtils.getCurrentUserObject();

        HistoricProcessInstance processInstance = historyService.createHistoricProcessInstanceQuery()
                .processInstanceId(processInstanceId)
                .startedBy(String.valueOf(currentUser.getId())) // Permission
                .singleResult();

        if (processInstance == null) {
            throw new NotFoundException("Process with id: " + processInstanceId + " does not exist or is not started by this user");
        }

        if (processInstance.getEndTime() != null) {
            // Check if a hard delete of process instance is allowed
            if (!permissionService.canDeleteProcessInstance(currentUser, processInstance)) {
                throw new NotFoundException("Process with id: " + processInstanceId + " is already completed and can't be deleted");
            }

            // Delete all content related to the process instance
            contentService.deleteContentItemsByProcessInstanceId(processInstanceId);

            // Delete all comments on tasks and process instances
            commentService.deleteAllCommentsForProcessInstance(processInstanceId);

            // Finally, delete all history for this instance in the engine
            historyService.deleteHistoricProcessInstance(processInstanceId);

        } else {
            runtimeService.deleteProcessInstance(processInstanceId, "Cancelled by " + SecurityUtils.getCurrentUserId());
        }
    }

    /**
     * 添加流程实例变量
     */
    public void addVariablesByExecutionId(String executionId, Map<String,Object> variable){
        if(variable != null) {
            for(String name : variable.keySet()) {
                runtimeService.setVariable(executionId, name, variable.get(name));
            }
        }
    }
}
