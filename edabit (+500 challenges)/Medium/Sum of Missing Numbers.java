/*********************************************************************************************************************
 Sum of Missing Numbers

Create a function that returns the sum of missing numbers.

Examples
sumMissing([1, 3, 5, 7, 10]) ➞ 29
// 2 + 4 + 6 + 8 + 9

sumMissing([10, 7, 5, 3, 1]) ➞ 29

sumMissing([10, 20, 30, 40, 50, 60]) ➞ 1575

Notes
The minimum and maximum value of the given array are the inclusive bounds of the numeric range to consider when searching for missing numbers.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;
import java.util.stream.IntStream;
public class Challenge {
	public static int sumMissing(int[] arr) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i : arr) {
			if (i < min) {min = i;}
			if (i > max) {max = i;}
		}
		return IntStream.rangeClosed(min, max).sum() - Arrays.stream(arr).sum();
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.stream.IntStream;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;
public class Challenge {
	public static int sumMissing(int[] arr) {
    List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
    IntStream integerStream = IntStream.rangeClosed(list.get(0), list.get(list.size() - 1));
    return integerStream
            .filter(i -> !list.contains(i))
            .sum();
  }
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.*;
public class Challenge {
	public static int sumMissing(int[] arr) {
		int missingSum = 0;
        int minimumValue = Integer.MAX_VALUE;
        int maximumValue = Integer.MIN_VALUE;
        Set<Integer> oldSet = new HashSet<>();
        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            oldSet.add(arr[i]);
            if (maximumValue < arr[i]) maximumValue = arr[i];
            if (minimumValue > arr[i]) minimumValue = arr[i];
        }
        for (int i = minimumValue + 1; i < maximumValue; i++) newSet.add(i);
        newSet.removeAll(oldSet);
        for (Integer a : newSet) missingSum += a;
        return missingSum;
	}
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
	public static int sumMissing(int[] arr) {
		java.util.Arrays.sort(arr);int l=0,count=0;
		for(int i=arr[0];i<=arr[arr.length-1];i++){
			while(i<=arr[arr.length-1] && arr[l]!=i){ count=count+i;
		i++;}l++;}
		return count;
	}
}