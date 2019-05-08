package com.ceying.flowable.modeler.extention.task.service.impl;

import com.ceying.common.util.bean.SpringUtil;
import com.ceying.common.util.sequence.SequenceUtil;
import com.ceying.flowable.modeler.app.task.model.ResultListGridDataEntity;
import com.ceying.flowable.modeler.extention.task.dao.ExtDelegateDao;
import com.ceying.flowable.modeler.extention.task.dao.ExtDelegateDetailDao;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateDetailEntity;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateEntity;
import com.ceying.flowable.modeler.extention.task.query.ProcessDefinitionQuery;
import com.ceying.flowable.modeler.extention.task.service.ExtDelegateDetailService;
import com.ceying.flowable.modeler.extention.task.vo.ProcessDefinitionVO;
import org.flowable.engine.ManagementService;
import org.flowable.engine.common.impl.cmd.CustomSqlExecution;
import org.flowable.engine.impl.cmd.AbstractCustomSqlExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @author: fej
 * @date: 2018/5/28
 * @description :
 * @version: 2.0
 */
@Service
@Transactional
public class ExtDelegateDetailServiceImpl implements ExtDelegateDetailService {

    @Override
    public Integer insert(ExtDelegateDetailEntity extDelegateDetailEntity) {
        extDelegateDetailEntity.setId(SequenceUtil.UUID());
        CustomSqlExecution<ExtDelegateDetailDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDetailDao, Integer>(ExtDelegateDetailDao.class) {
                public Integer execute(ExtDelegateDetailDao customMapper) {
                    return customMapper.insert(extDelegateDetailEntity);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public void insert(String[] processKey, String delegateId) {
        if(processKey != null){
            for(String key : processKey){
                ExtDelegateDetailEntity extDelegateDetailEntity = new ExtDelegateDetailEntity();
                extDelegateDetailEntity.setProcessKey(key);
                extDelegateDetailEntity.setDelegateId(delegateId);
                this.insert(extDelegateDetailEntity);
            }
        }
    }

    @Override
    public Integer update(ExtDelegateDetailEntity extDelegateDetailEntity) {
        CustomSqlExecution<ExtDelegateDetailDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDetailDao, Integer>(ExtDelegateDetailDao.class) {
                public Integer execute(ExtDelegateDetailDao customMapper) {
                    return customMapper.insert(extDelegateDetailEntity);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public Integer delete(String[] ids) {
        CustomSqlExecution<ExtDelegateDetailDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDetailDao, Integer>(ExtDelegateDetailDao.class) {
                public Integer execute(ExtDelegateDetailDao customMapper) {
                    return customMapper.delete(ids);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public Integer deleteByDelegateId(String[] ids) {
        CustomSqlExecution<ExtDelegateDetailDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDetailDao, Integer>(ExtDelegateDetailDao.class) {
                public Integer execute(ExtDelegateDetailDao customMapper) {
                    return customMapper.deleteByDelegateId(ids);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public Long count(ExtDelegateDetailEntity extDelegateDetailEntity) {
        CustomSqlExecution<ExtDelegateDetailDao, Long> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDetailDao, Long>(ExtDelegateDetailDao.class) {
                public Long execute(ExtDelegateDetailDao customMapper) {
                    return customMapper.count(extDelegateDetailEntity);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public ResultListGridDataEntity listExtDelegateDetail(ExtDelegateDetailEntity extDelegateDetailEntity) {
        final Integer page = extDelegateDetailEntity.getPage();
        if(extDelegateDetailEntity.getPage() != null && extDelegateDetailEntity.getRows() != null){
            extDelegateDetailEntity.setPage((extDelegateDetailEntity.getPage() - 1) * extDelegateDetailEntity.getRows());
        }
        CustomSqlExecution<ExtDelegateDetailDao, List<ExtDelegateDetailEntity>> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDetailDao, List<ExtDelegateDetailEntity>>(ExtDelegateDetailDao.class) {
                public List<ExtDelegateDetailEntity> execute(ExtDelegateDetailDao customMapper) {
                    return customMapper.listExtDelegateDetail(extDelegateDetailEntity);
                }
            };
        List<ExtDelegateDetailEntity> result = SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
        ResultListGridDataEntity gridDataEntity = new ResultListGridDataEntity();
        gridDataEntity.setPage(page);
        gridDataEntity.setTotal(this.count(extDelegateDetailEntity));
        gridDataEntity.setRows(result);
        return gridDataEntity;
    }

    @Override
    public ResultListGridDataEntity listExtDelegateDetailAndKeyName(ExtDelegateDetailEntity extDelegateDetailEntity) {
        final Integer page = extDelegateDetailEntity.getPage();
        if(extDelegateDetailEntity.getPage() != null && extDelegateDetailEntity.getRows() != null){
            extDelegateDetailEntity.setPage((extDelegateDetailEntity.getPage() - 1) * extDelegateDetailEntity.getRows());
        }
        CustomSqlExecution<ExtDelegateDetailDao, List<ExtDelegateDetailEntity>> customSqlExecution =
                new AbstractCustomSqlExecution<ExtDelegateDetailDao, List<ExtDelegateDetailEntity>>(ExtDelegateDetailDao.class) {
                    public List<ExtDelegateDetailEntity> execute(ExtDelegateDetailDao customMapper) {
                        return customMapper.listExtDelegateDetailAndKeyName(extDelegateDetailEntity);
                    }
                };
        List<ExtDelegateDetailEntity> result = SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
        ResultListGridDataEntity gridDataEntity = new ResultListGridDataEntity();
        gridDataEntity.setPage(page);
        gridDataEntity.setTotal(this.count(extDelegateDetailEntity));
        gridDataEntity.setRows(result);
        return gridDataEntity;
    }

    @Override
    public ExtDelegateDetailEntity getExtDelegateDetail(String id) {
        CustomSqlExecution<ExtDelegateDetailDao, ExtDelegateDetailEntity> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDetailDao, ExtDelegateDetailEntity>(ExtDelegateDetailDao.class) {
                public ExtDelegateDetailEntity execute(ExtDelegateDetailDao customMapper) {
                    return customMapper.getExtDelegateDetail(id);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public ResultListGridDataEntity listUnSavedProcessDefinition(ProcessDefinitionVO processDefinitionVO) {
        final Integer page = processDefinitionVO.getPage();
        if(processDefinitionVO.getPage() != null && processDefinitionVO.getRows() != null){
            processDefinitionVO.setPage((processDefinitionVO.getPage() - 1) * processDefinitionVO.getRows());
        }
        CustomSqlExecution<ExtDelegateDetailDao, List<ProcessDefinitionQuery>> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDetailDao, List<ProcessDefinitionQuery>>(ExtDelegateDetailDao.class) {
                public List<ProcessDefinitionQuery> execute(ExtDelegateDetailDao customMapper) {
                    return customMapper.listUnSavedProcessDefinition(processDefinitionVO);
                }
            };
        List<ProcessDefinitionQuery> result = SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
        ResultListGridDataEntity gridDataEntity = new ResultListGridDataEntity();
        gridDataEntity.setPage(page);
        gridDataEntity.setTotal(this.countUnSavedProcessDefinition(processDefinitionVO));
        gridDataEntity.setRows(result);
        return gridDataEntity;
    }

    @Override
    public Long countUnSavedProcessDefinition(ProcessDefinitionVO processDefinitionVO) {
        CustomSqlExecution<ExtDelegateDetailDao, Long> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDetailDao, Long>(ExtDelegateDetailDao.class) {
                public Long execute(ExtDelegateDetailDao customMapper) {
                    return customMapper.countUnSavedProcessDefinition(processDefinitionVO);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }
}
