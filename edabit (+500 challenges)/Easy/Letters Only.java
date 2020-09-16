/*********************************************************************************************************************
Letters Only

Write a function that removes any non-letters from a string, returning a well-known film title.

Examples
lettersOnly("R!=:~0o0./c&}9k`60=y") ➞ "Rocky"

lettersOnly("^,]%4B|@56a![0{2m>b1&4i4") ➞ "Bambi"

lettersOnly("^U)6$22>8p).") ➞ "Up"
**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String lettersOnly(String str) {
		 return str.replaceAll("[^a-zA-Z]","");
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String lettersOnly(String str) {
		return str.replaceAll("[!-~&&[^a-z]&&[^A-Z]]*", "");
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String lettersOnly(String str) {
		String newStr = "";
		for(int x = 0; x < str.length(); x++) {
			if( ( (int)str.charAt(x) >= 65 && (int) str.charAt(x) <= 90) || 
				 ((int) str.charAt(x) >= 97 && (int) str.charAt(x) <= 122)) {
				newStr += Character.toString(str.charAt(x));
			}
		}
		return newStr;
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String lettersOnly(String str) {
		String newStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (isLetter(str.charAt(i))) {
				newStr += str.charAt(i);
			}
		}
		return newStr;
	}
	public static boolean isLetter(char c) {
		char check = Character.toLowerCase(c);
		return check == 'a' || check == 'b' ||
					 check == 'c' || check == 'd' ||
					 check == 'e' || check == 'f' ||
					 check == 'g' || check == 'h' ||
					 check == 'i' || check == 'j' ||
					 check == 'k' || check == 'l' ||
					 check == 'm' || check == 'n' ||
					 check == 'o' || check == 'p' ||
					 check == 'q' || check == 'r' ||
					 check == 's' || check == 't' ||
					 check == 'u' || check == 'v' ||
					 check == 'w' || check == 'x' ||
					 check == 'y' || check == 'z';
	}
}





//#############################################################
//#                        MY SOLUTION 5



import static java.util.Arrays.stream;
import static java.util.stream.Collectors.joining;
public class Challenge {
	public static String lettersOnly(String str) {
		return stream(str.split("")).filter(s->Character.isLetter(s.charAt(0)))
																.collect(joining());
	}
}