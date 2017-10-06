package com.bridgelabz.Programs;
import com.bridgelabz.Utility.Util;
public class MonthlyLoan {
	public static void main(String args[]) {

		double P=Double.parseDouble(args[0]);
        float Y=Float.parseFloat(args[1]);
        float R=Float.parseFloat(args[2]);
		
		System.out.println(Util.calculatePayment(P,Y,R));
	}
}

