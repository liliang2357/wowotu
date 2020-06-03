package com.ly.cy.comm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.ly.pj.goods.pojo.Goods;

@Mapper
public interface GoodsDao {
     @Select("select * from tb_goods")
	List<Goods> selectbyid();
}
