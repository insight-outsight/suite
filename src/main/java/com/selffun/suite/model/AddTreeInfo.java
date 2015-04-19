package com.selffun.suite.model;

public class AddTreeInfo {
	
	private Integer id;
	private Integer node_id;
	private Integer parent_id;
	private Integer pos;
	private String title;
	private String type;
	private String oprn;
	private String state;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNode_id() {
		return node_id;
	}
	public void setNode_id(Integer node_id) {
		this.node_id = node_id;
	}
	public Integer getParent_id() {
		return parent_id;
	}
	public void setParent_id(Integer parent_id) {
		this.parent_id = parent_id;
	}
	public Integer getPos() {
		return pos;
	}
	public void setPos(Integer pos) {
		this.pos = pos;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOprn() {
		return oprn;
	}
	public void setOprn(String oprn) {
		this.oprn = oprn;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

}