package com.ceying.flowable.modeler.app.task.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: cyp
 * Date: 2018-03-07
 * Time: 17:23
 */
@Configuration
@ComponentScan(value = {"com.ceying.flowable.modeler.app.task.rest"})
public class TaskDispatcherServletConfiguration extends BaseDispatcherServletConfiguration {

    protected static final Logger LOGGER = LoggerFactory.getLogger(ProcessDispatcherServletConfiguration.class);
}
