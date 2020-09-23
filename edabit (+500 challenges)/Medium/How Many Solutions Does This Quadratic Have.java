/*********************************************************************************************************************
 How Many Solutions Does This Quadratic Have?
A quadratic equation a x² + b x + c = 0 has either 0, 1, or 2 distinct solutions for real values of x. Given a, b and c, you should return the number of solutions to the equation.

Examples
solutions(1, 0, -1) ➞ 2
// x² - 1 = 0 has two solutions (x = 1 and x = -1).

solutions(1, 0, 0) ➞ 1
// x² = 0 has one solution (x = 0).

solutions(1, 0, 1) ➞ 0
// x² + 1 = 0 has no solutions.

Notes
You do not have to calculate the solutions, just return how many there are.
a will always be non-zero.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int solutions(int a, int b, int c) {
		int discrim = (int)Math.pow(b, 2) - 4 * a *  c;
		return (discrim == 0) ? 1 : (discrim < 0) ? 0 : 2; 
  }
}





//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int solutions(int a, int b, int c) {
		int one = 1;
		int two = 2;
		int zero = 0;
		
		if (((b * b) - (4 * a * c)) > 0) 
      return two;
        else if (((b * b) - (4 * a * c)) == 0) 
            return one; 
  
        else
            return zero;
  }
}




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int solutions(int a, int b, int c) {
		int numSol = 0;
		//a x^2 + b x + c = 0
		if(b==0 && c > 0)	{
			numSol = 0;
		}
		else if((c < 0) || (a == b))	{
			numSol = 2;
		}
		else if((b==0 && c==0) || (b > c))	{
			numSol = 1;
		}
		return numSol;
	}
}



