package com.nationwide.chapter2;

public class Dog {
	
	int size;
	String breed;
	String name;
	
	void bark() {
		System.out.println("bark");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.size = 75;
		d.breed = "Lab";
		d.name = "Baxter";
		d.bark();
	}

}
