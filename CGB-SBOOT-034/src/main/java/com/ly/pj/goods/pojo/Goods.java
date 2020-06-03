package com.ly.pj.goods.pojo;

public class Goods {
private Integer id;
private String  name;
private String remark;
private String createTime;
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
public String getCreateTime() {
	return createTime;
}
public void setCreateTime(String createTime) {
	this.createTime = createTime;
}
@Override
public String toString() {
	return "Goods [id=" + id + ", name=" + name + ", remark=" + remark + ", createTime=" + createTime + "]";
}
public Goods(Integer id, String name, String remark, String createTime) {
	super();
	this.id = id;
	this.name = name;
	this.remark = remark;
	this.createTime = createTime;
}
public Goods()
{
	
}
}
