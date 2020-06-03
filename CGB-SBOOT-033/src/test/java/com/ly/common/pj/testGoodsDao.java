package com.ly.common.pj;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;

import com.ly.common.pj.dao.GoodsDao;
import com.ly.common.pojo.door;
import com.ly.common.service.GoodsService;
@SpringBootTest
public class testGoodsDao {
@Autowired
private GoodsDao ds;
@Autowired
 private GoodsService gd;
@Test

  void deletebyid1()
 {
	//int de=ds.deletebyid1();
	//System.out.println("影响的行数为"+de+"行");
	//System.out.println( ds.deletebyid(3,4,5));
	int de=gd.deletebyid1(1);
	System.out.println(de);
	door door=new door(10,"liliang","sg","2019-10-11");
	gd.insertbyid(door);
 }  
}
