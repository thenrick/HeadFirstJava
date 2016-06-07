package com.nationwide.chapter8.review;

import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// This is a list of objects
		List<Object> objList = new ArrayList<Object>();
		objList.add(new JavaProgrammer());
		objList.add(new DrakeRelays());
		// Casting is required here
		JavaProgrammer myJP = (JavaProgrammer) objList.get(0);
		DrakeRelays myDR = (DrakeRelays) objList.get(1);
	}

}
