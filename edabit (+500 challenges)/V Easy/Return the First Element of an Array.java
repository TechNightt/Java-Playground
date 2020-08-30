

/*********************************************************************************************************************
 
Return the First Element of an Array
Create a function that takes an array and returns the first element.

Examples
getFirstValue([1, 2, 3]) ➞ 1

getFirstValue([80, 5, 100]) ➞ 80

getFirstValue([-500, 0, 50]) ➞ -500
Notes
The first element in an array always has an index of 0.

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge{
	public static int getFirstValue(int[] arr) {
		
		int First = arr[0];
		return First;
		
	}
}



public class Challenge{
	public static int getFirstValue(int[] arr) {
		return arr[0];
	}
}