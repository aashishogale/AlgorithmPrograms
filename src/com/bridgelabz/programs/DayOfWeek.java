package com.bridgelabz.programs;

import com.bridgelabz.utility.Util;
/**
 * @author aashish
 *
 */

 class DayOfWeek {
	public static void main(String args[]) {

		int day = Integer.parseInt(args[0]);

		int month = Integer.parseInt(args[1]);
		int year = Integer.parseInt(args[2]);
		String[] sArray = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };
		System.out.println(sArray[Util.dayOfWeek(day, month, year)]);
	}
}
