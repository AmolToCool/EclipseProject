package com.map;
import java.util.*;

public class MapDemo {

	public static void main(String[] args) {

		HashMap m=new HashMap();
		m.put("Durga", 101);
		m.put("Pravin", 102);
		m.put("Sathya", 103);
		m.put("Naresh", 104);
		Set s=m.entrySet();
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			Map.Entry e=(Map.Entry)itr.next();
			
			if(e.getKey().equals("Durga")) {
				e.setValue(111);
			}
			System.out.print("["+e.getKey()+" = "+e.getValue()+"]");
			
		}System.out.println();
		Integer i=new Integer(10);
		Integer i2=new Integer(10);
		System.out.println(i==i2);
		System.out.println("equqls()--> "+i.equals(i2));
	}

}
