package com.NavigableSetDemo;

import java.util.*;

public class NavigableSetDemo {

	public static void main(String[] args) {
		
		//ArrayList l=new ArrayList<>();
		ArrayList l=new ArrayList();
		l.add("Z");
		l.add("B");
		l.add("C");
		l.add("A");
		l.add("D");
		//l.add(null);
		//l.add(10);
		System.out.println(l);
		//Collections.sort(l,new MyComparator());
		System.out.println(Collections.binarySearch(l, "C",new MyComparator()));
		System.out.println(l);
		Collections.reverse(l);
		System.out.println(l);

		/*TreeSet t=new TreeSet();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		System.out.println(t);
		System.out.println("floor(30)--> "+t.floor(30));
		System.out.println("lower(30)--> "+t.lower(30));
		System.out.println("ceiling(30)--> "+t.ceiling(30));
		System.out.println("higher(30)--> "+t.higher(30));
		System.out.println("pollFirst()--> "+t.pollFirst());
		System.out.println("pollLast()--> "+t.pollLast());
		System.out.println("descendingSet()--> "+t.descendingSet());
		System.out.println(t);*/
	
	    /*TreeMap t=new TreeMap();
	    t.put("c", "RAMHARI");
	    t.put("W", "JayHari");
	    t.put("p", "Narhari");
	    t.put("a", "Kaustubh");
	    t.put("b", "Makhanlal");
	    System.out.println(t);
	    System.out.println("floorKey()--> "+t.floorKey("p"));
	    System.out.println("lowerKey(p)--> "+t.lowerKey("p"));
	    System.out.println("ceilingKey(p)--> "+t.ceilingKey("p"));
	    System.out.println("higherKey(p)--> "+t.higherKey("p"));
	    System.out.println("descendingMap()--> "+t.descendingMap());
	    System.out.println("pollFirstKey()--> "+t.pollFirstEntry());
	    System.out.println("pollLastEntery()--> "+t.pollLastEntry());
	    System.out.println(t);*/
	
	
	}

}



































