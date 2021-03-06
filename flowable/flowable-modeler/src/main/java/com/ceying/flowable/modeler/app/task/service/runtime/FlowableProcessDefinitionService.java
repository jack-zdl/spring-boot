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
import com.ceying.flowable.modeler.app.modeler.service.exception.InternalServerErrorException;
import com.ceying.flowable.modeler.app.modeler.service.exception.NotFoundException;
import com.ceying.flowable.modeler.app.task.model.ResultListGridDataEntity;
import com.ceying.flowable.modeler.app.task.model.runtime.ProcessDefinitionRepresentation;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.lang3.StringUtils;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.bpmn.model.FlowElement;
import org.flowable.bpmn.model.Process;
import org.flowable.bpmn.model.StartEvent;
import org.flowable.editor.language.json.converter.util.CollectionUtils;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.common.api.FlowableObjectNotFoundException;
import org.flowable.engine.repository.Deployment;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.repository.ProcessDefinitionQuery;
import org.flowable.form.api.FormRepositoryService;
import org.flowable.form.model.FormField;
import org.flowable.form.model.FormModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Tijs Rademakers
 */
@Service
@Transactional
public class FlowableProcessDefinitionService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlowableProcessDefinitionService.class);

    @Autowired
    protected RepositoryService repositoryService;

    @Autowired
    protected FormRepositoryService formRepositoryService;

    @Autowired
    protected PermissionService permissionService;

    @Autowired
    protected ObjectMapper objectMapper;

    public FormModel getProcessDefinitionStartForm(HttpServletRequest request) {

        String[] requestInfoArray = parseRequest(request);
        String processDefinitionId = getProcessDefinitionId(requestInfoArray, requestInfoArray.length - 2);

        ProcessDefinition processDefinition = repositoryService.getProcessDefinition(processDefinitionId);

        try {
            return getStartForm(processDefinition);

        } catch (FlowableObjectNotFoundException aonfe) {
            // Process definition does not exist
            throw new NotFoundException("No process definition found with the given id: " + processDefinitionId);
        }
    }

    public ResultListGridDataEntity getProcessDefinitions(Boolean latest, String deploymentKey) {

        ProcessDefinitionQuery definitionQuery = repositoryService.createProcessDefinitionQuery();

        if (deploymentKey != null) {
            Deployment deployment = repositoryService.createDeploymentQuery().deploymentKey(deploymentKey).latest().singleResult();

            if (deployment != null) {
                definitionQuery.deploymentId(deployment.getId());
            } else {
                return new ResultListGridDataEntity(new ArrayList<ProcessDefinitionRepresentation>());
            }

        } else {

            if (latest != null && latest) {
                definitionQuery.latestVersion();
            }
        }

        List<ProcessDefinition> definitions = definitionQuery.list();

        List<ProcessDefinition> startableDefinitions = new ArrayList<>();
        for (ProcessDefinition definition : definitions) {
            if (SecurityUtils.getCurrentUserObject() == null || permissionService.canStartProcess(SecurityUtils.getCurrentUserObject(), definition)) {
                startableDefinitions.add(definition);
            }
        }

        ResultListGridDataEntity result = new ResultListGridDataEntity(convertDefinitionList(startableDefinitions));
        return result;
    }

    protected FormModel getStartForm(ProcessDefinition processDefinition) {
        FormModel formModel = null;
        BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinition.getId());
        Process process = bpmnModel.getProcessById(processDefinition.getKey());
        FlowElement startElement = process.getInitialFlowElement();
        if (startElement instanceof StartEvent) {
            StartEvent startEvent = (StartEvent) startElement;
            if (StringUtils.isNotEmpty(startEvent.getFormKey())) {
                formModel = formRepositoryService.getFormModelByKeyAndParentDeploymentId(startEvent.getFormKey(),
                        processDefinition.getDeploymentId(), processDefinition.getTenantId());
            }
        }

        if (formModel == null) {
            // Definition found, but no form attached
            throw new NotFoundException("Process definition does not have a form defined: " + processDefinition.getId());
        }

        return formModel;
    }

    protected ProcessDefinition getProcessDefinitionFromRequest(String[] requestInfoArray, boolean isTableRequest) {
        int paramPosition = requestInfoArray.length - 3;
        if (isTableRequest) {
            paramPosition--;
        }
        String processDefinitionId = getProcessDefinitionId(requestInfoArray, paramPosition);

        ProcessDefinition processDefinition = repositoryService.getProcessDefinition(processDefinitionId);

        return processDefinition;
    }

    protected FormField getFormFieldFromRequest(String[] requestInfoArray, ProcessDefinition processDefinition, boolean isTableRequest) {
        FormModel form = getStartForm(processDefinition);
        int paramPosition = requestInfoArray.length - 1;
        if (isTableRequest) {
            paramPosition--;
        }
        String fieldVariable = requestInfoArray[paramPosition];

        List<? extends FormField> allFields = form.listAllFields();
        FormField selectedField = null;
        if (CollectionUtils.isNotEmpty(allFields)) {
            for (FormField formFieldRepresentation : allFields) {
                if (formFieldRepresentation.getId().equalsIgnoreCase(fieldVariable)) {
                    selectedField = formFieldRepresentation;
                }
            }
        }

        if (selectedField == null) {
            throw new NotFoundException("Field could not be found in start form definition " + fieldVariable);
        }

        return selectedField;
    }

    protected List<ProcessDefinitionRepresentation> convertDefinitionList(List<ProcessDefinition> definitions) {
        List<ProcessDefinitionRepresentation> result = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(definitions)) {
            for (ProcessDefinition processDefinition : definitions) {
                ProcessDefinitionRepresentation rep = new ProcessDefinitionRepresentation(processDefinition);
                result.add(rep);
            }
        }
        return result;
    }

    protected String[] parseRequest(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        String[] requestInfoArray = requestURI.split("/");
        if (requestInfoArray.length < 2) {
            throw new BadRequestException("Start form request is not valid " + requestURI);
        }
        return requestInfoArray;
    }

    protected String getProcessDefinitionId(String[] requestInfoArray, int position) {
        String processDefinitionVariable = requestInfoArray[position];
        String processDefinitionId = null;
        try {
            processDefinitionId = URLDecoder.decode(processDefinitionVariable, "UTF-8");
        } catch (Exception e) {
            LOGGER.error("Error decoding process definition {}", processDefinitionVariable, e);
            throw new InternalServerErrorException("Error decoding process definition " + processDefinitionVariable);
        }
        return processDefinitionId;
    }
}
