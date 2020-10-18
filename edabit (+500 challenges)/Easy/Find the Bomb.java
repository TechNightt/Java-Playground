/*********************************************************************************************************************
 Find the Bomb

Write a function that finds the word "bomb" in the given string. Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".

Examples
bomb("There is a bomb.") ➞ "DUCK!"

bomb("Hey, did you think there is a BOMB?") ➞ "DUCK!"

bomb("This goes boom!!!") ➞ "Relax, there's no bomb."

Notes
The string "bomb" may appear in different character cases (i.e. uppercase, lowercase, mixed).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class FindTheBomb {
	public static String bomb(String s) {
		return s.matches("(?i).*(?<=bomb).*") ? "DUCK!" : "Relax, there's no bomb.";
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class FindTheBomb {
	public static String bomb(String str) {
		String l = str.toLowerCase();
		if (l.contains("bomb")) {
			return "DUCK!";
		} 
		return "Relax, there's no bomb.";
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class FindTheBomb {
	public static String bomb(String str) {
		str=str.toLowerCase();
		return str.length()==str.replaceAll("bomb", "").length() ? "Relax, there's no bomb." : "DUCK!";
	}
}


//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class FindTheBomb {
	public static String bomb(String str) {
		if (str.contains("BOMB") || str.contains("bomb") || str.contains("bOmB")
			 || str.contains("BoMb"))
		{
			return "DUCK!";
		}
		else
		{
			return "Relax, there's no bomb.";
		}
	}
}