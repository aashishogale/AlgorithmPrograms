/***************************************************************************
* Purpose : To create class for binary search
*
* @author   Aashish
* @version  1.0
* @since    05-10-2017
****************************************************************************/

package com.bridgelabz.Programs;

import com.bridgelabz.Utility.Util;

public class BinaryFind {

	public static void main(String args[]) {

		int limit = Integer.parseInt(args[0]);
		Util.binarySearch(0, limit - 1);
	}
}
