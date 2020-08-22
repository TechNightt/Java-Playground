

/*********************************************************************************************************************
 
Concatenate First and Last Name into One String
Given two strings, firstName and lastName, return a single string in the format "last, first".

Examples
concatName("First", "Last") ➞ "Last, First"

concatName("John", "Doe") ➞ "Doe, John"

concatName("Mary", "Jane") ➞ "Jane, Mary"
Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




public class Challenge {
	public static String concatName(String firstName, String lastName) {
		return String.format("%s, %s", lastName, firstName);
	}
}




public class Challenge {
	public static String concatName(String firstName, String lastName) {
	lastName= lastName + ", ";
		String name = lastName.concat(firstName);
		return name;
	}
}