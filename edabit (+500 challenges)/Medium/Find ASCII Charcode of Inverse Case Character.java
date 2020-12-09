/*********************************************************************************************************************
 
Find ASCII Charcode of Inverse Case Character

Create a function that takes a single character as an argument and returns the char code of its lowercased / uppercased counterpart.

Examples
Given that:
  - "A" char code is: 65
  - "a" char code is: 97

counterpartCharCode("A") ➞ 97

counterpartCharCode("a") ➞ 65


Notes
The argument will always be a single character.
Not all inputs will have a counterpart (e.g. numbers), in which case return the inputs char code.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static int counterpartCharCode(char ch) {
		int result = (int) ch;
        if(result>64 && result<91){
            result += 32;
        }else if(result>96 && result<123){
            result -= 32;
        }
        return result;
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int counterpartCharCode(char ch) {
		return (Character.isLowerCase(ch)) ? (int) Character.toUpperCase(ch) : (int) Character.toLowerCase(ch);
	}
}




//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static int counterpartCharCode(char c) {
		return c>64&&c<92 ? c+32 : c>96&&c<123 ? c-32 : c;
	}
}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static int counterpartCharCode(char ch) {
	
        String re1 = String.valueOf(ch).toUpperCase();
        String re2 = String.valueOf(ch).toLowerCase();
        
        if(ch == re1.charAt(0)){
            return (int) re2.charAt(0);
        }

        else {
            return (int) re1.charAt(0);
        }
		
	}
}