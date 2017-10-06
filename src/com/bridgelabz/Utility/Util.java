
package com.bridgelabz.Utility;

import java.util.Scanner;

public class Util {

	// convert to character array
	public static int[] convert(char firArray[], int firAscii[]) {
		for (int i = 0; i < firArray.length; i++) {

			firAscii[i] = (int) firArray[i];
		}
		return firAscii;

	}

	// sort the character array
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
	public static String toLowerCase(String string1) {

		String s2 = "", s3 = "";
		int aChar = 0;
		for (int i = 0; i < string1.length(); i++) {

			aChar = (int) string1.charAt(i);
			if (65 <= aChar && aChar <= 90) {
				s3 = Character.toString((char) ((aChar + 32)));
				s2 = s2 + s3;
			}

			else {
				s3 = Character.toString((char) ((aChar)));
				s2 = s2 + s3;

			}
		}
		return s2;
	}

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
	public static boolean checkPrime(int n) {

		// condition to check if no less than two
		if (n < 2) {
			return false;
		}

		// for loop to for checkin prime no
		for (int factor = 2; factor * factor <= n; factor++) {
			// if factor divides evenly into n, n is not prime, so break out of
			// loop
			if (n % factor == 0) {
				return false;

			}
		} // End of for loop
		return true;
	}

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

	// method for checking if numbers are anagram
	public static boolean checkAnagram(int number1, int number2) {
		int tempno = number1;
		int count1 = 0, count2 = 0, count = 0;

		// find the number of digits of first number
		while (tempno != 0) {
			tempno = tempno / 10;
			count1++;

		}
		tempno = number2;

		// find the number of digits second number
		while (tempno != 0) {
			tempno = tempno / 10;
			count2++;

		}

		if (count1 != count2)
			return false;

		// convert the numbers to array
		int arr1[] = new int[count1];
		int arr2[] = new int[count2];
		int i = 0;
		while (number1 != 0) {
			arr1[i] = number1 % 10;
			number1 = number1 / 10;
			i++;
		}
		i = 0;
		while (number2 != 0) {
			arr2[i] = number2 % 10;

			number2 = number2 / 10;
			i++;
		}

		// Sort the integer
		arr1 = sortInt(arr1);
		arr2 = sortInt(arr2);

		// check if digits are equal
		for (i = 0; i < arr1.length; i++) {
			if (arr1[i] == arr2[i]) {
				count++;
			}
		}
		return count == arr1.length;

	}

	// method for bubble sort for integer
	public static int[] iBubbleSort(int[] array) {
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

	// method for checking string bubblesort
	public static String[] sBubbleSort(String[] array) {
		String temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1].compareTo(array[j]) > 0) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}

	// method for integer insertion sort
	public static int[] iInsertionSort(int[] array) {

		int j;
		int temp;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i - 1;
			while (j >= 0 && temp < array[j]) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = temp;
		}

		return array;
	}

	// method for string insertion sort
	public static String[] sInsertionSort(String[] array) {

		int j;
		String temp;
		for (int i = 1; i < array.length; i++) {
			temp = array[i];
			j = i - 1;
			while (j >= 0 && temp.compareTo(array[j]) < 0) {
				array[j + 1] = array[j];
				j = j - 1;
			}
			array[j + 1] = temp;
		}

		return array;
	}

	// method for binary search
	public static int iBinarySearch(int[] sArray, int number, int low, int high) {

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
	public static long[] descBubbleSort(long[] array) {

		long temp;

		for (int i = 0; i < array.length; i++) {
			for (int j = 1; j < array.length - i; j++) {
				if (array[j - 1] < array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}

		return array;
	}

	// method for finding the number with user input
	public static void binarySearch(int low, int high) {
		int middle = (low + high) / 2;
		Scanner sc = new Scanner(System.in);
		char choice;
		if (low < high) {
			System.out.println("is your number between " + low + "and" + middle);
			choice = sc.next().charAt(0);
			if (choice == 'y')
				binarySearch(low, middle);
			else
				binarySearch(middle + 1, high);
		} else if (low == high)

			System.out.println("the no is " + low);

	}

	// method for vending machine
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
	public static int dayOfWeek(int day, int month, int year) {

		int m0, d0, y0, x;

		y0 = year - (14 - month) / 12;
		x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		m0 = month + 12 * ((14 - month) / 12) - 2;
		d0 = (day + x + 31 * m0 / 12) % 7;

		return d0;
	}

	// method for temperature conversion
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
	public static void mergeSort(String[] array, int start, int end) {

		int mid = (start + end) / 2;

		if (start < end) {

			mergeSort(array, start, mid);

			mergeSort(array, mid + 1, end);

			merge(array, start, mid, end);
		}
	}

	// method for merging the split array
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
	public static void binary(int nNumber) {

		int mDivision = 1;

		int counter = 0;

		// find the power of 2 from small to large

		while (mDivision <= nNumber / 2) {

			mDivision *= 2;

		}

		// prints the binary number from large to small

		while (mDivision > 0) {

			if (counter == 4) {
				System.out.print(" ");
				counter = 0;

			}

			if (nNumber < mDivision) {

				System.out.print("0");
				counter++;
			}

			else {
				System.out.print("1");

				nNumber -= mDivision;
				counter++;
			}

			mDivision /= 2;
		}
		System.out.println();

	}

	// method for binary swapping using nibble
	public static void binarySwap(int nNumber) {

		int mDivision = 1;

		int counter = 0;
		int convertCounter = 7;
		int checkDigit, finalNumber = 0;
		String newNumber = "";

		// stores 4 bits of each binary number
		String upperNibble, lowerNibble;

		// find the power of 2 from small to large

		while (mDivision <= nNumber / 2) {

			mDivision *= 2;
		}

		// prints the binary number from large to small

		while (mDivision > 0) {

			if (counter == 4) {
				System.out.print(" ");
				counter = 0;

			}

			if (nNumber < mDivision) {

				System.out.print("0");
				newNumber += "0";
				counter++;
			}

			else {

				System.out.print("1");

				newNumber += "1";
				nNumber -= mDivision;

				counter++;
			}

			mDivision /= 2;

		}

		System.out.println("no befor swapping" + newNumber);
		upperNibble = newNumber.substring(4, 8);
		lowerNibble = newNumber.substring(0, 4);

		newNumber = upperNibble + lowerNibble;
		System.out.println();
		System.out.println("no after swapping" + newNumber);

		for (int i = 0; i < newNumber.length(); i++) {

			checkDigit = Integer.parseInt(Character.toString(newNumber.charAt(i)));
			if (checkDigit == 1) {

				finalNumber += (int) Math.pow(2, convertCounter);
				convertCounter--;
			}

			else {

				convertCounter--;

			}
		}

		System.out.println(finalNumber);

	}

	public static void deadLine(int[][] array, int rows, int columns) {

		int temp;
		int currentTime = 0;
		for (int j = 0, i = 1; j < columns; j++) {
			if (array[i][j] > array[i][j + 1]) {
				temp = array[i][j];
				array[i][j] = array[i][j + 1];
				array[i][j + 1] = array[i][j];
				i = 0;
				temp = array[i][j];
				array[i][j] = array[i][j + 1];
				array[i][j + 1] = array[i][j];
			}

		}
	}

	public static void startTime(int [][]array,int currentTime) {

		currentTime++;
		int i=0;
		int j=0;
		array[i][j]--;
		array[i+1][j+1]--;
		if((array[i][j]==0)&&(array[i][j]>array[i+1][j])) {
			
			
			







	}

}

}
