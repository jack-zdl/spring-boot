package com.ceying.flowable.modeler.extention.task.service;

import com.ceying.flowable.modeler.app.task.model.ResultListGridDataEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateCommentEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateEntity;
import com.ceying.flowable.modeler.extention.task.vo.ExtDelegateVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/28
 * @description :
 * @version: 2.0
 */
public interface ExtDelegateCommentService {

    Integer insert(ExtDelegateCommentEntity extDelegateCommentEntity);

    Integer delete(String[] ids);

    List<ExtDelegateCommentEntity> listDelegateComment(ExtDelegateCommentEntity extDelegateCommentEntity);

    List<ExtDelegateCommentEntity> listDelegateCommentAddedLock(ExtDelegateCommentEntity extDelegateCommentEntity);

    Integer count(ExtDelegateCommentEntity extDelegateCommentEntity);

    void timerDelegateExecute();
}
