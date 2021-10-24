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
		try {
			List<BoardUserDTO> results = mapper.selectBoardJoinUser(1);
			
			for (BoardUserDTO result:results) {
				System.out.println(result.toString());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
