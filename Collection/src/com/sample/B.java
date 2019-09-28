package com.sample;

public class B extends A{

	static {
		System.out.println("B class");
	}
	public void add() throws NullPointerException {
		System.out.println("B class method");
	}
	public static void main(String[] args) throws NullPointerException {

		A a=new B();
		try {
			a.add();
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
