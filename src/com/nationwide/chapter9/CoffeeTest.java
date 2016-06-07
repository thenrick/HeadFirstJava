package com.nationwide.chapter9;

public class CoffeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Coffee coffee = new Coffee();
		// Example one: reference goes out of scope permanently
		coffee.sip();
		// Example two: reference is assigned to another object
		coffee = new Coffee();
		// Example three: reference is set to null
		coffee = null;
		System.out.println("No More coffee!!!");

	}

}
