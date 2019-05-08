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
package com.ceying.flowable.modeler.app.task.rest;

import com.ceying.flowable.modeler.app.task.model.runtime.ProcessInstanceRepresentation;
import com.ceying.flowable.modeler.app.task.service.runtime.FlowableProcessInstanceService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.runtime.ProcessInstance;
import org.flowable.form.model.FormModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * REST controller for managing a process instance.
 */
@RestController("processInstanceResourceController")
public class ProcessInstanceResource {

    @Autowired
    protected FlowableProcessInstanceService processInstanceService;

    @Autowired
    protected RuntimeService runtimeService;

    @RequestMapping(value = "/rest/process-instances/{processInstanceId}", method = RequestMethod.GET, produces = "application/json")
    public ProcessInstanceRepresentation getProcessInstance(@PathVariable String processInstanceId, HttpServletResponse response) {
        return processInstanceService.getProcessInstance(processInstanceId, response);
    }

    @RequestMapping(value = "/rest/process-instances/{processInstanceId}/start-form", method = RequestMethod.GET, produces = "application/json")
    public FormModel getProcessInstanceStartForm(@PathVariable String processInstanceId, HttpServletResponse response) {
        return processInstanceService.getProcessInstanceStartForm(processInstanceId, response);
    }

    /**
     * 不需要校验是否有删除权限
     * @param processInstanceId
     */
    @RequestMapping(value = "/rest/process-instances/{processInstanceId}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteProcessInstance(@PathVariable String processInstanceId) {
        processInstanceService.deleteProcessInstance(processInstanceId);
    }

    /**
     * 需要校验是否有删除权限
     * @param processInstanceId
     */
    @RequestMapping(value = "/rest/process-instances/{processInstanceId}/strictly", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteProcessInstanceStrictly(@PathVariable String processInstanceId) {
        processInstanceService.deleteProcessInstanceStrictly(processInstanceId);
    }


    /**
     * 不需要校验是否有删除权限
     * @param processInstanceId
     */
    @RequestMapping(value = "/rest/process-instances/business-key/{businessKey}", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteProcessInstanceByBusinessKey(@PathVariable String businessKey) {
        ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceBusinessKey(businessKey).singleResult();
        if(processInstance != null) {
            processInstanceService.deleteProcessInstance(processInstance.getProcessInstanceId());
        }
    }

    /**
     * 需要校验是否有删除权限
     * @param processInstanceId
     */
    @RequestMapping(value = "/rest/process-instances/business-key/{businessKey}/strictly", method = RequestMethod.DELETE)
    @ResponseStatus(value = HttpStatus.OK)
    public void deleteProcessInstanceByBusinessKeyStrictly(@PathVariable String businessKey) {
        ProcessInstance processInstance = runtimeService.createProcessInstanceQuery().processInstanceBusinessKey(businessKey).singleResult();
        if(processInstance != null) {
            processInstanceService.deleteProcessInstanceStrictly(processInstance.getProcessInstanceId());
        }
    }

    /**
     * 不需要校验是否有删除权限
     * @param processInstanceId
     */
    @RequestMapping(value = "/rest/process-instances/batch-delete", method = {RequestMethod.GET,RequestMethod.POST})
    public void batchDeleteProcessInstance(@RequestParam("processInstanceIds")List<String> processInstanceIds){
        for(String processInstanceId : processInstanceIds){
            processInstanceService.deleteProcessInstance(processInstanceId);
        }
    }

    /**
     * 需要校验是否有删除权限
     * @param processInstanceId
     */
    @RequestMapping(value = "/rest/process-instances/batch-delete/strictly", method = {RequestMethod.GET,RequestMethod.POST})
    public void batchDeleteProcessInstanceStrictly(@RequestParam("processInstanceIds")List<String> processInstanceIds){
        for(String processInstanceId : processInstanceIds){
            processInstanceService.deleteProcessInstanceStrictly(processInstanceId);
        }
    }

    @RequestMapping(value = "/rest/process-instances/variables/add", method = {RequestMethod.GET,RequestMethod.POST})
    public void addVariablesByExecutionId(@RequestParam("executionId") String executionId, @RequestBody Map<String,Object> variable){
        processInstanceService.addVariablesByExecutionId(executionId,variable);
    }

}
