/*********************************************************************************************************************
 Return Only the Int

Write a function that takes an array of elements and returns only the ints.

Examples
returnInts([9, 2, "space", "car", "lion", 16]) ➞ [9, 2, 16]

returnInts(["hello", 81, "basketball", 123, "fox"]) ➞ [81, 123]

returnInts([10, "121", 56, 20, "car", 3, "lion"]) ➞ [10, 56, 20, 3]

returnInts(["String",  true,  3.3,  1]) ➞ [1]
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Program {
	public static int[] returnInts(Object[] arr) {
		return java.util.Arrays.stream(arr).filter(x -> x instanceof Integer)
			.mapToInt(x -> (int) x).toArray();
	}
}


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.ArrayList;
import java.util.Iterator;
public class Program {
	public static int[] returnInts(Object[] arr) {
		ArrayList<Integer> ints = new ArrayList<Integer>();
		for (int i = 0; i<arr.length; i++) {
			if (arr[i].getClass() == Integer.class) {
				ints.add((Integer) arr[i]);
			}
		}
		Iterator<Integer> iterator = ints.iterator();
		int[] intsArr = new int[ints.size()];
		for (int i = 0; i<intsArr.length; i++) {
			intsArr[i] = iterator.next().intValue();
		}
		return intsArr;
	}
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.Arrays;

public class Program {
	public static int[] returnInts(Object[] arr) {
		return Arrays.stream(arr)
				.filter(i -> i instanceof Integer)
				.mapToInt(i -> (int) i)
				.toArray();
	}
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Program {
	public static int[] returnInts(Object[] arr) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) if (isInt(arr[i])) count++;
		
		int[] output = new int[count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			Object o = arr[i];
			if (isInt(o)) {
				output[index] = Integer.parseInt(o.toString());
				index++;
			}
		}
		
		return output;
	}
	
	static boolean isInt(Object o) {
		return o.getClass().getName().equals("java.lang.Integer");
	}
}


