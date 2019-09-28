package co.test.colln;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest {
    static int a=10;static int b=20;
	static int match() {
		int i=a+b;
		return i;
	}
	public static void main(String[] args) {

		LinkedHashSet h=new LinkedHashSet(20,(float) 0.80);
		h.add(null);
		h.add(5);
		h.add("Hi");
		h.add(1);
		h.add(2);
		h.add(3);
		h.add(4);
		
		SortedSet ss=new TreeSet();
		for(int i=100;i<110;i++) {
			ss.add(i);
		}
		    System.out.println("SortedSet --> "+ss);
    		System.out.println("Headset of 105--> "+ss.headSet(105));
    		System.out.println("Tailset of 105--> "+ss.tailSet(105));
    		System.out.println("Subset of 105 to 108--> "+ss.subSet(105, 108));
    		System.out.println("first()--> "+ss.first());
    		System.out.println("last()--> "+ss.last());
	}

}














