/*********************************************************************************************************************
 Moran Numbers

A Harshad number is a number which is divisible by the sum of its digits. For example, 132 is divisible by 6 (1+3+2).

A subset of the Harshad numbers are the Moran numbers. Moran numbers yield a prime when divided by the sum of their digits. For example, 133 divided by 7 (1+3+3) yields 19, a prime.

Create a function that takes a number and returns "M" if the number is a Moran number, "H" if it is a (non-Moran) Harshad number, or "Neither".

Examples
moran(132) ➞ "H"

moran(133) ➞ "M"

moran(134) ➞ "Neither"
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################




public class Challenge {
	public static String moran(int n) {
		int sum = sumDigits(n);
		return (n % sum != 0) ? "Neither" : isPrime(n/sum) ? "M" : "H";
	}
	
	private static int sumDigits(int n) {
		return ("" + n).chars()
			.map(cp -> Character.getNumericValue(cp))
			.sum();
	}
	
	private static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i <= (int)Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static String moran(int n) {
		int num = n;
		int digits = 0;
		while(n >0){
			digits += n % 10;
			n /= 10;
		}
		if(num % digits == 0){
			if(prime(num / digits, 2))
				return "M";
			return "H";
		}
		
		return "Neither";
	}
	
	public static boolean prime(int n, int c){
		if(n < 2)
			return false;
		return n == c || (n % c != 0 && prime(n, c+1));
	}
	
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static String moran(int n) {
		int sod = sumOfDigit(n);
		return n%sod == 0 ? (isPrime(n/sod) ? "M" : "H" ): "Neither";
		
	}
	public static boolean isPrime(int n){
		int d = (int)Math.sqrt(n);
		while(d >= 2){
			if(n%d--==0){
				return false;
			}
		}
		return true;
	}
	public static int sumOfDigit(int n){
		int sum = 0;
		while(n!=0){
			sum += n%10;
			n/=10;
		}
		return sum;
	}
	
}







