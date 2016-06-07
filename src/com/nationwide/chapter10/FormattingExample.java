package com.nationwide.chapter10;

public class FormattingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Formatting Numbers (decimal)
		String s = String.format("%, d", 1000000000);
		System.out.println(s);

		// Formatting (float)
		String c = String.format("I have %.2f bugs to fix.", 476578.0976);
		System.out.println(c);

		// Formatting (hexadecimal)
		c = String.format("%x", 42);
		System.out.println(c);

		// Formatting (character)
		c = String.format("%c", 42);
		System.out.println(c);

	}

}
