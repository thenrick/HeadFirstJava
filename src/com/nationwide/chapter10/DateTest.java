package com.nationwide.chapter10;

import java.util.Calendar;
import java.util.Date;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Format date
		System.out.println(String.format("%tc", new Date()));

		// Dates with Calendar object
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 7, 15, 40);

		// Convert time to millis
		long day = c.getTimeInMillis();

		// Adding 35 days to the date
		c.add(c.DATE, 35);

	}

}
