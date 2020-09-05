// Problem : Compare Keystrokes

/*****************************************************************************************************************************************************************************************************
 * This question is asked by Amazon. Given two strings s and t, which represents a sequence of keystrokes, where # denotes a backspace, return whether or not the sequences produce the same result. *
 *                                                                                                                                                                                                   *
 * Ex: Given the following strings...                                                                                                                                                                *
 *                                                                                                                                                                                                   *
 * s = "ABC#", t = "CD##AB", return true                                                                                                                                                             *
 * s = "como#pur#ter", t = "computer", return true                                                                                                                                                   *
 * s = "cof#dim#ng", t = "code", return false                                                                                                                                                        *
 ****************************************************************************************************************************************************************************************************/
package com.daily_byte.date_17_07_2020_compare_keystrokes;

class Solution {

	public static boolean compareKeystrokes(String str1, String str2) {
		str1 = buildWord(str1);
		str2 = buildWord(str2);
		return str1.equals(str2);
	}
	
	private static String buildWord(String str) {
		StringBuilder s1 = new StringBuilder();
		int toRemove = 0;
		for(int i = str.length() - 1; i >= 0; --i) {
			if(str.charAt(i) == '#') {
				++toRemove;
			} else if(toRemove > 0) {
				--toRemove;
			} else {
				s1.append(str.charAt(i));
			}
		}
		return s1.toString();
	}
	
}