package com.selffun.suite.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.selffun.suite.model.AddTreeInfo;
import com.selffun.suite.model.TreeInfo;
import com.selffun.suite.service.ITestService;
import com.selffun.suite.utils.CreateIDKey;
import com.selffun.suite.utils.JsonUtil;
import com.selffun.suite.utils.ReturnJson;
import com.selffun.suite.utils.TypeToInt;

@Controller
public class TestController {
	@Autowired
	private ITestService iTestService;
	//前台页面
	@RequestMapping(value="/testBasicTree",method = RequestMethod.GET)
	public String treeBasic() {
		return "/view/test/TestFile";  
	}
	//初始化树   
	@RequestMapping(value="getTreeData.do",method=RequestMethod.GET,produces="application/json; charset=utf-8")
	@ResponseBody
	public String getTreeData(TreeInfo treeInfo){
		List<TreeInfo> treeList = new ArrayList<TreeInfo>();
		Map<String,Integer> map = new HashMap<String,Integer>();
		int id = treeInfo.getId();
		String operName=treeInfo.getOperation();
		map.put("id", id);
		int initial = treeInfo.getInitial();
		if(initial == 1){
			treeList = iTestService.initialTreeData(map);
		}else{
			treeList = iTestService.getTreeData(map);
		}
		String reJson="";
		reJson = JsonUtil.listToJson(treeList);
		return reJson;
	}
	//增加树的节点
	@RequestMapping(value="addTreeData.do",method=RequestMethod.POST,produces="application/json; charset=utf-8")
	@ResponseBody
	public String addTreeData(AddTreeInfo treeInfo){
		Map<String,String> map = new HashMap<String,String>();
		int id = treeInfo.getId();//父节点的id
		int positon = treeInfo.getPos();//节点顺序
		String title = treeInfo.getTitle();//节点名称
		String types = treeInfo.getType();//获取节点类型
		String type = "";//节点类型
		if(types.equals("folder")){
			type="1";
		}else{
			type="0";
		}
		String operName="";
		operName=treeInfo.getOprn();
		CreateIDKey cidk = new CreateIDKey();
		String createID = cidk.createIdKey();
		map.put("node_id", createID);
		map.put("parent_id", String.valueOf(id));
		map.put("positon", String.valueOf(positon));
		map.put("title", title);
		map.put("type", type);
		int returnID=0;
		returnID = iTestService.addTreeData(map);
		String reJson="";
		reJson = ReturnJson.reJson((int)Integer.parseInt(createID));
		return reJson;
	}
	//修改树的节点   
	@RequestMapping(value="modifyTreeData.do",method=RequestMethod.POST,produces="application/json; charset=utf-8")
	@ResponseBody
	public String modifyTreeData(TreeInfo treeInfo){
		Map<String,String> map = new HashMap<String,String>();
		int id = treeInfo.getId();//节点id
		String operName=treeInfo.getOperation();
		String title = treeInfo.getTitle();
		map.put("node_id", String.valueOf(id));
		map.put("title", title);
		int status=0;
		status = iTestService.modifyTreeData(map);
		String reJson="";
		reJson = ReturnJson.integerToJson(status);
		return reJson;
	}
	//删除树的节点   
	@RequestMapping(value="deleteTreeData.do",method=RequestMethod.POST,produces="application/json; charset=utf-8")
	@ResponseBody
	public String deleteTreeData(TreeInfo treeInfo){
		List<TreeInfo> treeList = new ArrayList<TreeInfo>();
		List<TreeInfo> treeListPosi = new ArrayList<TreeInfo>();
		Map<String,String> map = new HashMap<String,String>();
		Map<String,Integer> mapPosi = new HashMap<String,Integer>();
		Map<String,Integer> mapMod = new HashMap<String,Integer>();
		int id = treeInfo.getId();//节点id
		String operName=treeInfo.getOperation();
		map.put("node_id", String.valueOf(id));
		treeList = iTestService.findTreeDataByNodeID(map);//查询删除记录的parentid值
		int parentID=treeList.get(0).getParent_id();
		mapPosi.put("parent_id", parentID);
		treeListPosi = iTestService.findTreeDataByParentID(mapPosi);//根据parentid查询此目录下有多少条记录
		int status=0;
		status = iTestService.deleteTreeData(map);//删除记录
		for(int i=0;i<treeListPosi.size();i++){
			int nodeIDs = treeListPosi.get(i).getNode_id();
			int positions = treeListPosi.get(i).getPositon();
			mapMod.put("node_id", nodeIDs);
			mapMod.put("positon", positions-1);
			iTestService.updateTreeDataOfPosition(mapMod);//删除成功后更新所有position字段
		}
		
		String reJson="";
		reJson = ReturnJson.integerToJson(status);
		return reJson;
	}
}
