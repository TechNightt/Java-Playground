/*********************************************************************************************************************
 Characters in Shapes
Create a function that counts how many characters make up a rectangular shape. You will be given an array of strings.

Examples
countCharacters([
  "###",
  "###",
  "###"
]) ➞ 9

countCharacters([
  "22222222",
  "22222222",
]) ➞ 16

countCharacters([
  "------------------"
]) ➞ 18

countCharacters([]) ➞ 0

countCharacters(["", ""]) ➞ 0

Notes
Return 0 if the given array is empty.
**********************************************************************************************************************/







//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int countCharacters(String[] arr) {
		return String.join("", arr).length();
	}
}






//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int countCharacters(String[] arr) {
		if(arr.length == 0 || arr[0].isEmpty()) return 0;
		return arr.length * arr[0].length();
	}
}







//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int countCharacters(String[] arr) {
		return arr.length * (arr.length > 0 ? arr[0].length() : 0);
	}
}







//#############################################################
//#                        MY SOLUTION 4



import java.util.Arrays;

public class Challenge {
	public static int countCharacters(String[] arr) {
		return Arrays.stream(arr).reduce(0, (subtotal, element) -> subtotal + element.length(), Integer::sum);
	}
}