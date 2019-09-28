package com.sortedmap;

import java.util.TreeMap;

public class SortedMap {

	public static void main(String[] args) {

		java.util.SortedMap m=new TreeMap();
		
		m.put(102, "B");
		m.put(103, "C");
		m.put(104, "D");
		m.put(105, "E");
		m.put(101, "A");
		System.out.println(m);
	}

}
