package com.nationwide.chapter16;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> listofcountries = new ArrayList<String>();
		listofcountries.add("1");
		listofcountries.add("2");
		listofcountries.add("China");
		listofcountries.add("Denmark");

		/* Unsorted List */
		System.out.println("Before Sorting:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}

		/* Sort statement */
		Collections.sort(listofcountries);

		/* Sorted List */
		System.out.println("After Sorting:");
		for (String counter : listofcountries) {
			System.out.println(counter);
		}
	}
}
