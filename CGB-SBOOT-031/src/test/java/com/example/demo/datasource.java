package com.example.demo;

import java.lang.reflect.Field;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class datasource {

	@Autowired
	private DataSource datasource;
	@Test
	public void datasourcetest()
	{
		try {
              System.out.println(datasource.getClass().getName());
			System.out.println(datasource.getConnection());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//HikariDataSource
		}
	}
}
