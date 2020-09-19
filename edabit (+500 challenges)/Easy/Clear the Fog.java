/*********************************************************************************************************************
 Clear the Fog

Create a function which returns the word in the string, but with all the fog letters removed. However, if the string is clear from fog, return "It's a clear day!".

Examples
clearFog("sky") ➞ "It's a clear day!"

clearFog("fogfogFFfoooofftogffreogffesGgfOogfog") ➞ "trees"

clearFog("fogFogFogffoObirdsanffodthebffoeffoesGGGfOgFog") ➞ "birdsandthebees"

Notes
Hidden words won't include the letters f, o or g.
Hidden words are always in lowercase.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String clearFog(String str) {
		if (str.length() == str.replaceAll("[fogFOG]", "").length())
       return "It's a clear day!";
    return str.replaceAll("[fogFOG]", "");
	}
}



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static String clearFog(String str) {
		String temp = str.replaceAll("[fogFOG]", "");
		return temp.length() == str.length() ? "It's a clear day!" : temp;
		
	}
}



//#############################################################
//#                        MY SOLUTION 3   





//#############################################################
//#                        MY SOLUTION 4


