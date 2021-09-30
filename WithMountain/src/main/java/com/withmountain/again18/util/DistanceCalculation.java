package com.withmountain.again18.util;

import java.util.HashMap;

public class DistanceCalculation {
	
	//�̺��� ������ ��� �Լ�
	double calculateBinaryData(HashMap<String, Integer> master, HashMap<String, Integer> other) {
		
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
	
	//������ ������ ��� �Լ�
	double calculateOrdinalData(HashMap<String, Double> master, HashMap<String, Double> other) {
		
		double distance = -1.0;
		
		try {
			double exercise = Math.abs(master.get("exercise")-other.get("exercise"))*4.0;	//��ɷ�	
			double difficulty = Math.abs(master.get("difficulty")-other.get("difficulty"))*3.0;	//���̵�
			double climbingLevel = Math.abs(master.get("climbingLevel")-other.get("climbingLevel"))*2.0;	//������
			double frequency = Math.abs(master.get("frequency")-other.get("frequency"))*2.0;	//����
			
			distance = exercise + difficulty + climbingLevel + frequency;
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		return distance;
	}

}
