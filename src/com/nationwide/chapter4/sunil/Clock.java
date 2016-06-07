package com.nationwide.chapter4.sunil;

public class Clock {

	String time;

	void setTime(String t) {
		time = t;
	}

	String getTime() {
		return time;
	}
}

/**
 * @param args
 */
class ClockTestDrive {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clock c = new Clock();
		c.setTime("1234");
		String tod = c.getTime();
		System.out.println("time:" + tod);
	}

}