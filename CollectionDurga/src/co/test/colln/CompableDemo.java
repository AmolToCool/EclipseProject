package co.test.colln;

import java.util.TreeSet;

public class CompableDemo {

	public static void main(String[] args) {

		TreeSet t=new TreeSet(new CustumComparator());
		//System.out.println("A".compareTo("B"));
	    //	System.out.println("B".compareTo("A"));
		//System.out.println("A".compareTo(null));
		/*t.add(1);t.add(5);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(0);*/
		t.add("z");
		t.add("p");
		t.add("k");
		t.add("a");
		t.add("c");
		t.add("zv");
		System.out.println(t);
	}

}
