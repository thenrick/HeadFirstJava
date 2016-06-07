package com.nationwide.chapter10;

public class StaticVsRegularMethods {

	static String myInstanceVariable;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Calling a static method
		// No instance variables here
		int x = (int) Math.round(42.2);
		myInstanceVariable = "";
		// Calling a regular method
		StaticVsRegularMethods regMeth = new StaticVsRegularMethods();
		regMeth.myRegularMethod();
	}

	private void myRegularMethod() {
		// I can use those instance variables...
		myInstanceVariable = "HA!";
		System.out.println("Just a regular old method here..."
				+ myInstanceVariable);

	}

}
