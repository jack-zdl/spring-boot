package com.ceying.flowable.modeler.extention.task.service.impl;

import com.ceying.common.util.bean.SpringUtil;
import com.ceying.flowable.modeler.extention.task.dao.ExtDelegateCommentDao;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateCommentEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateDetailEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtHiDelegateCommentEntity;
import com.ceying.flowable.modeler.extention.task.service.ExtDelegateCommentService;
import com.ceying.flowable.modeler.extention.task.service.ExtDelegateDetailService;
import com.ceying.flowable.modeler.extention.task.service.ExtDelegateService;
import com.ceying.flowable.modeler.extention.task.service.ExtHiDelegateCommentService;
import org.flowable.engine.ManagementService;
import org.flowable.engine.TaskService;
import org.flowable.engine.common.impl.cmd.CustomSqlExecution;
import org.flowable.engine.impl.cmd.AbstractCustomSqlExecution;
import org.flowable.identitylink.service.IdentityLinkType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: fej
 * @date: 2018/6/6
 * @description :
 * @version: 2.0
 */
@Service
@Transactional
public class ExtDelegateCommentServiceImpl implements ExtDelegateCommentService {

    @Autowired
    private ExtDelegateService extDelegateService;

    @Autowired
    private ExtDelegateDetailService extDelegateDetailService;

    @Autowired
    private ExtDelegateCommentService extDelegateCommentService;

    @Autowired
    private ExtHiDelegateCommentService extHiDelegateCommentService;

    @Override
    public Integer insert(ExtDelegateCommentEntity extDelegateCommentEntity) {
        CustomSqlExecution<ExtDelegateCommentDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateCommentDao, Integer>(ExtDelegateCommentDao.class) {
                public Integer execute(ExtDelegateCommentDao customMapper) {
                    return customMapper.insert(extDelegateCommentEntity);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public Integer delete(String[] ids) {
        CustomSqlExecution<ExtDelegateCommentDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateCommentDao, Integer>(ExtDelegateCommentDao.class) {
                public Integer execute(ExtDelegateCommentDao customMapper) {
                    return customMapper.delete(ids);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public List<ExtDelegateCommentEntity> listDelegateComment(ExtDelegateCommentEntity extDelegateCommentEntity) {
        CustomSqlExecution<ExtDelegateCommentDao, List<ExtDelegateCommentEntity>> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateCommentDao, List<ExtDelegateCommentEntity>>(ExtDelegateCommentDao.class) {
                public List<ExtDelegateCommentEntity> execute(ExtDelegateCommentDao customMapper) {
                    return customMapper.listDelegateComment(extDelegateCommentEntity);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public List<ExtDelegateCommentEntity> listDelegateCommentAddedLock(ExtDelegateCommentEntity extDelegateCommentEntity) {
        CustomSqlExecution<ExtDelegateCommentDao, List<ExtDelegateCommentEntity>> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateCommentDao, List<ExtDelegateCommentEntity>>(ExtDelegateCommentDao.class) {
                public List<ExtDelegateCommentEntity> execute(ExtDelegateCommentDao customMapper) {
                    return customMapper.listDelegateCommentAddedLock(extDelegateCommentEntity);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public Integer count(ExtDelegateCommentEntity extDelegateCommentEntity) {
        CustomSqlExecution<ExtDelegateCommentDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateCommentDao, Integer>(ExtDelegateCommentDao.class) {
                public Integer execute(ExtDelegateCommentDao customMapper) {
                    return customMapper.count(extDelegateCommentEntity);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public void timerDelegateExecute() {
        //刷新所有启用的委托配置，将启用状态更新到过期；
        //进行已经生效的配置回退;
        List<ExtDelegateEntity> result = extDelegateService.listExpireExtDelegateAll();
        if(result != null && result.size() > 0){
            List<String> updIds = new ArrayList<>();
            for(ExtDelegateEntity extDelegateEntity : result){
                updIds.add(extDelegateEntity.getId());
                if("A".equals(extDelegateEntity.getDelegateType()) && extDelegateEntity.getWithdrawTask() == 1){
                    ExtDelegateCommentEntity extDelegateCommentEntity = new ExtDelegateCommentEntity();
                    extDelegateCommentEntity.setUserId(extDelegateEntity.getUserId());
                    extDelegateCommentEntity.setDelegateUserId(extDelegateEntity.getDelegateUserId());
                    List<ExtDelegateCommentEntity> list = null;
                    list = extDelegateCommentService.listDelegateComment(extDelegateCommentEntity);
                    this.withdrawTask(list);
                } else if("P".equals(extDelegateEntity.getDelegateType())  && extDelegateEntity.getWithdrawTask() == 1) {
                    if(extDelegateEntity.getExtDelegateDetailEntityList() != null){
                        for(ExtDelegateDetailEntity extDelegateDetailEntity : extDelegateEntity.getExtDelegateDetailEntityList()){
                            ExtDelegateCommentEntity extDelegateCommentEntity = new ExtDelegateCommentEntity();
                            extDelegateCommentEntity.setUserId(extDelegateEntity.getUserId());
                            extDelegateCommentEntity.setDelegateUserId(extDelegateEntity.getDelegateUserId());
                            extDelegateCommentEntity.setProcessKey(extDelegateDetailEntity.getProcessKey());
                            List<ExtDelegateCommentEntity> list = null;
                            list = extDelegateCommentService.listDelegateComment(extDelegateCommentEntity);
                            this.withdrawTask(list);
                        }
                    }
                }
            }
            //更新委托配置为过期
            extDelegateService.batchUpdate(updIds.toArray(new String[updIds.size()]),"0");
            //同时删除相应的流程配置[不用删除，进行数据保留]
            //extDelegateDetailService.deleteByDelegateId(updIds.toArray(new String[updIds.size()]));
        }
    }

    private void withdrawTask(List<ExtDelegateCommentEntity> list){
        if(list != null && list.size() > 0){
            for(ExtDelegateCommentEntity entity : list){
                if("TASK_ASSIGNEE".equals(entity.getEventType())){
                    //SpringUtil.getBean(TaskService.class).delegateTask(entity.getTaskId(), entity.getUserId());
                    //SpringUtil.getBean(TaskService.class).setAssignee(entity.getTaskId(), entity.getUserId());
                    //SpringUtil.getBean(TaskService.class).setOwner(entity.getTaskId(), "");
                    SpringUtil.getBean(TaskService.class).deleteUserIdentityLink(entity.getTaskId(), entity.getDelegateUserId(), IdentityLinkType.CANDIDATE);
                    SpringUtil.getBean(TaskService.class).deleteUserIdentityLink(entity.getTaskId(), entity.getDelegateUserId(), IdentityLinkType.PARTICIPANT);
                }
                if("TASK_CREATED".equals(entity.getEventType())){
                    SpringUtil.getBean(TaskService.class).deleteUserIdentityLink(entity.getTaskId(), entity.getDelegateUserId(), IdentityLinkType.CANDIDATE);
                    SpringUtil.getBean(TaskService.class).deleteUserIdentityLink(entity.getTaskId(), entity.getDelegateUserId(), IdentityLinkType.PARTICIPANT);
                }
            }
            this.deleteExtDelegateComment(list);
        }
    }

    private void deleteExtDelegateComment(List<ExtDelegateCommentEntity> result){
        List<String> delIds = new ArrayList<>();
        if(result != null) {
            for (ExtDelegateCommentEntity entity : result){
                delIds.add(entity.getId());
                ExtHiDelegateCommentEntity extHiDelegateCommentEntity = new ExtHiDelegateCommentEntity();
                extHiDelegateCommentEntity.setId(entity.getId());
                extHiDelegateCommentEntity.setTaskId(entity.getTaskId());
                extHiDelegateCommentEntity.setEventType(entity.getEventType());
                extHiDelegateCommentEntity.setUserId(entity.getUserId());
                extHiDelegateCommentEntity.setDelegateUserId(entity.getDelegateUserId());
                extHiDelegateCommentEntity.setProcessKey(entity.getProcessKey());
                extHiDelegateCommentEntity.setStartTime(entity.getStartTime());
                extHiDelegateCommentEntity.setExtField(entity.getExtField());
                extHiDelegateCommentEntity.setEndTime(new Date());
                extHiDelegateCommentEntity.setExtField("由于委托过期作废，删除委托数据记录");
                extHiDelegateCommentService.insert(extHiDelegateCommentEntity);
            }
            extDelegateCommentService.delete(delIds.toArray(new String[delIds.size()]));
        }
    }
}
