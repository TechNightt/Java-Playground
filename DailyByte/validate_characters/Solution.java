// Problem : Validate Characters

/*************************************************************************************************************************************************************************************************
 * This question is asked by Google. Given a string only containing the following characters (, ), {, }, [, and ] return whether or not the opening and closing characters are in a valid order. *
 *                                                                                                                                                                                               *
 * Ex: Given the following strings...                                                                                                                                                            *
 *                                                                                                                                                                                               *
 * "(){}[]", return true                                                                                                                                                                         *
 * "(({[]}))", return true                                                                                                                                                                       *
 * "{(})", return false                                                                                                                                                                          *
 ************************************************************************************************************************************************************************************************/
package com.daily_byte.date_16_07_2020_validate_characters;

import java.util.Stack;

class Solution {

	public static boolean validateCharacters(String str) {
		Stack<Character> stack = new Stack<Character>();
		
		for(int i = 0; i < str.length(); ++i) {
			char cur = str.charAt(i);
			
			if(cur == '{' || cur == '(' || cur == '[') {
				stack.push(str.charAt(i));
			} else {
				char curStack = stack.pop();
				if(Math.abs(curStack - cur) > 2)
					return false;
			}
		}
		
		if(stack.size() == 0)
			return true;
		return false;
	}
	
}