/*********************************************************************************************************************
 
Check if a Number is Prime

Create a function that returns true if a number is prime, and false otherwise. A prime number is any positive integer that is evenly divisible by only two divisors: 1 and itself.

The first ten prime numbers are:

2, 3, 5, 7, 11, 13, 17, 19, 23, 29
Examples
isPrime(31) ➞ true

isPrime(18) ➞ false

isPrime(11) ➞ true

Notes
A prime number has no other factors except 1 and itself.
If a number is odd it is not divisible by an even number.
1 is not considered a prime number.
**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static boolean isPrime(int num) {
          if (num == 2)
                  return true;
          if (num < 2 || num % 2 == 0) 
                  return false;
          for (int i = 3; i <= (int) Math.sqrt(num); i += 2){
                  if (num % i == 0)
                          return false;
          }
          return true; 		
    }
  }



//#############################################################
//#                        MY SOLUTION 2   


import java.util.stream.IntStream;
public class Challenge {
  public static boolean isPrime(int num) {
		if (num == 1) {
			return false;
		}
		return IntStream.rangeClosed(2, (int)(Math.sqrt(num)+1))
			.filter(i -> num % i == 0)
			.count() == 0;
  }
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean isPrime(int num) {
          if (num == 1) return false;
          else{
          for (int i = 2; i < num; i++){
              if (num % i == 0) return false;
          }
              return true;
    }
  }
  }



//#############################################################
//#                        MY SOLUTION 4


import java.lang.Math; 
public class Challenge {
  public static boolean isPrime(int num) {
		if(num==1 || num==2)return false;
		for(int i=2; i<=Math.sqrt(num); ++i){
			if(num%i==0)return false;
		}
		return true;
  }
}