/***************************************************************************
* Purpose : To create class for calculating loan
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
public class MonthlyLoan {
	public static void main(String args[]) {

		double P = Double.parseDouble(args[0]);
		float Y = Float.parseFloat(args[1]);
		float R = Float.parseFloat(args[2]);

		System.out.println(Util.calculatePayment(P, Y, R));
	}
}
