package com.ceying.chx.cpi.base.rm.base.dao;

import com.ceying.chx.cpi.base.rm.base.dto.MemberPlayLog;
import com.ceying.chx.cpi.base.rm.base.dto.MemberPlayLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MemberPlayLogMapper {
    long countByExample(MemberPlayLogExample example);

    int deleteByExample(MemberPlayLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(MemberPlayLog record);

    int insertSelective(MemberPlayLog record);

    List<MemberPlayLog> selectByExampleWithBLOBs(MemberPlayLogExample example);

    List<MemberPlayLog> selectByExample(MemberPlayLogExample example);

    MemberPlayLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") MemberPlayLog record, @Param("example") MemberPlayLogExample example);

    int updateByExampleWithBLOBs(@Param("record") MemberPlayLog record, @Param("example") MemberPlayLogExample example);

    int updateByExample(@Param("record") MemberPlayLog record, @Param("example") MemberPlayLogExample example);

    int updateByPrimaryKeySelective(MemberPlayLog record);

    int updateByPrimaryKeyWithBLOBs(MemberPlayLog record);

    int updateByPrimaryKey(MemberPlayLog record);
}