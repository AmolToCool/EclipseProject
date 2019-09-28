package com.collection;

import java.util.Comparator;

public class MyComparator implements Comparator<Integer> {

	@Override//only first elements it will insert
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return 0;
	}

	/*@Override//every element come before so no any sorting
	public int compare(Integer o1, Integer o2) {

		return -1;
	}*/

	/*@Override//every element come after so noany sorting
	public int compare(Integer o1, Integer o2) {
		return +1;
	}*/

	
	/*@Override//return descending order
	public int compare(Integer o1, Integer o2) {
		return o2.compareTo(o1);
	}*/

	/*@Override //return descending order
	public int compare(Integer o1, Integer o2) {
		return -o1.compareTo(o2);
	}*/

	/*@Override//it returns natural sorting order
	public int compare(Integer o1, Integer o2) {
		return o1.compareTo(o2);
	}
*/
	/*@Override//Ascending order
	public int compare(Integer i1, Integer i2) {

		if(i1>i2){
			return +1;
		}
		else if(i1<i2){
			return -1;
		}
		else
		return 0;
	}*/

	
	/*@Override//for descending order
	public int compare(Integer i1, Integer i2) {

		if(i1>i2){
			return -1;
		}
		else if(i1<i2){
			return +1;
		}
		else
		return 0;	
		
		
	}*/

}
