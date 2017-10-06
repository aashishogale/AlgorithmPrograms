package com.bridgelabz.Programs;
import com.bridgelabz.Utility.Util;

public class PrimeRange {
		public static void main(String args[]) {
	
			for(int i=0;i<1000;i++) {
				if(Util.checkPrime(i)) {
					System.out.println(i);
				}
			
			}
		}	
}
		

	
