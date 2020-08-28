

/*********************************************************************************************************************
 
Return Something to Me!
Write a function that returns the string "something" joined with a space " " and the given argument a.

Examples
giveMeSomething("is better than nothing") ➞ "something is better than nothing"

giveMeSomething("Bob Jane") ➞ "something Bob Jane"

giveMeSomething("something") ➞ "something something"
Notes
Assume an input is given.

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Program {
	public static String giveMeSomething(String a) {
		return ("something " + a);
	}
}




public class Program {
    public static String giveMeSomething(String a) {
      String words = "something " + a;  
			return words;
    }
}