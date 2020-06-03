package com.ly.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ly.cy.common.pojo.Activity;
import com.ly.cy.common.service.serviceActive1;
@SpringBootTest
public class testfind {

	@Autowired 
	private serviceActive1 sa;
	@Test
	public void testfind()
	{  
		List<Activity> list = sa.selectactivity();
		System.out.println(list);
		for (Activity activity : list) {
			System.out.println(activity);
			
		}
	}
}
