// Source : https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/


/******************************************************************************************************************************************************************************************************************
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i]. *
 *                                                                                                                                                                                                                *
 * Return the answer in an array.                                                                                                                                                                                 *
 *                                                                                                                                                                                                                *
 *                                                                                                                                                                                                                *
 *                                                                                                                                                                                                                *
 * Example 1:                                                                                                                                                                                                     *
 *                                                                                                                                                                                                                *
 * Input: nums = [8,1,2,2,3]                                                                                                                                                                                      *
 * Output: [4,0,1,1,3]                                                                                                                                                                                            *
 * Explanation:                                                                                                                                                                                                   *
 * For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).                                                                                                                                        *
 * For nums[1]=1 does not exist any smaller number than it.                                                                                                                                                       *
 * For nums[2]=2 there exist one smaller number than it (1).                                                                                                                                                      *
 * For nums[3]=2 there exist one smaller number than it (1).                                                                                                                                                      *
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).                                                                                                                                          *
 * Example 2:                                                                                                                                                                                                     *
 *                                                                                                                                                                                                                *
 * Input: nums = [6,5,4,8]                                                                                                                                                                                        *
 * Output: [2,1,0,3]                                                                                                                                                                                              *
 * Example 3:                                                                                                                                                                                                     *
 *                                                                                                                                                                                                                *
 * Input: nums = [7,7,7,7]                                                                                                                                                                                        *
 * Output: [0,0,0,0]                                                                                                                                                                                              *
 *                                                                                                                                                                                                                *
 *                                                                                                                                                                                                                *
 * Constraints:                                                                                                                                                                                                   *
 *                                                                                                                                                                                                                *
 * 2 <= nums.length <= 500                                                                                                                                                                                        *
 * 0 <= nums[i] <= 100                                                                                                                                                                                            *
 *****************************************************************************************************************************************************************************************************************/


 package com.leet_code.easy.q1365_how_many_numbers_are_smaller_than_the_current_number.solution1;



/******************************************************************************************************************************************************************************************************************
 * Thoughts on implementation:                                                                            																										  *
 * Bruteforce solution. I run on all numbers in the array an check if they are smaller than current number.                                                                                                       *
 * This solution is faster than 18.73%                                                                    																										  *
 * Time complexity is O(n^2)                                                                           																											  *
 *****************************************************************************************************************************************************************************************************************/


 public class Solution {
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; --i) 
			for (int j = nums.length - 1; j >= 0; --j) 
				if(nums[j] < nums[i])
					++res[i];
        return res;
    }
}