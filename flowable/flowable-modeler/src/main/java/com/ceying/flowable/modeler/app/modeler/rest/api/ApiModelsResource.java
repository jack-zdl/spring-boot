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
package com.ceying.flowable.modeler.app.modeler.rest.api;

import com.ceying.flowable.modeler.app.modeler.service.editor.FlowableModelQueryService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ceying.flowable.modeler.app.modeler.domain.editor.Model;
import com.ceying.flowable.modeler.app.modeler.model.common.ResultListDataRepresentation;
import com.ceying.flowable.modeler.app.modeler.model.editor.ModelKeyRepresentation;
import com.ceying.flowable.modeler.app.modeler.model.editor.ModelRepresentation;
import com.ceying.flowable.modeler.app.modeler.security.SecurityUtils;
import com.ceying.flowable.modeler.app.modeler.service.api.ModelService;
import com.ceying.flowable.modeler.app.modeler.service.exception.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ApiModelsResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApiModelsResource.class);

    @Autowired
    protected FlowableModelQueryService modelQueryService;

    @Autowired
    protected ModelService modelService;

    @Autowired
    protected ObjectMapper objectMapper;

    @RequestMapping(value = "/editor/models", method = RequestMethod.GET, produces = "application/json")
    public ResultListDataRepresentation getModels(@RequestParam(required = false) String filter, @RequestParam(required = false) String sort, @RequestParam(required = false) Integer modelType,
                                                  HttpServletRequest request) {

        return modelQueryService.getModels(filter, sort, modelType, request);
    }

    @RequestMapping(value = "/editor/import-process-model", method = RequestMethod.POST, produces = "application/json")
    public ModelRepresentation importProcessModel(HttpServletRequest request, @RequestParam("file") MultipartFile file) {
        return modelQueryService.importProcessModel(request, file);
    }

    @RequestMapping(value = "/editor/models", method = RequestMethod.POST, produces = "application/json")
    public ModelRepresentation createModel(@RequestBody ModelRepresentation modelRepresentation) {
        modelRepresentation.setKey(modelRepresentation.getKey().replaceAll(" ", ""));

        ModelKeyRepresentation modelKeyInfo = modelService.validateModelKey(null, modelRepresentation.getModelType(), modelRepresentation.getKey());
        if (modelKeyInfo.isKeyAlreadyExists()) {
            throw new BadRequestException("Provided model key already exists: " + modelRepresentation.getKey());
        }

        String json = modelService.createModelJson(modelRepresentation);

        Model newModel = modelService.createModel(modelRepresentation, json, SecurityUtils.getCurrentUserObject());
        return new ModelRepresentation(newModel);
    }

}
