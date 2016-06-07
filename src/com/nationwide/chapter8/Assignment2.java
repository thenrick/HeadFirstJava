package com.nationwide.chapter8;

import java.util.ArrayList;
import java.util.List;

public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// This is a list of objects
		List<Object> objList = new ArrayList<Object>();
		objList.add(new Cat());
		objList.add(new Dog());
		// Casting is required here
		Dog myCat = (Cat) objList.get(0);
		Cat myDog = (Cat) objList.get(1);

		// This is a list of dogs
		List<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog());
		// Note how we don't have to cast here
		Dog dog2 = dogList.get(0);

	}

}
