package com.nationwide.chapter16.thurston;

public class AllThreeGenericLists {

	public static <E> void printArray(E[] inputArray) {

		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String args[]) {

		Integer[] intArray = { 11, 10, 1982 };
		System.out.println("Array integerArray contains:");
		printArray(intArray);

		Double[] doubleArray = { 3.14, 8.88, 4.5, 1.0 };
		System.out.println("\nArray doubleArray contains:");
		printArray(doubleArray);

		Character[] charArray = { 'H', 'O', 'M', 'E', 'W', 'O', 'R', 'k' };
		System.out.println("\nArray characterArray contains:");
		printArray(charArray);

	}

}
