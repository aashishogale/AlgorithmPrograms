/***************************************************************************
* Purpose : To create class for Prime numbers anagrams and prime number 
			anagram
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

			if (Util.checkPrime(i)) {
				for (int j = i + 1; j < 1000; j++) {
					if (Util.checkPrime(j)) {
						if (Util.checkAnagram(i, j)) {
							System.out.println(i + " " + j);
						}

					}

				}
			}
		}

	}

}
