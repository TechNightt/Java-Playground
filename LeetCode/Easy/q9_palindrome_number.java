// Source : https://leetcode.com/problems/palindrome-number/
// Author : Gregory


/**************************************************************************************************************************
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.   *
 *                                                                                                                        *
 * Example 1:                                                                                                             *
 *                                                                                                                        *
 * Input: 121                                                                                                             *
 * Output: true                                                                                                           *
 * Example 2:                                                                                                             *
 *                                                                                                                        *
 * Input: -121                                                                                                            *
 * Output: false                                                                                                          *
 * Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome. *
 * Example 3:                                                                                                             *
 *                                                                                                                        *
 * Input: 10                                                                                                              *
 * Output: false                                                                                                          *
 * Explanation: Reads 01 from right to left. Therefore it is not a palindrome.                                            *
 * Follow up:                                                                                                             *
 *                                                                                                                        *
 * Could you solve it without converting the integer to a string?                                                         *
 *************************************************************************************************************************/
package com.leet_code.easy.q9_palindrome_number.solution1;

/**************************************************************************************************************************
 * Thoughts on implementation:                                                                                            *
 * Simple solution of the palindrome check.                                                                               *
 * I first check the sign of the number.                                                                                  *
 * After the sign is checked I reverse the number and check if the reversed number is                                     *
 * same as the number that was passed to the method.                                                                      *
 * This solution is faster than 77.53%                                                                                    *
 * Time complexity is O(log(n))																							  *
 *************************************************************************************************************************/
public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
        	return false;
        int helper = 0, helper2 = x;
        while(helper2 > 0)  {
        	helper = helper * 10 + helper2 % 10;
        	helper2 /= 10;
        }
        return helper == x ? true : false; 
    }
}