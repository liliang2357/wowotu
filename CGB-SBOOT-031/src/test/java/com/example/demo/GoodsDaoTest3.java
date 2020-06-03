package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class GoodsDaoTest3 {
 @Autowired
private  GoodsDao goodsdao;
	
	@Test
	public void testgoodsDaoTest3()
	{
		
		int id = goodsdao.DeleteById(4);
		System.out.println(id);
		System.out.println(goodsdao);
	}
 
}
