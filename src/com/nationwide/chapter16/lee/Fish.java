package com.nationwide.chapter16.lee;

import java.util.ArrayList;

public class Fish {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> fish = new ArrayList<String>();

		fish.add("Bass");
		fish.add("Walleye");
		fish.add("Pike");
		fish.add("Crappie");

		String animal = fish.get(3);

		System.out.println(animal);

	}

}
