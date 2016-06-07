package com.nationwide.chapter11;

public class MultiCatchExample {

	public MultiCatchExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MultiCatchExample example = new MultiCatchExample();
		// Multi-catch example
		try {
			example.riskyMethod1();
		} catch (Sub1Exeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Sub2Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void riskyMethod1() throws Sub1Exeption, Sub2Exception {
		throw new Sub1Exeption();
	}

}
