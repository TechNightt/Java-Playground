/*********************************************************************************************************************
 Cumulative Array Sum

Create a method that takes an array of integers and returns an array where each integer is the sum of itself + all previous numbers in the array.

Examples
cumulativeSum([1, 2, 3]) ➞ [1, 3, 6]

cumulativeSum([1, -2, 3]) ➞ [1, -1, 2]

cumulativeSum([3, 3, -2, 408, 3, 3]) ➞ [3, 6, 4, 412, 415, 418]

Notes
Return an empty array if the input is an empty array.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Program {
    public static int[] cumulativeSum(int[] nums) {
      int[] result = new int[nums.length];
      int tot = 0;
      for (int i = 0; i< nums.length; i++){
        tot += nums[i];
        result[i] = tot;
      }
      return result;
    }
}




//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static int[] cumulativeSum(int[] nums) {
      if(nums.length == 0){
				return nums;
			}
			for(int i = 0; i < nums.length - 1; i++){
				nums[i + 1] += nums[i];
			}
			return nums;
    }
}



//#############################################################
//#                        MY SOLUTION 3   


public class Program {
    public static int[] cumulativeSum(int[] nums) {
		if (null == nums || nums.length == 0)
			return new int[0];

		int sum = 0;
		int[] retval = new int[nums.length];

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j <= i; j++) {
				sum += nums[j];
			}
			retval[i] = sum;
			sum = 0;
		}
		return retval;
			
    }
}





