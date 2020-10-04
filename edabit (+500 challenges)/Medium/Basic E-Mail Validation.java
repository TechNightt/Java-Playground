/*********************************************************************************************************************
 Basic E-Mail Validation
Create a function that accepts a string, checks if it's a valid email address and returns either true or false, depending on the evaluation.

The string must contain an @ character.
The string must contain a . character.
The @ must have at least one character in front of it.
e.g. "e@edabit.com" is valid while "@edabit.com" is invalid.
The . and the @ must be in the appropriate places.
e.g. "hello.email@com" is invalid while "john.smith@email.com" is valid.
If the string passes these tests, it's considered a valid email address.

Examples
validateEmail("@gmail.com") ➞ false

validateEmail("hello.gmail@com") ➞ false

validateEmail("gmail") ➞ false

validateEmail("hello@gmail") ➞ false

validateEmail("hello@edabit.com") ➞ true

Notes
Check the Tests tab to see exactly what's being evaluated.
You can solve this challenge with RegEx, but it's intended to be solved with logic.
Solutions using RegEx will be accepted but frowned upon :(
********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Program {
    public static boolean validateEmail(String s) {
      return s.contains("@") && s.endsWith(".com")
				&& s.charAt(0) != '@' && s.charAt(0) != '.' && 
				java.lang.Math.abs(s.indexOf('.') - s.indexOf('@')) > 1;
    }
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Program {
    public static boolean validateEmail(String s) {
            if (!s.contains("@") || !s.contains(".")) {
                return false;
            }
            String[] words = s.split("@");
            if (words[0].equals("")) {
                return false;
            }
            if (!s.endsWith(".com")) {
                return false;
            }
            return true;
    
        }
    }







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Program {
		public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
				Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validateEmail(String s) {
						Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(s);
						return matcher.find();
    }
	
	
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Program {
    public static boolean validateEmail(String s) {
			return (s.contains("@") && s.contains(".")
				 && s.indexOf("@") >= 1
				 && s.indexOf("@") == s.lastIndexOf("@")
				 && (s.indexOf("@") < s.lastIndexOf("."))
							&&  s.charAt(s.indexOf("@") - 1) != '.'
							&&  s.charAt(s.indexOf("@") + 1) != '.'
						 );
    }
}