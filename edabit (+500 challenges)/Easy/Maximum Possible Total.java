/*********************************************************************************************************************
 Maximum Possible Total

Given an array of 10 numbers, return the maximum possible total made by summing just 5 of the 10 numbers.

Examples
maxTotal([1, 1, 0, 1, 3, 10, 10, 10, 10, 1]) ➞ 43

maxTotal([0, 0, 0, 0, 0, 0, 0, 0, 0, 100]) ➞ 100

maxTotal([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) ➞ 40
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


import java.util.*;
public class Challenge {
      public static int maxTotal(int[] nums) {
				Arrays.sort(nums);
				int sum = 0;
				for (int i = 5; i < nums.length; i++) {
					sum += nums[i];
				}
				return sum;
    }



//#############################################################
//#                        MY SOLUTION 2   


import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
public class Challenge {
	public static int maxTotal(int[] nums) {
    Optional<Integer> stream  = Arrays.stream(nums).boxed().sorted(Collections.reverseOrder()).limit(5).reduce(Integer::sum);
    return stream.get();
  }
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.Arrays;

public class Challenge {
      public static int maxTotal(int[] nums) {
					Arrays.sort(nums);
				
					int sum = 0;
					for(int i = (nums.length - 5); i <= nums.length - 1; i++) {
							sum += nums[i];
					}
				
					return sum;
    }
}


