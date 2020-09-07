// Source : https://leetcode.com/explore/challenge/card/july-leetcoding-challenge/545/week-2-july-8th-july-14th/3387/


/****************************************************************************************
 * Given a set of distinct integers, nums, return all possible subsets (the power set). *
 *                                                                                      *
 * Note: The solution set must not contain duplicate subsets.                           *
 *                                                                                      *
 * Example:                                                                             *
 *                                                                                      *
 * Input: nums = [1,2,3]                                                                *
 * Output:                                                                              *
 * [                                                                                    *
 *   [3],                                                                               *
 *   [1],                                                                               *
 *   [2],                                                                               *
 *   [1,2,3],                                                                           *
 *   [1,3],                                                                             *
 *   [2,3],                                                                             *
 *   [1,2],                                                                             *
 *   []                                                                                 *
 * ]                                                                                    *
 ***************************************************************************************/
package com.leet_code.challenges.d_2020_07_11_Subsets;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        int mask = 1 << nums.length;
        for(int i = 0; i < mask; ++i) {
            List<Integer> l2 = new ArrayList<Integer>();
            for(int j = 0; j < nums.length; ++j) {
                if((i & (1 << j)) > 0) {
                    l2.add(nums[j]);
                }
            }
            l.add(l2);
        }
        return l;
    }
}