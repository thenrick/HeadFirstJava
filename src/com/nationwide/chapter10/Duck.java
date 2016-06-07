package com.nationwide.chapter10;

import java.io.ObjectInputStream.GetField;

public class Duck {
	private int size;
	private int duckCount = 0;

	public Duck() {
		// This won't work!
		// it would set duckCount to one every time
		duckCount++;
		// So make duckCount static!!!
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Static methods can't access non-static instance variables
		System.out.println("Size of duck is" + size);
		// Static methods can't access non-static methods either!
		System.out.println("Size of duck is" + getSize());
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}