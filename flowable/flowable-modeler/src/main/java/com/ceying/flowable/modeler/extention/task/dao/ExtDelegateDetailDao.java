package com.ceying.flowable.modeler.extention.task.dao;

import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateDetailEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateEntity;
import com.ceying.flowable.modeler.extention.task.query.ProcessDefinitionQuery;
import com.ceying.flowable.modeler.extention.task.vo.ProcessDefinitionVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/28
 * @description :
 * @version: 2.0
 */
public interface ExtDelegateDetailDao {

    Integer insert(ExtDelegateDetailEntity extDelegateDetailEntity);

    Integer update(ExtDelegateDetailEntity extDelegateDetailEntity);

    Integer delete(@Param("ids")String[] ids);

    Integer deleteByDelegateId(@Param("ids")String[] ids);

    Long count(ExtDelegateDetailEntity extDelegateDetailEntity);

    List<ExtDelegateDetailEntity> listExtDelegateDetail(ExtDelegateDetailEntity extDelegateDetailEntity);

    List<ExtDelegateDetailEntity> listExtDelegateDetailAndKeyName(ExtDelegateDetailEntity extDelegateDetailEntity);

    List<ProcessDefinitionQuery> listUnSavedProcessDefinition(ProcessDefinitionVO processDefinitionVO);

    Long countUnSavedProcessDefinition(ProcessDefinitionVO processDefinitionVO);

    ExtDelegateDetailEntity getExtDelegateDetail(@Param("id") String id);
}
