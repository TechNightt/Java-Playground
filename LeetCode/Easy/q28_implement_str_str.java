// Source : https://leetcode.com/problems/implement-strstr/

/*********************************************************************************************************************************************
 * Implement strStr().                                                                                                                       *
 *                                                                                                                                           *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.                                  *
 *                                                                                                                                           *
 * Example 1:                                                                                                                                *
 *                                                                                                                                           *
 * Input: haystack = "hello", needle = "ll"                                                                                                  *
 * Output: 2                                                                                                                                 *
 * Example 2:                                                                                                                                *
 *                                                                                                                                           *
 * Input: haystack = "aaaaa", needle = "bba"                                                                                                 *
 * Output: -1                                                                                                                                *
 * Clarification:                                                                                                                            *
 *                                                                                                                                           *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.                                *
 *                                                                                                                                           *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf() *
 ********************************************************************************************************************************************/
package com.leet_code.easy.q28_implement_str_str.solution1;

/*********************************************************************************************************************************************
                                                        														 *
 * Thoughts on implementation:                                                         														 *
 * I iterate on 'haystack' first and then when I find character that is the same as                                                          *
 * the starting character is the same. Then I iterate forward an check if all characters 													 *
 * are the same starting from the first character in the needle.        																	 *
 * This solution is faster than 06.09%                                                														 *
 * The time complexity is O(n^2)                                                         												     *
 ********************************************************************************************************************************************/



 public class Solution {  
	public int strStr(String haystack, String needle) {
		if(needle.length() == 0)
			return 0;
		if(needle.length() > haystack.length())
			return -1;
		char[] hayArr = haystack.toCharArray();
		char[] needleArr = needle.toCharArray();		
    	int j, i = -1;
    	for (; ++i < hayArr.length;) {
			if(hayArr[i] == needleArr[0]) {
				for (j = 0; ++j < needleArr.length &&
						    hayArr.length > j + i &&
						    needleArr[j] == hayArr[i + j];) {}
				if(j == needleArr.length)
					return i;
			}
    	}
    	return -1;
    }
}