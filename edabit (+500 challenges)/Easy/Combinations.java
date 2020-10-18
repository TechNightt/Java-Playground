/*********************************************************************************************************************
 Combinations

Create a function that takes a variable number of arguments, each argument representing the number of items in a group, and returns the number of permutations (combinations) of items that you could get by taking one item from each group.

Examples
combinations(2, 3) ➞ 6

combinations(3, 7, 4) ➞ 84

combinations(2, 3, 4, 5) ➞ 120

Notes
Don't overthink this one.
Input may include the number zero.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static int combinations(int... args) {   
		int result = 1;

		for (int num : args)
				if (num>0)
						result*=num;

		return result;
	}
}


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int combinations(int... num) {   
		int result = 1;
		for(int i : num)
			result *= i == 0 ? 1 : i;
		return result;
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static int combinations(int... n1) {
		int result = 1;
		for (int a : n1) if (a != 0)result *= a;
		return result;
	}
}



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static int factorial(int a)
	{
		int fac = a;
		for (int i = a - 1; i > 0; i--)
		{
			fac *= i;
		}
		
		return fac;
	}
	
	public static int com(int total, int sel)
	{
		if (sel == 0 || total == 0)
		{
			return 1;
		}
		return factorial(total) / (factorial(sel) * factorial(total - sel));
	}
	
	public static int combinations(int... numbers)
	{
		int c = 1;
		for (int n : numbers)
		{
			c *= com(n, 1);
		}
		
		return c;
	}
}