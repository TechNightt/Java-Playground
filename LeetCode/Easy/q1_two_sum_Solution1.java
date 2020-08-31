// Source : https://leetcode.com/problems/two-sum/
// Author : Gregory


/***************************************************************************************************************
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.   *
 *                                                                                                             *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice. *
 *                                                                                                             *
 * Example:                                                                                                    *
 *                                                                                                             *
 * Given nums = [2, 7, 11, 15], target = 9,                                                                    *
 *                                                                                                             *
 * Because nums[0] + nums[1] = 2 + 7 = 9,                                                                      *
 * return [0, 1].                                                                                              *
 **************************************************************************************************************/
package com.leet_code.easy.q1_two_sum.solution1;

/***************************************************************************************************************
                                                                             *
 * Thoughts on implementation:                                                                                 *
 * Bruteforce implementation. I simply run on 'nums' array and for each number in 'nums' array I iterate       *
 * through the 'nums' array again and check if sum of two numbers from different cells in array equals to      *
 * the target integer.                                                                                         *
 * This solution is faster than 23.28%                                                                         * 
 * The time complexity is O(n ^ 2)                                                                             *
 **************************************************************************************************************/

 public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; ++i)
            for(int j = i + 1; j < nums.length; ++j) 
                if(nums[i] + nums[j] == target)
                    return new int[]{i, j};
        return null;
    }
}