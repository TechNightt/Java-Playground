/*********************************************************************************************************************
 Next Prime
Given an integer, create a function that returns the next prime. If the number is prime, return the number itself.

Examples
nextPrime(12) ➞ 13

nextPrime(24) ➞ 29

nextPrime(11) ➞ 11
// 11 is a prime, so we return the number itself.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int nextPrime(int num) {
		return (isPrime(num)) ? num : nextPrime(num + 1);
  }
	
	private static boolean isPrime(int num) {
		if (num < 2) {
			return false;
		}
		for (int i = 2; i < (int)(Math.sqrt(num) + 1); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}





//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int nextPrime(int num) {
		if(isPrime(num)) return num;
		else {
			int temp = num+1;
			while(!isPrime(temp)) {
				temp++;
			}
			return temp;
		}
  }
	private static boolean isPrime(int num) {
		for(int i=2; i< ((num/2) +1); ++i) {
			if(num % i == 0) return false;
		}
		return true;
	}
}





//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int nextPrime(int num) {
		return new java.math.BigInteger(Integer.toString(num-1)).nextProbablePrime().intValue();
  }
}






//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int nextPrime(int num) {
		while (!isPrime(num)) { num++; }
		return num;
  }
	
	public static boolean isPrime(int num) {
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) { return false; }
		}		
		return true;
	}
}