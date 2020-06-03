package com.ly.cy.common.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ly.cy.common.pojo.Activity;
@Mapper
public interface activityDao {

	@Select("select * from tb_activity")
	List<Activity> selectfind();
	@Delete("delete from tb_activity where id=#{id}")
	int deletefind(Integer i);
}
