package com.ceying.flowable.modeler.extention.task.dao;

import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateCommentEntity;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/18
 * @description :
 * @version: 2.0
 */
public interface ExtDelegateCommentDao {

    Integer insert(ExtDelegateCommentEntity extDelegateCommentEntity);

    Integer delete(@Param("ids") String[] ids);

    List<ExtDelegateCommentEntity> listDelegateComment(ExtDelegateCommentEntity extDelegateCommentEntity);

    List<ExtDelegateCommentEntity> listDelegateCommentAddedLock(ExtDelegateCommentEntity extDelegateCommentEntity);

    Integer count(ExtDelegateCommentEntity extDelegateCommentEntity);
}
