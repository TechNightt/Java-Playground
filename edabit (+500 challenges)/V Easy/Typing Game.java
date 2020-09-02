

/*********************************************************************************************************************
 Typing Game
You're in the midst of creating a typing game.

Create a function that takes in two arrays: the array of user-typed words, and the array of correctly-typed words and outputs an array containing 1s (correctly-typed words) and -1s (incorrectly-typed words).

Inputs:
User-typed Array: ["cat", "blue", "skt", "umbrells", "paddy"]
Correct Array: ["cat", "blue", "sky", "umbrella", "paddy"]

Output: [1, 1, -1, -1, 1]
Examples
correctStream(
  ["it", "is", "find"],
  ["it", "is", "fine"]
) ➞ [1, 1, -1]

correctStream(
  ["april", "showrs", "bring", "may", "flowers"],
  ["april", "showers", "bring", "may", "flowers"]
) ➞ [1, -1, 1, 1, 1]

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#   MY SOLUTION 1  

public class Challenge {
	public static int[] correctStream(String[] user, String[] correct) {
		int[] arr=new int[user.length];
		for(int i=0;i<user.length;i++){
			if (user[i]==correct[i])
				arr[i]=1;
			else
				arr[i]=-1;
			
		}
		return arr;
	


//#   MY SOLUTION 2 

public class Challenge {
	public static int[] correctStream(String[] user, String[] correct) {
		int[] returnArray = new int[user.length];
		for ( int i = 0; i < user.length; i++ ) {
			returnArray[i] = ( user[i].equalsIgnoreCase(correct[i]) ) ? 1 : -1;
		}
		return returnArray;
	}
}


//#   MY SOLUTION 3 


public class Challenge {
	public static int[] correctStream(String[] user, String[] correct) {
		int[] correctTypedWords = new int[user.length];
		for(int i = 0; i < user.length; i++){
			if(user[i].equals(correct[i])){
				correctTypedWords[i] = 1;
			} else {
				correctTypedWords[i] = -1;
			}
		}
		return correctTypedWords;
	}
}