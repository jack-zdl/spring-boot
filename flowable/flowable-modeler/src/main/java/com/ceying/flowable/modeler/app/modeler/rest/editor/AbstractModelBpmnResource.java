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
import com.ceying.flowable.modeler.app.modeler.service.api.ModelService;
import com.ceying.flowable.modeler.app.modeler.service.exception.BaseModelerRestException;
import com.ceying.flowable.modeler.app.modeler.service.exception.InternalServerErrorException;
import com.ceying.flowable.modeler.app.modeler.domain.editor.AbstractModel;
import com.ceying.flowable.modeler.app.modeler.domain.editor.Model;
import com.ceying.flowable.modeler.app.modeler.service.exception.BadRequestException;
import org.flowable.bpmn.model.BpmnModel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * @author jbarrez
 */
public class AbstractModelBpmnResource {

    private static final Logger LOGGER = LoggerFactory.getLogger(AbstractModelBpmnResource.class);

    @Autowired
    protected ModelService modelService;

    public void getProcessModelBpmn20Xml(HttpServletResponse response, String processModelId) throws IOException {

        if (processModelId == null) {
            throw new BadRequestException("No process model id provided");
        }

        Model model = modelService.getModel(processModelId);
        generateBpmn20Xml(response, model);
    }

    public void getHistoricProcessModelBpmn20Xml(HttpServletResponse response, String processModelId, String processModelHistoryId) throws IOException {

        if (processModelId == null) {
            throw new BadRequestException("No process model id provided");
        }

        ModelHistory historicModel = modelService.getModelHistory(processModelId, processModelHistoryId);
        generateBpmn20Xml(response, historicModel);
    }

    protected void generateBpmn20Xml(HttpServletResponse response, AbstractModel model) {
        String name = model.getName().replaceAll(" ", "_");
        response.setHeader("Content-Disposition", "attachment; filename=" + name + ".bpmn20.xml");
        if (model.getModelEditorJson() != null) {
            try {
                ServletOutputStream servletOutputStream = response.getOutputStream();
                response.setContentType("application/xml");

                BpmnModel bpmnModel = modelService.getBpmnModel(model);
                byte[] xmlBytes = modelService.getBpmnXML(bpmnModel);
                BufferedInputStream in = new BufferedInputStream(new ByteArrayInputStream(xmlBytes));

                byte[] buffer = new byte[8096];
                while (true) {
                    int count = in.read(buffer);
                    if (count == -1) {
                        break;
                    }
                    servletOutputStream.write(buffer, 0, count);
                }

                // Flush and close stream
                servletOutputStream.flush();
                servletOutputStream.close();

            } catch (BaseModelerRestException e) {
                throw e;

            } catch (Exception e) {
                LOGGER.error("Could not generate BPMN 2.0 XML", e);
                throw new InternalServerErrorException("Could not generate BPMN 2.0 xml");
            }
        }
    }
}
