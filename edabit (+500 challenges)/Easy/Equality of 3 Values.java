/*********************************************************************************************************************
 
Equality of 3 Values
Create a function that takes three integer arguments (a, b, c) and returns the amount of integers which are of equal value.

Examples
equal(3, 4, 3) ➞ 2

equal(1, 1, 1) ➞ 3

equal(3, 4, 1) ➞ 0

Notes
Your function must return 0, 2 or 3.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int equal(int a, int b, int c) {
		
		if (a == b && b == c) {
			return 3;
		}
		if (a ==b || a == c || b == c){
			return 2;
		}
		return 0;
	}
}



//#############################################################
//#                        MY SOLUTION 2   



import java.util.HashSet;

public class Challenge {
	public static int equal(int a, int b, int c) {
		HashSet <Integer> equals = new HashSet <Integer>();
		
		equals.add(a);
		equals.add(b);
		equals.add(c);
		
		if(equals.size() == 1){
			return 3;
		}else if(equals.size() == 2){
			return 2;
		}else{
			return 0;
		}
	}
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.Arrays;
public class Challenge {
	public static int equal(int a, int b, int c) {
		int [] counts = new int[10];
			counts[a]++;
			counts[b]++;
			counts[c]++;
			Arrays.sort(counts);
			if(counts[9] > 1) return counts[9];
			else return 0;
	}
}



//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int equal(int a, int b, int c) {
		int count = 0;
		if (a == b){
			count++;
		}
		if (b == c){
			count++;
		}
		if (a == c){
			count++;
		}
		if (count == 1)
		{
      count = 2;
    }
		return count;
	}
}




//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static int equal(int a, int b, int c) {
		int numEqual = 0;
		
		if(a == b)
		{
			numEqual = numEqual + 2;
		} else if(c == b)
		{
			numEqual = numEqual + 2;
		} else if(c == a)
		{
			numEqual = numEqual + 2;
		}
		
		if(a == b && b == c)
		{
			numEqual = 3;
		}
		
		
			
		
		return numEqual;
		
		
		
	}
}