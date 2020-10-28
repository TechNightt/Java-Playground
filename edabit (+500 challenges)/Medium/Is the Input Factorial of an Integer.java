/*********************************************************************************************************************
 Is the Input Factorial of an Integer?

Create a function that checks if a given integer is exactly the factorial of an integer or not. true if it is, false otherwise.

Examples
isFactorial(2) ➞ true
// 2 = 2 * 1 = 2!

isFactorial(27) ➞ false

isFactorial(24) ➞ true
// 24 = 4 * 3 * 2 * 1 = 4!

Notes
No error handling is necessary. Inputs are all positive integers.
Alternatively, you can solve this with a recursive approach.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Program {
	public static boolean isFactorial(int n) {
		int fact = 1;
		for (int i = 2; fact < n; i++){
			fact *= i;
		}
		return fact == n;
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Program {
    public static boolean isFactorial(int n) {
      int factorial = 1;
      int idx = 1;
      while (factorial < n) {
        factorial *= idx;
        idx++;
      }
      return factorial == n ? true : false;
    }
  }





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Program {
	public static boolean isFactorial(int n) {
		    if (n < 10) return true;
        for (int i = n/2; i >= 1; i--) {
            if (n % i == 0) {
                int sum = 1;
                for (int j = 1; j <= i; j++) sum += sum * j;
                if (sum == n) return true;
            }
        }
        return false;
	}
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Program {
	public static boolean isFactorial(int n) {
		int f = 1;
		for(int i = 1 ; i <= n ; i++) {
			f *= i;
			if(f == n) break;
		}
		return f == n ;
	}
}