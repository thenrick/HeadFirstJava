package com.nationwide.chapter14;

public class ParsingStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String favoriteMLBteam = "What is your favorite?/Chicago Cubs";
		String[] result = favoriteMLBteam.split("/");
		for (String string : result) {
			System.out.println(string);
		}
	}
}