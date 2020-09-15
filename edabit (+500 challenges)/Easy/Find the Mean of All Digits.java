/*********************************************************************************************************************
 Find the Mean of All Digits
Create a function that returns the mean of all digits.

Examples
mean(42) ➞ 3

mean(12345) ➞ 3

mean(666) ➞ 6

Notes
The mean of all digits is the sum of digits / how many digits there are (e.g. mean of digits in 512 is (5+1+2)/3(number of digits) = 8/3=2).
The mean will always be an integer.
**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int mean(int a) {
		String number = String.valueOf(Math.abs(a));
		return (int) number.chars().map(x -> x-48).sum()/number.length();
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int mean(int a) {
		return (int)String.valueOf(a).chars()
			.map(Character::getNumericValue)
			.average()
			.orElse(0);
	}
}





//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int mean(int a) {
		String s = Integer.toString(a);
		int[] d = new int[s.length()];
		for (int i = 0; i < s.length(); ++i) {
			d[i] = s.charAt(i) == '-' ? 0 : s.charAt(i) - '0';
		}
		
		int sum = 0;
		for (int i : d) {
			sum += i;
		}
		
		return d[0] == 0 ? sum / (s.length() - 1) : sum / s.length();
	}
}
