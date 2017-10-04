package com.bridgelabz.lib;
public class TimeSort {
	public static void main(String args[]) {
		
		int []array={21,14,15,43,54};
		String []sArray={"abc","bcdef","afgddj","abcdbd","grda"};
		int []bIntSortArray=new int[array.length];
		String []bStrSortArray=new String[sArray.length];
		bIntSortArray=Util.iBubbleSort(array);
		bStrSortArray=Util.sBubbleSort(sArray);
		for(int i=0;i<bIntSortArray.length;i++) {
			System.out.println(bIntSortArray[i]);
		}
		for(int i=0;i<bStrSortArray.length;i++) {
			System.out.println(bStrSortArray[i]);
		}
		for(int i=0;i<sArray.length;i++) {
			System.out.println(sArray[i]);
		}
		
	}
}
			
	
