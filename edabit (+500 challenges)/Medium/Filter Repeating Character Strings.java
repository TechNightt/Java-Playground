/*********************************************************************************************************************
 Filter Repeating Character Strings
Create a function that keeps only strings with repeating identical characters (in other words, it has a set size of 1).

Examples
identicalFilter(["aaaaaa", "bc", "d", "eeee", "xyz"]) 
➞ ["aaaaaa", "d", "eeee"]

identicalFilter(["88", "999", "22", "545", "133"]) 
➞ ["88", "999", "22"]

identicalFilter(["xxxxo", "oxo", "xox", "ooxxoo", "oxo"]) 
➞ []

Notes
A string with a single character is trivially counted as a string with repeating identical characters.
If there are no strings with repeating identical characters, return an empty array (see example #3).
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.Arrays;

public class ChallengeTests {
	public static String[] identicalFilter(String[] arr) {
		return Arrays.stream(arr)
			.filter(s -> s.chars()
							.distinct()
							.count() == 1)
			.toArray(String[]::new);
	}
}





//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class ChallengeTests {
	public static String[] identicalFilter(String[] a) {
		String r = "";
		for(String s:a){
	  	if(s.replaceAll(""+s.charAt(0),"").length() == 0){
		    r+=s+" ";
			}
		}
		return r.length() == 0 ? new String[]{}:r.split(" ");
	}
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


import java.util.*;
public class ChallengeTests {
	public static String[] identicalFilter(String[] arr) {
ArrayList<String> sl = new ArrayList<>();
		for(String s: arr){
			char[] temp = s.toCharArray();
			int lenChar = temp.length;
			for(int x = 0; x < lenChar; x++){
				if(temp[x] == temp[0] && lenChar > 1){
					if(x == lenChar-1){
						sl.add(s);}
				}else if(temp[x] == temp[0] && lenChar == 1){
					sl.add(s);
				}else{
					break;
				}
			}
		}
		int lenSl = sl.size();
		String[] result = new String[lenSl];
		for(int j = 0; j < lenSl; j++){
			result[j] = sl.get(j);
		}
		return result;
    }
    





//#############################################################
//#                        MY SOLUTION 4
//#############################################################



import java.util.*;
public class ChallengeTests {
	public static String[] identicalFilter(String[] arr) {
		return Arrays.stream(arr).filter(a -> a.replaceAll(a.substring(0,1),"").length() == 0).toArray(String[]::new);
	}
}