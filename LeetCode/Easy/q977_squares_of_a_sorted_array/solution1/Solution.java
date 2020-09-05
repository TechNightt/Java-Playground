// Source : https://leetcode.com/problems/squares-of-a-sorted-array/
// Author : Julian Ghoncharenko
// Date   : 23-07-2020

/****************************************************************************************************************************************************
 * Given an array of integers A sorted in non-decreasing order, return an array of the squares of each number, also in sorted non-decreasing order. *
 *                                                                                                                                                  *
 *                                                                                                                                                  *
 *                                                                                                                                                  *
 * Example 1:                                                                                                                                       *
 *                                                                                                                                                  *
 * Input: [-4,-1,0,3,10]                                                                                                                            *
 * Output: [0,1,9,16,100]                                                                                                                           *
 * Example 2:                                                                                                                                       *
 *                                                                                                                                                  *
 * Input: [-7,-3,2,3,11]                                                                                                                            *
 * Output: [4,9,9,49,121]                                                                                                                           *
 *                                                                                                                                                  *
 *                                                                                                                                                  *
 * Note:                                                                                                                                            *
 *                                                                                                                                                  *
 * 1 <= A.length <= 10000                                                                                                                           *
 * -10000 <= A[i] <= 10000                                                                                                                          *
 * A is sorted in non-decreasing order.                                                                                                             *
 ***************************************************************************************************************************************************/
package com.leet_code.easy.q977_squares_of_a_sorted_array.solution1;

/****************************************************************************************************************************************************
 * @author Julian Ghoncharenko                                                                                                                      *
 * Thoughts on implementation:                                                                                                                      *
 * I iterate from left and right of the array and search for the larger pow between two numbers.                                                    *
 * This solution is faster than 72.95%                                                                                                              *
 * Time complexity is O(n)                                                                                                                          *
 * *************************************************************************************************************************************************/
public class Solution {
    public static int[] sortedSquares(int[] A) {
        int[] res = new int[A.length];
        int i = A.length - 1, j = 0, k = res.length - 1;
        
        for(;k >= 0;) {
            if(Math.pow(A[i], 2) < Math.pow(A[j], 2)) {
                res[k] = (int)Math.pow(A[j], 2);
                ++j;
            } else {
                res[k] = (int)Math.pow(A[i], 2);
                --i;
            }
            --k;
        }
        return res;
    }
}