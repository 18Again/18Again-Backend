package com.withmountain.again18.mapper;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.withmountain.again18.domain.DistanceDTO;

@SpringBootTest
public class DistanceMapperTest {
	
	@Autowired
	private DistanceMapper mapper;
	
	@Test
	void getDistanceListByUserIdTest() {
		List<DistanceDTO> distances = mapper.getDistanceListByUserId(1);
		
		System.out.println(distances.size());
	}
	
	@Test
	void testOfInsertDistance() {
		DistanceDTO distance = new DistanceDTO();
		distance.setUserId1((long) 1);
		distance.setUserId2((long) 60);
		distance.setDistance(2.25);
		
		System.out.println(mapper.insertDistance(distance));
	}
}
