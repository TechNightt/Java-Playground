/*********************************************************************************************************************
 
Special Arrays

An array is special, if every even index contains an even number and every odd index contains an odd number. Create a function that returns true if an array is special, and false otherwise.

Examples
isSpecialArray([2, 7, 4, 9, 6, 1, 6, 3]) ➞ true
// Even indices: [2, 4, 6, 6]; Odd indices: [7, 9, 1, 3]

isSpecialArray([2, 7, 9, 1, 6, 1, 6, 3]) ➞ false
// Index 2 has an odd number 9.

isSpecialArray([2, 7, 8, 8, 6, 1, 6, 3]) ➞ false
// Index 3 has an even number 8.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.IntStream;
public class Challenge {
	public static boolean isSpecialArray(int[] arr) {
		return IntStream.range(0, arr.length)
			.allMatch(i -> (i % 2 == 0 && arr[i] % 2 == 0) 
								|| (i % 2 != 0 && arr[i] % 2 != 0));
	}
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static boolean isSpecialArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if ((i % 2) != (arr[i] % 2)) {
				return false;
			}
		}
		return true;
	}
}




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static boolean isSpecialArray(int[] arr) {
		for (int i = 0 ; i < arr.length ; i++) {
			if (i % 2 == 0 && arr[i] % 2 != 0) {
				return false;
			} else if (i % 2 == 1 && arr[i] % 2 != 1) {
				return false;
			}
		}
		return true;
	}
}





//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static boolean isSpecialArray(int[] arr) {
	  for (int i=0;i<arr.length;i++){
		if(i%2==0 && arr[i]%2==1) return false;
	  	if(i%2==1 && arr[i]%2==0) return false;
	  }
		return true;
	}
}