/*********************************************************************************************************************
Remix the String

Create a function that takes both a string and an array of numbers as arguments. Rearrange the letters in the string to be in the order specified by the index numbers. Return the "remixed" string.

Examples
remix("abcd", [0, 3, 1, 2]) ➞ "acdb"
The string you'll be returning will have: "a" at index 0, "b" at index 3, "c" at index 1, "d" at index 2, because the order of those characters maps to their corresponding numbers in the index array.

remix("PlOt", [1, 3, 0, 2]) ➞ "OPtl"

remix("computer", [0, 2, 1, 5, 3, 6, 7, 4]) ➞ "cmourpte"

Notes
Be sure not to change the original case; otherwise no gotchas. Assume you'll be given a string and array of equal length, both containing valid characters (A-Z, a-z, or 0-9).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static String remix(String str, int[] arr) {
		StringBuilder remixed = new StringBuilder(str);
		for(int i=0;i<str.length();i++){
			remixed.setCharAt(arr[i],str.charAt(i));
		}
		return remixed.toString();
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.ArrayList;
public class Challenge {
    public static String remix(String str, int[] arr) {
			ArrayList<Integer> list = new ArrayList<>();
        
			for (int num : arr) 
					list.add(num);

			StringBuffer sb = new StringBuffer();

			for (int i=0;i<arr.length;i++) 
					sb.append(str.charAt(list.indexOf(i)));       

			return sb.toString();			
		}
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.ArrayList;
public class Challenge {
    public static String remix(String str, int[] arr) {
			ArrayList<Integer> list = new ArrayList<>();
        
			for (int num : arr) 
					list.add(num);

			StringBuffer sb = new StringBuffer();

			for (int i=0;i<arr.length;i++) 
					sb.append(str.charAt(list.indexOf(i)));       

			return sb.toString();			
		}
}





//#############################################################
//#                        MY SOLUTION 4
//#############################################################


import java.util.*;

public class Challenge {
	public static String remix(String str, int[] arr) {
		String remixStr = "";
		String[] strArr = str.split("");
		Map<Integer, String> hMap = new HashMap<Integer, String>();

		for (int i = 0; i < arr.length; i++) { hMap.put(arr[i], strArr[i]); }
		for (int j = 0; j < hMap.size(); j++) { remixStr += hMap.get(j); }

		return remixStr;	
	}
}