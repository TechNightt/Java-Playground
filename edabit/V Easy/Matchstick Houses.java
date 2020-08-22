

/*********************************************************************************************************************
 
Matchstick Houses
This challenge will help you interpret mathematical relationships both algebraically and geometrically.

Matchstick Houses, Steps 1, 2 and 3

Create a function that takes a number (step) as an argument and returns the number of matchsticks in that step. See step 1, 2 and 3 in the image above.

Examples
matchHouses(1) ➞ 6

matchHouses(4) ➞ 21

matchHouses(87) ➞ 436
Notes
Step 0 returns 0 matchsticks.
The input (step) will always be a non-negative integer.
Think of the input (step) as the total number of houses that have been connected together.

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




public class Challenge {
	public static int matchHouses(int step) {
		 return step == 0 ? 0 : 5 * step + 1;
  }
}




public class Challenge {
	public static int matchHouses(int step) {
		if (step == 0) return 0;
		if (step == 1) return 6;
		return (step - 1) * 5 + 6;
  }
}





public class Challenge {
	public static int matchHouses(int step) {
		int x=6;
		if(step==0){
			x=0;
		}
		for (int i=2; i<=step; i++){
			x+=5;
		}
		return x;
  }
}




public class Challenge {
	public static int matchHouses(int step) {
		if(step==0){
			return 0;
		}
		int value= (step-1);
		int mul = (step*6);
		int matchsticks = mul-value;
		return matchsticks;
  }
}