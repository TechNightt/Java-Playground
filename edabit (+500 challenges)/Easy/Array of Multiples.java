/*********************************************************************************************************************
 
Array of Multiples
Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num up to length.

Examples
arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]

arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]

arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]

Notes
Notice that num is also included in the returned array.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.IntStream;
public class Program {
	public static int[] arrayOfMultiples(int num, int length) {
		return IntStream.rangeClosed(1, length)
			.map(i -> num * i)
			.toArray();
	}
}




//#############################################################
//#                        MY SOLUTION 2   



import java.util.*;

public class Program {
	public static int[] arrayOfMultiples(int num, int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; i++) {
			array[i] = num * (i + 1);
		}
		return array;
	}
}







//#############################################################
//#                        MY SOLUTION 3   




import java.util.*;

public class Program {
	public static int[] arrayOfMultiples(int num, int length) {
		return java.util.stream.Stream.iterate(num,n->n+num)
																	.limit(length)
																	.mapToInt(n->n)
																	.toArray();
	}
}

