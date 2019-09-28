package com.weakhashmap;

import java.util.*;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
       WeakHashMap m=new WeakHashMap();
       HashMap h=new HashMap();
       Integer  i1=new Integer(10);
       Integer  i2=new Integer(10);
       h.put(i1, "Bansi");
       h.put(i2, "Jira");
       h.put(new Temp(115), "Durga");h.put(new Temp(11111), "Jiva");
       h.put(new Temp2(5), "Soft");
       System.out.println(new Temp(000).hashCode());
       System.out.println(h);
        Temp t=new Temp();
        m.put(t, "Durga");
        t=null;
		//System.out.println(m);
		System.gc();
		Thread.sleep(5000);
	//	System.out.println(m);
		
	}

}
