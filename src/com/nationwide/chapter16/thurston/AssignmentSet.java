package com.nationwide.chapter16.thurston;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AssignmentSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] elements = { "fire", "water", "metal;", "wood", "metal",
				"fire", "water" };
		List<String> list = Arrays.asList(elements);

		System.out.printf(" %s ", list);
		System.out.println();

		Set<String> set = new HashSet<String>(list);
		System.out.printf("%s ", set);

		Map<String, Integer> benders = new HashMap<String, Integer>();
		benders.put("Lava", 2);
		benders.put("Blood", 4);
		benders.put("Combustion", 2);
		benders.put("Flying Air", 1);

		System.out.println();
		System.out.printf("%s", benders);
		System.out.println();

	}

}
