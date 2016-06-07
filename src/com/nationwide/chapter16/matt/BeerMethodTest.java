package com.nationwide.chapter16.matt;

public class BeerMethodTest {
	public static <E> void printBeerType(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s ", element);
		}
		System.out.println();
	}

	public static void main(String args[]) {
		String[] typeArray = new String[5];
		typeArray[0] = "Draw";
		typeArray[1] = "Bottle";
		typeArray[2] = "Mini-Pitcher";
		typeArray[3] = "Pitcher";
		typeArray[4] = "Boot";

		System.out.println("Beer Sizes:");
		printBeerType(typeArray);
	}
}