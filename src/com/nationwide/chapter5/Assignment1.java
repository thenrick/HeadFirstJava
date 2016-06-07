package com.nationwide.chapter5;

public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name = "Tom";
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
		}
		String [] nameArr = new String[10];
		nameArr[0] = name;
		nameArr[1] = name;
		nameArr[2] = name;
		nameArr[3] = name;
		nameArr[4] = name;
		nameArr[5] = name;
		nameArr[6] = name;
		nameArr[7] = name;
		nameArr[8] = name;
		nameArr[9] = name;
		for (String string : nameArr) {
			System.out.println(string);
		}
	}

}
