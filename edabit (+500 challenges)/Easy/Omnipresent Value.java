/*********************************************************************************************************************
 Omnipresent Value
A value is omnipresent if it exists in every subarray inside the main array.

To illustrate:

[[3, 4], [8, 3, 2], [3], [9, 3], [5, 3], [4, 3]]
// 3 exists in every element inside this array, so is omnipresent.
Create a function that determines whether an input value is omnipresent for a given array.

Examples
omnipresent([[1, 1], [1, 3], [5, 1], [6, 1]], 1) ➞ true

omnipresent([[1, 1], [1, 3], [5, 1], [6, 1]], 6) ➞ false

omnipresent([[5], [5], [5], [6, 5]], 5) ➞ true

omnipresent([[5], [5], [5], [6, 5]], 6) ➞ false

Notes
Sub-arrays can be any length.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;

public class Program {
	public static boolean omnipresent(int[][] arr, int val) {
		return Arrays.stream(arr)
			.allMatch(x -> Arrays.stream(x).filter(y -> y == val).count() > 0);
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Program {
	public static boolean omnipresent(int[][] arr, int val) {
		int counter= 0;
		for(int i = 0; i < arr.length;i++){
			for(int a = 0; a < arr[i].length;a++){
				if(arr[i][a] == val){
					counter++;
				}	
			}
		}
		if(counter < arr.length){
			return false;
		}else{
			return true;
		}
	}
}
