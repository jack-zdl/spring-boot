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
package com.ceying.flowable.modeler.app.admin.rest.client;

import com.fasterxml.jackson.databind.JsonNode;
import com.ceying.flowable.modeler.app.admin.domain.EndpointType;
import com.ceying.flowable.modeler.app.admin.domain.ServerConfig;
import com.ceying.flowable.modeler.app.admin.service.engine.FormDeploymentService;
import com.ceying.flowable.modeler.app.admin.service.engine.exception.FlowableServiceException;
import com.ceying.flowable.modeler.app.modeler.service.exception.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author Yvo Swillens
 */
@RestController
public class FormDeploymentClientResource extends AbstractClientResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(FormDeploymentClientResource.class);

    @Autowired
    protected FormDeploymentService clientService;

    @RequestMapping(value = "/rest/admin/form-deployments/{deploymentId}", method = RequestMethod.GET, produces = "application/json")
    public JsonNode getDeployment(@PathVariable String deploymentId) throws BadRequestException {

        ServerConfig serverConfig = retrieveServerConfig(EndpointType.FORM);
        try {
            return clientService.getDeployment(serverConfig, deploymentId);
        } catch (FlowableServiceException e) {
            LOGGER.error("Error getting form deployment {}", deploymentId, e);
            throw new BadRequestException(e.getMessage());
        }
    }

    @RequestMapping(value = "/rest/admin/form-deployments/{deploymentId}", method = RequestMethod.DELETE)
    public void deleteDeployment(@PathVariable String deploymentId, HttpServletResponse httpResponse) {
        clientService.deleteDeployment(retrieveServerConfig(EndpointType.FORM), httpResponse, deploymentId);
    }
}
