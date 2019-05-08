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

import com.ceying.flowable.modeler.app.modeler.model.editor.DecisionTableSaveRepresentation;
import com.ceying.flowable.modeler.app.modeler.model.editor.ModelRepresentation;
import com.ceying.flowable.modeler.app.modeler.model.editor.decisiontable.DecisionTableRepresentation;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ceying.flowable.modeler.app.modeler.service.editor.FlowableDecisionTableService;
import com.ceying.flowable.modeler.app.modeler.service.exception.BadRequestException;
import com.ceying.flowable.modeler.app.modeler.service.exception.InternalServerErrorException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @author yvoswillens
 * @author erikwinlof
 */
@RestController("decisionTableResourceController")
@RequestMapping("/rest/decision-table-models")
public class DecisionTableResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(DecisionTableResource.class);

    @Autowired
    protected ObjectMapper objectMapper;

    @Autowired
    protected FlowableDecisionTableService decisionTableService;

    @RequestMapping(value = "/values", method = RequestMethod.GET, produces = "application/json")
    public List<DecisionTableRepresentation> getDecisionTables(HttpServletRequest request) {
        String[] decisionTableIds = request.getParameterValues("decisionTableId");
        if (decisionTableIds == null || decisionTableIds.length == 0) {
            throw new BadRequestException("No decisionTableId parameter(s) provided in the request");
        }
        return decisionTableService.getDecisionTables(decisionTableIds);
    }

    @RequestMapping(value = "/{decisionTableId}", method = RequestMethod.GET, produces = "application/json")
    public DecisionTableRepresentation getDecisionTable(@PathVariable String decisionTableId) {
        return decisionTableService.getDecisionTable(decisionTableId);
    }

    @RequestMapping(value = "/{decisionTableId}/export", method = RequestMethod.GET)
    public void exportDecisionTable(HttpServletResponse response, @PathVariable String decisionTableId) {
        decisionTableService.exportDecisionTable(response, decisionTableId);
    }

    @RequestMapping(value = "/import-decision-table", method = RequestMethod.POST, produces = "application/json")
    public ModelRepresentation importDecisionTable(HttpServletRequest request, @RequestParam("file") MultipartFile file) {
        return decisionTableService.importDecisionTable(request, file);
    }

    @RequestMapping(value = "/import-decision-table-text", method = RequestMethod.POST, produces = "application/json")
    public String importDecisionTableText(HttpServletRequest request, @RequestParam("file") MultipartFile file) {
        ModelRepresentation decisionTableRepresentation = decisionTableService.importDecisionTable(request, file);
        String json = null;
        try {
            json = objectMapper.writeValueAsString(decisionTableRepresentation);
        } catch (Exception e) {
            LOGGER.error("Error writing imported decision table json", e);
            throw new InternalServerErrorException("Error writing imported decision table representation json");
        }
        return json;
    }

    @RequestMapping(value = "/history/{historyModelId}", method = RequestMethod.GET, produces = "application/json")
    public DecisionTableRepresentation getHistoricDecisionTable(@PathVariable String historyModelId) {
        return decisionTableService.getHistoricDecisionTable(historyModelId);
    }

    @RequestMapping(value = "/history/{historyModelId}/export", method = RequestMethod.GET)
    public void exportHistoricDecisionTable(HttpServletResponse response, @PathVariable String historyModelId) {
        decisionTableService.exportHistoricDecisionTable(response, historyModelId);
    }

    @RequestMapping(value = "/{decisionTableId}", method = RequestMethod.PUT, produces = "application/json")
    public DecisionTableRepresentation saveDecisionTable(@PathVariable String decisionTableId, @RequestBody DecisionTableSaveRepresentation saveRepresentation) {
        return decisionTableService.saveDecisionTable(decisionTableId, saveRepresentation);
    }
}
