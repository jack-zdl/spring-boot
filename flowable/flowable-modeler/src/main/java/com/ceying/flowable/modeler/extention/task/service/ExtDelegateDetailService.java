package com.ceying.flowable.modeler.extention.task.service;

import com.ceying.flowable.modeler.app.task.model.ResultListGridDataEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateDetailEntity;
import com.ceying.flowable.modeler.extention.task.vo.ProcessDefinitionVO;

/**
 * @author: fej
 * @date: 2018/5/28
 * @description :
 * @version: 2.0
 */
public interface ExtDelegateDetailService {

    Integer insert(ExtDelegateDetailEntity extDelegateDetailEntity);

    void insert(String[] processKey, String delegateId);

    Integer update(ExtDelegateDetailEntity extDelegateDetailEntity);

    Integer delete(String[] ids);

    Integer deleteByDelegateId(String[] ids);

    Long count(ExtDelegateDetailEntity extDelegateDetailEntity);

    ResultListGridDataEntity listExtDelegateDetail(ExtDelegateDetailEntity extDelegateDetailEntity);

    ResultListGridDataEntity listExtDelegateDetailAndKeyName(ExtDelegateDetailEntity extDelegateDetailEntity);

    ResultListGridDataEntity listUnSavedProcessDefinition(ProcessDefinitionVO processDefinitionVO);

    Long countUnSavedProcessDefinition(ProcessDefinitionVO processDefinitionVO);

    ExtDelegateDetailEntity getExtDelegateDetail(String id);
}
