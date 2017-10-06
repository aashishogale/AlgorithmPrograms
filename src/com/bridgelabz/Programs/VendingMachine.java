/***************************************************************************
* Purpose : To create class for vending machine
*
* @author   Aashish
* @version  1.0
* @since    05-10-2017
****************************************************************************/

package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Util;
import java.util.Scanner;

public class VendingMachine {
	public static void main(String args[]) {
		int change, sum = 0;
		int[] arrayNoOfNotes = new int[8];

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the change");
		change = sc.nextInt();

		Util.noteCheck(arrayNoOfNotes, change, 0);
		for (int i = 0; i < arrayNoOfNotes.length; i++) {
			sum = sum + arrayNoOfNotes[i];
		}

		System.out.println("1000 notes " + arrayNoOfNotes[0]);
		System.out.println("500 notes " + arrayNoOfNotes[1]);
		System.out.println("100 notes " + arrayNoOfNotes[2]);
		System.out.println("50 notes " + arrayNoOfNotes[3]);
		System.out.println("10 notes " + arrayNoOfNotes[4]);
		System.out.println("2 notes " + arrayNoOfNotes[5]);
		System.out.println("5 notes " + arrayNoOfNotes[6]);
		System.out.println("1 notes " + arrayNoOfNotes[7]);
	}

}
