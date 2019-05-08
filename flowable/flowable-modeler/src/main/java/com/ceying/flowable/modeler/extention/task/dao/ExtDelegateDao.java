package com.ceying.flowable.modeler.extention.task.dao;

import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateEntity;
import com.ceying.flowable.modeler.extention.task.vo.ExtDelegateVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/18
 * @description :
 * @version: 2.0
 */
public interface ExtDelegateDao {

    Integer insert(ExtDelegateEntity extDelegateEntity);

    Integer update(ExtDelegateEntity extDelegateEntity);

    Integer batchUpdate(@Param("ids")String[] ids, @Param("taskState") String taskState);

    Integer delete(@Param("ids")String[] ids);

    Long count(ExtDelegateVO extDelegateVO);

    List<ExtDelegateEntity> listExtDelegate(ExtDelegateVO extDelegateVO);

    ExtDelegateEntity getExtDelegate(@Param("id") String id);

    List<ExtDelegateEntity> listExtDelegateAll(ExtDelegateVO extDelegateVO);

    List<ExtDelegateEntity> listExpireExtDelegateAll();

    Integer check(@Param("userId") String userId, @Param("delegateType") String delegateType, @Param("processKeys") String[] processKeys);
}
