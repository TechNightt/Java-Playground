// Source : https://leetcode.com/problems/remove-outermost-parentheses/
// Author : Gregory
// Date   : 18-08-2020

/*****************************************************************************************************************************************************************************************************************************************************
 * A valid parentheses string is either empty (""), "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.  For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings. *
 *                                                                                                                                                                                                                                                   *
 * A valid parentheses string S is primitive if it is nonempty, and there does not exist a way to split it into S = A+B, with A and B nonempty valid parentheses strings.                                                                            *
 *                                                                                                                                                                                                                                                   *
 * Given a valid parentheses string S, consider its primitive decomposition: S = P_1 + P_2 + ... + P_k, where P_i are primitive valid parentheses strings.                                                                                           *
 *                                                                                                                                                                                                                                                   *
 * Return S after removing the outermost parentheses of every primitive string in the primitive decomposition of S.                                                                                                                                  *
 *                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                   *
 * Example 1:                                                                                                                                                                                                                                        *
 *                                                                                                                                                                                                                                                   *
 * Input: "(()())(())"                                                                                                                                                                                                                               *
 * Output: "()()()"                                                                                                                                                                                                                                  *
 * Explanation:                                                                                                                                                                                                                                      *
 * The input string is "(()())(())", with primitive decomposition "(()())" + "(())".                                                                                                                                                                 *
 * After removing outer parentheses of each part, this is "()()" + "()" = "()()()".                                                                                                                                                                  *
 * Example 2:                                                                                                                                                                                                                                        *
 *                                                                                                                                                                                                                                                   *
 * Input: "(()())(())(()(()))"                                                                                                                                                                                                                       *
 * Output: "()()()()(())"                                                                                                                                                                                                                            *
 * Explanation:                                                                                                                                                                                                                                      *
 * The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".                                                                                                                                            *
 * After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".                                                                                                                                                 *
 * Example 3:                                                                                                                                                                                                                                        *
 *                                                                                                                                                                                                                                                   *
 * Input: "()()"                                                                                                                                                                                                                                     *
 * Output: ""                                                                                                                                                                                                                                        *
 * Explanation:                                                                                                                                                                                                                                      *
 * The input string is "()()", with primitive decomposition "()" + "()".                                                                                                                                                                             *
 * After removing outer parentheses of each part, this is "" + "" = "".                                                                                                                                                                              *
 *                                                                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                                                   *
 * Note:                                                                                                                                                                                                                                             *
 *                                                                                                                                                                                                                                                   *
 * S.length <= 10000                                                                                                                                                                                                                                 *
 * S[i] is "(" or ")"                                                                                                                                                                                                                                *
 * S is a valid parentheses string                                                                                                                                                                                                                   *
 ****************************************************************************************************************************************************************************************************************************************************/
package com.leet_code.easy.q1021_remove_outermost_parentheses.solution1;

/*****************************************************************************************************************************************************************************************************************************************************
                                                                                                                                                                                                              *
 * Thoughts on implementation:                                                                                                                                                                                                                       *
 * In this implementation I run on all parentheses inside the String and check if the current character is opening parentheses or closing one.                                                                                                       *
 * This solution is faster than 08.67%                                                                                                                                                                                                               *
 * Time complexity is O(n)                                                                                                                                                                                                                           *
 * **************************************************************************************************************************************************************************************************************************************************/
public class Solution {  
	public static String removeOuterParentheses(String S) {
		String res = "";
		int h = 0;
		for (int i = 0; i < S.length(); ++i) {
			if(S.charAt(i) == '(' && ++h > 1) {
				res += "(";
			} else if(S.charAt(i) == ')' && --h > 0) {
				res += ")";
			}
		}
		return res;
    }    
}