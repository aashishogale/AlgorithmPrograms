/***************************************************************************
* Purpose : To create class for bubblesort
*
* @author   Aashish
* @version  1.0
* @since    05-10-2017
****************************************************************************/

package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Util;

/*
 **get bubble sort for integer
 * @author aashish
 *
 */
public class BubbleSort {
	public static void main(String args[]) {
		Integer[] array = new Integer[5];
		System.out.println("enter in Values");
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(scanner.nextLine());
		}
		Util.iBubbleSort(array);

		System.out.println("Sorted int Values");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
