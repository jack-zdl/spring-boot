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
package com.ceying.flowable.modeler.app.modeler.rest.editor;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.ceying.flowable.modeler.app.modeler.domain.editor.Model;
import com.ceying.flowable.modeler.app.modeler.domain.editor.ModelHistory;
import com.ceying.flowable.modeler.app.modeler.model.common.ResultListDataRepresentation;
import com.ceying.flowable.modeler.app.modeler.model.editor.ModelRepresentation;
import com.ceying.flowable.modeler.app.modeler.repository.editor.ModelHistoryRepository;
import com.ceying.flowable.modeler.app.modeler.service.api.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AbstractModelHistoryResource {

    @Autowired
    protected ModelService modelService;

    @Autowired
    protected ModelHistoryRepository modelHistoryRepository;

    @Autowired
    protected ObjectMapper objectMapper;

    public ResultListDataRepresentation getModelHistoryCollection(String modelId, Boolean includeLatestVersion) {

        Model model = modelService.getModel(modelId);
        List<ModelHistory> history = modelHistoryRepository.findByModelId(model.getId());
        ResultListDataRepresentation result = new ResultListDataRepresentation();

        List<ModelRepresentation> representations = new ArrayList<>();

        // Also include the latest version of the model
        if (Boolean.TRUE.equals(includeLatestVersion)) {
            representations.add(new ModelRepresentation(model));
        }
        if (history.size() > 0) {
            for (ModelHistory modelHistory : history) {
                representations.add(new ModelRepresentation(modelHistory));
            }
            result.setData(representations);
        }

        // Set size and total
        result.setSize(representations.size());
        result.setTotal(Long.valueOf(representations.size()));
        result.setStart(0);
        return result;
    }

    public ModelRepresentation getProcessModelHistory(String modelId, String modelHistoryId) {
        // Check if the user has read-rights on the process-model in order to fetch history
        ModelHistory modelHistory = modelService.getModelHistory(modelId, modelHistoryId);
        return new ModelRepresentation(modelHistory);
    }

}
