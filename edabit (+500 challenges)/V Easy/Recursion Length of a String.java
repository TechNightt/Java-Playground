

/*********************************************************************************************************************
 Recursion: Length of a String
Write a function that returns the length of a string. Make your function recursive.

Examples
length("apple") ➞ 5

length("make") ➞ 4

length("a") ➞ 1

length("") ➞ 0
Notes
Check the Resources tab for info on recursion.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


public class Program {
	public static int length(String str) {
		return str.equals("") ? 0 : 1 + length(str.substring(1));
	}
}




public class Program {
	public static int length(String str) {
		if(str.length() == 0){
			return 0;
		}
		if(str.length() == 1){
			return 1;
		}
		else{
			return length(str.substring(1)) + 1;
		}
	}
}




public class Program {
	public static int length(String str) {
		int n=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			n = n+1;
		}
		return n;
	}
}