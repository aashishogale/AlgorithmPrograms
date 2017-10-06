package com.bridgelabz.Programs;
import com.bridgelabz.Utility.Util;
import java.util.Scanner;
public class BubbleSort {
	public static void main(String args[]) {
		int []array=new String[5];
		System.out.println("enter String Values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<array.length;i++) {
			array[i]=sc.nextLine();
		}
		Util.iBubbleSort(array);
		
		System.out.println("Sorted String Values");
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
