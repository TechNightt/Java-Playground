/*********************************************************************************************************************
 Same Number of Unique Elements
Write a function that returns true if two arrays have the same number of unique elements, and false otherwise.

To illustrate:

arr1 = [1, 3, 4, 4, 4]
arr2 = [2, 5, 7]
In arr1, the number 4 appears three times, which means it contains three unique elements: [1, 3, 4]. Since arr1 and arr2 both contain the same number of unique elements, this example would return true.

Examples
same([1, 3, 4, 4, 4], [2, 5, 7]) ➞ true

same([9, 8, 7, 6], [4, 4, 3, 1]) ➞ false

same([2], [3, 3, 3, 3, 3]) ➞ true
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
public class Challenge {
    public static boolean same(int[] a1, int[] a2) {
			return uniqueNum(a1) == uniqueNum(a2);
		}
	
		private static int uniqueNum(int[] arr) {
			return (int)Arrays.stream(arr)
				.distinct()
				.count();
		}
}



//#############################################################
//#                        MY SOLUTION 2   


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Challenge {
    public static boolean same(int[] a1, int[] a2) {
			HashSet<Integer> set1 = IntStream.of(a1).boxed().collect(Collectors.toCollection(HashSet::new));
			HashSet<Integer> set2 = IntStream.of(a2).boxed().collect(Collectors.toCollection(HashSet::new));
			return set1.size() == set2.size();
		}
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.HashSet;
import java.util.Set;

public class Challenge {
    public static boolean same(int[] a1, int[] a2) {
			Set<Integer> s1 = new HashSet<Integer>();
			Set<Integer> s2 = new HashSet<Integer>();
			for (int i : a1) { s1.add(i); }
			for (int i : a2) { s2.add(i); }
			return s1.size() == s2.size();
		}
}



//#############################################################
//#                        MY SOLUTION 4


import java.util.*;
public class Challenge {
    public static boolean same(int[] a1, int[] a2) {
			
			HashSet<Integer> set1 = new HashSet();
			HashSet<Integer> set2 = new HashSet();
			for(int x = 0; x < a1.length; x++) {
				set1.add(a1[x]);
			}
			
			for(int x = 0; x < a2.length; x++) {
				set2.add(a2[x]);
			}
			
			return set1.size() == set2.size() ? true : false;
			
		}
}