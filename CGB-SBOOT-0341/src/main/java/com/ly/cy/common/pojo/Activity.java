package com.ly.cy.common.pojo;

import java.util.Date;

public class Activity {
private Integer  id;
private String  title;
private String  category;
private  Date   startTime;
private  Date    endTime;
private  String  remark;
private  Integer  state;
private  Date    createdTime;
private  String  createdUser;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getCategory() {
	return category;
}
public void setCategory(String categeory) {
	this.category = categeory;
}
public Date getStartTime() {
	return startTime;
}
public void setStartTime(Date startTime) {
	this.startTime = startTime;
}
public Date getEndTime() {
	return endTime;
}
public void setEndTime(Date endTime) {
	this.endTime = endTime;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public Integer getState() {
	return state;
}
public void setState(Integer state) {
	this.state = state;
}
public Date getCreatedTime() {
	return createdTime;
}
public void setCreatedTime(Date createdTime) {
	this.createdTime = createdTime;
}
public String getCreatedUser() {
	return createdUser;
}
public void setCreatedUser(String createdUser) {
	this.createdUser = createdUser;
}
@Override
public String toString() {
	return "Activity [id=" + id + ", title=" + title + ", category=" + category + ", startTime=" + startTime
			+ ", endTime=" + endTime + ", remark=" + remark + ", state=" + state + ", createdTime=" + createdTime
			+ ", createdUser=" + createdUser + "]";
}
public Activity(Integer id, String title, String categeory, Date startTime, Date endTime, String remark, Integer state,
		Date createdTime, String createdUser) {
	super();
	this.id = id;
	this.title = title;
	this.category = categeory;
	this.startTime = startTime;
	this.endTime = endTime;
	this.remark = remark;
	this.state = state;
	this.createdTime = createdTime;
	this.createdUser = createdUser;
}
public Activity()
{
	
}
	
	
}
