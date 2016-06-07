package com.nationwide.chapter16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMethods {

	public static <T> T addAndReturn(T element, Collection<T> collection) {
		collection.add(element);
		return element;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String stringElement = "stringElement";
		List<String> stringList = new ArrayList<String>();

		String theElement = addAndReturn(stringElement, stringList);

		Integer integerElement = new Integer(123);
		List<Integer> integerList = new ArrayList<Integer>();

		Integer theElement1 = addAndReturn(integerElement, integerList);
	}

}
