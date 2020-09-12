/*********************************************************************************************************************
 
Where is Bob!?!
Write a function that searches a list of names (unsorted) for the name "Bob" and returns the location in the list. If Bob is not in the array, return -1.

Examples
find_bob(["Jimmy", "Layla", "Bob"]) ➞ 2

find_bob(["Bob", "Layla", "Kaitlyn", "Patricia"]) ➞ 0

find_bob(["Jimmy", "Layla", "James"]) ➞ -1

Notes
Assume all names start with a capital letter and are lowercase thereafter (i.e. don't worry about finding "BOB" or "bob").

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Program {
	public static int find_bob(String[] names) {
		for( int i = 0 ; i < names.length; i++){
			if(names[i] == "Bob") 
				return i;
		}
		
		return -1;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


import java.util.Arrays;

public class Program {
	public static int find_bob(String[] names) {
		return Arrays.asList(names).indexOf("Bob");
	}
}



//#############################################################
//#                        MY SOLUTION 3   


public class Program {
	public static int find_bob(String[] names) {
		for(int i = 0; i < names.length; i++) {
			if(names[i].equals("Bob")) {
				return i;
			}
		}
		return -1;
	}



//#############################################################
//#                        MY SOLUTION 4


import java.util.ArrayList;
public class Program {
	public static int find_bob(String[] names) {
		ArrayList<String> list = new ArrayList<>();
		for(String name : names){
			list.add(name);
		}
		return list.indexOf("Bob");
	}