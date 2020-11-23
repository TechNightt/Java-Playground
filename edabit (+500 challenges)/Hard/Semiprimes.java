/*********************************************************************************************************************
 Semiprimes

A semiprime is a composite number that is the product of two primes. Apart from these two primes, its only other proper (non-self) divisor is 1.

The two prime factors of a semiprime can be the same number (e.g. the semiprime 49 is the product of 7x7). A semiprime that has two distinct prime factors is called a squarefree semiprime.

Create a function that takes a number and returns "Squarefree Semiprime", "Semiprime", or "Neither".

Examples
semiprime(49) ➞ "Semiprime"

semiprime(15) ➞ "Squarefree Semiprime"

semiprime(97) ➞ "Neither"
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



import java.util.ArrayList;

public class Challenge {

	public static String semiprime(int n) {
		ArrayList<Integer> primeFactors = getPrimeFactors(n);
		if (primeFactors.size() > 0) {
			int i = 0;
			int j = primeFactors.size() - 1;
			int val1 = primeFactors.get(i);
			int val2 = primeFactors.get(j);
			if (n == val1 * val2) {
				if (val1 == val2) {
					return "Semiprime";
				}
				return "Squarefree Semiprime";
			}
		}
		return "Neither";
	}
	
	public static ArrayList<Integer> getPrimeFactors(int n){
		ArrayList<Integer> primeFactors = new ArrayList<>();
		for (int i = 1; i < n; i++) {
			if (isFactor(n ,i)) {
				if (isPrime(i)) {
					primeFactors.add(i);
				}
			}
		}
		return primeFactors;
	}
	
	public static boolean isFactor(int n, int i) {
		return n % i == 0;
	}
	
	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}


//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {

    public static String semiprime(int n) {
  
      if (n % 2 == 0) {
        return isPrime(n / 2) ? (n / 2 == 2) ? "Semiprime" : "Squarefree Semiprime" : "Neither";
      }
  
      for (int i = 3; i < n / 2; i = i + 2) {
        if (n % i == 0 && isPrime(i) && isPrime(n / i)) {
          return (n / i == i) ? "Semiprime" : "Squarefree Semiprime";
        }
      }
  
      return "Neither";
    }
  
    private static boolean isPrime(int n) {
      if (n == 2) {
        return true;
      }
      if (n % 2 == 0) {
        return false;
      }
  
      for (int i = 3; i < n / 2; i = i + 2) {
        if (n % i == 0) {
          return false;
        }
      }
      return true;
    }
  }


//#############################################################
//#                        MY SOLUTION 3   



import java.util.*;
public class Challenge {
	public static String semiprime(int n) {
	        ArrayList<Integer> primelist = new ArrayList<>();
	        int testnumber = n;
	        int count = 0;
	        int total = 1;
	        for(int i = 2; i <= n; i++){
	            if(isPrime(i) && testnumber % i == 0){
	                primelist.add(i);
	                n = n / i;
	            }
	        }
	        for(int eachnumber: primelist){
	            if(Math.pow(eachnumber,2) == testnumber){
	                return "Semiprime";
	            }
	        }
	        for(int eachnumber: primelist){
	            if(eachnumber == testnumber){
	                return "Neither";
	            }
	            for(int eachnumber2: primelist){
	              if(count == 2){
	                total = 1 * eachnumber;
	                count = 1;
	              }
	              total = total * eachnumber2;
	              if(total == testnumber && total != 1){
	                  return "Squarefree Semiprime";
	              }
	              count++;
	            }
	        }
	        return "Neither";
	    }
	    public static boolean isPrime(int num){
	        for(int i = 2; i < num; i++){
	            if(num % i == 0){
	                return false;
	            }
	        }
	        return true;
	    }
}



//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String semiprime(int n) {
		 		double d = Math.sqrt(n);
        if (d % 1 == 0 && d * d == n) return "Semiprime";
        int count = 0;
        for (int i = 2; i * i <= n && count < 2; i++)
            while (n % i == 0) {
                n /= i;
                count++;
            }
        if (n > 1)
            count++;
        return count == 2 ? "Squarefree Semiprime" : "Neither";
	}
}