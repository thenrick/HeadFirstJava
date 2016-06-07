package com.nationwide.chapter14.davis;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) {
		String myFile = "C:/Users/thenricksen/Documents/davis-test.txt";
		BufferedWriter buffWriter = null;
		try {
			// "FileWriter" is this a reserved word?
			FileWriter myFileWriter = new FileWriter(myFile);
			// Always wrap FileWriter in BufferedWriter.
			buffWriter = new BufferedWriter(myFileWriter);

			buffWriter.write("This is a test. ");
			buffWriter.write("If it works we will get a ");
			buffWriter.newLine();
			buffWriter.write(":-) ");
			buffWriter.newLine();
			buffWriter.write("And there you have it!");

			buffWriter.close();

		} catch (IOException ex) {
			System.out.println("Error writing :-( '" + myFile + "'");

		} finally {
			try {
				buffWriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // why not this here?
			System.out.println("finally happened");

		}

	}

}
