package com.selffun.suite.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.selffun.suite.dao.ITestMapper;
import com.selffun.suite.model.TreeInfo;
import com.selffun.suite.service.ITestService;

//使用Service注解 不需要再在配置文件中配置bean
@Service
public class TestServiceImpl implements ITestService{
	@Autowired
	private ITestMapper iTestMapper;

	public List<TreeInfo> getTreeData(Map<String,Integer> map) {
		// TODO Auto-generated method stub
		return iTestMapper.getTreeData(map);
	}

	public Integer addTreeData(Map<String, String> map) {
		// TODO Auto-generated method stub
		return iTestMapper.addTreeData(map);
	}

	public Integer modifyTreeData(Map<String, String> map) {
		// TODO Auto-generated method stub
		return iTestMapper.modifyTreeData(map);
	}

	public Integer deleteTreeData(Map<String, String> map) {
		// TODO Auto-generated method stub
		return iTestMapper.deleteTreeData(map);
	}

	public Integer updateTreeDataOfPosition(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return iTestMapper.updateTreeDataOfPosition(map);
	}

	public List<TreeInfo> findTreeDataByNodeID(Map<String, String> map) {
		// TODO Auto-generated method stub
		return iTestMapper.findTreeDataByNodeID(map);
	}

	public List<TreeInfo> findTreeDataByParentID(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return iTestMapper.findTreeDataByParentID(map);
	}

	@Override
	public List<TreeInfo> initialTreeData(Map<String, Integer> map) {
		// TODO Auto-generated method stub
		return iTestMapper.initialTreeData(map);
	}

}
