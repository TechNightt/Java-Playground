package com.code_wars.kyu8.basic_mathematical_operations.solution1;

/**
 * Your task is to create a function that does four basic mathematical operations.<br><br>
 * The function should take three arguments - operation(string/char), value1(number), value2(number).<br>
 * The function should return result of numbers after applying the chosen operation.<br><br>
 * Examples<br>
 * basicOp('+', 4, 7)         // Output: 11<br>
 * basicOp('-', 15, 18)       // Output: -3<br>
 * basicOp('*', 5, 5)         // Output: 25<br>
 * basicOp('/', 49, 7)        // Output: 7
**/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




public class BasicOperations {
	
	// ******************************************************************************************************************************
	// * This method is used to perform mathematical operation on 2 numbers depending on the argument that is passed to the method. *
	// ******************************************************************************************************************************
	public static Integer basicMath(String op, int v1, int v2) {
		switch(op) {
			case "+": return v1 + v2;
			case "-": return v1 - v2;
			case "*": return v1 * v2;
			default: return v1 / v2;
		}
	}
  
}