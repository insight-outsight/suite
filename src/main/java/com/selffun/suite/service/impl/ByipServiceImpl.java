package com.selffun.suite.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Service;

import com.selffun.suite.dao.ByipMapper;
import com.selffun.suite.pojo.Byip;
import com.selffun.suite.pojo.ByipExample;
import com.selffun.suite.service.ByipService;

@Service
public class ByipServiceImpl implements ByipService {

	@Resource
	ByipMapper byipMapper;
	
	@Override
	public int countByExample(ByipExample example) {	
		return byipMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(ByipExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Byip> selectByExample(ByipExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByExampleSelective(Byip record, ByipExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExample(Byip record, ByipExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Byip> selectByExampleAndPage(ByipExample example,
			RowBounds rowBound) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Byip record) {
		return byipMapper.insert(record);
	}

	@Override
	public int insertSelective(Byip record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Byip selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Byip record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Byip record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
