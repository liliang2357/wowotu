package com.ly.common.pj;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
public class DateSourcetest {

	@Autowired 
	DataSource datasource;
	
	@Test
	public void test()
	{
		try {
			System.out.println(datasource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
