package com.ceying.flowable.modeler.extention.task.dao;

import org.apache.ibatis.annotations.Param;
import org.flowable.engine.impl.persistence.entity.HistoricProcessInstanceEntityImpl;

import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/17
 * @description :
 * @version: 2.0
 */
public interface HistoricProcessInstanceDao {

    /**
     * 参数为必传项
     * @param userId
     * @return
     */
    Integer listProcessInstanceByTaskAssignCount(@Param("userId") String userId);

    /**
     * userId 为必传项
     * @param userId
     * @return
     */
    List<? extends HistoricProcessInstanceEntityImpl> listProcessInstanceByTaskAssignAndFinished(@Param("userId") String userId, @Param("page") Integer page, @Param("rows") Integer rows);
}
