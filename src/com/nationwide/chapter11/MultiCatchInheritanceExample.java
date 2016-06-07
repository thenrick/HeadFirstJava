package com.nationwide.chapter11;

public class MultiCatchInheritanceExample {

	public MultiCatchInheritanceExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MultiCatchInheritanceExample example = new MultiCatchInheritanceExample();
		// Multi-catch example
		try {
			example.anotherRiskyMethod();
		} catch (Sub1Exeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Sub2Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParentException e) {
			// TODO: handle exception
		}

	}

	public void anotherRiskyMethod() throws Sub1Exeption, Sub2Exception {
		riskyMethod1();
		riskyMethod2();
	}

	private void riskyMethod1() throws Sub1Exeption {
		throw new Sub1Exeption();
	}

	private void riskyMethod2() throws Sub2Exception {
		throw new Sub2Exception();
	}
}
