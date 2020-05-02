package com.ceying.chx.cpi.base.rm.base.dao;

import com.ceying.chx.cpi.base.rm.base.dto.ContentGreen;
import com.ceying.chx.cpi.base.rm.base.dto.ContentGreenExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContentGreenMapper {
    long countByExample(ContentGreenExample example);

    int deleteByExample(ContentGreenExample example);

    int deleteByPrimaryKey(String id);

    int insert(ContentGreen record);

    int insertSelective(ContentGreen record);

    List<ContentGreen> selectByExample(ContentGreenExample example);

    ContentGreen selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") ContentGreen record, @Param("example") ContentGreenExample example);

    int updateByExample(@Param("record") ContentGreen record, @Param("example") ContentGreenExample example);

    int updateByPrimaryKeySelective(ContentGreen record);

    int updateByPrimaryKey(ContentGreen record);
}