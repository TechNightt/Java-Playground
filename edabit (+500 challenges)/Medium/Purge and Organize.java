/*********************************************************************************************************************
 Purge and Organize

Given an array of integers, write a method that returns an array that...

Has all duplicate elements removed.
Is sorted from least value to greatest value.

Examples
uniqueSort([1, 2, 4, 3]) ➞ [1, 2, 3, 4]

uniqueSort([1, 4, 4, 4, 4, 4, 3, 2, 1, 2]) ➞ [1, 2, 3, 4]

uniqueSort([6, 7, 3, 2, 1]) ➞ [1, 2, 3, 6, 7]
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Program {
    public static int[] uniqueSort(int[] nums) {
      return java.util.Arrays.stream(nums).distinct().sorted().toArray();
    }
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.*;
import java.util.stream.*;

public class Program {
    public static int[] uniqueSort(int[] nums) {
      SortedSet<Integer> numSet = new TreeSet<Integer>();
      for(int i : nums){
        numSet.add(i);
      }
      return numSet.stream().mapToInt(i->i).toArray();
    }
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################

import java.util.SortedSet;
import java.util.TreeSet;

public class Program {
    public static int[] uniqueSort(int[] nums) {
      SortedSet<Integer> set = new TreeSet<>();
    	for (int i : nums) {
        set.add(i);
      }
      return set.stream().mapToInt(i -> i.intValue()).toArray();
    }
}





