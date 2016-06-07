package com.nationwide.chapter14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = "C:/Users/thenricksen/Documents/test.txt";
		try {
			// Assume default encoding.
			FileWriter fileWriter = new FileWriter(fileName);

			// Always wrap FileWriter in BufferedWriter.
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			// Note that write() does not automatically
			// append a newline character.
			bufferedWriter.write("Dear Java Class,");
			bufferedWriter.write("Let's write some text");
			bufferedWriter.newLine();
			bufferedWriter.write("Into this great ");
			bufferedWriter.write(" text file.");

			// Always close files.
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}

}
