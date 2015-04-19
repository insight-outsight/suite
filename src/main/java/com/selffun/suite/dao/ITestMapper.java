package com.selffun.suite.dao;

import java.util.List;
import java.util.Map;

import com.selffun.suite.model.TreeInfo;

public interface ITestMapper {
	public List<TreeInfo> getTreeData(Map<String,Integer> map);
	public Integer addTreeData(Map<String,String> map);
	public Integer modifyTreeData(Map<String,String> map);
	public Integer deleteTreeData(Map<String,String> map);
	public Integer updateTreeDataOfPosition(Map<String,Integer> map);
	public List<TreeInfo> findTreeDataByNodeID(Map<String,String> map);
	public List<TreeInfo> findTreeDataByParentID(Map<String,Integer> map);
	public List<TreeInfo> initialTreeData(Map<String,Integer> map);
}
