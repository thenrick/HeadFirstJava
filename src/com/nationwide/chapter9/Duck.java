package com.nationwide.chapter9;

public class Duck {

	private String name;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed
	 *            the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	private String breed;

	/**
	 * @param name
	 * @param breed
	 */
	public Duck(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	/**
	 * 
	 */
	public Duck() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Duck d1 = new Duck();
		System.out.println(d1.getName());
		d1.breed = "daffy";
		d1.setName("Bob");

		Duck d2 = new Duck("Fred", "daffy");
		System.out.println(d2.getName());
	}

}
