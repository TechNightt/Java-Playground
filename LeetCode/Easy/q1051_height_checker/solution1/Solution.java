// Source : https://leetcode.com/problems/height-checker/
// Author : Julian Ghoncharenko
// Date   : 28-07-2020

/*****************************************************************************************************************************************************************
 * Students are asked to stand in non-decreasing order of heights for an annual photo.                                                                           *
 *                                                                                                                                                               *
 * Return the minimum number of students that must move in order for all students to be standing in non-decreasing order of height.                              *
 *                                                                                                                                                               *
 * Notice that when a group of students is selected they can reorder in any possible way between themselves and the non selected students remain on their seats. *
 *                                                                                                                                                               *
 *                                                                                                                                                               *
 *                                                                                                                                                               *
 * Example 1:                                                                                                                                                    *
 *                                                                                                                                                               *
 * Input: heights = [1,1,4,2,1,3]                                                                                                                                *
 * Output: 3                                                                                                                                                     *
 * Explanation:                                                                                                                                                  *
 * Current array : [1,1,4,2,1,3]                                                                                                                                 *
 * Target array  : [1,1,1,2,3,4]                                                                                                                                 *
 * On index 2 (0-based) we have 4 vs 1 so we have to move this student.                                                                                          *
 * On index 4 (0-based) we have 1 vs 3 so we have to move this student.                                                                                          *
 * On index 5 (0-based) we have 3 vs 4 so we have to move this student.                                                                                          *
 * Example 2:                                                                                                                                                    *
 *                                                                                                                                                               *
 * Input: heights = [5,1,2,3,4]                                                                                                                                  *
 * Output: 5                                                                                                                                                     *
 * Example 3:                                                                                                                                                    *
 *                                                                                                                                                               *
 * Input: heights = [1,2,3,4,5]                                                                                                                                  *
 * Output: 0                                                                                                                                                     *
 *                                                                                                                                                               *
 *                                                                                                                                                               *
 * Constraints:                                                                                                                                                  *
 *                                                                                                                                                               *
 * 1 <= heights.length <= 100                                                                                                                                    *
 * 1 <= heights[i] <= 100                                                                                                                                        *
 ****************************************************************************************************************************************************************/
package com.leet_code.easy.q1051_height_checker.solution1;

/*****************************************************************************************************************************************************************
 * @author Julian Ghoncharenko                                                                                                                                   *
 * Thoughts on implementation:                                                                                                                                   *
 * I copy the array then sort it. Then I check the difference between the sorted array and the original one.                                                     *
 * This solution is faster than 09.03%                                                                                                                           *
 * Time complexity is O(nlogn)                                                                                                                                   *
 * **************************************************************************************************************************************************************/
public class Solution {

	public static int heightChecker(int[] heights) {
		int[] heights_sorted = bubbleSort(heights.clone());
		int c = 0;
		
		for (int i = heights.length - 1; i >= 0; --i) {
			if (heights_sorted[i] != heights[i])
				++c;
		}
		
		return c;
	}

	private static int[] bubbleSort(int[] arr) {
		boolean swapped;

		do {
			swapped = false;
			for (int i = 0; i < arr.length - 1; ++i) {
				if (arr[i] > arr[i + 1]) {
					arr[i] = arr[i + 1] + arr[i] - (arr[i + 1] = arr[i]);
					swapped = true;
				}
			}
		} while (swapped);

		return arr;
	}
	
}