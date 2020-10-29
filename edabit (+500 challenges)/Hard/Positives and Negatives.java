/*********************************************************************************************************************
 Positives and Negatives

Create a function which validates whether a given array alternates between positive and negative numbers.

Examples
alternateSign([3, -2, 5, -5, 2, -8]) ➞ true

alternateSign([-6, 1, -1, 4, -3]) ➞ true

alternateSign([4, 4, -2, 3, -6, 10]) ➞ false

Notes
Lists can be of any length.
It doesn't matter if an array begins/ends with a positive or negative, as long as it alternates.
If a list contains 0, return false (as it is neither positive nor negative).

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.IntStream;
import java.util.Arrays;

public class Program {
	public static boolean alternateSign(int[] arr) {
		if (Arrays.stream(arr).filter(x -> x == 0).count() > 0)
			return false;
		return IntStream.range(0, arr.length - 1)
			.map(x -> arr[x]/Math.abs(arr[x]) + arr[x + 1]/Math.abs(arr[x + 1]))
			.allMatch(x -> x == 0);
	}
}





//#############################################################
//#                        MY SOLUTION 2   


public class Program {
	public static boolean alternateSign(int[] arr) {
		for (int i = 0; i < arr.length; i++) {      
      if (arr[i] == 0) {
        return false;
      }
    }
    for (int i = 0; i < arr.length - 1; i++) {      
      if (arr[i] >= 0 && arr[i + 1] >= 0) {
        return false;
      }
      if (arr[i] <= 0 && arr[i + 1] <= 0) {
        return false;
      }
    }
    return true;
	}
}





//#############################################################
//#                        MY SOLUTION 3   



public class Program {
	public static boolean alternateSign(int[] arr) {

		for (int x : arr) {
			if (x == 0) {
				return false;
			}
		}

		for (int i = 0; i < arr.length - 1; i++) {
			if (!alternate(arr[i], arr[i + 1])) {
				return false;
			}
		}
		return true;
	}

	public static boolean alternate(int n1, int n2) {
		if ((n1 < 0 && n2 > 0) || (n1 > 0 && n2 < 0)) {
			return true;
		}
		return false;
	}
}






//#############################################################
//#                        MY SOLUTION 4


public class Program {
	public static boolean alternateSign(int[] arr) {
		 for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) return false;
            if (arr[0] > 0) {
                if ((i % 2 != 0 && arr[i] > 0) || (i % 2 == 0 && arr[i] < 0)) return false;
            } else {
                if ((i % 2 != 0 && arr[i] < 0) || (i % 2 == 0 && arr[i] > 0)) return false;
            }
        }
        return true;
	}
}