/*********************************************************************************************************************
 Secret Society

A group of friends have decided to start a secret society. The name will be the first letter of each of their names, sorted in alphabetical order.

Create a function that takes in an array of names and returns the name of the secret society.

Examples
societyName(["Adam", "Sarah", "Malcolm"]) ➞ "AMS"

societyName(["Harry", "Newt", "Luna", "Cho"]) ➞ "CHLN"

societyName(["Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey"]) ➞ "CJMPRR"

Notes
The secret society's name should be entirely uppercased.
**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
public class Challenge {
	public static String societyName(String[] friends) {
		String name = Arrays.stream(friends).map(str -> String.valueOf(str.charAt(0))).sorted().reduce("", String::concat);
		 return name;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


import java.util.Arrays;
public class Challenge {
	public static String societyName(String[] friends) {
		String s = "";
		Arrays.sort(friends);
		
		for(int i=0; i<friends.length; i++)
		{
			s += friends[i].charAt(0);
		}
		return s;
	}
}


//#############################################################
//#                        MY SOLUTION 3   


import java.util.*;

public class Challenge {
	public static String societyName(String[] friends) {
		char [] names = new char[friends.length];
		String namesString = "";
		
		for(int i = 0; i < friends.length; i++)
		{
			Arrays.sort(friends);
			names[i] = friends[i].charAt(0);
			namesString += Character.toString(names[i]);
		}
		
		return namesString;
	}
}

