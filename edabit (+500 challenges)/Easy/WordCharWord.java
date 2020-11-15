/*********************************************************************************************************************
 WordCharWord

Create a function that will put the first argument, a character, between every word in the second argument, a string.

Examples
add("❤", "I love Tesh!") ➞ "I❤love❤Tesh!"

add("👍", "Java is a lot of fun.") ➞ "Java👍is👍a👍lot👍of👍fun."

add("#", "hello world!") ➞ "hello#world!"

add("&", "you me world") ➞ "you&me&world"

Notes
Make sure there are no spaces between words when returning the function.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class CharBetweenWords {
	public static String add(String c, String str) {
		return str.replace(" ", c);
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.StringJoiner;
public class CharBetweenWords {
	public static String add(String c, String str) {
		     StringJoiner sj1 = new StringJoiner(c);
        for (String s : str.split(" ")) {
            sj1.add(s);
        }
        return sj1.toString();
	}
}

