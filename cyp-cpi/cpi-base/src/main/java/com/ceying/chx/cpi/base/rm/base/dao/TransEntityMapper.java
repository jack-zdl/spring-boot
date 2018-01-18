package com.ceying.chx.cpi.base.rm.base.dao;

import com.ceying.chx.cpi.base.rm.base.dto.TransEntity;
import com.ceying.chx.cpi.base.rm.base.dto.TransEntityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransEntityMapper {
    long countByExample(TransEntityExample example);

    int deleteByExample(TransEntityExample example);

    int deleteByPrimaryKey(String transCode);

    int insert(TransEntity record);

    int insertSelective(TransEntity record);

    List<TransEntity> selectByExample(TransEntityExample example);

    TransEntity selectByPrimaryKey(String transCode);

    int updateByExampleSelective(@Param("record") TransEntity record, @Param("example") TransEntityExample example);

    int updateByExample(@Param("record") TransEntity record, @Param("example") TransEntityExample example);

    int updateByPrimaryKeySelective(TransEntity record);

    int updateByPrimaryKey(TransEntity record);
}