/***************************************************************************
* Purpose : To create class for Word search
*
* @author   Aashish
* @version  1.0
* @since    05-10-2017
****************************************************************************/

package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import com.bridgelabz.utility.Util;
/**
 * @author aashish
 *
 */
public class WordSearch {
	public static void main(String args[]) throws IOException {

		String fileString;

		BufferedReader breader = new BufferedReader(
				new FileReader("/home/bridgeit" + "/Desktop/aashish-bridgelabz/Algorithm-Programs/test.txt"));

		fileString = breader.readLine();
		System.out.println(fileString);
		String[] array = fileString.split(",");
		Util.iBubbleSort(array);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		Util.iBubbleSort(array);
		
		System.out.println("Index at " + Util.sBinarySearch(array, "sujit", 0, array.length));

	}
}
