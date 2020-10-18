/*********************************************************************************************************************
 Finish the Sentence You're On!

POV: You are in an exam and time has just run out. While the teacher's back is turned, you hastily take the opportunity to finish scribbling down the last few words of the conclusion.

For this challenge, it takes 0.5 seconds to write a character (not including spaces). Given the full sentence and the unfinished sentence as inputs, return the time it takes to finish writing in seconds.

Worked Example
timeToFinish(
  "And so brings my conclusion to its conclusion.",
  "And so brings my conclusion to"
) ➞ 7

// "its" has 3 characters
// "conclusion." has 11 characters, including punctuation.
// 11 + 3 = 14
// 14 / 2 = 7
// Remember not to include spaces.
Examples
timeToFinish(
  "And so brings my conclusion to its conclusion.",
  "And so brings my conclusion to its conclus"
) ➞ 2

timeToFinish(
  "As a result, my point is still valid.",
  "As a result, my"
) ➞ 9

timeToFinish(
  "Thank you for reading my essay.",
  "T"
) ➞ 12

Notes
The unfinished sentence is always found at the start of a complete sentence.
Consider integer division with the default roundingMode = RoundingMode.HALF_DOWN.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Sentence {
	public static int timeToFinish(String f, String p) {
		return f.replace(p, "").replace(" ", "").length() / 2;
	}
}


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Sentence {
	public static int timeToFinish(String full, String part) {
		full = full.replaceAll(" ","");
		part = part.replaceAll(" ","");
		int fullL = full.toCharArray().length;
		int partL = part.toCharArray().length;
		return((fullL - partL)/2);
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Sentence {
	public static int timeToFinish(String full, String part) {
		/* Replaces all spaces for full and part String.  */
		full = full.replaceAll(" ", "");
		part = part.replaceAll(" ", "");

		return (full.length() - part.length()) / 2;
	}
	
	
	public static void main(String[] args) {
	
		System.out.println(timeToFinish("And so brings my conclusion to its conclusion.", 
										"And so brings my conclusion to its conclus"));
		System.out.println(timeToFinish("As a result, my point is still valid.", 
										"As a result, my"));
		System.out.println(timeToFinish("Thank you for reading my essay.", 
										"T"));
	}
}

