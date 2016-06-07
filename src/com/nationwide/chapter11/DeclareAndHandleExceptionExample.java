package com.nationwide.chapter11;

public class DeclareAndHandleExceptionExample {

	public DeclareAndHandleExceptionExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws Sub1Exeption
	 */
	public static void main(String[] args) throws Sub1Exeption {
		DeclareAndHandleExceptionExample example = new DeclareAndHandleExceptionExample();
		example.riskyMethod1();
		// Multi-catch example
		try {
			example.riskyMethod2();
		} catch (Sub2Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void riskyMethod1() throws Sub1Exeption {
		throw new Sub1Exeption();
	}

	private void riskyMethod2() throws Sub2Exception {
		throw new Sub2Exception();
	}
}