package com.nationwide.chapter11;

public class FlowControl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			ExceptionExample example = new ExceptionExample();
			// example.thisMightWork();
		} catch (Exception e) {
			System.out.println("Something bad happened!!!");
		}
		System.out.println("Things are just fine...");
	}

}
