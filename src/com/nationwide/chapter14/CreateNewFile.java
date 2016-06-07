package com.nationwide.chapter14;

import java.io.File;
import java.io.IOException;

public class CreateNewFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		File file = new File("C:/Users/thenricksen/Documents/EmptyFile.txt");

		boolean b = false;

		/*
		 * exists() method tests whether the file or directory denoted by this
		 * abstract pathname exists or not accordingly it will return TRUE /
		 * FALSE.
		 */

		if (!file.exists()) {

			/*
			 * createNewFile() method is used to creates a new, empty file
			 * mentioned by given abstract pathname if and only if a file with
			 * this name does not exist in given abstract pathname.
			 */
			b = file.createNewFile();
		}

		if (b)
			System.out.println("Empty File successfully created");
		else
			System.out.println("Failed to create File");
	}
}