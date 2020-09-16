// Author  : Julian Ghoncharenko
// Date    : 28-06-2020
// Problem : Correct Capitalization

/*********************************************************************************************************************************************************************************************************************************************************
 * This question is asked by Google. Given a string, return whether or not it uses capitalization correctly. A string correctly uses capitalization if all letters are capitalized, no letters are capitalized, or only the first letter is capitalized. *
 *                                                                                                                                                                                                                                                       *
 * Ex: Given the following strings...                                                                                                                                                                                                                    *
 *                                                                                                                                                                                                                                                       *
 * "USA", return true                                                                                                                                                                                                                                    *
 * "Calvin", return true                                                                                                                                                                                                                                 *
 * "compUter", return false                                                                                                                                                                                                                              *
 * "coding", return true                                                                                                                                                                                                                                 *
 ********************************************************************************************************************************************************************************************************************************************************/
package com.daily_byte.date_28_06_2020_correct_capitalization;

class Solution {
	
	static boolean checkCaps(String str) {
		if(str.length() < 1)
			return true;
		
		boolean caps = str.charAt(1) >= 'A' && str.charAt(1) <= 'Z' ? true : false;
		
		for (int i = 1; i < str.length(); ++i) 
			if(caps && str.charAt(i) >= 'a' || !caps && str.charAt(i) <= 'Z')
				return false;
		
		return true;
	}
	
}