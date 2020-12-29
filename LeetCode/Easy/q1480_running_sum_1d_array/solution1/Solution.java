// Source : https://leetcode.com/problems/running-sum-of-1d-array/

/*****************************************************************************************************
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]�nums[i]). *
 *                                                                                                   *
 * Return the running sum of nums.                                                                   *
 *                                                                                                   *
 *                                                                                                   *
 *                                                                                                   *
 * Example 1:                                                                                        *
 *                                                                                                   *
 * Input: nums = [1,2,3,4]                                                                           *
 * Output: [1,3,6,10]                                                                                *
 * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].                        *
 * Example 2:                                                                                        *
 *                                                                                                   *
 * Input: nums = [1,1,1,1,1]                                                                         *
 * Output: [1,2,3,4,5]                                                                               *
 * Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].             *
 * Example 3:                                                                                        *
 *                                                                                                   *
 * Input: nums = [3,1,2,10,1]                                                                        *
 * Output: [3,4,6,16,17]                                                                             *
 *                                                                                                   *
 *                                                                                                   *
 * Constraints:                                                                                      *
 *                                                                                                   *
 * 1 <= nums.length <= 1000                                                                          *
 * -10^6 <= nums[i] <= 10^6                                                                          *
 ****************************************************************************************************/
package com.leet_code.easy.q1480_running_sum_1d_array.solution1;

/*****************************************************************************************************
 *                                                                      *
 * Thoughts on implementation:                                                                       *
 * I run on the array 'nums' and sum the running sum as stated in problem's description.             *
 * This solution is faster than 100.00%                                                              *
 * The time complexity is O(n)                                                                       *
 ****************************************************************************************************/
public class Solution {
	public static int[] runningSum(int[] nums) {
		int sum = 0;
		for (int i = 0; i < nums.length; ++i)
			nums[i] = sum = sum + nums[i];
		return nums;
	}
}