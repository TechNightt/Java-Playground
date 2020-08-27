package com.daily_byte.date_07_07_2020_intersection_of_numbers;
import static com.daily_byte.date_07_07_2020_intersection_of_numbers.Solution.*;

import java.util.List;

class Tester {

	public static void main(String[] args) {
		int[] nums1 = new int[] {2, 4, 4, 2}, nums2 = new int[] {2, 4};
		List<Integer> nums = arrsIntersections(nums1, nums2);
		for (int i = 0; i < nums.size(); ++i) {
			System.out.print(" " + nums.get(i));
		}
		System.out.println();
		nums1 = new int[] {1, 2, 3, 3}; 
		nums2 = new int[] {3, 3};
		nums = arrsIntersections(nums1, nums2);
		for (int i = 0; i < nums.size(); ++i) {
			System.out.print(" " + nums.get(i));
		}
		System.out.println();
		nums1 = new int[] {2, 4, 6, 8};
		nums2 = new int[] {1, 3, 5, 7};
		nums = arrsIntersections(nums1, nums2);
		for (int i = 0; i < nums.size(); ++i) {
			System.out.print(" " + nums.get(i));
		}
		System.out.println();
	}
	
}