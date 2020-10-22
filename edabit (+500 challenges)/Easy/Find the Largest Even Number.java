/*********************************************************************************************************************
 Find the Largest Even Number

Write a function that finds the largest even number in an array and returns -1 if not found.

Examples
probe([3, 7, 2, 1, 7, 9, 10, 13]) ➞ 10

probe([1, 3, 5, 7]) ➞ -1

probe([0, 19, 18973623]) ➞ 0

Notes
Consider using the modulo operator % or the bitwise and operator &.
The use of built-in methods, such as Math.max(),Stream.sorted(), Streams, and even integer binary operator, are favored.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.*;
public class LargestEven {
	public static int probe(int[] r) {
		int [] arr = Arrays.stream(r).filter(num -> num%2==0).sorted().toArray();
		return arr.length == 0 ? -1 : arr[arr.length-1];
	}
}


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.stream.IntStream;

public class LargestEven {
	public static int probe(int[] r) {
		return IntStream.of(r).filter(e -> e % 2 == 0).reduce(Integer::max).orElse(-1);
	}
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class LargestEven {
	public static int probe(int[] r) {
		int m=Integer.MIN_VALUE;
		for (int a:r)
			if (a%2==0 && a>m)
				m=a;
		return m==Integer.MIN_VALUE ? -1 : m;
	}
}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class LargestEven {
	public static int probe(int[] r) {
		int la = -1; 
		for (int i = 0; i < r.length; i++) { 
			if ((r[i] > la && r[i] % 2 == 0) || (la == -1 && r[i] % 2 == 0)) la = r[i];
		}return la;
	}
}







//#############################################################
//#                        MY SOLUTION 5
//#############################################################


import java.util.Arrays;
public class LargestEven {
	public static int probe(int[] r) {
		int [] rSorted = Arrays.stream(r)
                          .filter(i -> i%2==0)
                          .sorted()
                          .toArray();
		
       return (rSorted.length==0?-1:rSorted[rSorted.length-1]);
	}
}





//#############################################################
//#                        MY SOLUTION 6
//#############################################################





import java.util.ArrayList;
import java.util.Collections;
public class LargestEven {
	public static int probe(int[] r) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i = 0; i < r.length; i++) {
					if(r[i] % 2 == 0) {
							list.add(r[i]);
					}
			}
			Collections.sort(list);
			return list.size() > 0 ? list.get(list.size() - 1) : -1;
	}
}