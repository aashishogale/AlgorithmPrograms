/***************************************************************************
* Purpose : To create class for calculating loan
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
public class MonthlyLoan {
	public static void main(String args[]) {

		double Principal = Double.parseDouble(args[0]);
		float Year = Float.parseFloat(args[1]);
		float Rate = Float.parseFloat(args[2]);

		System.out.println(Util.calculatePayment(Principal, Year, Rate));
	}
}
