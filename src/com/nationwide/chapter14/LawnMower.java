package com.nationwide.chapter14;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class LawnMower implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5528587755543484926L;

	private int deckWidth;

	private boolean selfPropelled;

	transient String dontSerializeMe;

	public LawnMower() {
		// TODO Auto-generated constructor stub
	}

	public int getDeckWidth() {
		return deckWidth;
	}

	public void setDeckWidth(int deckWidth) {
		this.deckWidth = deckWidth;
	}

	public boolean isSelfPropelled() {
		return selfPropelled;
	}

	public void setSelfPropelled(boolean selfPropelled) {
		this.selfPropelled = selfPropelled;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LawnMower mower = new LawnMower();
		mower.deckWidth = 22;
		mower.setSelfPropelled(true);
		mower.dontSerializeMe = "stuff";

		try {
			FileOutputStream fs = new FileOutputStream("mower.ser");
			ObjectOutputStream os = new ObjectOutputStream(fs);
			os.writeObject(mower);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
