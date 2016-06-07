package com.nationwide.chapter16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> bradyList = new ArrayList<String>();
		bradyList.add("Greg");
		bradyList.add("Marsha");
		bradyList.add("Cindy");

		Set<String> cheersSet = new HashSet<String>();
		cheersSet.add("Sam");
		cheersSet.add("Coach");
		cheersSet.add("Diane");

		Map<Integer, String> seinfeldMap = new HashMap<Integer, String>();
		seinfeldMap.put(new Integer(10), "Jerry");
		seinfeldMap.put(new Integer(15), "Kramer");
		seinfeldMap.put(new Integer(20), "George");

	}

}
