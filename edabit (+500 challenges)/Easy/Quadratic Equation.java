/*********************************************************************************************************************
 Quadratic Equation
Create a function to find only the root value of x in any quadratic equation ax^2 + bx + c. The function will take three arguments:

a as the coefficient of x^2
b as the coefficient of x
c as the constant term
Examples
quadraticEquation(1, 2, -3) ➞ 1

quadraticEquation(2, -7, 3) ➞ 3

quadraticEquation(1, -12, -28) ➞ 14

Notes
Quadratic equation is always guaranteed to have a root.
Check the Resources tab for more information on quadratic equations.
Calculate only the root that sums the square root of the discriminant, not the one that subtracts it.
Round the value / return only integer value.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int quadraticEquation(int a, int b, int c) {
		int x1 = (-b + (int)Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
		int x2 = (-b - (int)Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
		return (x1 < 0) ? x2 : x1;		
  }
}






//#############################################################
//#                        MY SOLUTION 2   


import java.lang.Math; 
public class Challenge {
	public static int quadraticEquation(int a, int b, int c) {
		int i = (b*b)-(4*(a*c));
		int x = (int)((-b + Math.sqrt(i))/(2*a)) ;
		int y = (int)((-b - Math.sqrt(i))/(2*a)) ;
		return x > 0 ? x : y;
  }
}





//#############################################################
//#                        MY SOLUTION 3   




public class Challenge {
	public static int quadraticEquation(int a, int b, int c) {
		int determinant = b * b - 4 * a * c;
        double root1 = 0, root2 = 0;
        if (determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
        }
        // Condition for real and equal roots
        else if (determinant == 0) {
            root1 = root2 = -b / (2 * a);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
        }
        return (int) root1;
  }
}







//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int quadraticEquation(int a, int b, int c) {
		if (a == 0 || (b * b - 4 * a * c < 0)) return -1;
		int sqrtRoot = (int) Math.sqrt(b * b - 4 * a * c);
		int x1 = (-b + sqrtRoot) / (2 * a);
		int x2 = (-b - sqrtRoot) / (2 * a);
		return x1 > 0 ? x1 : x2;
  }
}