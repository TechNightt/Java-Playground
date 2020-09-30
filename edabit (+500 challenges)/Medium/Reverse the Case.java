/*********************************************************************************************************************
 Reverse the Case
Given a string, create a function to reverse the case. All lower-cased letters should be upper-cased, and vice versa.

Examples
reverseCase("Happy Birthday") ➞ "hAPPY bIRTHDAY"

reverseCase("MANY THANKS") ➞ "many thanks"

reverseCase("sPoNtAnEoUs") ➞ "SpOnTaNeOuS"
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   

import java.io.*;

public class Challenge {
	public static String reverseCase(String str) {
		
		for(int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				
				char c = Character.toUpperCase(str.charAt(i));
				
				str = str.substring(0, i) 
              + c
              + str.substring(i + 1, str.length()); 
				
			}else	if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				
				char c = Character.toLowerCase(str.charAt(i));
				
				str = str.substring(0, i) 
              + c
              + str.substring(i + 1, str.length()); 
				
			}
			
			
			
		}
		
		return str;
			
		
	}
}







//#############################################################
//#                        MY SOLUTION 2   


import java.lang.*; 
public class Challenge {
	public static String reverseCase(String str) {
		String reverseString = "";
		char ch = ' ';
		
   for(int i = 0; i < str.length(); i++)
		{
			if(Character.isUpperCase(str.charAt(i)) == true)
			{
			ch =	Character.toLowerCase(str.charAt(i));
			}else if(Character.isLowerCase(str.charAt(i)) == true)
			{
			ch = Character.toUpperCase(str.charAt(i));
			}else{
				ch = str.charAt(i);
			}
		 
		 reverseString += ch;
		}
		
		return reverseString;
	}
}




