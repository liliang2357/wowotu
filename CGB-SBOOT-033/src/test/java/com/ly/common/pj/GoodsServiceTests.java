package com.ly.common.pj;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ly.common.pojo.door;
import com.ly.common.service.GoodsService;
import com.ly.common.service.GoodsServiceImpl;
@SpringBootTest
public class GoodsServiceTests {

	@Autowired
	private GoodsServiceImpl gods;
	
	@Test
	public void GoodsService()
	{
		System.out.println(gods);
		List<door> selectbyid = gods.selectbyid();
		
		for (door door : selectbyid) {
			System.out.println(door);
		}
	}
}
