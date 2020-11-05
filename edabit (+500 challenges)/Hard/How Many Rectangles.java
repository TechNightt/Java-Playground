/*********************************************************************************************************************
 How Many Rectangles?

Let there be a square matrix, where each square is a rectangle, and a combination of more squares are also rectangles. To find the number of rectangles, Pete sat down and started counting... but that's highly inefficient.

Create a function that takes the order of the matrix as input and returns the number of rectangles in them.

Examples
rectangles(1) ➞ 1

rectangles(2) ➞ 9

rectangles(3) ➞ 36

Notes
The input will always be an integer.
Number of rectangles are given by: ((n(n+1))/2)^2
Watch the video listed in the Resources tab to get three different formulas.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static int rectangles(int step) {
		return factorial(step) * factorial(step);
  }
	public static int factorial(int n){
		if(n == 0){
			return 0;
		}
		return n + factorial(n-1);
	}
}


//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int rectangles(int step) {
		int res = 0;
		
		for(int i = 1 ; i <= step ; i++){
			for(int j = 1 ; j <= step ; j++){
				res+= i*j;
			}
		}
		
		return res;
		
  }
}

