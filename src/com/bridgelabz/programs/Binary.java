/***************************************************************************
* Purpose : To create class for binary conversion
*
* @author   Aashish
* @version  1.0
* @since    05-10-2017
****************************************************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Util;

/**
 * @author aashish
 *
 */
public class Binary {
	public static void main(String srgs[]) {

		int number;
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter no");
		number = Integer.parseInt(scanner.nextLine());
		System.out.println(Util.binary(number));
	}

}
