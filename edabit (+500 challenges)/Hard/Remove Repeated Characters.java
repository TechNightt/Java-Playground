/*********************************************************************************************************************
 Remove Repeated Characters
Create a function that will remove any repeated charcter(s) in a word passed to the function. Not just consecutive characters, but characters repeating anywhere in the string.

Examples
unrepeated("hello") ➞ "helo"

unrepeated("aaaaa") ➞ "a"

unrepeated("WWE!!!") ➞ "WE!"

unrepeated("call 911") ➞ "cal 91"

Notes
No more than two words will be passed.
Notice that a string is iterable.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


import java.util.ArrayList;

public class Challenge {
	public static String unrepeated(String s) {
		ArrayList<String> r = new ArrayList<>();
		for (char c: s.toCharArray()) if (!r.contains(Character.toString(c))) r.add(Character.toString(c));
		return String.join("", r);
	}
}





//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static String unrepeated(String str) {
        String s = "";
        for (int i = 0; i < str.length(); ++i)
            s += s.contains(String.valueOf(str.charAt(i))) ? "" : str.charAt(i);
        return s;
    }
}





//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static String unrepeated(String str) {
	        String[] strArr = str.split("");
        String unrepStr = "";

        for(int i = 0; i < strArr.length; i++) {
            int j;
            for(j = 0; j < i; j++) {
                if(strArr[i].equals(strArr[j])) {
                    break;
                }
            }
            if(j == i) {
                unrepStr += strArr[i];
            }
        }
        return unrepStr;
	}
}




//#############################################################
//#                        MY SOLUTION 4


import java.util.*;

public class Challenge {
	public static String unrepeated(String str) {
		Set<Character> soFar = new HashSet<>();
		
		String temp = "";
		for (char c: str.toCharArray()) {
			if (!soFar.contains(c)) {
				soFar.add(c);
				temp = temp + c;
			} 
		}
		
		return temp;
	}
}