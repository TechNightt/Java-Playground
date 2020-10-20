/*********************************************************************************************************************
 Repeat the Shorter String

Write a function that repeats the shorter string until it is equal to the length of the longer string.

Examples
lengthen("abcdefg", "ab") ➞ "abababa"

lengthen("ingenius", "forest") ➞ "forestfo"

lengthen("clap", "skipping") ➞ "clapclap"

Notes
Both strings will differ in length.
Both strings will contain at least one character.
Either of the two strings could be the shortest in length.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static String lengthen(String str1, String str2) {
        String shorter = shorterString(str1, str2);
        String longer = longerString(str1, str2);
        String result = "";
        
        for (int i= 0; i<(longer.length()/shorter.length()); i++) {
            result += shorter;
        }
        
        result += shorter.substring(0, longer.length()%result.length());

        return result;
    }

    public static String shorterString(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return str1;
        } else return str2;
    }

    public static String longerString(String str1, String str2) {
        if (str1.length() > str2.length()) {
            return str1;
        } else return str2;
    }
		
	
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.*;
import java.io.*;

public class Challenge {
	public static String lengthen(String s1, String s2)
  {
    List<Integer> lst = new ArrayList<>();
    lst.add(s1.length());
    lst.add(s2.length());

    List<String> words = new ArrayList<>();
    words.add(s1);
    words.add(s2);

    int maxim = lst.indexOf(Collections.max(lst));
    int minim = lst.indexOf(Collections.min(lst));

    String maxi = words.get(maxim);
    String mini = words.get(minim);

    String output = "";
    for(int i = 0; i < maxi.length(); i++)
    {
      output += mini;
    }
    return output.substring(0,maxi.length());
	}
}



//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static String lengthen(String str1, String str2) {
        String longer = "";
        boolean flag = true;
        while (flag) {
            if (str1.length() > str2.length()) {
                longer = str2;
                for (int i = 0; i < (str1.length() - str2.length()); i++) {
                    longer += longer.charAt(i);
                    System.out.println(longer);
                }
            }
            if (str2.length() > str1.length()) {
                longer = str1;
                for (int i = 0; i < (str2.length() - str1.length()); i++) {
                    longer += longer.charAt(i);
                    System.out.println(longer);
                }
            }
            if (str1.length() == longer.length() || str2.length() == longer.length()) {
                flag = false;
            }
            System.out.println(longer);
        }
            return longer;
    }
}



//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static String lengthen(String str1, String str2) {
		String max = str1.length() > str2.length() ? str1 : str2;
		String res = str1.length() < str2.length() ? str1 : str2;
		int n = 0;
		while(res.length()!= max.length()) {
			res += res.charAt(n++);
		}
		return res;
	}
}