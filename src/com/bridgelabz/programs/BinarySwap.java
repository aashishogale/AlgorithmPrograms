/***************************************************************************
* Purpose : To create class for exchanging nibbles
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
public class BinarySwap {
	public static void main(String args[]) {

		int number;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter no");
		number=Integer.parseInt(scanner.nextLine());
		String sbinary=Util.binary(number);
		System.out.println(sbinary);
		String swapped=Util.binarySwap(sbinary);
		System.out.println(swapped);
		System.out.println(Util.binaryToDecimal(swapped));
	}
}
