/*********************************************************************************************************************
 Factorize a Number
Create a function that takes a number as its argument and returns an array of all its factors.

Examples
factorize(12) ➞ [1, 2, 3, 4, 6, 12]

factorize(4) ➞ [1, 2, 4]

factorize(17) ➞ [1, 17]

Notes
The input integer will be positive.
A factor is a number that evenly divides into another number without leaving a remainder. The second example is a factor of 12, because 12 / 2 = 6, with remainder 0.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



import java.util.stream.IntStream;

public class Challenge {
	public static int[] factorize(int num) {
		return IntStream.range(1, num + 1).filter(n -> num % n == 0).toArray();
	}
}




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.*;
public class Challenge {
	public static Integer[] factorize(int num) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				arr.add(i);
			}
		}
		Integer[] result = new Integer[arr.size()]; 
    result = arr.toArray(result); 
		return result;
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.ArrayList;
import java.util.List;

public class Challenge {
	public static int[] factorize(int num) {
		int[] factorArr;
		List<Integer> factors = new ArrayList<Integer>();
		factors.add(1);
		if(num != 1){
			for(int i = 2; i <= num/2; i++){
				if(num%i == 0){
					factors.add(i);
				}
			}
			factors.add(num);
		}
		factorArr = factors.stream().mapToInt(j->j).toArray();
		return factorArr;
	}
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



import java.util.*;

public class Challenge {
	public static int[] factorize(int num) {
		List<Integer> divisors = new ArrayList<Integer>();
		for(int i = 1; i <= (num / 2); i++) {
			if(num % i == 0) divisors.add(i);
		}
		divisors.add(num);
		int ret[] = new int[divisors.size()];
		for (int i = 0; i < divisors.size(); i++) ret[i] = divisors.get(i);
		return ret;
	}
}




