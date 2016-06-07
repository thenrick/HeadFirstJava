package com.nationwide.chapter10;

public class Assignment1 {

	private static int textCounts;
	public static final int TEXT_LIMIT = 25;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		textCounts = 10;
		System.out.println("Here is my static variable textCounts "
				+ textCounts);
		System.out.println("Here is my static final variable TEXT_LIMIT "
				+ TEXT_LIMIT);
	}

}