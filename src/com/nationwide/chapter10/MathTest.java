package com.nationwide.chapter10;

public class MathTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int x = (int) Math.round(42.2);
		System.out.println("Rounding 42.2 is " + x);
		int y = Math.min(56, 12);
		System.out.println("The Minimum of 56 and 12 is " + y);
		int z = Math.abs(-343);
		System.out.println("The Absolute Value of -343 is " + z);
	}

}
