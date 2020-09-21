/*********************************************************************************************************************
 Perfect Square Patch
Create a function that takes an integer and outputs an n x n square solely consisting of the integer n.

Examples
squarePatch(3) ➞ [
  [3, 3, 3],
  [3, 3, 3],
  [3, 3, 3]
]

squarePatch(5) ➞ [
  [5, 5, 5, 5, 5],
  [5, 5, 5, 5, 5],
  [5, 5, 5, 5, 5],
  [5, 5, 5, 5, 5],
  [5, 5, 5, 5, 5]
]

squarePatch(1) ➞ [
  [1]
]

squarePatch(0) ➞ []

Notes
n >= 0.
If n = 0, return an empty array.
**********************************************************************************************************************/







//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.Stream;

public class Challenge {
	public static int[][] squarePatch(int n) {
		return Stream.generate(() -> n)
                    .limit(n)
                    .map(size -> Stream.generate(() -> size).limit(size).mapToInt(Integer::intValue).toArray())
                    .toArray(int[][]::new)
            ;
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int[][] squarePatch(int n) {
		int[][] finalArray = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				finalArray[i][j] = n;
			}
		}
		return finalArray;
	}
}



//#############################################################
//#                        MY SOLUTION 3   


import java.util.Arrays;
public class Challenge {
	public static int[][] squarePatch(int n) {
		 if (n == 0) {
            return new int[][] {};
        } else {
            int[][] result = new int[n][n];
            Arrays.stream(result).forEach(t -> Arrays.fill(t, n));
            return result;
        }
	}
}

