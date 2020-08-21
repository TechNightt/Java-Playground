// Source : https://leetcode.com/problems/reverse-integer/
// Author : Gregory


/***************************************************************************************************************************************
 * Given a 32-bit signed integer, reverse digits of an integer.                                                                        *
 *                                                                                                                                     *
 * Example 1:                                                                                                                          *
 *                                                                                                                                     *
 * Input: 123                                                                                                                          *
 * Output: 321                                                                                                                         *
 * Example 2:                                                                                                                          *
 *                                                                                                                                     *
 * Input: -123                                                                                                                         *
 * Output: -321                                                                                                                        *
 * Example 3:                                                                                                                          *
 *                                                                                                                                     *
 * Input: 120                                                                                                                          *
 * Output: 21                                                                                                                          *
 * Note:                                                                                                                               *
 * Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. *
 * For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.                           *
 ***************************************************************************************************************************************/
package com.leet_code.easy.q7_reverse_integer.solution1;

/***************************************************************************************************************************************
 																				   *
 * Thoughts on implementation:                                                                                                         *
 * In this problem I decided to go with classical solution.                                                                            *
 * The number is being reversed depending on the received value.                                                                       *
 * I first check if value of the number is negative or positive. If the number is positive I perform the reverse.                      *
 * The check of int or long is performed after the number is reversed.                                                                 *
 * This solution is faster than 100%                                                                                                   *
 * Time complexity is O(log(n)) 																									   *
 **************************************************************************************************************************************/
public class Solution {	
    public int reverse(int x) {
        long res = 0;
        boolean sign = x > 0 ? true : false;
        x = sign ? x : x * -1;
        while(x > 0) {
        	res += x % 10;
        	res = x > 9 ? res * 10 : res;
        	x /= 10;
        }
        if(res > Integer.MAX_VALUE)
        	return 0;
        return sign ? (int)res : (int)res * -1;
    }   
}