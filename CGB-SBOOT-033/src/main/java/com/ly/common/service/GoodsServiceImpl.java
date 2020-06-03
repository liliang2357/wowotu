package com.ly.common.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ly.common.pj.dao.GoodsDao;
import com.ly.common.pojo.door;
@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsDao goodsDao;

	@Override
	public List<door> selectbyid() {
		// TODO Auto-generated method stub
		List<door> findbyid = goodsDao.findbyid();
		System.out.println(findbyid);
		return findbyid;
	}

	@Override
	public int deletebyid1(Integer id) {
		// TODO Auto-generated method stub
     	return goodsDao.deletebyid1(id);
	}

	@Override
	public void insertbyid(door door) {
		// TODO Auto-generated method stub
		goodsDao.insertbyid(door);
	}

	
	
	
	



}
