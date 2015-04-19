package com.selffun.suite.model;

public class TreeInfo {
	
	private Integer id;
	private Integer node_id;
	private Integer parent_id;
	private Integer positon;
	private String title;
	private Integer type;
	private String operation;
	private String state;
	private String attr;
	private Integer initial;
	
	public Integer getInitial() {
		return initial;
	}
	public void setInitial(Integer initial) {
		this.initial = initial;
	}
	public String getAttr() {
		return attr;
	}
	public void setAttr(String attr) {
		this.attr = attr;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
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
	public Integer getPositon() {
		return positon;
	}
	public void setPositon(Integer positon) {
		this.positon = positon;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getOperation() {
		return operation;
	}
	public void setOperation(String operation) {
		this.operation = operation;
	}

}
