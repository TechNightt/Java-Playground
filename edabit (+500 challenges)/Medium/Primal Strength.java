/*********************************************************************************************************************
 
Primal Strength

In number theory, a prime number is balanced if it is equidistant from the prime before it and the prime after it. It is therefore the arithmetic mean of those primes. For example, 5 is a balanced prime, two units away from 3, and two from 7. 211 is 12 units away from the previous prime, 199, and 12 away from the next, 223.

A prime that is greater than the arithmetic mean of the primes before and after it is called a strong prime. It is closer to the prime after it than the one before it. For example, the strong prime 17 is closer to 19 than it is to 13 (see note at bottom).

A prime that is lesser than the arithmetic mean of the primes before and after it is called weak prime. For example, 19.

Create a function that takes a prime number as input and returns "Strong" if it is a strong prime, "Weak" if it is a weak prime, or "Balanced".

Examples
primalStrength(211) ➞ "Balanced"

primalStrength(17) ➞ "Strong"

primalStrength(19) ➞ "Weak"

Notes
This definition of strong primes is not to be confused with strong primes as defined in cryptography, which are much more complicated than this. You are all welcome to make a challenge based on cryptographically strong primes.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.IntStream;
public class Challenge {
	public static String primalStrength(int n) {
    int mean = (getLowPrime(n) + getHighPrime(n))/2;
    return (n > mean) ? "Strong" : (n < mean) ? "Weak" : "Balanced";
  }

  private static int getLowPrime(int n) {
    int i = n - 1;
    for (; i >= 2; i--) {
      if (isPrime(i)) {
        break;
      }
    }
    return i;
  }

  private static int getHighPrime(int n) {
    int i = n + 1;
    for (; true; i++) {
      if (isPrime(i)) {
        break;
      }
    }
    return i;
  }

  private static boolean isPrime(int n) {
    return IntStream.range(2, (int)(Math.sqrt(n) + 1))
        .noneMatch(i -> n % i == 0);
  }
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String primalStrength(int n) {

		for (int goingUp = n + 1, goingDown = n - 1; true; goingDown--, goingUp++)
			if (isPrime(goingUp) && isPrime(goingDown))
				return "Balanced";
			else if (isPrime(goingUp) && !isPrime(goingDown))
				return "Strong";
			else if (!isPrime(goingUp) && isPrime(goingDown))
				return "Weak";
	}

	private static boolean isPrime(int num) {
		if (num < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(num); i++)
			if (num % i == 0)
				return false;

		return true;
	}
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String primalStrength(int n) {
		int max = n+1;
		int min = n-1;
		while(!isPrime(max)){ max++;}
		while(!isPrime(min)){ min--;}
		return (max-n > n-min) ? "Weak" : (n-min > max-n) ? "Strong" : "Balanced";
	}
	
	private static boolean isPrime(int n){
		for(int i = 2; i < n; i++){
			if(n % i == 0) return false;
		}
		return true;
	}
}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static String primalStrength(int n) {
		int lower = n-1; int higher = n+1;
		while (!isPrime(lower)) lower--;
		while (!isPrime(higher)) higher++;
		if (n == (lower + higher) / 2) return "Balanced";
		return (n > (lower + higher) / 2) ? "Strong" : "Weak";
	}
	
	private static boolean isPrime(int n) {
		for (int i = 2; i < n; i++)
			if (n % i == 0) return false;
		return n > 1;
	}
}