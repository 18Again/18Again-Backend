package com.withmountain.again18.util;

import java.util.Comparator;

import com.withmountain.again18.domain.DistanceDTO;

public class ListComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		double testDouble1 = ((DistanceDTO) o1).getDistance();
		double testDouble2 = ((DistanceDTO) o2).getDistance();
		
		if (testDouble1>testDouble2) {
			return 1;
		} else if (testDouble1<testDouble2) {
			return -1;
		} else {
			return 0;
		}
	}

}
