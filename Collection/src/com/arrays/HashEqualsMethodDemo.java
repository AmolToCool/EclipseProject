package com.arrays;

public class HashEqualsMethodDemo {

		public static void main(String[] args) {

			MyClass m1=new MyClass();
			MyClass m2=new MyClass();;
			//m2=m1;
			System.out.println(m1.hashCode());
			System.out.println(m2.hashCode());
			String s1=new String("Hi");
			String s2=new String("Hi");
			System.out.println(s1==s2);
			System.out.println(s1.equals(s2));
			StringBuffer sb1=new StringBuffer("Hi");
			StringBuffer sb2=new StringBuffer("Hi");
			System.out.println(sb1==sb2);
			//m1.setI(10);
			System.out.println(sb1.equals(sb2));
			System.out.println(s1.equals(sb2));
			//System.out.println(s1==sb2);
			System.out.println(m1==m2);
			System.out.println(m1.equals(m2));
			System.out.println(m1.hashCode()==m2.hashCode());
			
			
			
	}

}
