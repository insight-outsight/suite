package com.selffun.suite.service;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.selffun.suite.pojo.Byip;
import com.selffun.suite.pojo.ByipExample;

public interface ByipService {

    int countByExample(ByipExample example);

    int deleteByExample(ByipExample example);

    List<Byip> selectByExample(ByipExample example);

    int updateByExampleSelective(Byip record, ByipExample example);

    int updateByExample(Byip record, ByipExample example);

    List<Byip> selectByExampleAndPage(ByipExample example, RowBounds rowBound);

    int deleteByPrimaryKey(Long id);

    int insert(Byip record);

    int insertSelective(Byip record);

    Byip selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Byip record);

    int updateByPrimaryKey(Byip record);
    
}
