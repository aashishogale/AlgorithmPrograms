



package com.bridgelabz.lib;
public class Util {
	
	 
	//convert to character array
	public static int[] convert(char firArray[],int firAscii[])
	{
	 for (int i = 0; i < firArray.length; i++) {
				 
					firAscii[i]=(int)firArray[i];
				}
	return firAscii;
			

	}

//sort the character array
public static int[] sort(int firAscii[])
{
	int temp=0;
	for(int i=0; i < firAscii.length; i++){
		for(int j=1; j < (firAscii.length-i); j++){
			if(firAscii[j-1] > firAscii[j]){  

				temp = firAscii[j-1];  
				firAscii[j-1] = firAscii[j];  
				firAscii[j] = temp;  
			} 
		}

	}
	return firAscii;
}

	//convert to lower case
	public static String toLowerCase(String string1)
	{
	
		String s2="",s3="";
		int aChar=0;
		for (int i = 0; i< string1.length(); i++){

			aChar = (int)string1.charAt(i);
			if (65 <= aChar && aChar<=90){
			s3 = Character.toString((char)( (aChar + 32) )); 
			s2=s2+s3;
			}

			else{
			s3 = Character.toString((char)( (aChar) )); 
			s2=s2+s3;

			}  
		   }
		return s2;
		 }


    public static boolean isAnagram(String firString, String secString) {

        //String to lower Case
        firString=toLowerCase(firString);
        secString=toLowerCase(secString);
		
		//String to character Array
        char[] firArray = firString.toCharArray();
        char[] secArray = secString.toCharArray();

		       
		int firAscii[]=new int[firArray.length+1];
        int secAscii[]=new int[secArray.length+1];
        
        if (firArray.length != secArray.length) {
            return false;
        }

      
        int count = 0; 
		
		//character array to ascii value array  
        firAscii=convert(firArray,firAscii);
        secAscii=convert(secArray,secAscii);

		//sort the array
        firAscii=sort(firAscii);
        secAscii=sort(secAscii);   
       
        for (int i = 0; i < firAscii.length; i++) {
            if (firAscii[i] == secAscii[i]) {
                count++;
            }
        }
        return count == firAscii.length;

	}

  //funtion to check prime no
      public static boolean checkPrime(int n) {
     

      //condition to check if no less than two
      if (n < 2) { return false;
      }
      
      //for loop to for checkin prime no
      for (int factor = 2; factor*factor <= n; factor++) {
         // if factor divides evenly into n, n is not prime, so break out of loop
         if (n % factor == 0) {
             return false;
            
         }
      } // End of for loop
      return true;
	}

	public static boolean checkPalindrome(int number) {
		int tempno=0;
		int originalnumber=number;	
		while(number!=0) {
			tempno=10*tempno+(number%10);
			number=number/10;
	
				
		}
		if(originalnumber==tempno)
			return true;
		else
			return false;	
	}
	
	public static int[] sortInt(int []array) {
		int temp;
		
		for(int i=0;i<array.length;i++) {
			for(int j=1;j<array.length-i;j++) {
				if(array[j-1]>array[j]) {
					temp=array[j-1];
					array[j-1]=array[j];
					array[j]=temp;
                 }			
			}
		}
		
		
	return array;
	}
				
	
	public static boolean checkAnagram(int number1,int number2) {
		int tempno=number1;
		int count1=0,count2=0,count=0;
		while(tempno!=0) {
			tempno=tempno/10;
			count1++;
			
		}
		tempno=number2;
		while(tempno!=0) {
			tempno=tempno/10;
			count2++;

		}
			
		int arr1[]=new int[count1];
		int arr2[]=new int[count2];
		int i=0;
		while(number1!=0) {
			arr1[i]=number1%10;
			number1=number1/10;
			i++;
		}
		i=0;
		while(number2!=0) {
			arr2[i]=number2%10;
			
			number2=number2/10;
			i++;
		}
		if(arr1.length!=arr2.length)
			return false;

		



		arr1=sortInt(arr1);
		arr2=sortInt(arr2);


		


		for(i=0;i<arr1.length;i++) {
			if(arr1[i]==arr2[i]) {
				count++;
			}
		}
		return count==arr1.length;

				
	}	

}


