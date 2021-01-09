// Problem : Add Binary

/*********************************************************************************************************************************************
 * This question is asked by Apple. Given two binary strings (strings containing only 1s and 0s) return their sum (also as a binary string). *
 * Note: neither binary string will contain leading 0s unless the string itself is 0                                                         *
 *                                                                                                                                           *
 * Ex: Given the following binary strings...                                                                                                 *
 *                                                                                                                                           *
 * "100" + "1", return "101"                                                                                                                 *
 * "11" + "1", return "100"                                                                                                                  *
 * "1" + "0", return  "1"                                                                                                                    *
 ********************************************************************************************************************************************/
package com.daily_byte.date_29_06_2020_add_binary;

class Solution {
	
	public static String addBinary(String s1, String s2) {
		String res = "";
		int c = 0;
        int i = s1.length() - 1, j = s2.length() - 1;
        
        while (i >= 0 || j >= 0 || c == 1) { 
            c += (i >= 0) ? s1.charAt(i) - '0': 0; 
            c += (j >= 0) ? s2.charAt(j) - '0': 0; 
            res = (char)(c % 2 + '0') + res; 
            c /= 2; 
            --i; 
            --j; 
        }
        
        return res;
	}
	
}