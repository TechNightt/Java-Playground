/*********************************************************************************************************************
 Recursion: Fibonacci Numbers
Fibonacci numbers are created in the following way:

F(0) = 0
F(1) = 1
...
F(n) = F(n-2) + F(n-1)
Write a function that calculates the nth Fibonacci number.

Examples
fib(0) ➞ 0

fib(1) ➞ 1

fib(2) ➞ 1

fib(8) ➞ 21
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################






//#############################################################
//#                        MY SOLUTION 1   


public class Program {
	public static int fib(int n) {
		return n < 2 ? n : fib(n-1) + fib(n-2);
	}
}





//#############################################################
//#                        MY SOLUTION 2   


public class Program {
	public static int fib(int n) {
		if (n <= 1) return n;
		return fib(n - 1) + fib(n - 2);
	}
}




//#############################################################
//#                        MY SOLUTION 3   


public class Program {
	public static int fib(int n) {
		if ( n==0) {
			return 0;
			
		}
		if(n ==1) {
			return 1;
		}
		else {
			return fib(n-1) + fib(n-2);
		}
	}
}







//#############################################################
//#                        MY SOLUTION 4


public class Program {
	public static int fib(int n) {
		 if ((n == 0) || (n == 1))
         return n;
      else
         return fib(n - 1) + fib(n - 2);
	}
}







//#############################################################
//#                        MY SOLUTION 5



public class Program {
	public static int fib(int n) {
		
		if(n == 0)
			return 0;
		
		if(n == 1)
			return 1;
		
		int previous = 0;
		int current = 1;
		
		// fib(4) ➞ 3
		
		// 0 < 3 - previous = 1 | current = 1
		// 1 < 3 - previous = 1 | current = 2
		// 2 < 3 - previous = 2 | current = 3
		
		for(int i = 0;i < n-1;i++){
			int temp = previous + current;
			previous = current;
			current = temp;
		}
		return current;
	}
}

// fib(0) ➞ 0
// fib(1) ➞ 1
// fib(2) ➞ 1
// fib(3) ➞ 2
// fib(4) ➞ 3
// fib(5) ➞ 5
// fib(6) ➞ 8
// fib(7) ➞ 13
// fib(8) ➞ 21