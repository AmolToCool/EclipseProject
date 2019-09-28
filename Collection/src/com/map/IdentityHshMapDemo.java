package com.map;
import java.util.*;

public class IdentityHshMapDemo {

	public static void main(String[] args) {

		IdentityHashMap m=new IdentityHashMap();
		Integer i1=new Integer(101);
		Integer i2=new Integer(101);
		float i4=101;
		int i3=101;
		int i5=101;
		m.put(i1,"Pawan");
		m.put(i2,"Kalyan");
		m.put(i3,"Jivan");
		m.put(i4,"Kiran");
		m.put(i5,"Karam");
		System.out.println(m);
		
		
	}
	public void finalize() {
		System.out.println("finalize() call...");
	}

}
