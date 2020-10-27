/*********************************************************************************************************************
 Largest Gap

Given an array of integers, return the largest gap between the sorted elements of the array.

For example, consider the array:

[9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]
... in which, after sorting, the array becomes:

[0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
... so that we now see that the largest gap in the array is between 9 and 20 which is 11.

Examples
largestGap([9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5]) ➞ 11
// After sorting: [0, 0, 4, 5, 5, 6, 9, 20, 25, 26, 26]
// Largest gap between 9 and 20 is 11

largestGap([14, 13, 7, 1, 4, 12, 3, 7, 7, 12, 11, 5, 7]) ➞ 4
// After sorting: [1, 3, 4, 5, 7, 7, 7, 7, 11, 12, 12, 13, 14]
// Largest gap between 7 and 11 is 4

largestGap([13, 3, 8, 5, 5, 2, 13, 6, 14, 2, 11, 4, 10, 8, 1, 9]) ➞ 2
// After sorting: [1, 2, 2, 3, 4, 5, 5, 6, 8, 8, 9, 10, 11, 13, 13, 14]
// Largest gap between 6 and 8 is 2
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   



import java.util.stream.IntStream;

public class Stretches {
	public static int largestGap(int[] numbers) {
		int[] k = IntStream.of(numbers).sorted().toArray();
		return IntStream.range(0, numbers.length-1)
			.map(i -> k[i+1] - k[i]).reduce(0, Integer::max);
	}
}


//#############################################################
//#                        MY SOLUTION 2   



import java.util.*;
public class Stretches {
	public static int largestGap(int[] numbers) {
		ArrayList<Integer> intlist = new ArrayList<>();
		for(int eachnumber: numbers){
			intlist.add(eachnumber);
		}
		Collections.sort(intlist);
		int[] gaps = new int[intlist.size()];
		int index = 0;
		for(int i = 0; i < intlist.size()-1; i++){
			gaps[index] = intlist.get(i+1) - intlist.get(i);
			index++;
		}
		ArrayList<Integer> gaplist = new ArrayList<>();
		for(int eachgap: gaps){
			gaplist.add(eachgap);
		}
		return Collections.max(gaplist);
	}
}

//#############################################################
//#                        MY SOLUTION 3   


import java.util.*;
public class Stretches {
   public static int largestGap(int[] numbers) {
		Arrays.sort(numbers);
		int max = 0;
		for(int i = 1; i<numbers.length; i++){
		max =	max<numbers[i]-numbers[i-1] ? max = numbers[i]-numbers[i-1] : max;
		}
		return max;
	}
}


//#############################################################
//#                        MY SOLUTION 4


import java.lang.*;
import java.util.*;
public class Stretches {
	public static int largestGap(int[] numbers) {
		int b[]=new int[numbers.length];
			Arrays.sort(numbers);
			int diff=0;
			for(int i=0,j=1;i<numbers.length&&j<numbers.length;i++,j++)
			{
			
					b[i]=Math.abs(numbers[i]-numbers[j]);
				
			}
		int max=b[0];
		for(int k=0;k<b.length;k++)
		{
			if(b[k]>max)
			{
				max=b[k];
			}
		}
		
					
					return max;
			}
	}