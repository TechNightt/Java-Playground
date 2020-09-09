/*********************************************************************************************************************
 Triangular Number Sequence

This Triangular Number Sequence is generated from a pattern of dots that form a triangle. The first 5 numbers of the sequence, or dots, are:

1, 3, 6, 10, 15
This means that the first triangle has just one dot, the second one has three dots, the third one has 6 dots and so on.

Write a function that gives the number of dots with its corresponding triangle number of the sequence.

Examples
triangle(1) ➞ 1

triangle(6) ➞ 21

triangle(215) ➞ 23220

Notes
Check the Resources for info on triangular number sequence.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int triangle(int n) {
		if(n == 1) return 1;
		return (n + triangle(n - 1));
  }
}



//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
	public static int triangle(int n) {
		int number = 0;
		int count = 1;
		while(count <= n){
			number += count;
			count += 1;
		}
		
		return number;
  }
}

