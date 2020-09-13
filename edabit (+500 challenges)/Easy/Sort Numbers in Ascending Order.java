/*********************************************************************************************************************
 
Sort Numbers in Ascending Order
Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).

Sort integer array in ascending order.
If the function's argument is null, an empty array, or undefined; return an empty array.
Return a new array of sorted numbers.
Examples
sortNumsAscending([1, 2, 10, 50, 5]) ➞ [1, 2, 5, 10, 50]

sortNumsAscending([80, 29, 4, -95, -24, 85]) ➞ [-95, -24, 4, 29, 80, 85]

sortNumsAscending(null) ➞ []

sortNumsAscending([]) ➞ []

Notes
Test input can be positive or negative.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   

import java.util.Arrays;

public class Program {
    public static int[] sortNumsAscending(int[] nums) {
      Arrays.sort(nums);
      return nums;
    }
}



//#############################################################
//#                        MY SOLUTION 2   

public class Program {
    public static int[] sortNumsAscending(int[] nums) {
      for(int i=0; i<nums.length; i++){
        for(int j=0; j<nums.length; j++){
        	if(nums[i]<nums[j]){
            int flag;
            flag = nums[i];
            nums[i] = nums[j];
            nums[j] = flag;
          }
        }
      }
      return nums;
    }
}




//#############################################################
//#                        MY SOLUTION 3   

import java.util.Arrays;

public class Program {
    public static int[] sortNumsAscending(int[] nums) {
      int[] result = {};
      if (nums == null || nums.length == 0)
        return result;
      else
      {
        Arrays.sort(nums);
        return nums;
      }
    }
}




//#############################################################
//#                        MY SOLUTION 4



public class Program {
    public static int[] sortNumsAscending(int[] nums) {
      for (int x = 1; x < nums.length; x++ ) {
        for (int y = x; y > 0 && nums[y - 1] > nums[y]; y--) {
          int t = nums[y - 1];
          nums[y - 1] = nums[y];
          nums[y] = t;
        }
      }
      
      return nums;
    }
}



//#############################################################
//#                        MY SOLUTION 5



import java.util.*;

public class Program {
    public static int[] sortNumsAscending(int[] nums) {
      int[] res = new int[nums.length];
      ArrayList<Integer> temp = new ArrayList<Integer>();
      for(int i: nums)
        temp.add(i);
      Collections.sort(temp);
      for(int i=0; i<temp.size(); i++)
      	res[i] = (int) temp.get(i);
      return res;
    }
}