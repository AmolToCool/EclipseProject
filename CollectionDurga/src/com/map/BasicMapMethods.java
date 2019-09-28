package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class BasicMapMethods {

	public static void main(String[] args) {

		HashMap m=new HashMap();
		m.put(101, "Durga");
		Object o3=m.put(102, "Jay");
		Object o=m.put(101, "Bibhishan");
		m.put(107, "Kendre");
		//System.out.println(m+" --> "+o);
		HashMap m2=new HashMap();
		m2.putAll(m);
		m2.put(501, "Shirapa");
		m2.put(502, "Bam");
		m2.put(503, "Bhishmaraj");
		m2.put(504, "Jonny");
		//Object o2=m2.remove(101);
		//System.out.println(m2.get(101)+"--> "+o);
		//System.out.println(m2.containsKey(508));
		//System.out.println(m2.containsValue("Jay"));
		//System.out.println(m.size()+"-->m, m2--> "+m2.size());
		Set s=m2.keySet();
		m2.put(null, "Dadu");
		m2.put(null, "Madhu");
		Collection c=m2.values();
		System.out.println(m2);
		System.out.println(c);
		System.out.println(m2.entrySet());
		
	}

}
