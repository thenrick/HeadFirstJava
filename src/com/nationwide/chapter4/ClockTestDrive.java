package com.nationwide.chapter4;

class Clock {
	String time;
	
	void setTime(String t) {
		time = t;
	}

	public void getTime() {
		// TODO Auto-generated method stub
		return null;
	}
}

class ClockTestDrive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Clock c = new Clock();
		c.setTime("1245");
		String tod = c.getTime();
		System.out.println("time " + tod);
	}

}
