package com.withmountain.again18.util;

import java.util.HashMap;

public class DistanceCalculation {
	
	//이분형 데이터 계산 함수
	protected double calculateBinaryData(HashMap<String, Integer> master, HashMap<String, Integer> other) {
		
		double distance = -1.0;
		
		try {
			if (master.get("friendship")==other.get("friendship")&&master.get("climbingMate")==other.get("climbingMate"))
				distance = 0.0;
			else if (master.get("friendship")!=other.get("friendship")&&master.get("climbingMate")!=other.get("climbingMate"))
				distance = 1.0;
			else
				distance = 0.5;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return distance;
	}
	
	//서열형 데이터 계산 함수
	protected double calculateOrdinalData(HashMap<String, Double> master, HashMap<String, Double> other) {
		
		double distance = -1.0;
		
		try {
			double exercise = Math.abs(master.get("exercise")-other.get("exercise"))*6;	//운동능력	
			double difficulty = Math.abs(master.get("difficulty")-other.get("difficulty"))*3;	//난이도
			double climbingLevel = Math.abs(master.get("climbingLevel")-other.get("climbingLevel"))*1.5;	//등산수준
			double frequency = Math.abs(master.get("frequency")-other.get("frequency"))*1.5;	//등산빈도
			
			distance = exercise + difficulty + climbingLevel + frequency;
		} catch(Exception e) {
			e.printStackTrace();
		}
			
		return distance;
	}

}
