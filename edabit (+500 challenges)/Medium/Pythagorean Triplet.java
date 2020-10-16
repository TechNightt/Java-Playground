/*********************************************************************************************************************
 Pythagorean Triplet

Create a function that validates whether the three given integers form a Pythagorean triplet which is defined as the sum of the squares of the two smallest integers must be equal to the square of the largest integer.

Examples
isTriplet(3, 4, 5) ➞ true
// 3² + 4² = 25
// 5² = 25

isTriplet(13, 5, 12) ➞ true
// 5² + 12² = 169
// 13² = 169

isTriplet(1, 2, 3) ➞ false
// 1² + 2² = 5
// 3² = 9

Notes
Numbers may not be given in a sorted order.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;

public class Pythagorean {	
	public static boolean isTriplet(int a, int b, int c) {
		int[] t = new int[] {a, b, c};
		Arrays.sort(t);
		return Math.pow(t[0], 2) + Math.pow(t[1], 2) == Math.pow(t[2], 2);
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Pythagorean {	
	public static boolean isTriplet(int n1, int n2, int n3) {
		 boolean flag=false;
        int max =Math.max(Math.max(n1, n2),Math.max(n1, n3));
        List<Integer> ls=new ArrayList<>();
       ls.add(n1);
       ls.add(n2);
       ls.add(n3);
        List<Integer> collect = ls.stream().filter(x->x!=max).collect(Collectors.toList());
        System.out.println(collect);

        if(Math.pow(collect.get(0),2)+Math.pow(collect.get(1),2)==Math.pow(max,2)){
           flag=true;
       }


        System.out.println(max);

        return flag;

	}
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



import java.util.*;
public class Pythagorean {	
	public static boolean isTriplet(int a, int b, int c) {
		int[] nums = new int[] { a, b, c };
    Arrays.sort(nums);
    return nums[2] * nums[2] == nums[0] * nums[0] + nums[1] * nums[1];
	}
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.lang.Math;
public class Pythagorean {	
	public static boolean isTriplet(int a, int b, int c) {
		int tmp = Math.max(a, b);
		int max = Math.max(tmp, c);
		if (max == a) {
			return a * a == b * b + c * c;
		} else if (max == b) {
			return b * b == a * a + c * c;
		} else {
			return c * c == b * b + a * a;
		}
	}
}