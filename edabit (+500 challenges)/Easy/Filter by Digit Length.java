/*********************************************************************************************************************
 Filter by Digit Length

Write a function that filters an array of numbers based on the criteria set for the number of digits.

Examples
filterByLength([88, 232, 4, 9721, 555], 3) ➞ [232, 555]
// An array of only the numbers with 3 digits.

filterByLength([2, 7, 8, 9, 1012], 1) ➞ [2, 7, 8, 9]
// An array of only the numbers with a single digit.

filterByLength([32, 88, 74, 91, 300, 4050], 1) ➞ []
// No numbers with only 1 digit exist, thus, an empty array.

filterByLength([5, 6, 8, 9], 1) ➞ [5, 6, 8, 9]
// All numbers in the array have 1 digit only, thus, the original array.

Notes
If no numbers of the specified digit length exist, return an empty array.
If all numbers in the array have the specified digit length, return original array.
The returned sub-array should have the same relative order as the original array.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.IntStream;

public class FilterDigits {
	public static int[] filterByLength(int[] n, int l) {
		return IntStream.of(n).filter(k -> (k+"").length() == l).toArray();
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.*;
public class FilterDigits {
	public static int[] filterByLength(int[] numbers, int length) {
		ArrayList<Integer> intlist = new ArrayList<>();
		for(int eachnumber: numbers){
			if(String.valueOf(eachnumber).length() == length){
				intlist.add(eachnumber);
			}
		}
		if(intlist.size() == numbers.length){
			return numbers;
		}
		else{
			int[] newlist = new int[intlist.size()];
			int index = 0;
			for(int eachnum: intlist){
				newlist[index] = eachnum;
				index++;
			}
			return newlist;
		}
	}
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.Arrays;
public class FilterDigits {
	public static int[] filterByLength(int[] numbers, int length) {
		return Arrays.stream(numbers)
                .filter(x -> String.valueOf(x).length() == length)
                .toArray();
	}
}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.ArrayList;
import java.util.Arrays;
public class FilterDigits {
	public static int[] filterByLength(int[] number, int len) {
    	ArrayList<Integer> outlist = new ArrayList<Integer>();
    	
    	for (int k:number) {
//    		int start = (int) Math.pow(10, len-1);
//    		int end =  (int) Math.pow(10, len) - 1;
    		
    		if (String.valueOf(k).length() == len) {
    			outlist.add(k);
    		}
    	}
    	
    	int[] arr = outlist.stream().mapToInt(i -> i).toArray();

    	return arr;
	}
}




//#############################################################
//#                        MY SOLUTION 5
//#############################################################


import java.util.Arrays;
public class FilterDigits {
	public static int[] filterByLength(int[] numbers, int length) {
		int maxValue = (int)Math.pow(10, length);
		int minValue = maxValue/10;
		return Arrays.stream(numbers).filter(n->n > minValue && n < maxValue).toArray();
	}
}




