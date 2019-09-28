package com.comparator;

import java.util.TreeSet;

public class ComparatorDemo {

	public static void main(String[] args) {
 
		TreeSet t=new TreeSet(new CustumComparator());
		t.add(new StringBuffer("a"));
		t.add(new StringBuffer("z"));
		t.add("Xx");
		t.add("yyy");
		t.add("pp");
		t.add("Aa");
		System.out.println(t);
	}

}
