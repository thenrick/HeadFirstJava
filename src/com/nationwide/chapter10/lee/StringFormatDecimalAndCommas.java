package com.nationwide.chapter10.lee;

public class StringFormatDecimalAndCommas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int one = 3245988;
		double two = 176345.98032;

		String a = String.format("The rank is: %,d out of %,.2f", one, two);
		System.out.println(a);
	}

}
