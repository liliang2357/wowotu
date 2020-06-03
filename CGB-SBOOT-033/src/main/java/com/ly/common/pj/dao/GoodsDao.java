package com.ly.common.pj.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.ly.common.pojo.door;

@Mapper
public interface GoodsDao {
	
	   @Delete("delete from tb_goods where id= #{id}")
	int deletebyid1(int id);
	@Select("select id,name,remark,createdTime from tb_goods")
     List<door> findbyid();
	
  // int deletebyid(@Param ("ids") int...ids);
	@Insert("insert into tb_goods value(#{id},#{name},#{remark},#{createdTime})")
	void insertbyid(door door);
	
}
