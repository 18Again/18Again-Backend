package com.withmountain.again18.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.withmountain.again18.domain.BoardUserDTO;

@SpringBootTest
public class BoardUserMapperTest {
	
	@Autowired
	private BoardUserMapper mapper;

	@Test
	void testOfSelectBoardJoinUser() {
		List<BoardUserDTO> results = mapper.selectBoardJoinUser(1);
		
		System.out.println(results.get(0).toString());
	}
}
