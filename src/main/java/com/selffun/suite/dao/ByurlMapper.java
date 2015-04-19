package com.selffun.suite.dao;

import com.selffun.suite.pojo.Byurl;
import com.selffun.suite.pojo.ByurlExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ByurlMapper {
    int countByExample(ByurlExample example);

    int deleteByExample(ByurlExample example);

    List<Byurl> selectByExample(ByurlExample example);

    int updateByExampleSelective(@Param("record") Byurl record, @Param("example") ByurlExample example);

    int updateByExample(@Param("record") Byurl record, @Param("example") ByurlExample example);

    List<Byurl> selectByExampleAndPage(ByurlExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Long id);

    int insert(Byurl record);

    int insertSelective(Byurl record);

    Byurl selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Byurl record);

    int updateByPrimaryKey(Byurl record);
}