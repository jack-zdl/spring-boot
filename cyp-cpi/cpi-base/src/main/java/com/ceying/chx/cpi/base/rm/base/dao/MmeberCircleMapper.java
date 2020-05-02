package com.ceying.chx.cpi.base.rm.base.dao;

import com.ceying.chx.cpi.base.rm.base.dto.MmeberCircle;
import com.ceying.chx.cpi.base.rm.base.dto.MmeberCircleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MmeberCircleMapper {
    long countByExample(MmeberCircleExample example);

    int deleteByExample(MmeberCircleExample example);

    int deleteByPrimaryKey(String id);

    int insert(MmeberCircle record);

    int insertSelective(MmeberCircle record);

    List<MmeberCircle> selectByExample(MmeberCircleExample example);

    MmeberCircle selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MmeberCircle record, @Param("example") MmeberCircleExample example);

    int updateByExample(@Param("record") MmeberCircle record, @Param("example") MmeberCircleExample example);

    int updateByPrimaryKeySelective(MmeberCircle record);

    int updateByPrimaryKey(MmeberCircle record);
}