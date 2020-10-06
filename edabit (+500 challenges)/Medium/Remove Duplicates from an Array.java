/*********************************************************************************************************************
 Remove Duplicates from an Array

Create a method that takes an array of strings or integers, removes all duplicate items and returns a new array in the same sequential order as the old array (minus duplicates).

Examples
removeDups([1, 0, 1, 0]) ➞ [1, 0]

removeDups(["The", "big", "cat"]) ➞ ["The", "big", "cat"]

removeDups(["John", "Taylor", "John"]) ➞ ["John", "Taylor"]

Notes
Tests contain arrays with both strings and integers.
Tests are case sensitive.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.*;
import java.util.HashSet;
public class Program {
	public static int[] removeDups(int[] nums) {
    return IntStream.of(nums).distinct().toArray(); 
	}

	public static String[] removeDups(String[] str) {
		HashSet<String> hash = new HashSet();
		for (String s : str) {
				hash.add(s);
		}
		String[] result = new String[hash.size()];
		int k = 0;
		int n = str.length;
		for (int i=0; i<n; i++) { 

		// Check if str[i] is present before it   
		int j;   
		for (j=0; j<i; j++)  
			 if (str[i] == str[j]) 
					break; 

		// If not present, then add it to 
		// result. 
		if (j == i) 
			 result[k++] = str[i]; 
		}            
		return result;
	} 
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.LinkedHashSet;
import java.util.Set;


public class Program {
    public static int[] removeDups(int[] nums) {
      Set<Integer> my2Set = new LinkedHashSet<>();
        for (int i =0; i < nums.length; i ++) {
            my2Set.add(nums[i]);
        }
        Integer[] score2Array = new Integer[my2Set.size()];
        my2Set.toArray(score2Array);

        int[] score3 = new int[my2Set.size()];
        for (int i = 0; i < score3.length; i++) {
            score3[i] = score2Array[i];
        }
        return score3;
    }
    public static String[] removeDups(String[] str) {
      Set<String> mySet = new LinkedHashSet<String>();
        for (int i =0; i < str.length; i ++) {
            mySet.add(str[i]);
        }
        String[] scoreArray = new String[mySet.size()];
        mySet.toArray(scoreArray);
        return scoreArray;
    }
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.*;

public class Program {
    public static int[] removeDups(int[] nums) {
      ArrayList<Integer> res = new ArrayList<Integer>();
      for(int i: nums)
        if(!res.contains(i))
          res.add(i);
      return res.stream().mapToInt(x -> x).toArray();
    }
    public static String[] removeDups(String[] str) {
      ArrayList<String> res = new ArrayList<String>();
      for(String s: str)
        if(!res.contains(s))
          res.add(s);
      return res.stream().toArray(String[]::new);
    }
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################



import java.util.Arrays;

public class Program {
    public static int[] removeDups(int[] nums) {
			return Arrays.stream(nums).boxed().mapToInt(Integer::intValue).distinct().toArray();
    }
    public static String[] removeDups(String[] str) {
      return Arrays.asList(str).stream().distinct().toArray(String[]::new);
    }
}




//#############################################################
//#                        MY SOLUTION 5
//#############################################################

import java.util.*;

public class Program {
    public static int[] removeDups(int[] nums) {
      Set<Integer> hs = new LinkedHashSet<>();
			for(int i : nums) hs.add(i);
			int[] a = new int[hs.size()];
			int ind = 0;
			for(int i : hs)
				a[ind++] = i;
			return a;
    }
    public static String[] removeDups(String[] str) {
      Set<String> hs = new LinkedHashSet<>();
			for(String s : str) hs.add(s);
			return hs.toArray(new String[hs.size()]);
    }
}