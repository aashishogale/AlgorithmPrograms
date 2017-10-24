package com.bridgelabz.programs;
import com.bridgelabz.utility.Util;
/**
 * @author aashish
 *
 */
public class TemperatureConv {
	public static void main(String args[]) {
		
		double celsius=Double.parseDouble(args[0]);
        double fahrenheit=Double.parseDouble(args[1]);
		Util.temperatureConversion(celsius,fahrenheit);
	}
}
          







