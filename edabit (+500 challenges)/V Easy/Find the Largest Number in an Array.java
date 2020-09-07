/*********************************************************************************************************************
 
Find the Largest Number in an Array
Create a method that takes an array of integers. Return the largest integer in the array.


Examples
findLargestNum([4, 5, 1, 3]) ➞ 5
findLargestNum([300, 200, 600, 150]) ➞ 600
findLargestNum([1000, 1001, 857, 1]) ➞ 1001


Notes
Expect either a positive number or zero (there are no negative numbers).
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   

public class Program {
    public static int findLargestNum(int[] nums) {
      int largest = 0;
      for (int i:nums){
        if (i > largest) largest = i;
      }
      return largest;
    }
}


//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static int findLargestNum(int[] nums) {
      int max = nums[0];
      for(int i = 1; i < nums.length; i++) {
        if (max < nums[i]) {
          max = nums[i];
        }
      }
      return max;
    }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static int findLargestNum(int[] nums) {
      int highest = nums[0];
      for(int i = 0; i <= nums.length - 1; i++)
      {
        if(nums[i] > highest)
        {
          highest = nums[i];
        }
      }
      return highest;
    }
}


//#############################################################
//#                        MY SOLUTION 4


public class Program {
    public static int findLargestNum(int[] nums) {
      int high = Integer.MIN_VALUE;
      for (int i : nums ) {
        if (i > high) {
          high = i;
        }
      }
      return high;
    }
}


//#############################################################
//#                        MY SOLUTION 5


import static java.util.Arrays.stream;

public class Program {
  public static int findLargestNum(int[] nums) {
		return stream(nums).max().getAsInt();
  }
}