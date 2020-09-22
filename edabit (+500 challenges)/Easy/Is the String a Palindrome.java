/*********************************************************************************************************************
 Is the String a Palindrome?

A palindrome is a word that is identical forward and backwards.

mom
racecar
kayak
Given a word, create a function that checks whether it is a palindrome.

Examples
checkPalindrome("mom") ➞ true

checkPalindrome("scary") ➞ false

checkPalindrome("reviver") ➞ true

checkPalindrome("stressed") ➞ false

Notes
All test input is lower cased.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static boolean checkPalindrome(String str) {
		for (int i = 0 ; i < (str.length()/2) ; i++) {
			if (str.charAt(i) != str.charAt(str.length()-i-1)) {
				return false;
			}
		}
		return true;
	}
}


//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static boolean checkPalindrome(String str) {
		
		boolean ans = true;
		
		int len = str.length();
		
		for(int i = 0; i < len/2; i++) {
			
			if(str.charAt(i) != str.charAt(len - i- 1)) {
				
				ans = false;
				
			}
			
			
			
		}
		
		return ans;
		
		
	}
}


//#############################################################
//#                        MY SOLUTION 3   




public class Challenge {
	public static boolean checkPalindrome(String str) {
		StringBuilder sb = new StringBuilder();
		for(int i=str.length()-1;i>=0;i--){
			sb.append(str.charAt(i));
		}
		String str1 = sb.toString();
		return str1.equals(str) ? true : false;
	}
}


