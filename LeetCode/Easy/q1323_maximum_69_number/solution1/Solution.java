// Source : https://leetcode.com/problems/maximum-69-number/


/*******************************************************************************************************
 * Given a positive integer num consisting only of digits 6 and 9.                                     *
 *                                                                                                     *
 * Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6). *
 *                                                                                                     *
 *                                                                                                     *
 *                                                                                                     *
 * Example 1:                                                                                          *
 *                                                                                                     *
 * Input: num = 9669                                                                                   *
 * Output: 9969                                                                                        *
 * Explanation:                                                                                        *
 * Changing the first digit results in 6669.                                                           *
 * Changing the second digit results in 9969.                                                          *
 * Changing the third digit results in 9699.                                                           *
 * Changing the fourth digit results in 9666.                                                          *
 * The maximum number is 9969.                                                                         *
 * Example 2:                                                                                          *
 *                                                                                                     *
 * Input: num = 9996                                                                                   *
 * Output: 9999                                                                                        *
 * Explanation: Changing the last digit 6 to 9 results in the maximum number.                          *
 * Example 3:                                                                                          *
 *                                                                                                     *
 * Input: num = 9999                                                                                   *
 * Output: 9999                                                                                        *
 * Explanation: It is better not to apply any change.                                                  *
 *                                                                                                     *
 *                                                                                                     *
 * Constraints:                                                                                        *
 *                                                                                                     *
 * 1 <= num <= 10^4                                                                                    *
 * num's digits are 6 or 9.                                                                            *
 ******************************************************************************************************/
package com.leet_code.easy.q1323_maximum_69_number.solution1;

import java.util.ArrayList;
import java.util.List;

/********************************************************************************************************
 * Thoughts on implementation:                                                                          *
 * In this solution I create an ArrayList and iterate on all digits of the received number.             *
 * After I save all digits I look for the first digit from the left that needs to change from 6 to 9.   *
 * After that I build the new number and return it from the method.                                     *
 * This solution is faster than 66.43%                                                                  *
 * Time complexity is O(n)                                                                              *
 * *****************************************************************************************************/
public class Solution {
    public static int maximum69Number (int num) {
    	List<Integer> digits = new ArrayList<Integer>();
        int res = 0;
    	while(num > 0) {
        	digits.add(num % 10);
        	num /= 10;
        }
    	for(int i = digits.size() - 1; i >= 0; --i) {
    		if(digits.get(i) == 6) {
        		digits.set(i, 9);
        		break;
        	}
    	}
        for(int i = digits.size() - 1; i >= 0; --i) {
        	res += digits.get(i).intValue();
        	if(i > 0) {
        		res = res * 10;
        	}
        }
        return res;
    } 
}