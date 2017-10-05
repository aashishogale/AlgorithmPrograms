package com.bridgelabz.Programs;
import com.bridgelabz.Utility.Util;

public class PrimeAnaPali {
	public static void main(String args[]) {
		
		System.out.println("Palindrome");

		int palcount=0,anacount=0;
		for(int i=10;i<1000;i++) {
			if(Util.checkPrime(i)) {
				if(Util.checkPalindrome(i)) {
					System.out.println(i);
				
				}
		
			}
		}


		System.out.println("Anagram");
		for(int i=0;i<1000;i++) {
			
			if(Util.checkPrime(i)) {
				for(int j=i+1;j<1000;j++) {
					if(Util.checkPrime(j)) {
						if(Util.checkAnagram(i,j)) {
							System.out.println(i+" "+j);
						}
					
				
					}
		
				}
			}
		}
		

	}

}
