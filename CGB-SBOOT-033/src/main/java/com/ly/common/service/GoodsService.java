package com.ly.common.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ly.common.pojo.door;

public interface GoodsService {

	List<door> selectbyid();
	int deletebyid1(Integer id);
	void insertbyid(door door);
}
