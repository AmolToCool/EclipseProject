package com.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Student[] s=new Student[1000];
		//s[0]=new Client();//cann't convert from Client to Student
		Object[] o=new Object[10];
		int[] i= new int[10];
		i[0]=11;
		i[1]=12;
		i[3]=13;
		//System.out.println(i[3]);
		o[0]=new Student();
		o[1]=new Client();
		int a=1;
		int b=2;
		int c=3;
		Set st=new LinkedHashSet<>();
		st.add(b);
		st.add(a);
		st.add(c);
		//System.out.println(st);
		List l=new ArrayList();
		System.out.println(l.size());
		//l.add(5, o);
		l.add("B");System.out.println();
		l.add("C");
		l.add("D");l.add(2,"A");
		l.addAll(2, st);
		System.out.println(l);
		//l.remove("B");
		l.remove(0);
		l.set(2, i);
		System.out.println(l.indexOf("A"));
	}

}
