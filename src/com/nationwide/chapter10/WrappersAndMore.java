package com.nationwide.chapter10;

public class WrappersAndMore {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Wrapping an int
		int i = 288;
		Integer iWrap = new Integer(i);
		// unwrapping the value
		int unWrapped = iWrap.intValue();

		// Using the Wrappers static utilities
		String s = "2";
		int x = Integer.parseInt(s);
		double d = Double.parseDouble("420.24");
	}

}
