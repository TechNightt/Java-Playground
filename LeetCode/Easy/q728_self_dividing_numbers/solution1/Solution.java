// Source : https://leetcode.com/problems/self-dividing-numbers/


/*********************************************************************************************************************************
 * A self-dividing number is a number that is divisible by every digit it contains.                                              *
 *                                                                                                                               *
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.                              *
 *                                                                                                                               *
 * Also, a self-dividing number is not allowed to contain the digit zero.                                                        *
 *                                                                                                                               *
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible. *
 *                                                                                                                               *
 * Example 1:                                                                                                                    *
 * Input:                                                                                                                        *
 * left = 1, right = 22                                                                                                          *
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]                                                                           *
 * Note:                                                                                                                         *
 *                                                                                                                               *
 * The boundaries of each input argument are 1 <= left <= right <= 10000.                                                        *
 ********************************************************************************************************************************/
package com.leet_code.easy.q728_self_dividing_numbers.solution1;

import java.util.ArrayList;
import java.util.List;

/*********************************************************************************************************************************
 * @author Julian Ghoncharenko                                                                                                   *
 * Thought on implementation:                                                                                                    *
 * In this problem I iterate on all numbers beginning at left and ending at right.                                               *
 * Then I check all digits of every number if the number is can be divided by those digits.                                      *
 * At the end I return the list.                                                                                                 *
 * This solution is faster than 52.56%                                                                                           *
 * Time complexity is O(nm)                                                                                                      *
 * ******************************************************************************************************************************/


 public class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> l = new ArrayList<Integer>();
        for(; left <= right; ++left) {
            int h = left;
            while(h != 0) {
                if(h % 10 == 0 || left % (h % 10) != 0)
                    break;
                h /= 10;
            }
            if(h == 0) {
                l.add(left);
            }
        }
        return l;
    }
}