package com.withmountain.again18.util;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DistanceCalculationTest {
	private DistanceCalculation distanceCalculation = new DistanceCalculation();
	
	@Test
	void calculateBinaryDataTest() {
		HashMap<String, Integer> master = new HashMap<String, Integer>();
		master.put("friendship", 0);
		master.put("climbingMate", 0);
		
		HashMap<String, Integer> other = new HashMap<String, Integer>();
		other.put("friendship", 1);
		other.put("climbingMate", 1);
		
		assertEquals(4.0, distanceCalculation.calculateBinaryData(master, other)); 
	}
	
	@Test
	void calculateOrdinalData() {
//		double exercise = Math.abs(master.get("exercise")-other.get("exercise"));	//운동능력	
//		double difficulty = Math.abs(master.get("difficulty")-other.get("difficulty"))*2;	//난이도
//		double climbingLevel = Math.abs(master.get("climbingLevel")-other.get("climbingLevel"))*3;	//등산수준
//		double frequency = Math.abs(master.get("frequency")-other.get("frequency"))*3;	//등산빈도
		HashMap<String, Double> master = new HashMap<String, Double>();
		master.put("exercise", 0.25);
		master.put("difficulty", 0.25);
		master.put("climbingLevel", 0.33);
		master.put("frequency", 0.0);
		
		HashMap<String, Double> other = new HashMap<String, Double>();
		other.put("exercise", 0.5);
		other.put("difficulty", 0.5);
		other.put("climbingLevel", 0.66);
		other.put("frequency", 0.5);
		
		System.out.println(distanceCalculation.calculateOrdinalData(master, other));
	}

}
