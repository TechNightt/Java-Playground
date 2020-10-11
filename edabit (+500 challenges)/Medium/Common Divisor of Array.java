/*********************************************************************************************************************
 Common Divisor of Array

Write a function that returns the greatest common divisor of all array elements. If the greatest common divisor is 1, return 1.

Examples
GCD([10, 20, 40]) ➞ 10

GCD([1, 2, 3, 100]) ➞ 1

GCD([1024, 192, 2048, 512]) ➞ 64

Notes
Array elements are always greater than 0.
There is a minimum of two array elements given.
If you have any problems, check the Resources.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static int GCD(int ... array) {
		int a = array[0];
		int b = array[1];
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		return a > b ? GCD(b, a % b) : GCD(a, b % a);
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
    public static int GCD(int[] array) {
      for (int x = array[0]; x > 0; x -= 1) {
        int count = 0;
        for (int y = 0; y < array.length; y += 1)
          if  (array[y] % x == 0)
            count += 1;
        if (count == array.length)
          return x;
      }	
      return 1;
    } 
  }







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.*;
public class Challenge {
  public static int GCD(int[] array) {
		Arrays.sort(array);
		int gcd = array[0];
		for (int i = 1; i < array.length; i++){
			gcd = Math.min(gcd, GCD(array[0], array[i]));
		}
		return gcd;
  }
	
	public static int GCD(int a, int b){
		return b == 0 ? a : GCD(b, a%b);
	}
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static int GCD(int[] array) {
		for(int i = 1; i < array.length; i++) {
		  	array[0] = calc(array[0], array[i]);
		}
	  	return array[0];
	}
  	
  	public static int calc(int a, int b) {
	  	return a == b ? a : a > b ? calc(a - b, b) : calc(b - a, a);
	}
}