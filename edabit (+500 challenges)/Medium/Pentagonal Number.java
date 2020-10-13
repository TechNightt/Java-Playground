/*********************************************************************************************************************
 Pentagonal Number

Write a function that takes a positive integer and calculates how many dots exist in a pentagonal shape around the center dot on the Nth iteration.

In the image below you can see the first iteration is only a single dot. On the second, there are 6 dots. On the third, there are 16 dots, and on the fourth there are 31 dots.

alt text

Return the number of dots that exist in the whole pentagon on the Nth iteration.

Examples
pentagonal(1) ➞ 1

pentagonal(2) ➞ 6

pentagonal(3) ➞ 16

pentagonal(8) ➞ 141
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
	public static int pentagonal(int n) {
		return (n == 1) ? 1 : 5 * (n - 1) + pentagonal(n - 1);
  }
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static int pentagonal(int num) {
		return num < 2 ? num : (num - 1) * 5 + pentagonal(num-1);
  }
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static int pentagonal(int num) {
  	if (num == 1) {
			return 1;
		}
		int i = 1;
		for (int j = 1; j < num; j++) {
			i += 5*j;
		}
		return i;
	}
	public static void main(String[] args) {
		System.out.print(pentagonal(1));
	}
}


