package com.withmountain.again18.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.withmountain.again18.domain.TestDTO;

@SpringBootTest
public class TestMapperTest {
	
	@Autowired
	private TestMapper mapper;
	
	@Test
	public void testOfSelectTestList() {
		List<TestDTO> testList = mapper.selectTestList();
		
		System.out.println(testList.get(0).toString());
	}

}
