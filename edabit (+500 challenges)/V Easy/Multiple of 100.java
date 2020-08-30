

/*********************************************************************************************************************
 
Multiple of 100
Create a function that takes an integer and return true if it's divisible by 100, otherwise return false.

Examples
divisible(1) ➞ false

divisible(1000) ➞ true

divisible(100) ➞ true
Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge {
	public static boolean divisible(int num) {
		return (num % 100 == 0);
	}
}





public class Challenge {
	public static boolean divisible(int num) 
	{
		if(num%100==0)
			return true;
		else
			return false;
		
	}
}










public class Challenge {
	public static boolean divisible(int num) {
		if (num == 0) return true;
		if (num < 0){
			num = num * -1;
		}
		if(num % 100 == 0) {
			return true;
		} else {
			return false;
		}
	}
}