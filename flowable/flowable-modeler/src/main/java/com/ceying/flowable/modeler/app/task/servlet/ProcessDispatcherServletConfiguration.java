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
package com.ceying.flowable.modeler.app.task.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@ComponentScan(value = { "org.flowable.rest.exception", "org.flowable.rest.service.api" }, excludeFilters = { @ComponentScan.Filter(type = FilterType.REGEX, pattern = "org.flowable.rest.service.api.identity.*") })
@EnableAsync
public class ProcessDispatcherServletConfiguration extends BaseDispatcherServletConfiguration {

    protected static final Logger LOGGER = LoggerFactory.getLogger(ProcessDispatcherServletConfiguration.class);

}
