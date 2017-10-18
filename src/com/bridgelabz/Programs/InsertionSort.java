/***************************************************************************
* Purpose : To create class for Insertion Sort of string
*
* @author   Aashish
* @version  1.0
* @since    05-10-2017
****************************************************************************/

package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Util;
import java.util.Scanner;
/**
 * @author aashish
 *
 */
public class InsertionSort {
	public static void main(String args[]) {
		String[] array = new String[5];
		System.out.println("enter String Values");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextLine();
		}
		scanner.close();
		Util.sInsertionSort(array);

		System.out.println("Sorted String Values");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
