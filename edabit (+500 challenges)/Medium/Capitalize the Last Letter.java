/*********************************************************************************************************************
 
Capitalize the Last Letter

Create a function that capitalizes the last letter of every word.

Examples
capLast("hello") ➞ "hellO"

capLast("My Name Is Edabit") ➞ "MY NamE IS EdabiT"

capLast("HELp THe LASt LETTERs CAPITALISe") ➞ "HELP THE LAST LETTERS CAPITALISE"

Notes
There won't be any cases of punctuation in the tests.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static String capLast(String str) {
		String[] newArr = str.split(" ");
        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = newArr[i].substring(0, newArr[i].length() - 1) + newArr[i].substring(newArr[i].length() - 1).toUpperCase();
        }
        return String.join(" ", newArr);
	}
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.Arrays;
import java.util.stream.Collectors;

public class Challenge {
	public static String capLast(String str) {
    return Arrays.stream(str.split(" ")).map(s -> s.substring(0, s.length()-1) + Character.toUpperCase(s.charAt(s.length()-1))).collect(Collectors.joining(" "));
	}
}








//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String capLast(String str) {
		String[] words = str.split(" ");
		String total = "";
		for(int i = 0; i < words.length; i++){
			words[i] = words[i].substring(0, words[i].length() - 1) + words[i].substring(words[i].length() - 1).toUpperCase();
		}
		for(int i = 0; i < words.length; i++){
			if(i == words.length - 1){
				total += words[i];
				break;
			}
			total += words[i] + " ";
		}
		return total;
	}
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
	public static String capLast(String str) {
		String ret = "";
		for (int i=0;i<str.length();i++)
			if (i==str.length()-1)
				ret += str.substring(i,i+1).toUpperCase();
			else if (str.charAt(i+1)==' ')
				ret += str.substring(i,i+1).toUpperCase();
			else
				ret += str.charAt(i);
		return ret;
	}
}