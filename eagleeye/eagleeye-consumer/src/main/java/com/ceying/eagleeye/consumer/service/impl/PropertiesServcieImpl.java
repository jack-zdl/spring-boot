package com.ceying.eagleeye.consumer.service.impl;

import com.ceying.common.base.CypRowSet;
import com.ceying.common.util.sequence.SequenceUtil;
import com.ceying.eagleeye.consumer.dao.PropertiesDao;
import com.ceying.eagleeye.consumer.entity.PropertiesEntity;
import com.ceying.eagleeye.consumer.service.PropertiesServcie;
import com.ceying.eagleeye.consumer.vo.PropertiesVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/4/20<br>
 * <br>
 */
@Service
public class PropertiesServcieImpl implements PropertiesServcie {
    @Autowired
    private PropertiesDao propertiesDao;
    @Override
    public CypRowSet<PropertiesEntity> list(PropertiesVo vo) {
        CypRowSet<PropertiesEntity> cypRowSet = new CypRowSet<>();
        List<PropertiesEntity> list = propertiesDao.selectByExampleAuto(vo, PropertiesEntity.class);
        cypRowSet.setList(list);
        return cypRowSet;
    }

    @Override
    public void save(PropertiesEntity entity) throws Exception {
        entity.setUrid(SequenceUtil.UUID());
        entity.setLable("trunk");
        propertiesDao.insertSelectiveStrictly(entity);
    }

    @Override
    public void remove(PropertiesVo vo) {
        if(StringUtils.isNotBlank(vo.getIds())){
            String[] urids=vo.getIds().split(",");
            for(String urid:urids){
                propertiesDao.deleteByPrimaryKey(urid);
            }
        }
    }

    @Override
    public void edit(PropertiesEntity entity) throws Exception {
        PropertiesEntity propertiesEntity=propertiesDao.selectByPrimaryKey(entity);
        propertiesEntity.setKeyName(entity.getKeyName());
        propertiesEntity.setValueVal(entity.getValueVal());
        propertiesEntity.setProfile(entity.getProfile());
        propertiesDao.updateByPrimaryKeySelectiveStrictly(propertiesEntity);
    }
}
