package com.code_wars.kyu8.convert_a_boolean_to_a_string.solution1;

/**
 * Convert a Boolean to a String

 * In this programming exercise, you're going to learn about functions, boolean (true/false) values, strings, and the if-statement.<br><br>
 * A function is a block of code that takes an input and produces an output. In this example, boolean_to_string is a function whose input is either true or false, and whose output is the string representation of the input, either "true"/"True" or "false"/"False" (check the sample tests about what capitalization to use in a given language).<br><br>
 * A common idea we often want to represent in code is the concept of true and false. A variable that can either be true or false is called a boolean variable. In this example, the input to boolean_to_string (represented by the variable b) is a boolean.<br><br>
 * Lastly, when we want to take one action if a boolean is true, and another if it is false, we use an if-statement.<br><br>
 * For this kata, don't worry about edge cases like where unexpected input is passed to the function. You'll get to worry about these enough in later exercises.
**/




 //#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class BooleanToString {
	
	// *****************************************************
	// * This method is used to convert boolean to String. *
    // *****************************************************
	public static String convert(boolean b) {
		return b ? "true" : "false";
	}

}