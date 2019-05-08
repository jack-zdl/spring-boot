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
package com.ceying.flowable.modeler.app.modeler.service.editor;

import com.ceying.flowable.modeler.app.modeler.domain.editor.AbstractModel;
import com.ceying.flowable.modeler.app.modeler.domain.editor.Model;
import com.ceying.flowable.modeler.app.modeler.domain.editor.ModelHistory;
import com.ceying.flowable.modeler.app.modeler.model.editor.FormSaveRepresentation;
import com.ceying.flowable.modeler.app.modeler.model.editor.ModelKeyRepresentation;
import com.ceying.flowable.modeler.app.modeler.model.editor.form.FormRepresentation;
import com.ceying.flowable.modeler.app.modeler.security.SecurityUtils;
import com.ceying.flowable.modeler.app.modeler.service.api.ModelService;
import com.ceying.flowable.modeler.app.modeler.service.exception.InternalServerErrorException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.codec.binary.Base64;
import com.ceying.flowable.modeler.app.modeler.service.exception.BadRequestException;
import org.flowable.form.model.FormModel;
import org.flowable.idm.api.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Tijs Rademakers
 */
@Service
@Transactional
public class FlowableFormService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FlowableFormService.class);

    @Autowired
    protected ModelService modelService;

    @Autowired
    protected ObjectMapper objectMapper;

    public FormRepresentation getForm(String formId) {
        Model model = modelService.getModel(formId);
        FormRepresentation form = createFormRepresentation(model);
        return form;
    }

    public FormRepresentation getFormHistory(String formId, String formHistoryId) {
        ModelHistory model = modelService.getModelHistory(formId, formHistoryId);
        FormRepresentation form = createFormRepresentation(model);
        return form;
    }

    public List<FormRepresentation> getForms(String[] formIds) {
        List<FormRepresentation> formRepresentations = new ArrayList<>();

        if (formIds == null || formIds.length == 0) {
            throw new BadRequestException("No formIds provided in the request");
        }

        for (String formId : formIds) {
            Model model = modelService.getModel(formId);

            FormRepresentation form = createFormRepresentation(model);
            formRepresentations.add(form);
        }

        return formRepresentations;
    }

    public FormRepresentation saveForm(String formId, FormSaveRepresentation saveRepresentation) {
        User user = SecurityUtils.getCurrentUserObject();
        Model model = modelService.getModel(formId);

        String formKey = saveRepresentation.getFormRepresentation().getKey();
        ModelKeyRepresentation modelKeyInfo = modelService.validateModelKey(model, model.getModelType(), formKey);
        if (modelKeyInfo.isKeyAlreadyExists()) {
            throw new BadRequestException("Model with provided key already exists " + formKey);
        }

        model.setName(saveRepresentation.getFormRepresentation().getName());
        model.setKey(formKey);
        model.setDescription(saveRepresentation.getFormRepresentation().getDescription());

        String editorJson = null;
        try {
            editorJson = objectMapper.writeValueAsString(saveRepresentation.getFormRepresentation().getFormDefinition());
        } catch (Exception e) {
            LOGGER.error("Error while processing form json", e);
            throw new InternalServerErrorException("Form could not be saved " + formId);
        }

        String filteredImageString = saveRepresentation.getFormImageBase64().replace("data:image/png;base64,", "");
        byte[] imageBytes = Base64.decodeBase64(filteredImageString);
        model = modelService.saveModel(model, editorJson, imageBytes, saveRepresentation.isNewVersion(), saveRepresentation.getComment(), user);
        FormRepresentation result = new FormRepresentation(model);
        result.setFormDefinition(saveRepresentation.getFormRepresentation().getFormDefinition());
        return result;
    }

    protected FormRepresentation createFormRepresentation(AbstractModel model) {
        FormModel formDefinition = null;
        try {
            formDefinition = objectMapper.readValue(model.getModelEditorJson(), FormModel.class);
        } catch (Exception e) {
            LOGGER.error("Error deserializing form", e);
            throw new InternalServerErrorException("Could not deserialize form definition");
        }

        FormRepresentation result = new FormRepresentation(model);
        result.setFormDefinition(formDefinition);
        return result;
    }
}
