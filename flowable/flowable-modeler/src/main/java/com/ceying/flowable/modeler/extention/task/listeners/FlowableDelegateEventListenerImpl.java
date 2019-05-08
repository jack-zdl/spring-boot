package com.ceying.flowable.modeler.extention.task.listeners;

import com.ceying.common.util.bean.SpringUtil;
import com.ceying.common.util.sequence.SequenceUtil;
import com.ceying.flowable.modeler.app.modeler.model.common.RemoteUser;
import com.ceying.flowable.modeler.app.modeler.service.idm.RemoteIdmService;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateCommentEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateDetailEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtHiDelegateCommentEntity;
import com.ceying.flowable.modeler.extention.task.service.ExtDelegateCommentService;
import com.ceying.flowable.modeler.extention.task.service.ExtDelegateService;
import com.ceying.flowable.modeler.extention.task.service.ExtHiDelegateCommentService;
import com.ceying.flowable.modeler.extention.task.vo.ExtDelegateVO;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.TaskService;
import org.flowable.engine.common.api.delegate.event.*;
import org.flowable.engine.common.impl.identity.Authentication;
import org.flowable.engine.delegate.event.AbstractFlowableEngineEventListener;
import org.flowable.engine.impl.persistence.entity.CommentEntity;
import org.flowable.engine.impl.persistence.entity.CommentEntityImpl;
import org.flowable.engine.repository.ProcessDefinition;
import org.flowable.engine.task.Comment;
import org.flowable.identitylink.api.IdentityLinkInfo;
import org.flowable.identitylink.service.IdentityLinkType;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/17
 * @description : 全局任务接收监听器【处理流程委托】,
 *                  不可注入工作流相关的service，需通过SpringUtil.getBean()获取工作流相关bean,
 *                  如果注入会形成循环依赖，启动报错
 * @version: 2.0
 */
@Component("flowableDelegateEventListenerImpl")
@Transactional
public class FlowableDelegateEventListenerImpl extends AbstractFlowableEngineEventListener {

    @Autowired
    private ExtDelegateService extDelegateService;

    @Autowired
    private ExtDelegateCommentService extDelegateCommentService;

    @Autowired
    private ExtHiDelegateCommentService extHiDelegateCommentService;

    @Autowired
    private RemoteIdmService remoteIdmService;

    /**
     * 如果不存在代理人，则直接添加可选用户处理任务
     * @param event
     */
    @Override
    protected void taskCreated(FlowableEngineEntityEvent event) {
        super.taskAssigned(event);
        //如果不存在代理人，则直接处理
        if(!StringUtils.hasText(((Task)event.getEntity()).getAssignee()) && !this.checkIsExecuteTaskAssigneeMethod((Task)event.getEntity())){
            //直接处理
            this.dealWithNoAssignee((Task)event.getEntity());
        }
    }

    /**
     * 如果存在代理人，则首先进入TASK_ASSIGNEE事件；
     * 如果没有代理人，只有可选用户或者组，则不进入此方法；
     * 如果可选用户处理待办任务，则会触发此事件，需要进行处理，不能让监听事件执行
     * @param event
     */
    @Override
    protected void taskAssigned(FlowableEngineEntityEvent event) {
        super.taskAssigned(event);
        //如果存在代理人并且此任务没有触发过TASK_ASSIGNEE事件，则直接处理
        if(StringUtils.hasText(((Task)event.getEntity()).getAssignee()) && !this.checkIsExecuteTaskCreatedMethod((Task)event.getEntity())){
            //直接处理
            this.dealWithConcreteBusiness((Task)event.getEntity());
        }
    }

    /**
     * 任务完成时执行
     * 将当前数据移动进历史表进行备份
     * @param event
     */
    @Override
    protected void taskCompleted(FlowableEngineEntityEvent event) {
        super.taskCompleted(event);
        this.dealHiDelegateComment((Task)event.getEntity());
    }

    /**
     * 具体处理业务方法，循环判断该任务书否已经被委托
     * @param task
     */
    private void dealWithConcreteBusiness(Task task){
        String processDefinitionKey = null;
        if(StringUtils.hasText(task.getProcessDefinitionId())) {
            processDefinitionKey = this.getProcessDefinitionKey(task.getProcessDefinitionId());
        }
        List<ExtDelegateEntity> result = this.listAll();
        for(ExtDelegateEntity extDelegateEntity : result){
            if(StringUtils.hasText(extDelegateEntity.getDelegateType()) && "A".equals(extDelegateEntity.getDelegateType()) && extDelegateEntity.getUserId().equals(task.getAssignee())){
                this.dealWithAll(extDelegateEntity, task, "", false);
                continue;
            }
            for(ExtDelegateDetailEntity extDelegateDetailEntity : extDelegateEntity.getExtDelegateDetailEntityList()){
                if(StringUtils.hasText(extDelegateEntity.getDelegateType()) && "P".equals(extDelegateEntity.getDelegateType()) && StringUtils.hasText(processDefinitionKey)
                        && processDefinitionKey.equals(extDelegateDetailEntity.getProcessKey()) && extDelegateEntity.getUserId().equals(task.getAssignee())) {
                    this.dealWithProcess(extDelegateEntity, task, processDefinitionKey, false);
                    break;
                }
                if(StringUtils.hasText(task.getTaskDefinitionKey()) && task.getTaskDefinitionKey().equals(extDelegateDetailEntity.getActivityId()) && extDelegateEntity.getUserId().equals(task.getAssignee())){
                    this.dealWithActivityId(extDelegateEntity, task, "", false);
                    break;
                }
            }
        }
    }

    /**
     * 处理所有未接收的任务
     * @param task
     */
    private void dealWithNoAssignee(Task task){
        String processDefinitionKey = null;
        if(StringUtils.hasText(task.getProcessDefinitionId())) {
            processDefinitionKey = this.getProcessDefinitionKey(task.getProcessDefinitionId());
        }
        List<ExtDelegateEntity> result = this.listAll();
        List<? extends IdentityLinkInfo> linkList = task.getIdentityLinks();
        for(ExtDelegateEntity extDelegateEntity : result){
            if(StringUtils.hasText(extDelegateEntity.getDelegateType()) && "A".equals(extDelegateEntity.getDelegateType()) && this.checkUserInIdentityLink(extDelegateEntity.getUserId(),linkList)){
                this.dealWithAll(extDelegateEntity, task, "", true);
                continue;
            }
            for(ExtDelegateDetailEntity extDelegateDetailEntity : extDelegateEntity.getExtDelegateDetailEntityList()){
                if(StringUtils.hasText(extDelegateEntity.getDelegateType()) && "P".equals(extDelegateEntity.getDelegateType()) && StringUtils.hasText(processDefinitionKey)
                        && processDefinitionKey.equals(extDelegateDetailEntity.getProcessKey()) && this.checkUserInIdentityLink(extDelegateEntity.getUserId(),linkList)) {
                    this.dealWithProcess(extDelegateEntity, task, processDefinitionKey, true);
                    break;
                }
                //暂不支持,后期可扩展
                if(StringUtils.hasText(task.getTaskDefinitionKey()) && task.getTaskDefinitionKey().equals(extDelegateDetailEntity.getActivityId()) && this.checkUserInIdentityLink(extDelegateEntity.getUserId(),linkList)){
                    this.dealWithActivityId(extDelegateEntity, task, "", true);
                    break;
                }
            }
        }
    }

    /**
     * 移动数据到历史表
     * @param task
     */
    private void dealHiDelegateComment(Task task){
        ExtDelegateCommentEntity extDelegateCommentEntity = new ExtDelegateCommentEntity();
        extDelegateCommentEntity.setTaskId(task.getId());
        List<ExtDelegateCommentEntity> result = extDelegateCommentService.listDelegateComment(extDelegateCommentEntity);
        List<String> delIds = new ArrayList<>();
        if(result != null && result.size() > 0) {
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
                extHiDelegateCommentEntity.setExtField("任务正常结束，数据移动进历史表");
                extHiDelegateCommentService.insert(extHiDelegateCommentEntity);
            }
            extDelegateCommentService.delete(delIds.toArray(new String[delIds.size()]));
        }
    }

    /**
     * 处理流程委托
     * @param extDelegateEntity
     * @param task
     */
    private void dealWithProcess(ExtDelegateEntity extDelegateEntity, Task task, String processKey, boolean added){
        if(!added) {
            this.delegateTask(extDelegateEntity, processKey, task);
        } else {
            this.addIdentityLink(extDelegateEntity, processKey, task);
        }
    }

    /**
     * 处理节点委托
     * @param extDelegateEntity
     * @param task
     */
    private void dealWithActivityId(ExtDelegateEntity extDelegateEntity, Task task, String processKey, boolean added){
        if(!added) {
            this.delegateTask(extDelegateEntity, processKey, task);
        } else {
            this.addIdentityLink(extDelegateEntity, processKey, task);
        }
    }

    /**
     * 处理全权委托
     * @param extDelegateEntity
     * @param task
     */
    private void dealWithAll(ExtDelegateEntity extDelegateEntity, Task task, String processKey, boolean added){
        if(!added) {
            this.delegateTask(extDelegateEntity, processKey, task);
        } else {
            this.addIdentityLink(extDelegateEntity, processKey, task);
        }
    }

    /**
     * 委托任务
     * @param extDelegateEntity
     * @param task
     */
    private void delegateTask(ExtDelegateEntity extDelegateEntity, String processKey, Task task){
        //SpringUtil.getBean(TaskService.class).delegateTask(task.getId(), extDelegateEntity.getDelegateUserId());
        //SpringUtil.getBean(TaskService.class).setAssignee(task.getId(), extDelegateEntity.getDelegateUserId());
        //SpringUtil.getBean(TaskService.class).setOwner(task.getId(), extDelegateEntity.getUserId());
        SpringUtil.getBean(TaskService.class).setAssignee(task.getId(), null);
        SpringUtil.getBean(TaskService.class).addUserIdentityLink(task.getId(), extDelegateEntity.getUserId(), IdentityLinkType.CANDIDATE);
        SpringUtil.getBean(TaskService.class).addUserIdentityLink(task.getId(), extDelegateEntity.getDelegateUserId(), IdentityLinkType.CANDIDATE);
        ExtDelegateCommentEntity extDelegateCommentEntity = new ExtDelegateCommentEntity();
        extDelegateCommentEntity.setId(SequenceUtil.UUID());
        extDelegateCommentEntity.setTaskId(task.getId());
        extDelegateCommentEntity.setEventType("TASK_ASSIGNEE");
        extDelegateCommentEntity.setUserId(extDelegateEntity.getUserId());
        extDelegateCommentEntity.setDelegateUserId(extDelegateEntity.getDelegateUserId());
        extDelegateCommentEntity.setProcessKey(processKey);
        extDelegateCommentEntity.setStartTime(new Date());
        this.addDelegateComment(extDelegateCommentEntity);
    }

    /**
     * 添加可选用户
     * @param extDelegateEntity
     * @param task
     */
    private void addIdentityLink(ExtDelegateEntity extDelegateEntity, String processKey, Task task){
        SpringUtil.getBean(TaskService.class).addUserIdentityLink(task.getId(), extDelegateEntity.getDelegateUserId(), IdentityLinkType.CANDIDATE);
        ExtDelegateCommentEntity extDelegateCommentEntity = new ExtDelegateCommentEntity();
        extDelegateCommentEntity.setId(SequenceUtil.UUID());
        extDelegateCommentEntity.setTaskId(task.getId());
        extDelegateCommentEntity.setEventType("TASK_CREATED");
        extDelegateCommentEntity.setUserId(extDelegateEntity.getUserId());
        extDelegateCommentEntity.setDelegateUserId(extDelegateEntity.getDelegateUserId());
        extDelegateCommentEntity.setProcessKey(processKey);
        extDelegateCommentEntity.setStartTime(new Date());
        this.addDelegateComment(extDelegateCommentEntity);
    }

    /**
     * 根据流程定义ID获取流程定义KEY
     * @param processDefinitionId
     * @return
     */
    private String getProcessDefinitionKey(String processDefinitionId){
        ProcessDefinition processDefinition = SpringUtil.getBean(RepositoryService.class).createProcessDefinitionQuery().processDefinitionId(processDefinitionId).singleResult();
        return processDefinition.getKey();
    }

    /**
     * 查询所有启用的委托流程定义
     * @return
     */
    private List<ExtDelegateEntity> listAll(){
        ExtDelegateVO extDelegateVO = new ExtDelegateVO();
        extDelegateVO.setTaskState("2");
        return extDelegateService.listExtDelegateAll(extDelegateVO);
    }

    /**
     * 校验用户是否在可选用户中
     * @param userId
     * @param linkList
     * @return
     */
    private boolean checkUserInIdentityLink(String userId, List<? extends IdentityLinkInfo> linkList){
        if(linkList != null && linkList.size() > 0){
            for (IdentityLinkInfo identityLink : linkList){
                if(StringUtils.hasText(identityLink.getUserId()) && identityLink.getUserId().equals(userId)){
                    return true;
                } else {
                    if(StringUtils.hasText(identityLink.getGroupId())){
                        List<RemoteUser> remoteUserList = remoteIdmService.findUsersByGroup(identityLink.getGroupId());
                        if(remoteUserList != null && remoteUserList.size() > 0){
                            for(RemoteUser remoteUser : remoteUserList){
                                if(userId.equals(remoteUser.getId())){
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    /**
     * 插入当前委托备注表
     * @param extDelegateCommentEntity
     */
    private void addDelegateComment(ExtDelegateCommentEntity extDelegateCommentEntity){
        extDelegateCommentService.insert(extDelegateCommentEntity);
    }

    /**
     * 校验是否执行过TASK_ASSIGNEE事件
     * @param task
     * @return
     */
    private boolean checkIsExecuteTaskCreatedMethod(Task task){
        ExtDelegateCommentEntity extDelegateCommentEntity = new ExtDelegateCommentEntity();
        extDelegateCommentEntity.setTaskId(task.getId());
        extDelegateCommentEntity.setEventType("TASK_CREATED");
        Integer count = extDelegateCommentService.count(extDelegateCommentEntity);
        return count > 0? true: false;
    }

    /**
     * 校验是否执行过TASK_ASSIGNEE事件
     * @param task
     * @return
     */
    private boolean checkIsExecuteTaskAssigneeMethod(Task task){
        ExtDelegateCommentEntity extDelegateCommentEntity = new ExtDelegateCommentEntity();
        extDelegateCommentEntity.setTaskId(task.getId());
        extDelegateCommentEntity.setEventType("TASK_ASSIGNEE");
        Integer count = extDelegateCommentService.count(extDelegateCommentEntity);
        return count > 0? true: false;
    }

}
