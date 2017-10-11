/***************************************************************************
* Purpose : To create class for binary conversion
*
* @author   Aashish
* @version  1.0
* @since    05-10-2017
****************************************************************************/

package com.bridgelabz.Programs;

import java.util.Scanner;

import com.bridgelabz.Utility.Util;

public class Binary {
	public static void main(String srgs[]) {

		int number;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter no");
		number = Integer.parseInt(sc.nextLine());
		System.out.println(Util.binary(number));
	}

}
