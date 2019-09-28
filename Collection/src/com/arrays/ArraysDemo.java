package com.arrays;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {

		int[] i=new int[10];
		i[0]=1;
		i[1]=44;
		i[2]=3;
		i[3]=11;
		i[4]=5;
		System.out.print("[ ");
		for(int j: i) {
			System.out.print(j+", ");
		}
		System.out.print(" ]");
		Arrays.sort(i);
		System.out.println("After sorting...");
		System.out.print(" [ ");
		for(int k : i) {
			System.out.print(k+", ");
		}
		System.out.print(" ]");
	System.out.println();
	String[] s=new String[4];
	s[0]="Z";
	s[1]="D";
	s[2]="A";
	s[3]="P";
	for(String st : s) {
		System.out.print(st+", ");
	}
	System.out.println("After Custumize sorting...");
	Arrays.sort(s,new MyComparator());
	for(String st : s) {
		System.out.print(st+", ");
	}
	
	Arrays.sort(s);
	System.out.println("Natural sort...");
	for(String st : s) {
		System.out.print(st+", ");
	}
	System.out.println();
	System.out.println(Arrays.binarySearch(s, "4"));
	
	String s2[]= {"A","X","G","L"};
	List l=Arrays.asList(s2);
	System.out.println(l.get(1));
	System.out.println(l.set(0, "D"));
	System.out.println(l);
	l.add("q");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
