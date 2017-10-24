/***************************************************************************
* Purpose : To create class for prime range
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
public class PrimeRange {
	public static void main(String args[]) {

		for (int i = 0; i < 1000; i++) {
			if (Util.checkPrime(i)) {
				System.out.println(i);
			}

		}
	}
}
