

/*********************************************************************************************************************
 
Multiply by Length
Create a function to multiply all of the values in an array by the amount of values in the given array.

Examples
MultiplyByLength([2, 3, 1, 0]) ➞ [8, 12, 4, 0]

MultiplyByLength([4, 1, 1]) ➞ ([12, 3, 3])

MultiplyByLength([1, 0, 3, 3, 7, 2, 1]) ➞  [7, 0, 21, 21, 49, 14, 7]

MultiplyByLength([0]) ➞ ([0])
Notes
All of the values given are numbers.
All arrays will have at least one element.
Don't forget to return the result.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


public class Challenge {
	public static int[] MultiplyByLength(int[] arr) {
		for(int i=0; i<arr.length; i++){
			arr[i] *= arr.length;
		}
		return arr;
	}
}


//#############################################################





