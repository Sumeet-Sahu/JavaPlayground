package com.experiments;

public class OverloadingExample {

	public static void getValue(Object object) {
		System.out.println("Overloaded with Object");
	}

	public static void getValue(String string) {
		System.out.println("Overloaded with string");
	}
	
	public static void getValue(StringBuilder stringBuilder) {
		System.out.println("Overloaded with stringBuilder");
	}
	
	static public void  main(String[] args) {
		getValue("null");
	}

}
