/*********************************************************************************************************************
 
Check String for Spaces
Create a function that returns true if a string contains any spaces.

Examples
hasSpaces("hello") ➞ false

hasSpaces("hello, world") ➞ true

hasSpaces(" ") ➞ true

hasSpaces("") ➞ false

hasSpaces(",./!@#") ➞ false
Notes
An empty string does not contain any spaces.
Try doing this without RegEx.

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




public class Challenge {
	public static boolean hasSpaces(String str) {
		return str.contains(" ");
	}
}







public class Challenge {
	public static boolean hasSpaces(String str) {
            char space = ' ';
            for(int i = 0;i<str.length();i++){
                if(str.charAt(i) == space)
                    return true;
            } return false;
        }
}








public class Challenge {
	public static boolean hasSpaces(String str) {
		for(int i = 0; i<str.length();i++){
		
		if(str.charAt(i) == ' '){
			return true;
		}
		}
		return false;
	}
}




public class Challenge {
	public static boolean hasSpaces(String str) 
	{
		return str.contains(" ") ? true : false;
	}
}