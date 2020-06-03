package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.common.DefaultCache;

@SpringBootTest
class Demo1ApplicationTests {
@Autowired
private DefaultCache defaultcache;
	@Test
	public void contextLoads() {
	System.out.println(defaultcache);
	}

}
