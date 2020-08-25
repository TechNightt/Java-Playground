
/*********************************************************************************************************************************************************
 * This question is asked by Microsoft. Given a string, return the index of its first unique character. If a unique character does not exist, return -1. *
 *                                                                                                                                                       *
 * Ex: Given the following strings...                                                                                                                    *
 *                                                                                                                                                       *
 * "abcabd", return 2                                                                                                                                    *
 * "thedailybyte", return 1                                                                                                                              *
 * "developer", return 0                                                                                                                                 *
 ********************************************************************************************************************************************************/

 package com.daily_byte.date_05_07_2020_first_unique_character;

class Solution {
	
	static int firstUniques(String str) {
		int len = str.length();
		boolean f;
		
		for(int i = 0; i < len; ++i) {
			f = false;
			for (int j = i + 1; j < len; ++j) {
				if(str.charAt(j) == str.charAt(i)) {
					f = true;
				}
			}
			if(!f) {
				return i;
			}
		}
		
		return -1;
	}
	
}