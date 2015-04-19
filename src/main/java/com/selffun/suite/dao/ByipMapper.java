package com.selffun.suite.dao;

import com.selffun.suite.pojo.Byip;
import com.selffun.suite.pojo.ByipExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ByipMapper {
    int countByExample(ByipExample example);

    int deleteByExample(ByipExample example);

    List<Byip> selectByExample(ByipExample example);

    int updateByExampleSelective(@Param("record") Byip record, @Param("example") ByipExample example);

    int updateByExample(@Param("record") Byip record, @Param("example") ByipExample example);

    List<Byip> selectByExampleAndPage(ByipExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Long id);

    int insert(Byip record);

    int insertSelective(Byip record);

    Byip selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Byip record);

    int updateByPrimaryKey(Byip record);
}