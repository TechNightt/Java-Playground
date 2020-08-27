
// Problem : Intersection of Numbers

/******************************************************************************************
 * This question is asked by Google. Given two integer arrays, return their intersection. *
 * Note: the intersection is the set of elements that are common to both arrays.          *
 *                                                                                        *
 * Ex: Given the following arrays...                                                      *
 *                                                                                        *
 * nums1 = [2, 4, 4, 2], nums2 = [2, 4], return [2, 4]                                    *
 * nums1 = [1, 2, 3, 3], nums2 = [3, 3], return [3]                                       *
 * nums1 = [2, 4, 6, 8], nums2 = [1, 3, 5, 7], return []                                  *
 *****************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


 package com.daily_byte.date_07_07_2020_intersection_of_numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Solution {
	
	static List<Integer> arrsIntersections(int[] arr1, int[] arr2) {
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
		List<Integer> res = new ArrayList<Integer>();
		
		for (int i = 0; i < arr1.length; ++i) {
			map1.put(arr1[i], arr1[i]);
		}
		
		for (int i = 0; i < arr2.length; ++i) {
			if (map1.get(arr2[i]) != null) {
				res.add(map1.get(arr2[i]));
				map1.remove(arr2[i]);
			}
		}
		
		return res;
	}
	
}