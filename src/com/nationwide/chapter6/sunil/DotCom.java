package com.nationwide.chapter6.sunil;

import java.util.ArrayList;

public class DotCom {

	private ArrayList<String> locationCells;

	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}

	/**
	 * @param args
	 */

	public String CheckYourself(String userInput) {

		String result = "miss";
		int index = locationCells.indexOf(userInput);
		if (index >= 0) {
			locationCells.remove(index);

			if (locationCells.isEmpty()) {
				result = "Kill";
			} else {
				result = "hit";
			}
		}
		return result;
	}
}