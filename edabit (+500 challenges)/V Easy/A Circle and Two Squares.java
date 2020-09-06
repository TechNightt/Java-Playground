

/*********************************************************************************************************************
 
A Circle and Two Squares
Imagine a circle and two squares: a smaller and a bigger one. For the smaller one, the circle is a circumcircle and for the bigger one, an incircle.

Scale

Create a function, that takes an integer (radius of the circle) and returns the difference of the areas of the two squares.

Examples
squareAreasDifference(5) ➞ 50
squareAreasDifference(6) ➞ 72
squareAreasDifference(7) ➞ 98

Notes
Use only positive integer parameters.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   

public class Challenge {
	public static int squareAreasDifference(int r) {
		return 2 * r * r;
  }
}

//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
	public static int squareAreasDifference(int r) {
		int maxArea =(int) Math.pow(2*r, 2);
		int minArea =(int) Math.ceil(Math.pow((2*r)/Math.sqrt(2), 2));
		
		return maxArea-minArea;
  }
}
