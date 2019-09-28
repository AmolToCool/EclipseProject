package com.arrays;

import java.util.Comparator;

public class IntComparator implements Comparator<Integer>{

	public int compare(Integer i1,Integer i2) {
		return i2.compareTo(i1);
	}
}
