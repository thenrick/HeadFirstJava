package com.nationwide.chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeMower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileInputStream fileStream;
		try {
			fileStream = new FileInputStream("mower.ser");
			ObjectInputStream os = new ObjectInputStream(fileStream);
			Object one = os.readObject();
			LawnMower mower = (LawnMower) one;
			System.out.println(mower.getDeckWidth());
			System.out.println(mower.isSelfPropelled());
			System.out.println(mower.dontSerializeMe);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
