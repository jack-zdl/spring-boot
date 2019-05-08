package com.ceying.flowable.modeler.extention.task.service.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ceying.common.constant.CacheKeyConstant;
import com.ceying.common.feign.SysBaseDataCacheFeignClient;
import com.ceying.common.util.bean.SpringUtil;
import com.ceying.common.util.sequence.SequenceUtil;
import com.ceying.flowable.modeler.app.modeler.security.SecurityUtils;
import com.ceying.flowable.modeler.app.task.model.ResultListGridDataEntity;
import com.ceying.flowable.modeler.extention.task.dao.ExtDelegateDao;
import com.ceying.flowable.modeler.extention.task.entity.ExtDelegateEntity;
import com.ceying.flowable.modeler.extention.task.service.ExtDelegateDetailService;
import com.ceying.flowable.modeler.extention.task.service.ExtDelegateService;
import com.ceying.flowable.modeler.extention.task.vo.ExtDelegateVO;
import org.flowable.engine.ManagementService;
import org.flowable.engine.common.impl.cmd.CustomSqlExecution;
import org.flowable.engine.impl.cmd.AbstractCustomSqlExecution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: fej
 * @date: 2018/5/28
 * @description :
 * @version: 2.0
 */
@Service
@Transactional
public class ExtDelegateServiceImpl implements ExtDelegateService {

    @Autowired
    private SysBaseDataCacheFeignClient sysBaseDataCacheFeignClient;

    @Autowired
    private ExtDelegateDetailService extDelegateDetailService;

    @Override
    public Integer insert(ExtDelegateEntity extDelegateEntity) {
        extDelegateEntity.setId(SequenceUtil.UUID());
        extDelegateEntity.setUserId(SecurityUtils.getCurrentUserId());
        CustomSqlExecution<ExtDelegateDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDao, Integer>(ExtDelegateDao.class) {
                public Integer execute(ExtDelegateDao customMapper) {
                    return customMapper.insert(extDelegateEntity);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public Integer update(ExtDelegateEntity extDelegateEntity) {
        CustomSqlExecution<ExtDelegateDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDao, Integer>(ExtDelegateDao.class) {
                public Integer execute(ExtDelegateDao customMapper) {
                    return customMapper.update(extDelegateEntity);
                }
            };
        //如果是删除委托配置，需要进行删除明细信息
        if(StringUtils.hasText(extDelegateEntity.getTaskState()) && extDelegateEntity.getTaskState().equals("3")){
            extDelegateDetailService.deleteByDelegateId(new String[]{extDelegateEntity.getId()});
        }
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public Integer batchUpdate(String[] ids, String taskState) {
        CustomSqlExecution<ExtDelegateDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDao, Integer>(ExtDelegateDao.class) {
                public Integer execute(ExtDelegateDao customMapper) {
                    return customMapper.batchUpdate(ids, taskState);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public Integer delete(String[] ids) {
        CustomSqlExecution<ExtDelegateDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDao, Integer>(ExtDelegateDao.class) {
                public Integer execute(ExtDelegateDao customMapper) {
                    return customMapper.delete(ids);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public Long count(ExtDelegateVO extDelegateVO) {
        CustomSqlExecution<ExtDelegateDao, Long> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDao, Long>(ExtDelegateDao.class) {
                public Long execute(ExtDelegateDao customMapper) {
                    return customMapper.count(extDelegateVO);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public ResultListGridDataEntity listExtDelegate(ExtDelegateVO extDelegateVO) {
        final Integer page = extDelegateVO.getPage();
        if(extDelegateVO.getPage() != null && extDelegateVO.getRows() != null){
            extDelegateVO.setPage((extDelegateVO.getPage() - 1) * extDelegateVO.getRows());
        }
        CustomSqlExecution<ExtDelegateDao, List<ExtDelegateEntity>> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDao, List<ExtDelegateEntity>>(ExtDelegateDao.class) {
                public List<ExtDelegateEntity> execute(ExtDelegateDao customMapper) {
                    return customMapper.listExtDelegate(extDelegateVO);
                }
            };
        List<ExtDelegateEntity> result = SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
        ResultListGridDataEntity gridDataEntity = new ResultListGridDataEntity();
        gridDataEntity.setPage(page);
        gridDataEntity.setTotal(this.count(extDelegateVO));
        gridDataEntity.setRows(convertIdToName(result,new String[]{"userId","delegateUserId"},new String[]{"userName","delegateUserName"}));
        return gridDataEntity;
    }

    /**
     * 翻译userId对应的userName
     * @param result
     * @param userId
     * @param userName
     * @return
     */
    private JSONArray convertIdToName(List<? extends Object> result, String[] userId, String[] userName){
        Map<String,Object> userMap = sysBaseDataCacheFeignClient.getCache(CacheKeyConstant.USERMAP);
        JSONArray jsonArray = JSONArray.parseArray(JSON.toJSONString(result, SerializerFeature.WriteDateUseDateFormat));
        for(int i=0;i<jsonArray.size();i++){
            for(int k=0;k<userId.length;k++) {
                ((JSONObject) jsonArray.get(i)).put(userName[k], userMap.get(((JSONObject) jsonArray.get(i)).get(userId[k])));
            }
        }
        return jsonArray;
    }

    @Override
    public ResultListGridDataEntity getExtDelegate(String id) {
        CustomSqlExecution<ExtDelegateDao, ExtDelegateEntity> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDao, ExtDelegateEntity>(ExtDelegateDao.class) {
                public ExtDelegateEntity execute(ExtDelegateDao customMapper) {
                    return customMapper.getExtDelegate(id);
                }
            };
        ExtDelegateEntity extDelegateEntity = SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
        ResultListGridDataEntity gridDataEntity = new ResultListGridDataEntity();
        gridDataEntity.setPage(0);
        gridDataEntity.setTotal(1L);
        List<ExtDelegateEntity> rows = new ArrayList<>();
        rows.add(extDelegateEntity);
        gridDataEntity.setRows(rows);
        return gridDataEntity;
    }

    @Override
    public List<ExtDelegateEntity> listExtDelegateAll(ExtDelegateVO extDelegateVO) {
        CustomSqlExecution<ExtDelegateDao, List<ExtDelegateEntity>> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDao, List<ExtDelegateEntity>>(ExtDelegateDao.class) {
                public List<ExtDelegateEntity> execute(ExtDelegateDao customMapper) {
                    return customMapper.listExtDelegateAll(extDelegateVO);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public List<ExtDelegateEntity> listExpireExtDelegateAll() {
        CustomSqlExecution<ExtDelegateDao, List<ExtDelegateEntity>> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDao, List<ExtDelegateEntity>>(ExtDelegateDao.class) {
                public List<ExtDelegateEntity> execute(ExtDelegateDao customMapper) {
                    return customMapper.listExpireExtDelegateAll();
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }

    @Override
    public Integer check(String userId, String delegateType, String[] processKeys) {
        CustomSqlExecution<ExtDelegateDao, Integer> customSqlExecution =
            new AbstractCustomSqlExecution<ExtDelegateDao, Integer>(ExtDelegateDao.class) {
                public Integer execute(ExtDelegateDao customMapper) {
                    return customMapper.check(userId, delegateType, processKeys);
                }
            };
        return SpringUtil.getBean(ManagementService.class).executeCustomSql(customSqlExecution);
    }
}
