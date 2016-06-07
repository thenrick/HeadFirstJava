package com.nationwide.chapter16.matt;

import java.util.Arrays;

public class SortBeerObject {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beer[] beers = new Beer[3];

		Beer brandOne = new Beer("MillerLite", "The best", 100);
		Beer brandTwo = new Beer("BudLight", "Mediocre", 70);
		Beer brandThree = new Beer("BuschLight", "Last resort", 50);

		beers[0] = brandOne;
		beers[1] = brandTwo;
		beers[2] = brandThree;

		Arrays.sort(beers);

		int i = 0;
		for (Beer temp : beers) {
			System.out.println("Beers " + ++i + " : " + temp.getBeerName()
					+ " , " + temp.getBeerDesc() + ", Quantity : "
					+ temp.getQuantity());
		}

	}

}