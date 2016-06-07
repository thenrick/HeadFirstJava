package com.nationwide.chapter16.davis;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.TreeSet;

public class A3ListSet {
	public static void main(String[] args) {
		System.out.println("List");
		myA3(new ArrayList<String>());
		System.out.println(" ");
		System.out.println("Set");
		myA3(new HashSet<String>());
		System.out.println(" ");
		System.out.println("TreeSet");
		myA3(new TreeSet<String>());

	}

	private static void myA3(Collection<String> coll) {

		coll.add("1");
		coll.add("6");
		coll.add("3");
		coll.add("4");
		coll.add("5");
		coll.add("5");
		coll.add("2");
		coll.add("6");

		System.out.println(coll);
		System.out.println("Remove 6");
		System.out.println(coll.remove("6"));
		System.out.println("Look for 6");
		System.out.println(coll.contains("6"));

		for (String a : coll) {
			System.out.println(a);

		}
	}
}
