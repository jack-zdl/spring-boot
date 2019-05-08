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

import com.ceying.flowable.modeler.app.modeler.domain.editor.ModelHistory;
import com.ceying.flowable.modeler.app.modeler.model.common.BaseRestActionRepresentation;
import com.ceying.flowable.modeler.app.modeler.model.common.ResultListDataRepresentation;
import com.ceying.flowable.modeler.app.modeler.model.editor.ModelRepresentation;
import com.ceying.flowable.modeler.app.modeler.model.editor.ReviveModelResultRepresentation;
import com.ceying.flowable.modeler.app.modeler.security.SecurityUtils;
import com.ceying.flowable.modeler.app.modeler.service.exception.BadRequestException;
import org.springframework.web.bind.annotation.*;

@RestController
public class ModelHistoryResource extends AbstractModelHistoryResource {

    @RequestMapping(value = "/rest/models/{modelId}/history", method = RequestMethod.GET, produces = "application/json")
    public ResultListDataRepresentation getModelHistoryCollection(@PathVariable String modelId, @RequestParam(value = "includeLatestVersion", required = false) Boolean includeLatestVersion) {
        return super.getModelHistoryCollection(modelId, includeLatestVersion);
    }

    @RequestMapping(value = "/rest/models/{modelId}/history/{modelHistoryId}", method = RequestMethod.GET, produces = "application/json")
    public ModelRepresentation getProcessModelHistory(@PathVariable String modelId, @PathVariable String modelHistoryId) {
        return super.getProcessModelHistory(modelId, modelHistoryId);
    }

    @RequestMapping(value = "/rest/models/{modelId}/history/{modelHistoryId}", method = RequestMethod.POST, produces = "application/json")
    public ReviveModelResultRepresentation executeProcessModelHistoryAction(@PathVariable String modelId, @PathVariable String modelHistoryId,
                                                                            @RequestBody(required = true) BaseRestActionRepresentation action) {

        // In order to execute actions on a historic process model, write permission is needed
        ModelHistory modelHistory = modelService.getModelHistory(modelId, modelHistoryId);

        if ("useAsNewVersion".equals(action.getAction())) {
            return modelService.reviveProcessModelHistory(modelHistory, SecurityUtils.getCurrentUserObject(), action.getComment());
        } else {
            throw new BadRequestException("Invalid action to execute on model history " + modelHistoryId + ": " + action.getAction());
        }
    }
}
