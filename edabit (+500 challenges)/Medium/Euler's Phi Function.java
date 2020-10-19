/*********************************************************************************************************************
 Euler's Phi Function

The Euler's phi function (from the Greek letter φ, also called Euler's totient function) counts the positive integers that are coprime of a given number n, from 1 to n - 1. Two numbers are coprime when their greater common divisor is equal to 1. Look at the example below.

divisors of 6 ➞ [1, 2, 3, 6]

divisors of 5 ➞ [1, 5] ➞ g.c.d. = 1
divisors of 4 ➞ [1, 2, 4] ➞ g.c.d. = 2
divisors of 3 ➞ [1, 3] ➞ g.c.d. = 3
divisors of 2 ➞ [1, 2] ➞ g.c.d. = 2
divisors of 1 ➞ [1] ➞ g.c.d. = 1

1 and 5 are coprime of 6 ➞ phi(6) = 2
Implement a phi function that returns the count of coprime integers of a given positive integer n.

Examples
phi(1) ➞ 1

phi(3) ➞ 2

phi(8) ➞ 4

Notes
1 is trivially coprime of every number.
You can also proceed to obtain prime factors of an integer instead of all its positive divisors, just remember that 1 is present in any case despite is not prime.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.stream.IntStream;
public class Challenge {
	public static int phi(int n) {
		return (n == 1) ? 1 : (int)IntStream.range(1, n)
			.map(i -> gcd(i, n))
			.filter(i -> i == 1)
			.count();
  }
	
	private static int gcd(int a, int b) {
		return (b == 0) ? a : gcd(b, a % b);
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static void main(String[] args) {
		phi(9);
	}

	public static int phi(int n) {
		int coPrimeAmmount = 1;

		for (int i = 2; i < n; i++)
			if (gcd(i, n) == 1)
				coPrimeAmmount++;

		return coPrimeAmmount;
	}

	private static int gcd(int n1, int n2) {
		int min = (n1 < n2) ? n1 : n2;

		int gcd = 1;

		for (int i = 2; i <= min; i++)
			gcd = (n1 % i == 0 && n2 % i == 0) ? i : gcd;

		return gcd;
	}
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.stream.IntStream;
public class Challenge {
	private static int gcd(int a, int b) {return b == 0 ? a : gcd(b, a % b);}
	
	public static int phi(int n) {
		return (int) IntStream.rangeClosed(1, n)
			.filter(i -> gcd(n, i) == 1)
			.count();
  }
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################



import java.util.*;
public class Challenge {
public static int phi(int n) {
		if(n == 1)return 1;
		int k = 1;
		int ans = 0;
		while(k < n){
			if(gcd(n, getDiv(k)) == 1)
				ans++;
			k++;
		}
		
		return ans;
}

private static int gcd(int n, Integer[] arr){
		int ans = -1;
		for(int temp: arr)
			if(n % temp == 0)
				ans = temp;
		
		return ans;
}

private static Integer[] getDiv(int n){
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		int k = 1;
		while(k <= n){
			if(n % k == 0)
				list.add(k);
			k++;
		}
		Integer[] ans = list.toArray(new Integer[list.size()]);
		return ans;
}
}