/*********************************************************************************************************************
 
Capture the Rook
Write a function that returns true if two rooks can attack each other, and false otherwise.

Examples
canCapture(["A8", "E8"]) ➞ true

canCapture(["A1", "B2"]) ➞ false

canCapture(["H4", "H3"]) ➞ true

canCapture(["F5", "C8"]) ➞ false

Notes
Assume no blocking pieces.
Two rooks can attack each other if they share the same row (letter) or column (number).

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static boolean canCapture(String[] rooks) {
		return ((rooks[0].charAt(0) == rooks[1].charAt(0)) || 
						(rooks[0].charAt(1) == rooks[1].charAt(1)));
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static boolean canCapture(String[] rooks) {
		return rooks[0].charAt(0) == rooks[1].charAt(0) || rooks[0].charAt(1) == rooks[1].charAt(1);
	}
}



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static boolean canCapture(String[] rooks) {
		char [] rook1 = new char [2];
		char [] rook2 = new char [2];
		rook1[0] = rooks[0].charAt(0);
		rook1[1] = rooks[0].charAt(1);
		rook2[0] = rooks[1].charAt(0);
		rook2[1] = rooks[1].charAt(1);
		
		if(rook1[0] == rook2[0] || rook1[1] == rook2[1])
			return true;
		else return false;
		
	}
}



//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static boolean canCapture(String[] rooks) {
		String s1 = rooks[0];
		String s2 = rooks[1];
		boolean result = false;
		if (s1.charAt(0) == s2.charAt(0)){
			result = true;
		}
		if (s1.charAt(1) == s2.charAt(1)){
			result = true;
		}
		return result;
	}
}