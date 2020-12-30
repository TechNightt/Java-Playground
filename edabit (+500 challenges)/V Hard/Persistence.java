/*********************************************************************************************************************
 Persistence
The additive persistence of an integer, n, is the number of times you have to replace n with the sum of its digits until n becomes a single digit integer.

The multiplicative persistence of an integer, n, is the number of times you have to replace n with the product of its digits until n becomes a single digit integer.

Create two functions that take an integer as an argument and:

Return its additive persistence.
Return its multiplicative persistence.
Examples: Additive Persistence
additivePersistence(1679583) ➞ 3
// 1 + 6 + 7 + 9 + 5 + 8 + 3 = 39
// 3 + 9 = 12
// 1 + 2 = 3
// It takes 3 iterations to reach a single-digit number.

additivePersistence(123456) ➞ 2
// 1 + 2 + 3 + 4 + 5 + 6 = 21
// 2 + 1 = 3

additivePersistence(6) ➞ 0
// Because 6 is already a single-digit integer.
Examples: Multiplicative Persistence
multiplicativePersistence(77) ➞ 4
// 7 x 7 = 49
// 4 x 9 = 36
// 3 x 6 = 18
// 1 x 8 = 8
// It takes 4 iterations to reach a single-digit number.

multiplicativePersistence(123456) ➞ 2
// 1 x 2 x 3 x 4 x 5 x 6 = 720
// 7 x 2 x 0 = 0

multiplicativePersistence(4) ➞ 0
// Because 4 is already a single-digit integer.


Notes
The input n is never negative.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int additivePersistence(int n) {
		if (n == 0)
			return 0;
		
		int iterations = Integer.valueOf(n).toString().length();
		
		if (iterations == 1)
			return 0;
		
		int result = 0, temp = 0;
		while(temp > 9 || temp == 0){
			iterations = Integer.valueOf(n).toString().length();
			temp = 0;
			for (int i = 0; i < iterations; i++) {
				temp += n % 10;
				n = (n - (n%10))/10;
			}
			n = temp;
			result++;
		}
		return result;
  }

	public static long multiplicativePersistence(long n) {
		if (n==0)
			return 0;
		int iterations = Long.valueOf(n).toString().length();
		
		boolean breaking = false;
		
		if (iterations == 1)
			return 0;
		
		long result = 0, temp = 0;
		while(temp > 9 || temp == 0){
			iterations = Long.valueOf(n).toString().length();
			temp = 1;
			for (int i = 0; i < iterations; i++) {
				temp *= n % 10;
				if (temp == 0){
					breaking = true;
					break;
				}	
				n = (n - (n%10))/10;
			}
			n = temp;
			result++;
			if(breaking)
				break;
		}
		return result;
  }
}



//#############################################################
//#                        MY SOLUTION 2   



import java.util.ArrayList;

public class Challenge {
	public static int additivePersistence(int n) {
				if (n < 10) {
			return 0;
		}

		// n kopieren, kopie abrunden
		// n mod kopie = letzte ziffer
		// letzte ziffer abschneiden, in array packen
		// länge checken, wenn nur eine stelle übrig ist -> ziffer übernehmen
		// array addieren
		// return counter hochzählen
		// wieder von vorne anfangen

		int newN = 0;
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int result = 0;

		do {
			try {
				while (n > 9) {
					int m = n;
					m = Math.round(m / 10) * 10;
					digits.add(n % m);
					n /= 10;
				}
			} finally {
				digits.add(n);
			}

			for (int digit : digits) {
				newN += digit;
			}
			result++;
			n = newN;
			newN = 0;
			digits.clear();
		} while (n > 9);

		return result;
  }

	public static long multiplicativePersistence(long n) {

				long result = 0L;

		if (n < 10) {
			return result;
		}

		do {
			String s = String.valueOf(n);
			long[] numberArray = new long[s.length()];

			for (int i = 0; i < s.length(); i++) {
				numberArray[i] = Integer.parseInt(Character.toString(s.charAt(i)));
			}

			long product = numberArray[0];

			for (int i = 1; i < numberArray.length; i++) {
				product *= numberArray[i];
			}
			result++;
			n = product;
		} while (n > 9);

		return result;
		
  }
}




//#############################################################
//#                        MY SOLUTION 3   



import java.util.stream.*;

public class Challenge {
	public static int additivePersistence(int n) {
		int sum = n;
		int steps = 0;
		while(sum>9){
			int[]digits = Integer.toString(sum).chars().map(c -> c - '0').toArray(); 
			sum = IntStream.of(digits).sum();
			steps++;
		}
		return steps;
  }

	public static int multiplicativePersistence(long n) {
		long sum = n;
		int steps = 0;
		while(sum>9){
			long[] digits = Long.toString(sum).chars().mapToLong(c -> c - '0').toArray(); 
			sum = LongStream.of(digits).reduce(1, (a, b) -> a * b);
			steps++;
		}
		return steps;
  }
}




//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	/**
     * The additive persistence of an integer, n, is the number of times
     * you have to replace n with the sum of its digits until
     * n becomes a single digit integer.
     * @param n
     * @return {int}
     */
    public static int additivePersistence(int n) {
			int numberOfIterations = 0;

			while (n / 10 != 0) {
				numberOfIterations++;
				
				n = String.valueOf(n)
								.chars()
								.map(Character::getNumericValue)
								.sum();
			}
			
		return numberOfIterations;
	}

    /**
     * The multiplicative persistence of an integer, n, is the number of times
     * you have to replace n with the product of its digits until
     * n becomes a single digit integer.
     */
    public static long multiplicativePersistence(long n) {
			int numberOfIterations = 0;

			while (n / 10 != 0) {
				numberOfIterations++;

				n = String.valueOf(n)
								.chars()
								.mapToLong(Character::getNumericValue)
								.reduce(1, (acc, digit) -> acc * digit);
			}

		return numberOfIterations;
  }
}