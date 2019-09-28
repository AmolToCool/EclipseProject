package co.test.colln;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CurserObject {

	public static void main(String[] args) {

		Set s=new HashSet();
		Vector v=new Vector();
		LinkedList ll=new LinkedList();
		//Enumeration e=(Enumeration) ll.element();
		Enumeration ee=v.elements();
		Map m=new HashMap<>();Iterator itr=v.iterator();
		//m.notify();
		
		/*for(int i=0;i<10;i++) {
			s.add(i);
		}Iterator itr=s.iterator();
		while(itr.hasNext()) {
			int i=(int) itr.next();
			if(i%2==0) {
				itr.remove();
			}
		}System.out.println(s);*/

		for(int i=0;i<10;i++) {
			ll.add(i);
		}
		ListIterator litr=ll.listIterator();
		while(litr.hasNext()) {
			int i=(int)litr.next();
			if(i%2!=0) {
				litr.add("1A");
			}else {
				litr.add("2B");
			}
		}
		System.out.println(ll);
		System.out.println(ll.set(0, "55ZZ")+", "+ll);
		System.out.println(litr.getClass().getName()+" for listItr");
		System.out.println(itr.getClass().getName()+" for itr");
		ArrayList al=new ArrayList();
		//Iterator it=al.iterator();
		ListIterator ltr=al.listIterator();
		System.out.println(ltr.getClass().getName());
		System.out.println(s.add("A"));
		System.out.println(s.add("A"));
				}

}

















