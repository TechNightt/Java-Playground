

/*********************************************************************************************************************
 String to Integer and Vice Versa
Write two functions:

toInt() : A function to convert a string to an integer.
toStr() : A function to convert an integer to a string.
Examples
toInt("77") ➞ 77

toInt("532") ➞ 532

toStr(77) ➞ "77"

toStr(532) ➞ "532"
Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class StringNumber {
	public static int toInt(String str) {
		return Integer.parseInt(str);
	}
	
	public static String toStr(int num) {
		return String.valueOf(num);
	}
}







public class StringNumber {
	
    //toInt() : A function to convert the integer value of a string.
  //toStr() : A function to transform a string into an integer.
  
  public static int toInt(String str) {
      return Integer.parseInt(str);
  }
  
  public static String toStr(int num) {
      return Integer.toString(num);
      
  }
}