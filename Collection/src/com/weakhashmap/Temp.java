package com.weakhashmap;

public class Temp {

	int i=0;
	public Temp(int i) {

		this.i=i;
	}
	public Temp() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "TemP";
	}
	public int hashCode() {
		return i;
	}
	public void finalize() {
		System.out.println("finalize...");
	}

}
