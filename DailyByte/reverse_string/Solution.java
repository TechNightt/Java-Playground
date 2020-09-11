
// Problem : Reverse String

/********************************************************************************************************************
 * This question is asked by Google. Given a string, reverse all of its characters and return the resulting string. *
 *                                                                                                                  *
 * Ex: Given the following strings...                                                                               *
 *                                                                                                                  *
 * �Cat�, return �taC�                                                                                              *
 * �The Daily Byte�, return "etyB yliaD ehT�                                                                        *
 * �civic�, return �civic�                                                                                          *
 *******************************************************************************************************************/
package com.daily_byte.date_25_06_2020_reverse_string;

class Solution {
	
	static String reverseString(String str) {
		String res = "";
		for (int i = str.length() - 1; i >= 0; --i) 
			res += str.charAt(i);
		return res;
	}
	
}