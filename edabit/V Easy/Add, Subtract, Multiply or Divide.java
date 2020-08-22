

/*********************************************************************************************************************
 
Add, Subtract, Multiply or Divide?
Write a function that takes two numbers and returns if they should be added, subtracted, multiplied or divided to get 24. If none of the operations can give 24, return "none".

Examples
operation(15, 9) ➞ "added"

operation(26, 2) ➞ "subtracted"

operation(11, 11) ➞ "none"
Notes
Only integers are used as test input.
Numbers should be added, subtracted, divided or multiplied in the order they appear in the parameters.
The function should return either "added", "subtracted", "divided", "multiplied" or "none".

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge {
	public static String operation(int num1, int num2) {
		if (num1 + num2 == 24) return "added";
		else if (num1 - num2 == 24) return "subtracted";
		else if (num1 * num2 == 24) return "multiplied";
		else if (num1 / num2 == 24) return "divided";
		else return "none";
	}
}




public class Challenge {
	public static String operation(int num1, int num2) {
    final int GOAL = 24;
		
		String result = "none";
		// 0 = add, 1 = sub, 2 = mult, 3 = div
		String[] ans = {"added", "subtracted", "multiplied", "divided"};
		
		if (num1 + num2 == GOAL) result = ans[0];
		else if((num1 - num2) == GOAL) result = ans[1];
		else if((num1 * num2) == GOAL) result = ans[2];
		else if ((num1 / num2) == GOAL) result = ans[3];
			
		return result;
    }
    
}







public class Challenge {
	public static String operation(int num1, int num2) {
		if(num1 + num2 == 24){
			return "added";
		} else if(num1 - num2 == 24){
			return "subtracted";
		}	else if(num1 * num2 == 24){
			return "multiplied";
		} else if (num1 / num2 == 24){
			return "divided";
		}
		
		return "none";
	}
}