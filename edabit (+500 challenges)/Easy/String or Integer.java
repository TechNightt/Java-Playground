/*********************************************************************************************************************
 String or Integer?
Create a function that checks if the argument is an integer or a string. Return int if it's an integer and str if it's a string.

Examples
intOrString(8) ➞ "int"

intOrString("Hello") ➞ "str"

intOrString(9843532) ➞ "int"
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


public class Program {
	public static String intOrString(Object var) {
		return var instanceof String ? "str" : "int";
	}
}


//#############################################################
//#                        MY SOLUTION 2   



public class Program {
	public static String intOrString(Object var) {
		if(var instanceof Integer)
			return "int";
		if(var instanceof String)
			return "str";
		return "";
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Program {
	public static String intOrString(Object var) {
		return var.toString().matches("[0-9]+")?"int":"str";
	}
}


