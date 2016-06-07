package com.nationwide.chapter11.davis;

import java.util.Calendar;

public class Birthdate {

	public Birthdate() {
		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 15, 16, 00);
		System.out.println(String.format("1 " + "%tc", cal));
		// Sun May 15 16:00:52 CDT 2016

		cal.set(1999, 4, 11, 19, 00); // my birthday & hour w/random year
		System.out.println(String.format("2 " + "%tc", cal));
		// Tue May 11 19:00:44 CDT 1999

		// Trying to adjust the time to 19:10? Why did month and day change?
		cal.set(1999, 4, 11, 1910, 00); // why did hour change to 14?
		System.out.println(String.format("3 " + "%tc", cal));
		// Thu Jul 29 14:00:18 CDT 1999

		cal.set(1999, 4, 11, 19, 10);
		System.out.println(String.format("3.2 " + "%tc", cal));

		// set(int year, int month, int date, int hourOfDay, int minute)
		// Sets the values for the calendar fields YEAR, MONTH, DAY_OF_MONTH,
		// HOUR_OF_DAY, and MINUTE.

		cal.set(1999, 5, 11, 1910, 00); // changed 4 to 5 and the month changes?
		System.out.println(String.format("4 " + "%tc", cal));
		// Sun Aug 29 14:00:10 CDT 1999 How does 4 & 5 relate to Jul & Aug?

		cal.set(1999, 5, 11, 19, 10); // changed 4 to 5 and the month changes?
		System.out.println(String.format("4.2 " + "%tc", cal));

		cal.set(1999, 4, 11, 19, 11); // Now we got my birthday, hour & minutes
		System.out.println(String.format("5 " + "%tc", cal));
	}

	public static void main(String[] args) {

		Birthdate bd = new Birthdate();

	}
}
