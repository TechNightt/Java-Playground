

/*********************************************************************************************************************
 
Is the Word Singular or Plural?
Create a function that takes in a word and determines whether or not it is plural. A plural word is one that ends in "s".

Examples
isPlural("changes") ➞ true

isPlural("change") ➞ false

isPlural("dudes") ➞ true

isPlural("magic") ➞ false
Notes
Don't forget to return the result.
Remember that return true (boolean) is not the same as return "true" (string).
This is an oversimplification of the English language. We are ignoring edge cases like "goose" and "geese", "fungus" and "fungi", etc.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





public class Challenge {
	public static boolean isPlural(String word) {
		if (word.substring(word.length()-1).equals("s")){
			return true;
		} else {
			return false;
		}
	}
}



public class Challenge {
	public static boolean isPlural(String word) {
		return word.endsWith("s") ? true : false;
	}
}



public class Challenge {
	public static boolean isPlural(String word) {
		int finalIndex = word.length() - 1;
		char chx = word.charAt(finalIndex);
		boolean ifPlural = false;
		if (chx == 's'){
			ifPlural = true;
		}
		return ifPlural;
	}
}




public class Challenge {
	public static boolean isPlural(String word) {
		if (word.charAt(word.length()-1) == 's'){
			return true;
		}else{
			return false;
		}
	}
}