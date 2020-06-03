package com.ly.common.pojo;

import java.io.Serializable;
import java.util.Date;

public class door implements Serializable{
private Integer id;
private String name;
private String remark;
private String createdTime;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}

public String getCreatedTime() {
	return createdTime;
}
public void setCreatedTime(String createdTime) {
	this.createdTime = createdTime;
}
@Override
public String toString() {
	return "door [id=" + id + ", name=" + name + ", remark=" + remark + ", createdTime=" + createdTime + "]";
}
public door()
{
	
}
public door(Integer id, String name, String remark, String createdTime) {
	super();
	this.id = id;
	this.name = name;
	this.remark = remark;
	this.createdTime = createdTime;
}
	
	
	
}
