/*********************************************************************************************************************
 Eliminate Odd Numbers within an Array

Create a function that takes an array of numbers and returns only the even values.

Examples
noOdds([1, 2, 3, 4, 5, 6, 7, 8]) ➞ [2, 4, 6, 8]

noOdds([43, 65, 23, 89, 53, 9, 6]) ➞ [6]

noOdds([718, 991, 449, 644, 380, 440]) ➞ [718, 644, 380, 440]

Notes
Return all even numbers in the order they were given.
All test cases contain valid numbers ranging from 1 to 3000.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.*;
import java.util.stream.*;

public class Program {
    public static int[] noOdds(int[] nums) {
      int[] evens = Arrays.stream(nums)
				.filter(n -> n % 2 == 0)
				.boxed()
				.mapToInt(i -> i)
				.toArray();
				
			return evens;
    }
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Program {
    public static int[] noOdds(int[] nums) {
      return java.util.Arrays.stream(nums).filter(n -> n % 2 == 0).toArray();
    }
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.ArrayList;

public class Program {
    public static int[] noOdds(int[] nums) {
      ArrayList<Integer> evens = new ArrayList<Integer>();
      for(int i: nums)
        if(i%2 == 0)
          evens.add(i);
      return evens.stream().mapToInt(x -> x).toArray();
    }
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.ArrayList;
import java.util.List;

public class Program {
    public static int[] noOdds(int[] nums) {
        List<Integer> out = new ArrayList<Integer>();
        
        for (int i : nums) {
        	if (i % 2 == 0) {
        		out.add(i);
        	}
        }
        
        int[] ia = out.size() > 0 ? new int[out.size()] : new int[]{};
        int pos = 0;
        for (int i : out) {
        	ia[pos++] = i;
        }
        return ia;      
    }
}


