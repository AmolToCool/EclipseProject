package co.test.colln;

import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {

		TreeSet s=new TreeSet();
		s.add(new StringBuffer("A"));
		s.add(new StringBuffer("Z"));//ClassCastException bcoz java.lang.StringBuffer not impliments Comparable intf
		s.add(new StringBuffer("L"));
		s.add(new StringBuffer("B"));
		System.out.println(s);
	}

}
