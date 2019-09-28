package co.test.colln;

import java.util.TreeSet;

public class TreeSetDemo1 extends SetTest{
	static int i=0;
	static int match(int k) {
		a=1;b=2;
		 return i=a+b+k;
	}
	public static void main(String[] args) {

		TreeSet t=new TreeSet();
		int j =match(2);
		System.out.println("Hi "+j);
		t.add("A");
		t.add("a");
		t.add("B");
		t.add("L");
		//t.add(null);//null pointerException
		//t.add(new Integer(10));ClassCastException
		System.out.println(t);
	}

}
