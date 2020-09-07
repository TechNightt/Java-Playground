// Author  : Julian Ghoncharenko
// Date    : 08-08-2020
// Problem : Remove Adjacent Duplicates

/****************************************************************************************************************************************************************************
 * This question is asked by Facebook. Given a string s containing only lowercase letters, continuously remove adjacent characters that are the same and return the result. *
 *                                                                                                                                                                          *
 * Ex: Given the following strings...                                                                                                                                       *
 *                                                                                                                                                                          *
 * s = "abccba", return ""                                                                                                                                                  *
 * s = "foobar", return "fbar"                                                                                                                                              *
 * s = "abccbefggfe", return "a"                                                                                                                                            *
 ***************************************************************************************************************************************************************************/
package com.daily_byte.date_18_07_2020_remove_adjacent_duplicates;

import java.util.Stack;

class Solution {

	public static String removeAdjacentDuplicates(String str) {
		Stack<Character> stack = new Stack<Character>(), helper = new Stack<Character>();
		StringBuilder res = new StringBuilder();
		
		for(int i = 0; i < str.length(); ++i) {
			if(!stack.empty()) {
				char cur = stack.pop();
				if(cur != str.charAt(i)) {
					stack.push(cur);
					stack.push(str.charAt(i));
				}
			} else {
				stack.push(str.charAt(i));
			}
		}
		
		while(!stack.empty() ) 
			helper.push(stack.pop());
		
		while(!helper.empty()) 
			res.append(helper.pop());
		
		return res.toString();
	}
	
}