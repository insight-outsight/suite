package com.selffun.suite.service;

import java.util.List;
import java.util.Map;

import com.selffun.suite.model.TreeInfo;

public interface ITestService {

	//树的内容
	public List<TreeInfo> getTreeData(Map<String,Integer> map);
	//增加树的节点
	public Integer addTreeData(Map<String,String> map);
	//修改树的节点
	public Integer modifyTreeData(Map<String,String> map);
	//删除树的节点
	public Integer deleteTreeData(Map<String,String> map);
	//更新positon字段值
	public Integer updateTreeDataOfPosition(Map<String,Integer> map);
	//查询更新list记录
	public List<TreeInfo> findTreeDataByNodeID(Map<String,String> map);
	public List<TreeInfo> findTreeDataByParentID(Map<String,Integer> map);
	public List<TreeInfo> initialTreeData(Map<String,Integer> map);
}
