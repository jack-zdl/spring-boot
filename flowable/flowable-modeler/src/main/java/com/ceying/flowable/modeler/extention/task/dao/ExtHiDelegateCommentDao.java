package com.ceying.flowable.modeler.extention.task.dao;

import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateCommentEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtHiDelegateCommentEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/18
 * @description :
 * @version: 2.0
 */
public interface ExtHiDelegateCommentDao {

    Integer insert(ExtHiDelegateCommentEntity extHiDelegateCommentEntity);
}
