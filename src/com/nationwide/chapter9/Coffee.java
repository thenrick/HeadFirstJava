package com.nationwide.chapter9;

public class Coffee {

	public String beanType;

	public String roastType;

	/**
	 * @return the roastType
	 */
	public String getRoastType() {
		return roastType;
	}

	/**
	 * @param roastType
	 *            the roastType to set
	 */
	public void setRoastType(String roastType) {
		this.roastType = roastType;
	}

	/**
	 * @return the beanType
	 */
	public String getBeanType() {
		return beanType;
	}

	/**
	 * @param beanType
	 *            the beanType to set
	 */
	public void setBeanType(String beanType) {
		this.beanType = beanType;
	}

	public Coffee() {
		System.out.println("making plain coffee");
	}

	/**
	 * @param beanType
	 */
	public Coffee(String beanType) {
		super();
		this.beanType = beanType;
	}

	/**
	 * @param beanType
	 * @param roastType
	 */
	public Coffee(String beanType, String roastType) {
		super();
		this.beanType = beanType;
		this.roastType = roastType;
	}

	public void sip() {
		System.out.println("creating another coffee object");
		Coffee coffee = new Coffee();
		System.out.println(coffee.toString());
		System.out.println("now it ready for Garbage Collection!");
	}
}
