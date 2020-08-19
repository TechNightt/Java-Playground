// Source : https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/


/***************************************************************************************************************************************************************************************************************************************************
 * Given a string S of lowercase letters, a duplicate removal consists of choosing two adjacent and equal letters, and removing them.                                                                                                              *
 *                                                                                                                                                                                                                                                 *
 * We repeatedly make duplicate removals on S until we no longer can.                                                                                                                                                                              *
 *                                                                                                                                                                                                                                                 *
 * Return the final string after all such duplicate removals have been made.  It is guaranteed the answer is unique.                                                                                                                               *
 *                                                                                                                                                                                                                                                 *
 *                                                                                                                                                                                                                                                 *
 *                                                                                                                                                                                                                                                 *
 * Example 1:                                                                                                                                                                                                                                      *
 *                                                                                                                                                                                                                                                 *
 * Input: "abbaca"                                                                                                                                                                                                                                 *
 * Output: "ca"                                                                                                                                                                                                                                    *
 * Explanation:                                                                                                                                                                                                                                    *
 * For example, in "abbaca" we could remove "bb" since the letters are adjacent and equal, and this is the only possible move.  The result of this move is that the string is "aaca", of which only "aa" is possible, so the final string is "ca". *
 *                                                                                                                                                                                                                                                 *
 *                                                                                                                                                                                                                                                 *
 * Note:                                                                                                                                                                                                                                           *
 *                                                                                                                                                                                                                                                 *
 * 1 <= S.length <= 20000                                                                                                                                                                                                                          *
 * S consists only of English lowercase letters.                                                                                                                                                                                                   *
 **************************************************************************************************************************************************************************************************************************************************/
package com.leet_code.easy.q1047_remove_all_adjacent_duplicates_in_string.solution1;

import java.util.Stack;

/***************************************************************************************************************************************************************************************************************************************************
                                                                                                                                                                                                                *
 * Thoughts on implementation:                                                                                                                                                                                                                     *
 * I iterate through the String and add each letter to a stack. If letter exists in top of the stack than that means that these are adjacent letters in a String.                                                                                  *
 * Then I just take all letter and build a String that I return from the method.                                                                                                                                                                   *
 * This solution is faster than 42.47%                                                                                                                                                                                                             *
 * Time complexity is O(n)                                                                                                                                                                                                                         *
 * ************************************************************************************************************************************************************************************************************************************************/


class Solution {
    public static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<Character>(), stack_helper = new Stack<Character>();
        StringBuilder res = new StringBuilder();
        
        for(int i = 0; i < S.length(); ++i) {
        	if(!stack.empty()) {
        		char current_stack = stack.pop().charValue(), current_string = S.charAt(i);
        		if(current_stack != current_string) {
        			stack.push(current_stack);
        			stack.push(current_string);
        		}
        	} else {
        		stack.push(S.charAt(i));
        	}
        }

        while(!stack.empty()) 
        	stack_helper.push(stack.pop());
        
        while(!stack_helper.empty())
        	res.append(stack_helper.pop());

        return res.toString();       
    }
}