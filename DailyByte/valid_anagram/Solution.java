// Problem : Valid Anagram

/*************************************************************************************************************
 * This question is asked by Facebook. Given two strings s and t return whether or not s is an anagram of t. *
 * Note: An anagram is a word formed by reordering the letters of another word.                              *
 *                                                                                                           *
 * Ex: Given the following strings...                                                                        *
 *                                                                                                           *
 * s = "cat", t = "tac", return true                                                                         *
 * s = "listen", t = "silent", return true                                                                   *
 * s = "program", t = "function", return false                                                               *
 ************************************************************************************************************/

 package com.daily_byte.date_04_07_2020_valid_anagram;

import java.util.HashMap;

class Solution {
	
	static boolean validAnagram(String s, String t) {
		if (s.length() != t.length())
			return false;
		
		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		
		for(int i = 0; i < s.length(); ++i) {
			map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
		}
		
		for(int i = 0; i < t.length(); ++i) {
			Integer c = map1.get(t.charAt(i));
			if(c == null || c == 0)
				return false;
			map1.put(t.charAt(i), c - 1);
		}
		
		return true;
	}
	
}