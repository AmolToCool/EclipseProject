package co.test.colln;

import java.util.Enumeration;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class LinkedList {

	public static void main(String[] args) {

		/*java.util.LinkedList ll=new java.util.LinkedList();
		ll.add("JayBhim");
		ll.add("JayMim");
		System.out.println(ll);
		ll.add(0, "Pragathi");
		System.out.println(ll);
		ll.addFirst("Jatau");
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll.getFirst());*/
		Vector v=new Vector();
		
		for(int i=0;i<10;i++) {
			v.addElement(i);
		}
		Enumeration e=v.elements();
		System.out.print("[");
		while(e.hasMoreElements()) {
			int i=(int)e.nextElement();
			if(i%2==0) {
				System.out.print(i);
			}
		}
		System.out.println("]");
		System.out.println(v.capacity());
		v.addElement(6);
		System.out.println(v.capacity()+" ["+v+"]");
		
		Stack st=new Stack(); 
			for(int i=0;i<10;i++) {
				st.addElement(i);
			}
			st.push(112);
			
			System.out.println(st.peek()+"  hh"+st);
			System.out.println(st.pop()+" ["+st);
			System.out.println(st.empty());
			System.out.println(st.search(1));
		    System.out.println(e.getClass().getName());
		
		
	}
	
}















