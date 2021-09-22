package com.withmountain.again18;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class WithMountainApplicationTests {

	@Autowired
	private ApplicationContext context;
	@Autowired
	private SqlSessionTemplate sessionFactory;
	
	@Test
	void contextLoads() {
	}
	
	@Test
	public void testByApplicationContext() {
		try {
			System.out.println("====================================================");
			System.out.println(context.getBean("sqlSessionFactory"));
			System.out.println("====================================================");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testBySqlSessionFactory() {
		try {
			System.out.println("====================================================");
			System.out.println(sessionFactory.toString());
			System.out.println("====================================================");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
