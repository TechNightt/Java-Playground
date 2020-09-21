// Source : https://leetcode.com/problems/longest-common-prefix/

/******************************************************************************************
 * Write a function to find the longest common prefix string amongst an array of strings. *
 *                                                                                        *
 * If there is no common prefix, return an empty string "".                               *
 *                                                                                        *
 * Example 1:                                                                             *
 *                                                                                        *
 * Input: ["flower","flow","flight"]                                                      *
 * Output: "fl"                                                                           *
 * Example 2:                                                                             *
 *                                                                                        *
 * Input: ["dog","racecar","car"]                                                         *
 * Output: ""                                                                             *
 * Explanation: There is no common prefix among the input strings.                        *
 * Note:                                                                                  *
 *                                                                                        *
 * All given inputs are in lowercase letters a-z.                                         *
 ******************************************************************************************/
package com.leet_code.easy.q14_longest_common_prefix.solution1;


/***************************************************************************************************************************************
 * Thoughts on implementation:                                                                                                         *
 * Firstly I used the first String in String array as a matcher to every other String.                                                 *
 * I looped on every letter of the first String with every letter of every String in String array.                                     *
 * If the current String was shorter then the prefix of character that has been looped through than the prefix already found.          *
 * If the current character in current String is not the same as the current character in first String than prefix already found.      *
 * In any other case I continue to loop and after the whole array has been looped trough I add the current character to 'pref' String. *
 * This solution is faster than 100.00%                                                                                                *
 * Time complexity is O(n)                                                                                                             *
 **************************************************************************************************************************************/
public class Solution {
    public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) 
            return "";
	    String pref = strs[0];
	    for (int i = 1; i < strs.length; ++i) {
	        while (strs[i].indexOf(pref) != 0) {
	            pref = pref.substring(0, pref.length() - 1);
	            if (pref.length() == 0) 
                    return "";
	        }        
        }
	    return pref;   
    }
}