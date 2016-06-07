package com.nationwide.chapter11;

public class FinallyExample {

	/**
	 * @param args
	 * @throws CrazyException
	 */
	public static void main(String[] args) throws CrazyException {

		ExceptionExample example = new ExceptionExample();
		example.thisMightWork();
		System.out.println("I am here");

	}

}
