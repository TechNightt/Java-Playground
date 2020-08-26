

/*******************************************************************************************************************************************************
 * This question is asked by Facebook. Given a string and the ability to delete at most one character, return whether or not it can form a palindrome. *
 * Note: a palindrome is a sequence of characters that reads the same forwards and backwards.                                                          *
 *                                                                                                                                                     *
 * Ex: Given the following strings...                                                                                                                  *
 *                                                                                                                                                     *
 * "abcba", return true                                                                                                                                *
 * "foobof", return true (remove the first 'o', the second 'o', or 'b')                                                                                *
 * "abccab", return false                                                                                                                              *
 ******************************************************************************************************************************************************/
package com.daily_byte.date_01_07_2020_valid_palindrome_with_removal;

class Solution {

	public static boolean canFormPalindrome(String str) {
		if(isPalindrome(str))
			return true;
		for (int i = 0; i < str.length(); ++i) {
			if(isPalindrome(str.substring(0, i) + str.substring(i + 1, str.length())))
				return true;
		}
		return false;
	}
	
	private static boolean isPalindrome(String str) {
		for(int i = 0; i < str.length() / 2; ++i) 
			if(str.charAt(i) != str.charAt(str.length() - 1 - i))
				return false;
		return true;
	}	
	
}