/***************************************************************************
* Purpose : To create class for exchanging nibbles
*
* @author   Aashish
* @version  1.0
* @since    05-10-2017
****************************************************************************/


package com.bridgelabz.Programs;

import java.util.Scanner;

import com.bridgelabz.Utility.Util;

public class BinarySwap {
	public static void main(String args[]) {

		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter nogretaer or equal to 128");
		number=Integer.parseInt(sc.nextLine());
		Util.binarySwap(number);
	}
}
