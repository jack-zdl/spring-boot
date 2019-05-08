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
package com.ceying.flowable.modeler.app.admin.rest;

import org.apache.commons.lang3.StringUtils;
import com.ceying.flowable.modeler.app.admin.domain.EndpointType;
import com.ceying.flowable.modeler.app.admin.domain.ServerConfig;
import com.ceying.flowable.modeler.app.admin.dto.ServerConfigRepresentation;
import com.ceying.flowable.modeler.app.admin.service.engine.ServerConfigService;
import com.ceying.flowable.modeler.app.modeler.service.exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing the server configs.
 *
 * @author Tijs Rademakers
 * @author Joram Barrez
 * @author Yvo Swillens
 */
@RestController
public class ServerConfigsResource {

    @Autowired
    protected ServerConfigService serverConfigService;

    @Autowired
    protected Environment env;

    @RequestMapping(value = "/rest/server-configs", method = RequestMethod.GET, produces = "application/json")
    public List<ServerConfigRepresentation> getServers() {
        return serverConfigService.findAll();
    }

    @RequestMapping(value = "/rest/server-configs/default/{endpointTypeCode}", method = RequestMethod.GET, produces = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    @ResponseBody
    public ServerConfigRepresentation getDefaultServerConfig(@PathVariable Integer endpointTypeCode) {
        EndpointType endpointType = EndpointType.valueOf(endpointTypeCode);

        if (endpointType == null) {
            throw new IllegalArgumentException("Unknown endpoint type code: " + endpointTypeCode);
        }

        return new ServerConfigRepresentation(serverConfigService.getDefaultServerConfig(endpointType));
    }

    @RequestMapping(value = "/rest/server-configs/{serverId}", method = RequestMethod.PUT, produces = "application/json")
    @ResponseStatus(value = HttpStatus.OK)
    public void updateServer(@PathVariable String serverId, @RequestBody ServerConfigRepresentation configRepresentation) {
        ServerConfig config = serverConfigService.findOne(serverId);

        if (config == null) {
            throw new BadRequestException("Server with id '" + serverId + "' does not exist");
        }

        boolean updatePassword = false;
        if (StringUtils.isNotEmpty(configRepresentation.getPassword())) {
            config.setPassword(configRepresentation.getPassword());
            updatePassword = true;
        } else {
            configRepresentation.setPassword(serverConfigService.getServerConfigDecryptedPassword(config));
        }

        config.setContextRoot(configRepresentation.getContextRoot());
        config.setDescription(configRepresentation.getDescription());
        config.setName(configRepresentation.getName());
        config.setPort(configRepresentation.getServerPort());
        config.setRestRoot(configRepresentation.getRestRoot());
        config.setServerAddress(configRepresentation.getServerAddress());
        config.setUserName(configRepresentation.getUserName());

        serverConfigService.save(config, updatePassword);
    }

    protected ServerConfigRepresentation createServerConfigRepresentation(ServerConfig serverConfig) {
        ServerConfigRepresentation serverRepresentation = new ServerConfigRepresentation();
        serverRepresentation.setId(serverConfig.getId());
        serverRepresentation.setName(serverConfig.getName());
        serverRepresentation.setDescription(serverConfig.getDescription());
        serverRepresentation.setServerAddress(serverConfig.getServerAddress());
        serverRepresentation.setServerPort(serverConfig.getPort());
        serverRepresentation.setContextRoot(serverConfig.getContextRoot());
        serverRepresentation.setRestRoot(serverConfig.getRestRoot());
        serverRepresentation.setUserName(serverConfig.getUserName());
        return serverRepresentation;
    }
}
