package com.selffun.suite.dao;

import com.selffun.suite.pojo.Bysecond;
import com.selffun.suite.pojo.BysecondExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface BysecondMapper {
    int countByExample(BysecondExample example);

    int deleteByExample(BysecondExample example);

    List<Bysecond> selectByExample(BysecondExample example);

    int updateByExampleSelective(@Param("record") Bysecond record, @Param("example") BysecondExample example);

    int updateByExample(@Param("record") Bysecond record, @Param("example") BysecondExample example);

    List<Bysecond> selectByExampleAndPage(BysecondExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Long id);

    int insert(Bysecond record);

    int insertSelective(Bysecond record);

    Bysecond selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bysecond record);

    int updateByPrimaryKey(Bysecond record);
}