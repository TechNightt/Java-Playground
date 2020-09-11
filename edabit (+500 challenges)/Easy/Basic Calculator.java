/*********************************************************************************************************************
 
Basic Calculator

Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.

Examples
calculator(2, '+', 2) ➞ 4

calculator(2, '*', 2) ➞ 4

calculator(4, '/', 2) ➞ 2

Notes
If the input tries to divide by 0, return 0.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int calculator(int num1, char operator, int num2) {
		switch(operator) {
			case '+': return num1 + num2;
			case '-': return num1 - num2;
			case '*': return num1 * num2;
			case '/': return (num2 == 0) ? 0 : num1/num2;
		}
		return 0;
  }
}



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static int calculator(int num1, char operator, int num2) {
		if (operator == '+')
				return num1+num2;
		if (operator == '*')
				return num1*num2;
		if (operator == '-')
        return num1-num2;
		try {
				return num1/num2;
		} catch (Exception et) {
				return 0;
		}		
  }
}



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int calculator(int m, char o, int n) {
		if(o=='/'&&n==0)return 0;
		return o=='+'?m+n:o=='-'?m-n:o=='*'?m*n:m/n;
  }
}


