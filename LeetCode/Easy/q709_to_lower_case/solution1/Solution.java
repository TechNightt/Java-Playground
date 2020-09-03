// Source : https://leetcode.com/problems/to-lower-case/

/***************************************************************************************************************
 * Implement function ToLowerCase() that has a string parameter str, and returns the same string in lowercase. *
 *                                                                                                             *
 *                                                                                                             *
 *                                                                                                             *
 * Example 1:                                                                                                  *
 *                                                                                                             *
 * Input: "Hello"                                                                                              *
 * Output: "hello"                                                                                             *
 * Example 2:                                                                                                  *
 *                                                                                                             *
 * Input: "here"                                                                                               *
 * Output: "here"                                                                                              *
 * Example 3:                                                                                                  *
 *                                                                                                             *
 * Input: "LOVELY"                                                                                             *
 * Output: "lovely"                                                                                            *
 **************************************************************************************************************/
package com.leet_code.easy.q709_to_lower_case.solution1;

/***************************************************************************************************************
 * This solution is faster than 12.33%                                                                         *
 * Time complexity is O(n)                                                                                     *
 * ************************************************************************************************************/

 public class Solution {
    public String toLowerCase(String str) {
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                res += (char)(str.charAt(i) + 32);
            } else {
                res += str.charAt(i);
            }
        }
        return res;
    }
}
