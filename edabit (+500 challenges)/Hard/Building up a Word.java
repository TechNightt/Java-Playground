/*********************************************************************************************************************
 
Building up a Word

You are given an input list of strings, ordered by ascending length.

Write a function that returns True if, for each pair of consecutive strings, the second string can be formed from the first by adding a single letter either at the beginning or end.

Examples
can_build(["a", "at", "ate", "late", "plate", "plates"]) ➞ True

can_build(["a", "at", "ate", "late", "plate", "plater", "platter"]) ➞ False
# "platter" is formed by adding "t" in the middle of "plater"

can_build(["it", "bit", "bite", "biters"]) ➞ False
# "biters" is formed by adding two letters - we can only add one

can_build(["mean", "meany"]) ➞ True

Notes
Return False a word is NOT formed by adding only one letter.
Return False if the letter is added to the middle of the previous word.
Letters in tests will all be lower case.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static boolean canBuild(String[] arr) {
		for (int i = 1; i < arr.length; i ++) {
			if (!arr[i].contains(arr[i-1]) || !(arr[i].length() - arr[i-1].length() == 1)) {
				return false;
			}
		}
		return true;
	}
}





//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static boolean canBuild(String[] arr) {
		boolean flag=false;
		int i;
		for(i=1;i<arr.length;i++)
		{
			if(arr[i].contains(arr[i-1]) && arr[i].length()-arr[i-1].length()==1)
			{
				flag=true;
			}
			else 
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
}





//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static boolean canBuild(String[] arr) {
		for (int i = 1; i < arr.length; i++) {
			String prev = arr[i - 1];
			String curr = arr[i];
			if (!curr.contains(prev) 
					|| curr.length() - prev.length() > 1
				  || curr.length() - prev.length() == 0) return false;
		}
		return true;
	}
}







//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static boolean canBuild(String[] arr) {
		
		for (int i = 1; i < arr.length; i++) {
			String prev = arr[i - 1];
			String curr = arr[i];
			boolean condition = (startsWith(curr, prev) || endsWith(curr, prev)) && (curr.length() == prev.length() + 1);
			
			if (!(condition)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean startsWith(String main, String sub) {
		return main.substring(0, sub.length()).equals(sub);
	}
	
	public static boolean endsWith(String main, String sub) {
		return main.substring(main.length() - sub.length(), main.length()).equals(sub);
	}
}









//#############################################################
//#                        MY SOLUTION 5


public class Challenge {
	public static boolean canBuild(String[] words) {
		boolean valid = true;
		for (int a = 1; a < words.length; a++) {
			valid = (words[a - 1].equals(words[a].substring(1)) || words[a - 1].equals 
						  (words[a].substring(0, words[a].length() - 1))) ? true : false;
			if (valid == false)
				return valid;
		}
		return valid;
	}
}
