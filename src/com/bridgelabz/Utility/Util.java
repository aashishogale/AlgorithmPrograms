
package com.bridgelabz.Utility;

import java.util.Scanner;

public class Util {

	// convert to character array
	/**
	 * purpose:convert to character array
	 * @param firArray
	 * @param firAscii
	 * @return firAscii
	 */
	public static int[] convert(char firArray[], int firAscii[]) {
		for (int i = 0; i < firArray.length; i++) {

			firAscii[i] = (int) firArray[i];
		}
		return firAscii;

	}

	// sort the character array
	/**
	 * purpose:sort character array
	 *
	 * @param firAscii
	 * @return firAscii
	 */
	
	public static int[] sort(int firAscii[]) {
		int temp = 0;
		for (int i = 0; i < firAscii.length; i++) {
			for (int j = 1; j < (firAscii.length - i); j++) {
				if (firAscii[j - 1] > firAscii[j]) {

					temp = firAscii[j - 1];
					firAscii[j - 1] = firAscii[j];
					firAscii[j] = temp;
				}
			}

		}
		return firAscii;
	}

	// convert to lower case
	/**
	 * purpose:convert to lower case
	 * @param string1
	 * 
	 * @return string2
	 */
	public static String toLowerCase(String string1) {

		String string2 = "", string3 = "";
		int aChar = 0;
		for (int i = 0; i < string1.length(); i++) {

			aChar = (int) string1.charAt(i);
			if (65 <= aChar && aChar <= 90) {
				string3 = Character.toString((char) ((aChar + 32)));
				string2 = string2 + string3;
			}

			else {
				string3 = Character.toString((char) ((aChar)));
				string2 = string2 + string3;

			}
		}
		return string2;
	}
	
	/**
	 * purpose:check for anagram
	 * @param firString
	 * @param secString
	 * @return boolean
	 */

	public static boolean isAnagram(String firString, String secString) {

		// String to lower Case
		firString = toLowerCase(firString);
		secString = toLowerCase(secString);

		// String to character Array
		char[] firArray = firString.toCharArray();
		char[] secArray = secString.toCharArray();

		int firAscii[] = new int[firArray.length + 1];
		int secAscii[] = new int[secArray.length + 1];

		if (firArray.length != secArray.length) {
			return false;
		}

		int count = 0;

		// character array to ascii value array
		firAscii = convert(firArray, firAscii);
		secAscii = convert(secArray, secAscii);

		// sort the array
		firAscii = sort(firAscii);
		secAscii = sort(secAscii);

		for (int i = 0; i < firAscii.length; i++) {
			if (firAscii[i] == secAscii[i]) {
				count++;
			}
		}
		return count == firAscii.length;

	}

	// funtion to check prime no
	/**
	 * purpose:check if no is prime
	 * @param number
	 *
	 * @return boolean
	 */
	public static boolean checkPrime(int number) {

		// condition to check if no less than two
		if (number < 2) {
			return false;
		}

		// for loop to for checkin prime no
		for (int factor = 2; factor * factor <= number; factor++) {
			// if factor divides evenly into n, n is not prime, so break out of
			// loop
			if (number % factor == 0) {
				return false;

			}
		} // End of for loop
		return true;
	}
	/**
	 * purpose:check for palindrome
	 * @param number
	 *  
	 * @return boolean
	 */

	public static boolean checkPalindrome(int number) {

		int tempno = 0;
		int originalnumber = number;
		while (number != 0) {
			tempno = 10 * tempno + (number % 10);
			number = number / 10;

		}
		if (originalnumber == tempno)
			return true;
		else
			return false;
	}

	// method for integer sorting
	/**
	 * purpose:sort int
	 * @param array
	 *
	 * @return array
	 */
	public static int[] sortInt(int[] array) {
		int temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}
	/**
	 * purpose:count the number of digits
	 * @param number
	 *
	 * @return count
	 */

	public static int numberCount(int number) {
		int count = 0;
		int tempno = number;

		// find the number of digits of first number
		while (tempno != 0) {
			tempno = tempno / 10;
			count++;

		}
		return count;

	}
	/**
	 * purpose:convert number toi nteger array
	 * @param array
	 * @param number
	 * @return
	 */

	public static void convertIntArray(int[] array, int number) {
		int i = 0;

		while (number != 0) {
			array[i] = number % 10;
			number = number / 10;
			i++;
		}

	}

	// method for checking if numbers are anagram
	/**
	 * purpose check if numbers are anagram
	 * @param number1;
	 * @param number2;
	 * @return boolean
	 */
	public static boolean checkAnagram(int number1, int number2) {

		int count1 = numberCount(number1);
		int count2 = numberCount(number2);
		int count = 0;

		if (count1 != count2)
			return false;

		// convert the numbers to array
		int arr1[] = new int[count1];
		int arr2[] = new int[count2];

		convertIntArray(arr1, number1);
		convertIntArray(arr2, number2);

		// Sort the integer
		arr1 = sortInt(arr1);
		arr2 = sortInt(arr2);

		// check if digits are equal
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				count++;
			}
		}
		return count == arr1.length;

	}

	// method for bubble sort for integer
	/**
	 * purpose:bubblesort 
	 * @param array
	 * @return 
	 *
	 * @return array
	 */
	public static <T extends Comparable<T>> void iBubbleSort(T[] array) {
		T temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] .compareTo(array[j])>0) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

		
	}

	// method for checking string bubblesort
	



	/**
	 * purpose:insertionsort 
	 * @param array
	 * @return 
	 *
	 * @return array
	 */
	public static <T extends Comparable<T>> void sInsertionSort(T[] array) {

		int j;
	T temp;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i - 1;
			while (j >= 0 && temp.compareTo(array[j]) < 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = temp;
		}

	
	}

	// method for binary search
	/**
	 * purpose:binary search integer
	 * @param sarray,number,low,high
	 *
	 * @return array
	 */
	public static int iBinarySearch(Integer[] sArray, int number, int low, int high) {

		int mid = (low + high) / 2;
		if (sArray[mid] < number) {
			return (iBinarySearch(sArray, number, mid, sArray.length));
		}
		if (sArray[mid] > number) {
			return (iBinarySearch(sArray, number, 0, mid));
		}
		if (sArray[mid] == number) {
			return mid;
		} else
			return 0;
	}

	// method for finding String binary search
	/**
	 * purpose:binary search String
	 * @param sarray,number,low,high
	 *
	 * @return array
	 */
	public static int sBinarySearch(String[] sArray, String word, int low, int high) {

		int mid = (low + high) / 2;

		if (sArray[mid].compareTo(word) < 0) {
			return (sBinarySearch(sArray, word, mid, sArray.length));
		}
		if (sArray[mid].compareTo(word) > 0) {
			return (sBinarySearch(sArray, word, 0, mid));
		}

		if (sArray[mid].compareTo(word) == 0) {
			return mid;
		} else
			return 0;
	}

	// method for descending bubble sort
	/**
	 * purpose:bubble sort integer in descending
	 * @param array
	 * @return 
	 *
	 * @return array
	 */
	
	public static <T extends Comparable<T>> void descBubbleSort(T[] array) {

	T temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1].compareTo(array[j]) <0) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

	
	}

	// method for finding the number with user input
	/**
	 * purpose:binary search integer
	 * @param,low,high
	 *
	 * @return 
	 */
	public static void binarySearch(int low, int high) {
		int middle = (low + high) / 2;
		Scanner scanner = new Scanner(System.in);
		char choice;
		if (low < high) {
			System.out.println("is your number between " + low + "and" + middle);
			choice = scanner.next().charAt(0);
			if (choice == 'y')
				binarySearch(low, middle);
			else
				binarySearch(middle + 1, high);
		} else if (low == high)

			System.out.println("the no is " + low);

	}

	// method for vending machine
	/**
	 * purpose:Vending machine
	 * @param notesNo,change,pos
	 *
	 * @return array
	 */
	public static void noteCheck(int[] notesNo, int change, int pos) {

		int[] noteList = { 1000, 500, 100, 50, 10, 5, 2, 1 };

		if (pos < noteList.length) {
			if (change < noteList[pos]) {
				pos++;
				noteCheck(notesNo, change, pos);

			} else {
				change = change - noteList[pos];
				notesNo[pos]++;

				noteCheck(notesNo, change, pos);
			}
		}

	}

	// method for calculating day of week
	/**
	 * purpose:calculate day of week
	 * @param day,month,year
	 *
	 * @return day
	 */
	public static int dayOfWeek(int day, int month, int year) {

		int m0, d0, y0, x;

		y0 = year - (14 - month) / 12;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = month + 12 * ((14 - month) / 12) - 2;
		d0 = (day + x + 31 * m0 / 12) % 7;

		return d0;
	}

	// method for temperature conversion
	/**
	 * purpose:convert temperature
	 * @param celsius,fahrenheit
	 *
	 * @return 
	 */
	public static void temperatureConversion(double celsius, double fahrenheit) {

		double fahr = (celsius * 9 / 5) + 32;
		double cels = (fahrenheit - 32) * 5 / 9;

		System.out.println(fahr + " F  " + cels + "  C");
	}

	// method for calculating payment
	public static double calculatePayment(double P, float Y, float R) {

		float n = Y * 12;
		double r = R / 12 / 100;

		// apply formula
		double payment = (P * r) / (1 - Math.pow(1 + r, -n));

		return payment;
	}

	// method for splitting array for merge sort
	/**
	 * purpose:split the array
	 * @param array,start,end
	 *
	 * @return array
	 */
	public static void mergeSort(String[] array, int start, int end) {

		int mid = (start + end) / 2;

		if (start < end) {

			mergeSort(array, start, mid);

			mergeSort(array, mid + 1, end);

			merge(array, start, mid, end);
		}
	}

	// method for merging the split array
	/**
	 * purpose:mergesort
	 * @param sarray,start,mid,end
	 *
	 * @return 
	 */
	public static void merge(String[] array, int start, int mid, int end) {

		int p = start;
		int q = mid + 1;
		String[] tArray = new String[end - start + 1];
		int k = 0;

		for (int i = start; i <= end; i++) {

			if (p > mid) {
				tArray[k++] = array[q++];
			}

			else if (q > end) {
				tArray[k++] = array[p++];
			}

			else if (array[p].compareTo(array[q]) < 0) {

				tArray[k++] = array[p++];

			} else {
				tArray[k++] = array[q++];
			}
		}

		for (int i = 0; i < k; i++) {
			array[start++] = tArray[i];

		}
	}

	// method for converting decimal to binary
	/**
	 * purpose:convert to binary
	 * @param number
	 *
	 * @return binary
	 */
	public static String binary(int number) {

		int rem;
		String bin[] = { "0", "1" };
		String binary = "";
		int padding = 0;
		while (number > 0 || padding % 8 != 0) {
			rem = number % 2;
			binary = bin[rem] + binary;
			number = number / 2;
			padding++;
			if (padding % 4 == 0 && number != 0) {
				binary = " " + binary;

			}
		}
		return binary;
}
	

	// method for binary swapping using nibble
	/**
	 * purpose:binary swap 
	 * @param binary
	 *
	 * @return decimal
	 */
	public static String binarySwap(String binary) {

		binary = binary.replaceAll(" ", "");
		String lowerNibble = binary.substring(0, 4);
		String upperNibble = binary.substring(4, 8);
		String swappedBinary = upperNibble + lowerNibble;
       return swappedBinary;

	}
	/**
	 * purpose:convert to decimal
	 * @param binary
	 *
	 * @return decimal
	 */
	
	public static int binaryToDecimal(String binary) {
		int decimal = 0, power = 0;
		binary = binary.replaceAll(" ", "");
		int index = binary.length() - 1;
		while (index >= 0) {
			decimal = decimal+(int)(Integer.parseInt(binary.charAt(index) + "") * Math
					.pow(2, power));
			power++;
			index--;
		}
		return decimal;

}
	


	public static void startTime(int[][] array, int currentTime) {

		currentTime++;
		int i = 0;
		int j = 0;
		array[i][j]--;
		array[i + 1][j + 1]--;
		if ((array[i][j] == 0) && (array[i][j] > array[i + 1][j])) {

		}

	}

}
