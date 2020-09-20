/*********************************************************************************************************************
 Say "Hello" Say "Bye"

Write a function that takes a string name and a number num (either 0 or 1) and return "Hello" + name if num is 1, otherwise return "Bye" + name.

Examples
sayHelloBye("alon", 1) ➞ "Hello Alon"

sayHelloBye("Tomi", 0) ➞ "Bye Tomi"

sayHelloBye("jose", 0) ➞ "Bye Jose"

Notes
The name you return must be capitalized.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String sayHelloBye(String name, int num) {
		return (num == 1 ? "Hello " : "Bye ") +
			name.substring(0,1).toUpperCase() + name.substring(1);
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String sayHelloBye(String name, int num) {
		if (num == 1) return "Hello " + Character.toUpperCase(name.charAt(0)) + name.substring(1);
		else return "Bye " + Character.toUpperCase(name.charAt(0)) + name.substring(1);
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String sayHelloBye(String name, int num) {
		String titleName = Character.toUpperCase(name.charAt(0)) + name.substring(1).toLowerCase();
		return String.format("%s %s", (num == 1) ? "Hello" : "Bye", titleName);
	}
}


//#############################################################
//#                        MY SOLUTION 4
