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
import com.ceying.flowable.modeler.app.task.model.runtime.CaseInstanceRepresentation;
import com.ceying.flowable.modeler.app.task.model.runtime.CreateCaseInstanceRepresentation;
import org.apache.commons.lang3.StringUtils;
import org.flowable.cmmn.api.CmmnHistoryService;
import org.flowable.cmmn.api.CmmnRepositoryService;
import org.flowable.cmmn.api.CmmnRuntimeService;
import org.flowable.cmmn.api.history.HistoricCaseInstance;
import org.flowable.cmmn.api.repository.CaseDefinition;
import org.flowable.cmmn.api.runtime.CaseInstance;
import org.flowable.content.api.ContentService;
import org.flowable.form.api.FormRepositoryService;
import org.flowable.form.api.FormService;
import org.flowable.idm.api.IdmIdentityService;
import org.flowable.idm.api.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Tijs Rademakers
 */
@Service
@Transactional
public class FlowableCaseInstanceService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlowableCaseInstanceService.class);

    @Autowired
    protected CmmnRepositoryService cmmnRepositoryService;

    @Autowired
    protected CmmnRuntimeService cmmnRuntimeService;
    
    @Autowired
    protected CmmnHistoryService cmmnHistoryService;

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

    public CaseInstanceRepresentation getCaseInstance(String caseInstanceId, HttpServletResponse response) {

        HistoricCaseInstance caseInstance = cmmnHistoryService.createHistoricCaseInstanceQuery().caseInstanceId(caseInstanceId).singleResult();

        CaseDefinition caseDefinition = cmmnRepositoryService.getCaseDefinition(caseInstance.getCaseDefinitionId());

        User userRep = null;
        if (caseInstance.getStartUserId() != null) {
            userRep = SecurityUtils.getRemoteUser(caseInstance.getStartUserId());
        }

        CaseInstanceRepresentation caseInstanceResult = new CaseInstanceRepresentation(caseInstance, caseDefinition, userRep);

        return caseInstanceResult;
    }

    public CaseInstanceRepresentation startNewCaseInstance(CreateCaseInstanceRepresentation startRequest) {
        if (StringUtils.isEmpty(startRequest.getCaseDefinitionId())) {
            throw new BadRequestException("Case definition id is required");
        }

        CaseDefinition caseDefinition = cmmnRepositoryService.getCaseDefinition(startRequest.getCaseDefinitionId());

        CaseInstance caseInstance = cmmnRuntimeService.createCaseInstanceBuilder()
                        .caseDefinitionId(startRequest.getCaseDefinitionId())
                        .name(startRequest.getName()).start();

        User user = null;
        if (caseInstance.getStartUserId() != null) {
            user = SecurityUtils.getRemoteUser(caseInstance.getStartUserId());
        }
        return new CaseInstanceRepresentation(caseInstance, caseDefinition, user);
    }

    public void deleteCaseInstance(String caseInstanceId) {

        User currentUser = SecurityUtils.getCurrentUserObject();

        HistoricCaseInstance caseInstance = cmmnHistoryService.createHistoricCaseInstanceQuery()
                .caseInstanceId(caseInstanceId)
                .startedBy(String.valueOf(currentUser.getId())) // Permission
                .singleResult();

        if (caseInstance == null) {
            throw new NotFoundException("Case with id: " + caseInstanceId + " does not exist or is not started by this user");
        }

        if (caseInstance.getEndTime() != null) {
            // Check if a hard delete of case instance is allowed
            /*if (!permissionService.canDeleteProcessInstance(currentUser, processInstance)) {
                throw new NotFoundException("Process with id: " + processInstanceId + " is already completed and can't be deleted");
            }*/

            // Delete all content related to the process instance
            //contentService.deleteContentItemsByProcessInstanceId(processInstanceId);

            // Finally, delete all history for this instance in the engine
            cmmnHistoryService.deleteHistoricCaseInstance(caseInstanceId);

        } else {
            cmmnRuntimeService.terminateCaseInstance(caseInstanceId);
        }
    }
}
