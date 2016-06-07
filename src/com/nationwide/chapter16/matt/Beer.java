package com.nationwide.chapter16.matt;

public class Beer implements Comparable<Beer> {

	private String beerName;
	private String beerDesc;
	private int quantity;

	public Beer(String beerName, String beerDesc, int quantity) {
		super();
		this.beerName = beerName;
		this.beerDesc = beerDesc;
		this.quantity = quantity;
	}

	public String getBeerName() {
		return beerName;
	}

	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}

	public String getBeerDesc() {
		return beerDesc;
	}

	public void setBeerDesc(String beerDesc) {
		this.beerDesc = beerDesc;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int compareTo(Beer compareBeer) {

		int compareQuantity = ((Beer) compareBeer).getQuantity();

		// ascending order
		return this.quantity - compareQuantity;

		// descending order
		// return compareQuantity - this.quantity;

	}
}
