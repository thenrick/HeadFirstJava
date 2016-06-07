package com.nationwide.chapter4.sunil;

public class EncapTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RunEncap runcap = new RunEncap();
		runcap.setName("James");
		runcap.setAge(20);
		runcap.setIdNum("12343ms");

		System.out.print("Name : " + runcap.getName() + " Age : "
				+ runcap.getAge());

	}

}
