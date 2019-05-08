package com.ceying.eagleeye.consumer.service;

import com.ceying.common.base.CypRowSet;
import com.ceying.eagleeye.consumer.entity.PropertiesEntity;
import com.ceying.eagleeye.consumer.vo.PropertiesVo;

/**
 * 功能说明: <br>
 * 系统版本: 2.0 <br>
 * 开发人员: huanghaiyun
 * 开发时间: 2018/4/20<br>
 * <br>
 */
public interface PropertiesServcie {
    CypRowSet<PropertiesEntity> list(PropertiesVo vo);

    void save(PropertiesEntity entity) throws Exception;

    void remove(PropertiesVo vo);

    void edit(PropertiesEntity entity) throws Exception;
}
