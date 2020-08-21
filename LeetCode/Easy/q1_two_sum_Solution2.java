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
package com.leet_code.easy.q1_two_sum.solution2;

import java.util.HashMap;
/***************************************************************************************************************
                                                                             *
 * Thoughts on implementation:                                                                                 *
 * This time I did one-pass hash table run.                                                                    *
 * The numbers in array are unique so they can be used as keys and indexes of the array can be used as values  *
 * inside the hash map.                                                                                        *
 * This solution is faster than 99.93%                                                                         *
 * Time complexity is O(n)                                                                                     *
 **************************************************************************************************************/
public class Solution {
    public int[] twoSum(int[] nums, int target) {
	    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	    for(int i = nums.length - 1; i >=0; map.put(nums[i], i--))
	        if(map.containsKey(target - nums[i]))
	            return new int[]{i, map.get(target - nums[i])};
	    return new int[] {};
    }
}