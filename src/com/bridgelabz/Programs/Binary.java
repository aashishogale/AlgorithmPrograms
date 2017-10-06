package com.bridgelabz.Programs;

import java.util.Scanner;

import com.bridgelabz.Utility.Util;
public class Binary {
	public static void main(String srgs[]) {
		
		int number;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		number=Integer.parseInt(sc.nextLine());
		Util.binary(number);
	}
		
}
