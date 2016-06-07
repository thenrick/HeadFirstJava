package com.nationwide.chapter6;

import java.util.ArrayList;

public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Create an arrayList and use the following methods add(), size(), contains(), indexOf, isEmpty(), and remove()
		ArrayList<String> myList = new ArrayList<String>();
		myList.add("Frank Drebin");
		myList.add("Jane Spencer");
		myList.add("Vincent Ludwig");
		System.out.println(myList.size());
		System.out.println(myList.contains("Nordberg"));
		System.out.println(myList.indexOf("Jane Spencer"));
		System.out.println(myList.isEmpty());
		myList.remove(2);
		System.out.println(myList.size());
	}

}
