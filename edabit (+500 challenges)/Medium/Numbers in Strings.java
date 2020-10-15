/*********************************************************************************************************************
 Numbers in Strings

Create a function that takes an array of strings and returns an array with only the strings that have numbers in them. If there are no strings containing numbers, return an empty array.

Examples
numInStr(["1a", "a", "2b", "b"]) ➞ ["1a", "2b"]

numInStr(["abc", "abc10"]) ➞ ["abc10"]

numInStr(["abc", "ab10c", "a10bc", "bcd"]) ➞ ["ab10c", "a10bc"]

numInStr(["this is a test", "test1"]) ➞ ["test1"]

Notes
The strings can contain white spaces or any type of characters.
Bonus: Try solving this without regex.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.Arrays;
public class Challenge {
	public static String[] numInStr(String[] arr) {
		return Arrays.stream(arr)
			.filter(s -> s.matches(".*[0-9].*"))
			.toArray(String[]::new);
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static String[] numInStr(String[] arr) {
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			if (containsDigit(arr[i])) {
				c++;
			}
		}
		String[] res = new String[c];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (containsDigit(arr[i])) {
				res[j] = arr[i];
				j++;
			}
		}
		return res;
	}
	public static boolean containsDigit(String str) {
		for (int i = 0; i < str.length(); i++) {
			if ((int)str.charAt(i) >= 48 && (int)str.charAt(i) <= 57) {
				return true;
			}
		}
		return false;
	}
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.*;

public class Challenge {
    public static String[] numInStr(String[] arr) {
        ArrayList L = new ArrayList();
        boolean valid;
        char c;
        for(String s: arr){
            valid = false;
            for(int i=0; i<s.length(); i++){
               c = s.charAt(i);
               if('0' <= c && c <= '9'){
                   valid = true;
                   break;
               }
            }
            if(valid){
                L.add(s);
            }
        }
        String[] ans = new String[L.size()];
        for(int i=0; i<L.size(); i++){
            ans[i] = (String) L.get(i);
        }
        return ans;
    }
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.*;
public class Challenge {
	public static String[] numInStr(String[] arr) {
		ArrayList<String> a = new ArrayList<String>();
		for(int i = 0; i < arr.length; i++){
			if(arr[i].contains("1") || arr[i].contains("2") || arr[i].contains("3") || arr[i].contains("4") || arr[i].contains("5") || arr[i].contains("6") || arr[i].contains("7") || arr[i].contains("8") || arr[i].contains("9") || arr[i].contains("0"))
				a.add(arr[i]);
		}
		String[] array = new String[a.size()];
		for(int i = 0; i < array.length; i++)
			array[i] = a.get(i);
		return array;
	}
}






//#############################################################
//#                        MY SOLUTION 5
//#############################################################


import java.util.ArrayList;
public class Challenge {
	public static String[] numInStr(String[] arr) {
		ArrayList<String> result = new ArrayList<String>();
		for(int i = 0; i < arr.length; i++){
			String indexStr = arr[i];
			String temp = indexStr.replaceAll("[\\p{Punct} a-zA-Z]", "0");
			if(Integer.parseInt(temp) != 0)
				result.add(indexStr);
		}
		return result.toArray(new String[result.size()]);
	}
}