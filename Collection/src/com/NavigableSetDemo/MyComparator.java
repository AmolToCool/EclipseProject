package com.NavigableSetDemo;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

	public int compare(String s,String s2) {
		return s2.compareTo(s);
	}
}
