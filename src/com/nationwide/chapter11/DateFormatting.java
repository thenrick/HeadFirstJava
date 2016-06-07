package com.nationwide.chapter11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Date curDate = new Date();

		SimpleDateFormat format = new SimpleDateFormat();
		String DateToStr = format.format(curDate);
		System.out.println("Default pattern: " + DateToStr);

		format = new SimpleDateFormat("yyyy/MM/dd");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);

		format = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		DateToStr = format.format(curDate);
		System.out.println(DateToStr);
	}

}
