package com.nationwide.chapter11;

public class OrderingCatchExample {

	public OrderingCatchExample() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		OrderingCatchExample example = new OrderingCatchExample();
		// Multi-catch example
		try {
			example.anotherRiskyMethod();
		} catch (SubSub1Exception sse) {
			// TODO Auto-generated catch block
			sse.printStackTrace();
		} catch (Sub2Exception se) {
			// TODO Auto-generated catch block
			se.printStackTrace();
		} catch (ParentException e) {
			// TODO: handle exception
		}
	}

	public void anotherRiskyMethod() throws ParentException {
		riskyMethod1();
		riskyMethod2();
		riskyMethod3();
	}

	private void riskyMethod3() throws ParentException {
		throw new ParentException();
	}

	private void riskyMethod1() throws SubSub1Exception {
		throw new SubSub1Exception();
	}

	private void riskyMethod2() throws Sub2Exception {
		throw new Sub2Exception();
	}

}