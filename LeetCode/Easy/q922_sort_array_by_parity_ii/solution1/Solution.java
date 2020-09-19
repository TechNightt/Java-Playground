// Source : https://leetcode.com/problems/sort-array-by-parity-ii/
// Author : Julian Ghoncharenko
// Date   : 03-08-2020

/********************************************************************************************************************
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even. *
 *                                                                                                                  *
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.                     *
 *                                                                                                                  *
 * You may return any answer array that satisfies this condition.                                                   *
 *                                                                                                                  *
 *                                                                                                                  *
 *                                                                                                                  *
 * Example 1:                                                                                                       *
 *                                                                                                                  *
 * Input: [4,2,5,7]                                                                                                 *
 * Output: [4,5,2,7]                                                                                                *
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.                                      *
 *                                                                                                                  *
 *                                                                                                                  *
 * Note:                                                                                                            *
 *                                                                                                                  *
 * 2 <= A.length <= 20000                                                                                           *
 * A.length % 2 == 0                                                                                                *
 * 0 <= A[i] <= 1000                                                                                                *
 *******************************************************************************************************************/
package com.leet_code.easy.q922_sort_array_by_parity_ii.solution1;

/********************************************************************************************************************
 * @author Julian Ghoncharenko                                                                                      *
 * Thoughts on implementation:                                                                                      *
 * I create a result array and iterate thorough the received array. Then I put each number from the received array  *
 * according to placement it needs to be in the result array.                                                       *
 * This solution is faster than 99.40%                                                                              *
 * Time complexity is O(n)                                                                                          *
 * *****************************************************************************************************************/
class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];
        for(int i = 0, j = 1, k = 0; k < A.length; ++k) {
            if(A[k] % 2 == 0) {
                res[i] = A[k];
                i += 2;
            } else {
                res[j] = A[k];
                j += 2;
            }
        }
        return res;
    }
}