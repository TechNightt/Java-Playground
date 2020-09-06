/*********************************************************************************************************************
 
Recursion: Factorials
Write a function that calculates the factorial of a number recursively.

Examples
factorial(5) ➞ 120
factorial(3) ➞ 6
factorial(1) ➞ 1
factorial(0) ➞ 1

**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


public class Program {
	public static int factorial(int n) {
		if (n <= 1) return 1;
		return n * factorial(n - 1);
	}
}

//#############################################################
//#                        MY SOLUTION 2   


public class Program {
	public static int factorial(int n) {
		return n < 2 ? 1 : factorial(n - 1) * n;
	}
}

//#############################################################
//#                        MY SOLUTION 3   


public class Program {
	public static int factorial(int n) {
		if (n == 0) 
            return 1; 
  
        return n * factorial(n - 1); 
	}
}

