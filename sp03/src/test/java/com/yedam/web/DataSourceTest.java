package com.yedam.web;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/datasource-context.xml")
// @RequiredArgsConstructor
public class DataSourceTest {
	
	// 필드 주입
	// @Autowired
	// DataSource dataSource; // Connection Pool
	
	// setter메서드 주입
	@Setter(onMethod_= {@Autowired})
	DataSource dataSource; // Connection Pool
	
	// 생성자 주입 @RequiredArgsConstructor 사용 final 사용
	// final DataSource dataSource; // Connection Pool
	
	@Test
	public void 데이터소스연결() {
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			System.out.println(conn);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
