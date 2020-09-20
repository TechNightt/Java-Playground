/*********************************************************************************************************************
 Algebra Sequence — Boxes

Create a function that takes a number (step) as an argument and returns the amount of boxes in that step of the sequence.

Box Sequence Image

Step 0: Start with 0
Step 1: Add 3
Step 2: Subtract 1
Repeat Step 1 & 2 ...
Examples
boxSeq(0) ➞ 0

boxSeq(1) ➞ 3

boxSeq(2) ➞ 2

Notes
Step (the input) is always a positive integer (or zero).
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int boxSeq(int step) {
		return (step % 2 == 0) ? step : step + 2;
  }
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int boxSeq(int step) {
		if (step <= 0) return 0;
		return (step % 2 == 1) ? 3 + boxSeq(step - 1) : boxSeq(step - 1) - 1;
  }
}



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int boxSeq(int step) {
		if (step ==0) {
			return 0;
		}
		int result = 0;
		while (true) {
			result+=3;
			step--;
			if (step==0) {
				return result;
			}
			result--;
			step--;
			if (step==0) {
				return result;
			}						
		}
  }
}


//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static int boxSeq(int step) {
		int boxes = 0;
		if (step % 2 == 0){
			if (step == 0){
				boxes = 0;
				return boxes;
			}
			else {
			boxes = step;
			return boxes;
			}
		}
		else if (step % 2 != 0){
			boxes = step + 2;
			return boxes;
		}
	 return boxes;
  }
}