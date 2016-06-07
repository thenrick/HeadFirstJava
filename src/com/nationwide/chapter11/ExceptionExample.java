package com.nationwide.chapter11;

public class ExceptionExample {

	public void thisMightWork() throws CrazyException {
		throw new CrazyException();
	}

	/**
	 * @param args
	 * @throws CrazyException
	 */
	public static void main(String[] args) throws CrazyException {
		ExceptionExample example = new ExceptionExample();
		example.thisMightWork();

	}

}
