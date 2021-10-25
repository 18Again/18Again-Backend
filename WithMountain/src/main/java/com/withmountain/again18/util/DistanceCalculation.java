package com.withmountain.again18.util;

import java.util.HashMap;

public class DistanceCalculation {
	
	//�̺��� ������ ��� �Լ�
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
		
		return distance*0.05;
	}
	
	//������ ������ ��� �Լ�
	protected double calculateOrdinalData(HashMap<String, Double> master, HashMap<String, Double> other) {
		
		double distance = -1.0;
		
		try {
//			double exercise = Math.abs(master.get("exercise")-other.get("exercise"))*6;	//��ɷ�	
//			double difficulty = Math.abs(master.get("difficulty")-other.get("difficulty"))*3.5;	//���̵�
//			double climbingLevel = Math.abs(master.get("climbingLevel")-other.get("climbingLevel"))*2;	//������
//			double frequency = Math.abs(master.get("frequency")-other.get("frequency"))*2;	//����
			
			double exercise = Math.sqrt(Math.pow(master.get("exercise")-other.get("exercise"), 2));	//��ɷ�	
			double difficulty = Math.sqrt(Math.pow(master.get("difficulty")-other.get("difficulty"), 2));	//���̵�
			double climbingLevel = Math.sqrt(Math.pow(master.get("climbingLevel")-other.get("climbingLevel"), 2));	//������
			double frequency = Math.sqrt(Math.pow(master.get("frequency")-other.get("frequency"), 2));	//����
			
			distance = exercise*0.42 + difficulty*0.3 + climbingLevel*0.15 + frequency*0.08;
		} catch(Exception e) {
			e.printStackTrace();
		}
		return distance;
		//return Math.sqrt(distance);
	}

}
