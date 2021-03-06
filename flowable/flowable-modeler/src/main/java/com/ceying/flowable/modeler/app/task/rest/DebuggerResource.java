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

import com.ceying.flowable.modeler.app.task.model.debugger.BreakpointRepresentation;
import com.ceying.flowable.modeler.app.task.service.debugger.DebuggerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * REST controller for managing a debugger requests.
 *
 * @author martin.grofcik
 */
@RestController
public class DebuggerResource {

    @Autowired
    protected DebuggerService debuggerService;

    @RequestMapping(value = "/rest/debugger/breakpoints", method = RequestMethod.GET, produces = "application/json")
    public Collection<BreakpointRepresentation> getBreakpoints() {
        return debuggerService.getBreakpoints();
    }

    @RequestMapping(value = "/rest/debugger/breakpoints", method = RequestMethod.POST)
    public void addBreakPoints(@RequestBody BreakpointRepresentation breakpointRepresentation) {
        debuggerService.addBreakpoint(breakpointRepresentation);
    }

    @RequestMapping(value = "/rest/debugger/breakpoints/{executionId}/continue", method = RequestMethod.PUT)
    public void continueExecution(@PathVariable String executionId) {
        debuggerService.continueExecution(executionId);
    }

    @RequestMapping(value = "/rest/debugger/breakpoints", method = RequestMethod.DELETE)
    public void deleteBreakPoints(@RequestBody BreakpointRepresentation breakpointRepresentation) {
        debuggerService.removeBreakpoint(breakpointRepresentation);
    }

}
