/*********************************************************************************************************************
 Disarium Number
A number is said to be Disarium if the sum of its digits raised to their respective positions is the number itself.

Create a function that determines whether a number is a Disarium or not.

Examples
isDisarium(75) ➞ false
// 7^1 + 5^2 = 7 + 25 = 32
 
isDisarium(135) ➞ true
// 1^1 + 3^2 + 5^3 = 1 + 9 + 125 = 135

isDisarium(518) ➞ true

isDisarium(8) ➞ true

Notes
Position of the digit is 1-indexed.
A recursive version of this challenge can be found here.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



public class DisariumNumber {
	public static boolean isDisarium(int n) {
		// Count digits in n.
        int count_digits = Integer.toString(n).length();
      
        // Compute sum of terms like digit multiplied by
        // power of position
        int sum = 0; // Initialize sum of terms
        int x = n;
        while (x!=0)
        {
            // Get the rightmost digit
            int r = x%10;
      
            // Sum the digits by powering according to
            // the positions
            sum = (int) (sum + Math.pow(r, count_digits--));
            x = x/10;
        }
      
        // If sum is same as number, then number is
        return (sum == n);
	}
}






//#############################################################
//#                        MY SOLUTION 2   


public class DisariumNumber {
	public static boolean isDisarium(int n) {
		return n==r(n,(""+n).length());
	}
	private static int r(int n, int p) {
		return n<1 ? 0 : (int)Math.pow(n%10,p) + r(n/10,--p);
	}
}






//#############################################################
//#                        MY SOLUTION 3   


public class DisariumNumber {
    public static boolean isDisarium(int n) {
      int numberOfDigits = numberOfDigits(n);
      int sum = 0;
      int temp = n;
      return check(n, temp, sum, numberOfDigits);
    }
  
    private static int numberOfDigits(int n) {
      int digits = 0;
      while (n > 0) {
        digits++;
        n = n / 10;
      }
      return digits;
    }
  
    private static boolean check(int n, int temp, int sum, int numberOfDigits) {
      if (temp == 0) {
        return n % sum == 0;
      }
      sum = sum + (int) Math.pow(temp % 10, numberOfDigits);
      return check(n, temp / 10, sum, --numberOfDigits);
    }
  }





//#############################################################
//#                        MY SOLUTION 4


public class DisariumNumber {
	public static boolean isDisarium(int num) {
		String s = ""  + num;
		int sum = 0;
		
		for (int i = 0; i < s.length(); i++) {
			sum += Math.pow(Integer.parseInt("" + s.charAt(i)), i + 1);
		}// end for 
		
		return sum == num? true : false;
	}
}