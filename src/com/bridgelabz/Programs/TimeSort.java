/***************************************************************************
* Purpose : To create class for find the time required for array sorting
*
* @author   Aashish
* @version  1.0
* @since    05-10-2017
****************************************************************************/

package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Util;
/**
 * @author aashish
 *
 */

public class TimeSort {
	public static void main(String args[]) {

		long start, elapsedTime;
		long timearr[] = new long[6];
		int j = 0;

		int[] array = { 21, 14, 15, 43, 54 };
		String[] sArray = { "abc", "bcdef", "afgddj", "abcdbd", "grda" };
		int[] bIntSortArray = new int[array.length];
		String[] bStrSortArray = new String[sArray.length];

		start = System.nanoTime();
		bIntSortArray = Util.iBubbleSort(array);
		elapsedTime = System.nanoTime() - start;
		System.out.println("integer bubble sort " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		start = System.nanoTime();
		bStrSortArray = Util.sBubbleSort(sArray);
		elapsedTime = System.nanoTime() - start;
		System.out.println("String bubble sort " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		for (int i = 0; i < bIntSortArray.length; i++) {
			System.out.println(bIntSortArray[i]);
		}
		for (int i = 0; i < bStrSortArray.length; i++) {
			System.out.println(bStrSortArray[i]);
		}

		int[] nArray = { 21, 14, 15, 43, 54 };
		String[] nsArray = { "abc", "bcdef", "afgddj", "abcdbd", "grda" };
		int[] iIntSortArray = new int[array.length];
		String[] iStrSortArray = new String[sArray.length];

		start = System.nanoTime();
		iIntSortArray = Util.iInsertionSort(nArray);
		elapsedTime = System.nanoTime() - start;
		System.out.println("integer insertion sort " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		start = System.nanoTime();
		iStrSortArray = Util.sInsertionSort(nsArray);
		elapsedTime = System.nanoTime() - start;
		System.out.println("String insertion sort " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		for (int i = 0; i < bIntSortArray.length; i++) {
			System.out.println(iIntSortArray[i]);
		}
		for (int i = 0; i < bStrSortArray.length; i++) {
			System.out.println(iStrSortArray[i]);
		}

		int ikey = 14;
		String skey = "abc";
		int[] barray = { 21, 14, 15, 43, 54 };
		String[] bsArray = { "abc", "bcdef", "afgddj", "abcdbd", "grda" };
		bIntSortArray = Util.iBubbleSort(barray);
		bStrSortArray = Util.sBubbleSort(bsArray);

		start = System.nanoTime();
		System.out.println("number found at index" + Util.iBinarySearch(bIntSortArray, ikey, 0, array.length));
		elapsedTime = System.nanoTime() - start;
		System.out.println("integer binary search " + elapsedTime);
		timearr[j] = elapsedTime;
		j++;

		start = System.nanoTime();
		System.out.println("String found at index" + Util.sBinarySearch(bStrSortArray, skey, 0, sArray.length));
		elapsedTime = System.nanoTime() - start;
		System.out.println("integer binary search " + elapsedTime);
		timearr[j] = elapsedTime;

		Util.descBubbleSort(timearr);
		for (int i = 0; i < timearr.length; i++) {
			System.out.println(timearr[i]);
		}

	}
}
