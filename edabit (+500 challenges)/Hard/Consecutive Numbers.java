/*********************************************************************************************************************
 
Consecutive Numbers
Create a function that determines whether elements in an array can be re-arranged to form a consecutive list of numbers where each number appears exactly once.

Examples
cons([5, 1, 4, 3, 2]) ➞ true
// Can be re-arranged to form [1, 2, 3, 4, 5]

cons([5, 1, 4, 3, 2, 8]) ➞ false

cons([5, 6, 7, 8, 9, 9]) ➞ false
// 9 appears twice
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



import java.util.Arrays;
public class Challenge {
	public static boolean cons(int[] arr) {
		Arrays.sort(arr);
    return (arr[arr.length - 1] - arr[0]) == (arr.length - 1);
	}
}


//#############################################################
//#                        MY SOLUTION 2   


import java.util.*;
public class Challenge {
	public static boolean cons(int[] arr) {
		Arrays.sort(arr);
		boolean isCons = true;
		for (int i = 0; i < arr.length ; i++){
			if (i == arr.length - 1){
				break;
			}
			
			if (arr[i+1] != arr[i]+1 || arr[i+1]==arr[i]){
				isCons = false;
				break;
			}
		}
		return isCons;
	}
}


//#############################################################
//#                        MY SOLUTION 3   


import java.util.*;
public class Challenge {
	public static boolean cons(int[] arr) {
		  Arrays.sort(arr);
        for(int i =0; i < arr.length-1;i++){
            if(arr[i] == arr[i+1] || arr[i+1] - arr[i] != 1) return false;
        }
        return true;
	}
}



//#############################################################
//#                        MY SOLUTION 4


import java.util.Arrays;

public class Challenge {
	public static boolean cons(int[] arr) {
		
		Arrays.sort(arr);
		for (int i = 1; i < arr.length; i++){
			if (arr[i] > arr[i-1]+1) return false;
			if (arr[i] == arr[i-1]) return false;
		}
		return true;
	}
}