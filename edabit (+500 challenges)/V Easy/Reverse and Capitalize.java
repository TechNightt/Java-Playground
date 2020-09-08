/*********************************************************************************************************************
 
Reverse and Capitalize

Create a function that takes a string of lowercase characters and returns that string reversed and in upper case.

Examples
reverseCapitalize("abc") ➞ "CBA"

reverseCapitalize("hellothere") ➞ "EREHTOLLEH"

reverseCapitalize("input") ➞ "TUPNI"

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String reverseCapitalize(String str) {
		 return new StringBuilder(str).reverse().toString().toUpperCase();
	}
}



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static String reverseCapitalize(String str) {
		 String s=str.toUpperCase();
		String k="";
		for(int i=s.length()-1;i>=0;i--)
		{
			k=k+s.charAt(i);
		}
		return k;
	}
}
