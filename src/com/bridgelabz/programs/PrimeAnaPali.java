/***************************************************************************
* Purpose : To create class for Prime numbers anagrams and prime number 
			anagram
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
public class PrimeAnaPali {
	public static void main(String args[]) {

		System.out.println("Palindrome");

		for (int i = 10; i < 1000; i++) {
			if (Util.checkPrime(i)) {
				if (Util.checkPalindrome(i)) {
					System.out.println(i);

				}

			}
		}

		System.out.println("Anagram");
		for (int i = 0; i < 1000; i++) {

			for (int j = i + 1; j < 1000; j++) {
				if ((Util.checkPrime(i) && Util.checkPrime(j) && Util.checkAnagram(i, j))) {

					System.out.println(i + " " + j);
				}

			}

		}

	}

}
