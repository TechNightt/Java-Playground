package com.daily_byte.date_02_07_2020_two_sum;
import static com.daily_byte.date_02_07_2020_two_sum.Solution.*;

class Tester {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 8, 2 };
		int k = 10;
		System.out.println(twoSum(arr, k));
		arr = new int[] { 3, 9, 13, 7 };
		k = 8;
		System.out.println(twoSum(arr, k));
		arr = new int[] { 4, 2, 6, 5, 2 };
		k = 4;
		System.out.println(twoSum(arr, k));
	}
	
}