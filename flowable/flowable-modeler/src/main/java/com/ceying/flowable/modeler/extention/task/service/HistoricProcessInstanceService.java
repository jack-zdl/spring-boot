package com.ceying.flowable.modeler.extention.task.service;

import org.apache.ibatis.annotations.Param;
import org.flowable.engine.history.HistoricProcessInstance;
import org.flowable.engine.impl.persistence.entity.HistoricProcessInstanceEntityImpl;

import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/17
 * @description :
 * @version: 2.0
 */
public interface HistoricProcessInstanceService {

    Integer listProcessInstanceByTaskAssignCount(String userId);
    List<? extends HistoricProcessInstanceEntityImpl> listProcessInstanceByTaskAssignAndFinished(String userId, Integer page, Integer rows);
}
