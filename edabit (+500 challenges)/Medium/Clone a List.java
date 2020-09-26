/*********************************************************************************************************************
 Clone a List
The Code tab has a code which attempts to add a clone of an array to itself. There is no error message, but the results are not as expected. Can you fix the code?

Examples
clone([1, 1]) ➞ [1, 1, [1, 1]]

clone([1, 2, 3]) ➞ [1, 2, 3, [1, 2, 3]]

clone(["x", "y"]) ➞ ["x", "y", ["x", "y"]]
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   

import java.util.ArrayList;

public class CloneList {
	public static Object[] clone(Object[] obj) {
		ArrayList<Object> arr = new ArrayList<>();
		for(Object k: obj) arr.add(k);
		arr.add(obj);
		return arr.toArray();
	}
}







//#############################################################
//#                        MY SOLUTION 2   


import java.util.Arrays;

public class CloneList {
	public static Object[] clone(Object[] arr) {
		return java.util.stream.Stream
			.concat(Arrays.stream(arr), Arrays.stream(new Object[] {arr}))
			.toArray();
	}
}
