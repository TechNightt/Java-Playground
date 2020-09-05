
/*********************************************************************************************************************
 
Hitting the Jackpot
Create a function that takes in an array (slot machine outcome) and returns true if all elements in the array are identical, and false otherwise. The array will contain 4 elements.

Examples
testJackpot(["@", "@", "@", "@"]) ➞ true
testJackpot(["abc", "abc", "abc", "abc"]) ➞ true
testJackpot(["SS", "SS", "SS", "SS"]) ➞ true
testJackpot(["&&", "&", "&&&", "&&&&"]) ➞ false
testJackpot(["SS", "SS", "SS", "Ss"]) ➞ false

Notes
The elements must be exactly identical for there to be a jackpot.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   

import java.util.Arrays;
public class Challenge {
	public static boolean testJackpot(String[] result) {
		return 1 == Arrays.stream(result)
			.distinct()
			.count();
	}
}

//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
	public static boolean testJackpot(String[] result) {
		for (int i = 1 ; i < result.length ; i++) {
			if (result[i] != result[i-1]) {
				return false;
			}
		}
		return true;
	}
}


//#############################################################
//#                        MY SOLUTION 3   

public class Challenge {
	public static boolean testJackpot(String[] result) {
		
		int sum = 0;
		
		for(int i = 0;i<result.length-1;i++){
			if(result[i] == result[i+1]){
				sum = sum + 1;
			}else{
				sum = sum + 0;
			}
		}
		if(sum == 3){
			return true;
		}else{
			return false;
		}
	}
}

//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static boolean testJackpot(String[] result) {
		return result[0]==result[1]&&result[1]==result[2]&&result[2]==result[3];
	}
}


//#############################################################
//#                        MY SOLUTION 5



public class Challenge {
	public static boolean testJackpot(String[] result) {
		String x = result[0];
		for (int i = 1; i < result.length; i++) {
			if (!result[i].equals(x)) { return false; }
		}
		return true;
	}
}