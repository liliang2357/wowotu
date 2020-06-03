package com.cy.pj.common.cache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.cy.pj.common.DefaultCache;

@SpringBootTest
public class DefaultCacheTests {
//	@Autowired
//	private DefaultCache defaultCache;
	@Autowired
	private ApplicationContext ApplicationContext;
//	@Test
//	public void testcache()
//	{
//		System.out.println(defaultCache);
//	}
	@Test
	public void tg()
	{
		DefaultCache bean = (DefaultCache) ApplicationContext.getBean("defaultCache");
		System.out.println(bean);
	}

}
