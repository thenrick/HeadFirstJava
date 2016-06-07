package com.nationwide.chapter16.davis;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A3Map {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Map");

		Map<Integer, String> myA3Map = new HashMap<Integer, String>();
		myA3Map.put(new Integer(7), "7");
		myA3Map.put(new Integer(9), "9");
		myA3Map.put(new Integer(8), "8");

		Set<Integer> keySet = myA3Map.keySet();
		for (Integer key : keySet) {
			String value = myA3Map.get(key);

			System.out.println(key + " : " + value);
		}

	}
}
