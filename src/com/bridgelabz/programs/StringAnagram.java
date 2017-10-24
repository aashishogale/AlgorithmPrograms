/***************************************************************************
* Purpose : To create class for String anagram
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
public class StringAnagram {
	public static void main(String args[]) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("enter String 1");
		
		String string1=scanner.nextLine();
	System.out.println("enter String 2");
		
		String string2=scanner.nextLine();
		
		if(Util.isAnagram(string1, string2)) {
			System.out.println("Strings are anagram");
		}
		else {
			System.out.println("Strings are not anagram");
			
		}
	}
}
