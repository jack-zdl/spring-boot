package com.ceying.flowable.modeler.app.admin.repository;

import com.ceying.flowable.modeler.app.admin.domain.ServerConfig;
import com.ceying.flowable.modeler.app.admin.service.engine.ServerConfigService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletContext;
import java.util.List;

/**
 * @author: fej
 * @date: 2018/4/25
 * @description :
 * @version: 2.0
 */
@Component
@DependsOn("liquibase2")
public class PostProcessorInitialBean implements InitializingBean {

    @Autowired
    private ServerConfigService serverConfigService;

    @Autowired
    private ServerConfigRepository serverConfigRepository;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("----------------------------------------------------配置参数到数据库START---");
        serverConfigRepository.deleteAll();
        List<ServerConfig> list = serverConfigService.getDefaultServerConfigs();
        for(ServerConfig serverConfig : list){
            serverConfigRepository.save(serverConfig);
        }
        System.out.println("----------------------------------------------------配置参数到数据库END---");
    }
}
