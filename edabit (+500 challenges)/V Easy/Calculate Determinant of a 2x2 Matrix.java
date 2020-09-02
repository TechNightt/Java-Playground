

/*********************************************************************************************************************
 Calculate Determinant of a 2x2 Matrix
Create a function to calculate the determinant of a 2 * 2 matrix. The determinant of the following matrix is: ad - bc:

[[a, b], [c, d]]
Examples
calcDeterminant([
  [1, 2],
  [3, 4]
]) ➞ -2

calcDeterminant([
  [5, 3],
  [3, 1]
]) ➞ -4

calcDeterminant([
  [1, 1],
  [1, 1]
]) ➞ 0
Notes
Matrix will be in 2 * 2 form only.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#    SOLUTION 1      
public class Challenge {
	public static int calcDeterminant(int[][] matrix) {
		return (matrix[0][0]*matrix[1][1])-(matrix[0][1]*matrix[1][0]);
	}
}



//#    SOLUTION 2   
public class Challenge {
	public static int calcDeterminant(int[][] matrix) {
		int a = matrix[0][0];
		int b = matrix[0][1];
		int c = matrix[1][0];
		int d = matrix[1][1];
		return (a*d)-(b*c);
	}
}