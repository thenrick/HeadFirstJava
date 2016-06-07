package com.nationwide.chapter16.thurston;

public class ComparableComparator {

	public static <T extends Comparable<T>> T maximum(T alpha, T bravo,
			T charlie) {
		T max = alpha;
		if (bravo.compareTo(max) > 0) {
			max = bravo;
		}
		if (charlie.compareTo(max) > 0) {
			max = charlie;
		}
		return max;
	}

	public static void main(String args[]) {
		System.out.printf("Max of %d, %d and %d is %d\n\n", 1, 5, 2,
				maximum(1, 5, 2));

		System.out.printf("Maxm of %.1f, %.1f and %.1f is %.1f\n\n", 3.14, 9.0,
				8.8, maximum(3.14, 8.8, 9.0));

		System.out.printf("Max of %s, %s and %s is %s\n", "red", "blue",
				"green", maximum("red", "blue", "green"));
	}
}
