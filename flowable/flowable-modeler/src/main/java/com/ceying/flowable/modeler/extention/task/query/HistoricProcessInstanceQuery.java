package com.ceying.flowable.modeler.extention.task.query;

import com.ceying.common.constant.CacheKeyConstant;
import com.ceying.common.util.annotation.CacheConver;
import org.flowable.engine.impl.persistence.entity.HistoricProcessInstanceEntityImpl;

/**
 * @author: fej
 * @date: 2018/5/23
 * @description :
 * @version: 2.0
 */
public class HistoricProcessInstanceQuery extends HistoricProcessInstanceEntityImpl {

    private String startUserId;
}
