/***************************************************************************
* Purpose : To create class for bubblesort
*
* @author   Aashish
* @version  1.0
* @since    05-10-2017
****************************************************************************/

package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Util;
import java.util.Scanner;

/*
 **get bubble sort for integer
 * @author aashish
 *
 */
public class BubbleSort {
	public static void main(String args[]) {
		int[] array = new int[5];
		System.out.println("enter in Values");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(sc.nextLine());
		}
		Util.iBubbleSort(array);

		System.out.println("Sorted int Values");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
