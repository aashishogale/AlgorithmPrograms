package com.bridgelabz.Programs;
import com.bridgelabz.Utility.Util;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class WordSearch {
	public static void main(String args[]) throws IOException{
		
		
	
		
		String str;
		

		BufferedReader breader=new BufferedReader(new FileReader("/home/bridgeit/Desktop/aashish-bridgelabz/Algorithm-Programs/test.txt"));
	
		str=breader.readLine();
		System.out.println(str);
		String []array=str.split(",");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);	
		}
		Util.sBubbleSort(array);
		System.out.println("Index at "+Util.sBinarySearch(array,"aashish",0,array.length));
		
	}
}

	
	

