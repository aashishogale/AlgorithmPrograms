/***************************************************************************
* Purpose : To create class for merge sort
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
public class MergeSort {
	public static void main(String args[]) {
		String[] array = new String[4];
		Scanner scanner = new Scanner(System.in);

		System.out.println(array.length);
		for (int i = 0; i < array.length; i++) {

			array[i] = scanner.nextLine();
		}
		scanner.close();
		Util.mergeSort(array, 0, array.length - 1);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

	}

}
