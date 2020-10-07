/*********************************************************************************************************************
 
Find the Missing Number

Create a method that takes an array of integers between 1 and 10 (excluding one number) and returns the missing number.

Examples
missingNum([1, 2, 3, 4, 6, 7, 8, 9, 10]) ➞ 5

missingNum([7, 2, 3, 6, 5, 9, 1, 4, 8]) ➞ 10

missingNum([10, 5, 1, 2, 4, 6, 8, 3, 9]) ➞ 7

Notes
The array of numbers will be unsorted (not in order).
Only one number will be missing.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;
public class Program {
    public static int missingNum(int[] nums) {
    	if (nums == null || nums.length == 0) return 0;
        Arrays.sort(nums);
        for (int i=0; i < nums.length - 1; i++) {
        	if (nums[i + 1] != nums[i] + 1) {
        		return nums[i] + 1;
        	}
        }
        return nums[0] == 1 ? 10 : 1;
    }
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static int missingNum(int[] nums) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        for (int num : nums) {
            for (int i=0; i<numbers.size(); i++) {
                if (num == numbers.get(i)) {
                    numbers.remove(i);
                }
            }
        }
			return numbers.get(0);
    }
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



import java.util.Arrays;
public class Program {
    public static int missingNum(int[] nums) {
            Arrays.sort(nums);
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for(int i = 0; i < testArray.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if (nums[j] == testArray[i]) {
                    testArray[i] = 0;
                }
            }
        }
        for(int i = 0; i < testArray.length; i++) {
            if(testArray[i] != 0) {
                return testArray[i];
            }
        }
        return 0;  
    }
}



