/***************************************************************************
* Purpose : To create class for find the time required for array sorting
*
* @author   Aashish
* @version  1.0
* @since    05-10-2017
****************************************************************************/

package com.bridgelabz.programs;

import com.bridgelabz.utility.Util;

/**
 * @author aashish
 *
 */

public class TimeSort {
	public static void main(String args[]) {

		long start;
		long elapsedTime;
		Long timearr[] = new Long[6];
		int j = 0;

		Integer[] array = { 21, 14, 15, 43, 54 };
		String[] sArray = { "abc", "bcdef", "afgddj", "abcdbd", "grda" };

		start = System.nanoTime();
		Util.iBubbleSort(array);
		elapsedTime = System.nanoTime() - start;
		System.out.println("integer bubble sort " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		start = System.nanoTime();
		Util.iBubbleSort(sArray);
		elapsedTime = System.nanoTime() - start;
		System.out.println("String bubble sort " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < sArray.length; i++) {
			System.out.println(sArray[i]);
		}

		Integer[] nArray = { 21, 14, 15, 43, 54 };
		String[] nsArray = { "abc", "bcdef", "afgddj", "abcdbd", "grda" };

		start = System.nanoTime();
		Util.sInsertionSort(nArray);
		elapsedTime = System.nanoTime() - start;
		System.out.println("integer insertion sort " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		start = System.nanoTime();
		Util.sInsertionSort(nsArray);
		elapsedTime = System.nanoTime() - start;
		System.out.println("String insertion sort " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		for (int i = 0; i < nArray.length; i++) {
			System.out.println(nArray[i]);
		}
		for (int i = 0; i < nsArray.length; i++) {
			System.out.println(nsArray[i]);
		}

		int ikey = 14;
		String skey = "abc";
		Integer[] barray = { 21, 14, 15, 43, 54 };
		String[] bsArray = { "abc", "bcdef", "afgddj", "abcdbd", "grda" };
		Util.iBubbleSort(barray);
		Util.iBubbleSort(bsArray);

		start = System.nanoTime();
		System.out.println("number found at index" + Util.iBinarySearch(barray, ikey, 0, array.length));
		elapsedTime = System.nanoTime() - start;
		System.out.println("integer binary search " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		start = System.nanoTime();
		System.out.println("String found at index" + Util.sBinarySearch(bsArray, skey, 0, sArray.length));
		elapsedTime = System.nanoTime() - start;
		System.out.println("integer binary search " + elapsedTime);
		timearr[j] = elapsedTime;

		Util.descBubbleSort(timearr);
		for (int i = 0; i < timearr.length; i++) {
			System.out.println(timearr[i]);
		}

	}
}
