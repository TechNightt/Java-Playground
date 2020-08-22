

/*********************************************************************************************************************
 Stack the Boxes
Here's an image of four models. Some of the cubes are hidden behind other cubes. Model one consists of one cube. Model two consists of four cubes, and so on...

Stack the Boxes

Write a function that takes a number n and returns the number of stacked boxes in a model n levels high, visible and invisible.

Examples
stackBoxes(1) ➞ 1

stackBoxes(2) ➞ 4

stackBoxes(0) ➞ 0
Notes
Step n is a positive integer.

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge {
	public static int stackBoxes(int n) {
		return n * n;
  }
}





public class Challenge {
	public static int stackBoxes(int n) {
		int boxes = 0;
		for(int i = 0; i < n; i++) {
			boxes+=2*i + 1;
		}
		
		return boxes;
  }
}