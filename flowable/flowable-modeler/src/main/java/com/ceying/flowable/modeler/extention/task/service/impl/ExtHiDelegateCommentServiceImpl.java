package com.ceying.flowable.modeler.extention.task.service.impl;

import com.ceying.common.util.bean.SpringUtil;
import com.ceying.flowable.modeler.extention.task.dao.ExtHiDelegateCommentDao;
import com.ceying.flowable.modeler.extention.task.entity.ExtHiDelegateCommentEntity;
import com.ceying.flowable.modeler.extention.task.service.ExtHiDelegateCommentService;
import org.flowable.engine.ManagementService;
import org.flowable.engine.common.impl.cmd.CustomSqlExecution;
import org.flowable.engine.impl.cmd.AbstractCustomSqlExecution;
import org.springframework.stereotype.Service;

/**
 * @author: fej
 * @date: 2018/6/6
 * @description :
 * @version: 2.0
 */
@Service
public class ExtHiDelegateCommentServiceImpl implements ExtHiDelegateCommentService {

    @Override
    public Integer insert(ExtHiDelegateCommentEntity extHiDelegateCommentEntity) {
        CustomSqlExecution<ExtHiDelegateCommentDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtHiDelegateCommentDao, Integer>(ExtHiDelegateCommentDao.class) {
                public Integer execute(ExtHiDelegateCommentDao customMapper) {
                    return customMapper.insert(extHiDelegateCommentEntity);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }
}
