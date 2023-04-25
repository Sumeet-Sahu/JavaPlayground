package com.experiments;

public class MainStaticTest {

	int value;

	public MainStaticTest(int value) {
		this.value = value;
	}

	private void dummy() {
		System.out.println("Dummy call");
	}

	public static void doIt() {
		System.out.println("Do It...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainStaticTest t = new MainStaticTest(25);

		System.out.println("T Value == " + t.value);
		
		t.doIt();
		
		t.dummy();
	}

}
