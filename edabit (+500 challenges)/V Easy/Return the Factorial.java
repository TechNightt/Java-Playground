/*********************************************************************************************************************
 Return the Factorial
Create a function that takes an integer and returns the factorial of that integer. That is, the integer multiplied by all positive lower integers.

Examples
factorial(3) ➞ 6

factorial(5) ➞ 120

factorial(13) ➞ 6227020800
Notes
Assume all inputs are greater than or equal to 0.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


public class Challenge {
	public static int factorial(int num) {
		int f = 1;
		while(num>0){
			f *=num;
			num--;
		}
		return f;
	}
}


//#############################################################

public class Challenge {
	public static int factorial(int num) {
		if(num == 0) return 1;
		return num*factorial(num-1);
	}
}


//#############################################################


public class Challenge {
	public static int factorial(int num) {
		int sum = 1;
		for (int i = 1; i <= num; i++)
			sum *= i;
		
		return sum;
	}
}

//#############################################################

public class Challenge {
	public static int factorial(int num) {
	if(num == 0 || num == 1){
		return 1;
	}else{
		return factorial(num-1) * num;
	}
	}
}


//#############################################################
