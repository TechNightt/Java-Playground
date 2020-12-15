// Source : https://leetcode.com/problems/increasing-decreasing-string/

/********************************************************************************************************************************************
 * Given a string s. You should re-order the string using the following algorithm:                                                          *
 *                                                                                                                                          *
 * Pick the smallest character from s and append it to the result.                                                                          *
 * Pick the smallest character from s which is greater than the last appended character to the result and append it.                        *
 * Repeat step 2 until you cannot pick more characters.                                                                                     *
 * Pick the largest character from s and append it to the result.                                                                           *
 * Pick the largest character from s which is smaller than the last appended character to the result and append it.                         *
 * Repeat step 5 until you cannot pick more characters.                                                                                     *
 * Repeat the steps from 1 to 6 until you pick all characters from s.                                                                       *
 * In each step, If the smallest or the largest character appears more than once you can choose any occurrence and append it to the result. *
 *                                                                                                                                          *
 * Return the result string after sorting s with this algorithm.                                                                            *
 *                                                                                                                                          *
 *                                                                                                                                          *
 *                                                                                                                                          *
 * Example 1:                                                                                                                               *
 *                                                                                                                                          *
 * Input: s = "aaaabbbbcccc"                                                                                                                *
 * Output: "abccbaabccba"                                                                                                                   *
 * Explanation: After steps 1, 2 and 3 of the first iteration, result = "abc"                                                               *
 * After steps 4, 5 and 6 of the first iteration, result = "abccba"                                                                         *
 * First iteration is done. Now s = "aabbcc" and we go back to step 1                                                                       *
 * After steps 1, 2 and 3 of the second iteration, result = "abccbaabc"                                                                     *
 * After steps 4, 5 and 6 of the second iteration, result = "abccbaabccba"                                                                  *
 * Example 2:                                                                                                                               *
 *                                                                                                                                          *
 * Input: s = "rat"                                                                                                                         *
 * Output: "art"                                                                                                                            *
 * Explanation: The word "rat" becomes "art" after re-ordering it with the mentioned algorithm.                                             *
 * Example 3:                                                                                                                               *
 *                                                                                                                                          *
 * Input: s = "leetcode"                                                                                                                    *
 * Output: "cdelotee"                                                                                                                       *
 * Example 4:                                                                                                                               *
 *                                                                                                                                          *
 * Input: s = "ggggggg"                                                                                                                     *
 * Output: "ggggggg"                                                                                                                        *
 * Example 5:                                                                                                                               *
 *                                                                                                                                          *
 * Input: s = "spo"                                                                                                                         *
 * Output: "ops"                                                                                                                            *
 *                                                                                                                                          *
 *                                                                                                                                          *
 * Constraints:                                                                                                                             *
 *                                                                                                                                          *
 * 1 <= s.length <= 500                                                                                                                     *
 * s contains only lower-case English letters.                                                                                              *
 *******************************************************************************************************************************************/
package com.leet_code.easy.q1370_increasing_decreasing_string.solution1;

/********************************************************************************************************************************************
 * Thoughts on implementation:                                                                                                              *
 * I iterate on the String that is received by the method and count frequency of each character.                                            *
 * Then I iterate on the map until the result String length is not the same as length of the received String.                               *
 * This solution is faster than 80.37%                                                                                                      *
 * Time complexity is O(n)                                                                                                                  *
 * *****************************************************************************************************************************************/
public class Solution {
    public static String sortString(String s) {
        int[] map = new int[26];
        char[] chars = s.toCharArray();
        StringBuilder res = new StringBuilder();
        
        for(int i = chars.length - 1; i >= 0; --i) 
        	++map[chars[i] - 97];
        
        while(res.length() != chars.length) {
        	for(int i = 0; i < map.length; ++i) {
        		if(map[i] > 0) {
        			--map[i];
        			res.append((char) (i + 97));
        		}
        	}
        	for(int i = map.length - 1; i >= 0; --i) {
        		if(map[i] > 0) {
        			--map[i];
        			res.append((char) (i + 97));
        		}
        	}
        }
        
        return res.toString();
    }
}