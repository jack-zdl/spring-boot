package com.ceying.flowable.modeler.extention.task.service;

import com.ceying.flowable.modeler.app.task.model.ResultListGridDataEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateEntity;
import com.ceying.flowable.modeler.extention.task.vo.ExtDelegateVO;

import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/28
 * @description :
 * @version: 2.0
 */
public interface ExtDelegateService {

    Integer insert(ExtDelegateEntity extDelegateEntity);

    Integer update(ExtDelegateEntity extDelegateEntity);

    Integer batchUpdate(String[] ids, String taskState);

    Integer delete(String[] ids);

    Long count(ExtDelegateVO extDelegateVO);

    ResultListGridDataEntity listExtDelegate(ExtDelegateVO extDelegateVO);

    ResultListGridDataEntity getExtDelegate(String id);

    List<ExtDelegateEntity> listExtDelegateAll(ExtDelegateVO extDelegateVO);

    List<ExtDelegateEntity> listExpireExtDelegateAll();

    Integer check(String userId, String delegateType, String[] processKeys);
}
