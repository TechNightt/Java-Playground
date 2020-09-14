/*********************************************************************************************************************
 Spaces Between Each Character

Create a function that takes a string and returns a string with spaces in between all of the characters.

Examples
spaceMeOut("space") ➞ "s p a c e"

spaceMeOut("far out") ➞ "f a r  o u t"

spaceMeOut("elongated musk") ➞ "e l o n g a t e d   m u s k"

Notes
Treat a space as its own character (i.e. leave three spaces between words).

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   

public class Challenge {
	public static String spaceMeOut(String str) {
		return str.replaceAll(""," ").trim();
	}
}


//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String spaceMeOut(String str) {
		String result = "";
		for (int i = 0; i < str.length()-1; i++) {
			result = result + str.charAt(i) + " ";
		}
		return result + str.charAt(str.length()-1);
	}
}





//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String spaceMeOut(String str) {
		String s = "";
		for (char c : str.toCharArray()) s += " " + c;
		return s.substring(1);
	}
}






//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String spaceMeOut(String str) {
                char[] chars = new char[str.length() * 2 - 1];

                String result = "";

                for (int i = 0; i < str.length(); i++) {
                        chars[i * 2] = str.charAt(i);
                }

                for (int i = 1; i < chars.length; i += 2) {
                        chars[i] = ' ';
                }

                for (int i = 0; i < chars.length; i++) {
                        result += chars[i];
                }

		return result;
	}
}