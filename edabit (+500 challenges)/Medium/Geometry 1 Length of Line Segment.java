/*********************************************************************************************************************
 Geometry 1: Length of Line Segment

Write a function that takes coordinates of two points on a two-dimensional plane and returns the length of the line segment connecting those two points.

Examples
lineLength(arr[0]={15, 7}, arr[1]={22, 11}) ➞ 8.06

lineLength(arr[0]={0, 0}, arr[1]={0, 0}) ➞ 0

lineLength(arr[0]={0, 0}, arr[1]={1, 1}) ➞ 1.41

Notes
The numbers in the argument array can be positive or negative.
The order of the given numbers is X, Y.
There is 0.1 tolerance so you don't need to round your result.
This challenge is easier than it looks.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static double lineLength(int[][] point) {
          int absoluteXDifference = Math.abs(point[0][0] - point[1][0]);
          int absoluteYDifference = Math.abs(point[0][1] - point[1][1]);
  
          return Math.sqrt(Math.pow(absoluteXDifference, 2) + Math.pow(absoluteYDifference, 2));
      }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.lang.Math;

public class Challenge {
  public static double lineLength(int[][] point) {
		int x1 = point[0][0];
		int y1 = point[0][1];
		
		int x2 = point[1][0];
		int y2 = point[1][1];
		
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
  }
}



