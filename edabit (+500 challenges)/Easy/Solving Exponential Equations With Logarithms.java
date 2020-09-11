/*********************************************************************************************************************
 
Solving Exponential Equations With Logarithms

Create a function that takes a number a and finds the missing exponent x so that a when raised to the power of x is equal to b.

Examples
solveForExp(4, 1024) ➞ 5

solveForExp(2, 1024) ➞ 10

solveForExp(9, 3486784401) ➞ 10

Notes
a is raised to the power of what in order to equal b?

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int solveForExp(int a, int b) {
		return (int) (Math.log10(b) / Math.log10(a));
  }
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int solveForExp(int a, int b) {
		for(int i=0;i<=b;i++){
			if(Math.pow(a,i)==b)
				return i;
			
		}return 0;
  }
}



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int solveForExp(int a, int b) {
		int i = 0;
		while (true) 
		{
			if (Math.pow(a, i) == b)
			{
				return i;
			}
			i ++;
		}
  }
}




//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	/*
	Create a function that takes a number a and finds
	the missing exponent x so that a when raised to
	the power of x is equal to b.
	*/
	public static int solveForExp(int a, int b) {
		if ( a == b) return 1;
		int exp = 1;
		int tot = a;
		while (tot < b) {
			tot = tot * a;
			exp++;
		}
		return exp;
  }
}