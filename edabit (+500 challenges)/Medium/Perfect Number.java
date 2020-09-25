/*********************************************************************************************************************
 Perfect Number
Create a function that tests whether or not an integer is a perfect number. A perfect number is a number that can be written as the sum of its factors, excluding the number itself.

For example, 6 is a perfect number, since 1 + 2 + 3 = 6, where 1, 2, and 3 are all factors of 6. Similarly, 28 is a perfect number, since 1 + 2 + 4 + 7 + 14 = 28.

Examples
checkPerfect(6) ➞ true

checkPerfect(28) ➞ true

checkPerfect(496) ➞ true

checkPerfect(12) ➞ false

checkPerfect(97) ➞ false
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   

public class Challenge {
	public static boolean checkPerfect(int num) {
		int sum = 1;
    for(int i=2; i<=num/2; i++){
      if(num%i == 0){
        sum += i;
       }
    }
		return sum==num;
	}
}




//#############################################################
//#                        MY SOLUTION 2   


import java.util.*;

public class Challenge {
	public static boolean checkPerfect(int num) {
		ArrayList<Integer> factors = getFactors(num);
		int sum = 0;
		
		for(int i = 0; i < factors.size(); i++)
			sum += factors.get(i);
		
		return sum == num;
	}
	
	private static ArrayList<Integer> getFactors(int num) {
		ArrayList<Integer> factors = new ArrayList<>();
		
		for(int i = 1; i < num; i++) {
			if(num % i == 0)
				factors.add(i);
		}
		
		return factors;
	}
}







//#############################################################
//#                        MY SOLUTION 3   



import java.util.*;
public class Challenge {
	public static boolean checkPerfect(int num) {
		ArrayList<Integer> factors = new ArrayList<Integer>();
		for(int i = 1; i < num; i++){
			if(num%i == 0){
				factors.add(i);
			}
		}
		int sum = 0;
		for(int f : factors){
			sum+= f;
		}
		return (sum==num) ? true: false;
		
	}
	
	
}



