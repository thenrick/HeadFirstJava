package com.nationwide.chapter6;

import java.util.ArrayList;

public class Assignment1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Recycled code
		//10 element array
		String name = "Tom";
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
		for (String str : nameArr) {
			System.out.println(str);
		}
		
		ArrayList<String> nameList = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			nameList.add("Don");			
		}
		for (String str : nameList) {
			System.out.println(str);
		}
		
		

	}

}
