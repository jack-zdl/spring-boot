package com.ceying.flowable.modeler.extention.task.service.impl;

import com.ceying.flowable.modeler.extention.task.dao.FlowableStatisticsDao;
import com.ceying.flowable.modeler.extention.task.dao.HistoricProcessInstanceDao;
import com.ceying.flowable.modeler.extention.task.service.HistoricProcessInstanceService;
import org.flowable.engine.ManagementService;
import org.flowable.engine.common.impl.cmd.CustomSqlExecution;
import org.flowable.engine.history.HistoricProcessInstance;
import org.flowable.engine.impl.cmd.AbstractCustomSqlExecution;
import org.flowable.engine.impl.persistence.entity.HistoricProcessInstanceEntityImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author: fej
 * @date: 2018/5/17
 * @description :
 * @version: 2.0
 */
@Service
public class HistoricProcessInstanceServiceImpl implements HistoricProcessInstanceService {

    @Autowired
    protected ManagementService managementService;

    @Override
    public List<? extends HistoricProcessInstanceEntityImpl> listProcessInstanceByTaskAssignAndFinished(String userId, Integer page, Integer rows) {
        CustomSqlExecution<HistoricProcessInstanceDao, List<? extends HistoricProcessInstanceEntityImpl> > customSqlExecution =
            new AbstractCustomSqlExecution<HistoricProcessInstanceDao, List<? extends HistoricProcessInstanceEntityImpl> >(HistoricProcessInstanceDao.class) {
                public List<? extends HistoricProcessInstanceEntityImpl> execute(HistoricProcessInstanceDao customMapper) {
                    return customMapper.listProcessInstanceByTaskAssignAndFinished(userId, page, rows);
                }
            };
        return managementService.executeCustomSql(customSqlExecution);
    }

    @Override
    public Integer listProcessInstanceByTaskAssignCount(String userId) {
        CustomSqlExecution<HistoricProcessInstanceDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<HistoricProcessInstanceDao, Integer>(HistoricProcessInstanceDao.class) {
                public Integer execute(HistoricProcessInstanceDao customMapper) {
                    return customMapper.listProcessInstanceByTaskAssignCount(userId);
                }
            };
        return managementService.executeCustomSql(customSqlExecution);
    }
}
