package com.nationwide.chapter5;

public class SimpleDotComTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDotCom dot = new SimpleDotCom();
		int[] locations = {2,3,4};
		dot.setLocationCells(locations);
		String guess = "2";
		String result = dot.checkYourself(guess);
	}

}
