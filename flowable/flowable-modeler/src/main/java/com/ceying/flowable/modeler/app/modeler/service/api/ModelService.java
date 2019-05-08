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
package com.ceying.flowable.modeler.app.modeler.service.api;

import com.ceying.flowable.modeler.app.modeler.domain.editor.AbstractModel;
import com.ceying.flowable.modeler.app.modeler.domain.editor.Model;
import com.ceying.flowable.modeler.app.modeler.domain.editor.ModelHistory;
import com.ceying.flowable.modeler.app.modeler.model.editor.ModelKeyRepresentation;
import com.ceying.flowable.modeler.app.modeler.model.editor.ModelRepresentation;
import com.ceying.flowable.modeler.app.modeler.model.editor.ReviveModelResultRepresentation;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.cmmn.model.CmmnModel;
import org.flowable.idm.api.User;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface ModelService {

    Model getModel(String modelId);

    ModelRepresentation getModelRepresentation(String modelId);

    List<AbstractModel> getModelsByModelType(Integer modelType);

    ModelKeyRepresentation validateModelKey(Model model, Integer modelType, String key);

    ModelHistory getModelHistory(String modelId, String modelHistoryId);

    Long getModelCountForUser(User user, int modelTypeApp);

    BpmnModel getBpmnModel(AbstractModel model);

    byte[] getBpmnXML(BpmnModel bpmnMode);

    byte[] getBpmnXML(AbstractModel model);

    BpmnModel getBpmnModel(AbstractModel model, Map<String, Model> formMap, Map<String, Model> decisionTableMap);
    
    CmmnModel getCmmnModel(AbstractModel model);

    byte[] getCmmnXML(CmmnModel cmmnModel);

    byte[] getCmmnXML(AbstractModel model);
    
    CmmnModel getCmmnModel(AbstractModel model, Map<String, Model> formMap, Map<String, Model> decisionTableMap,
                           Map<String, Model> caseModelMap, Map<String, Model> processModelMap);
    
    String createModelJson(ModelRepresentation model);

    Model createModel(ModelRepresentation model, String editorJson, User createdBy);

    Model createModel(Model newModel, User createdBy);

    Model saveModel(Model modelObject);

    Model saveModel(Model modelObject, String editorJson, byte[] imageBytes, boolean newVersion, String newVersionComment, User updatedBy);

    Model saveModel(String modelId, String name, String key, String description, String editorJson,
                    boolean newVersion, String newVersionComment, User updatedBy);

    ModelRepresentation importNewVersion(String modelId, String fileName, InputStream modelStream);

    Model createNewModelVersion(Model modelObject, String comment, User updatedBy);

    ModelHistory createNewModelVersionAndReturnModelHistory(Model modelObject, String comment, User updatedBy);

    void deleteModel(String modelId);

    ReviveModelResultRepresentation reviveProcessModelHistory(ModelHistory modelHistory, User user, String newVersionComment);
}
