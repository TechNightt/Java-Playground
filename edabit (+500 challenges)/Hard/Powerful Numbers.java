/*********************************************************************************************************************
 Powerful Numbers

Given a positive number x:

p = (p1, p2, …)
// Set of *prime* factors of x
If the square of every item in p is also a factor of x, then x is said to be a powerful number.

Create a function that takes a number and returns true if it's powerful, false if it's not.

Examples

isPowerful(36) ➞ true
// p = (2, 3) (prime factors of 36)
// 2^2 = 4 (factor of 36)
// 3^2 = 9 (factor of 36)

isPowerful(27) ➞ true

isPowerful(674) ➞ false
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   



import java.util.Arrays;
import java.util.stream.IntStream;
public class Challenge {
  public static boolean isPowerful(int num) {
		int[] primes = getPrimeFactors(num);
		return Arrays.stream(primes)
			.map(n -> n * n)
			.allMatch(n -> num % n == 0);
  }
	
  private static int[] getPrimeFactors(int num) {
		return IntStream.range(2, num)
		  .filter(i -> isPrime(i) && num % i == 0)
		  .toArray();
	}
	
	private static boolean isPrime(int n) {
	  return IntStream.rangeClosed(2, (int)(Math.sqrt(n) + 1))
	    .allMatch(i -> n % i != 0);
	}
}




//#############################################################
//#                        MY SOLUTION 2   


import java.math.*;
public class Challenge {
  public static boolean isPowerful(int n) {
		int i,x=1;
	    for(i=2;i<n;i++)
	    {
	        if(new BigInteger(""+i+"").isProbablePrime(1))
	        {
	            if(n%i==0 && n%(i*i)!=0)
	            {
	                x=-1;
	            }
	            
	        }
	    }
		return(x==1?true:false);
  }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean isPowerful(int num) {
          while (num % 2 == 0) { 
              int power = 0; 
              while (num % 2 == 0) { 
                  num /= 2; 
                  power++; 
              } 
    
              // If only 2^1 divides num (not higher powers), 
              // then return false 
              if (power == 1) 
                  return false; 
          } 
    
          // if n is not a power of 2 then this loop will execute 
          // repeat above process 
          for (int factor = 3; factor <= Math.sqrt(num); factor += 2) { 
              // Find highest power of "factor" that divides num 
              int power = 0; 
              while (num % factor == 0) { 
                  num = num / factor; 
                  power++; 
              } 
    
              // If only factor^1 divides num (not higher powers), 
              // then return false 
              if (power == 1) 
                  return false; 
          } 
    
          // n must be 1 now if it is not a prime number. 
          // Since prime numbers are not powerful, we return 
          // false if num is not 1. 
          return (num == 1);
          
    }
  }






  

//#############################################################
//#                        MY SOLUTION 4


public class Challenge {

    public static boolean isPowerful(int num) {

    for (int i = 1; i <= num / 2; i++) {

        if (num % i == 0 && isPrime(i) && num % (i * i) != 0) {
            return false;
        }
    }
    
    return true;
}

public static boolean isPrime(int num) {
    if (num == 2 || num == 3) {
        return true;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {

        if (num % i == 0) {
            return false;
        }
    }

    return true;
}


}