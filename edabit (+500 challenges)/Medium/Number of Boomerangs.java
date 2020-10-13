/*********************************************************************************************************************
 Number of Boomerangs

A boomerang is a V-shaped sequence that is either upright or upside down. Specifically, a boomerang can be defined as: sub-array of length 3, with the first and last digits being the same and the middle digit being different.

Some boomerang examples:

[3, 7, 3], [1, -1, 1], [5, 6, 5]
Create a function that returns the total number of boomerangs in an array.

To illustrate:

[3, 7, 3, 2, 1, 5, 1, 2, 2, -2, 2]
// 3 boomerangs in this sequence:  [3, 7, 3], [1, 5, 1], [2, -2, 2]
Be aware that boomerangs can overlap, like so:

[1, 7, 1, 7, 1, 7, 1]
// 5 boomerangs (from left to right): [1, 7, 1], [7, 1, 7], [1, 7, 1], [7, 1, 7], and [1, 7, 1]
Examples
countBoomerangs([9, 5, 9, 5, 1, 1, 1]) ➞ 2

countBoomerangs([5, 6, 6, 7, 6, 3, 9]) ➞ 1

countBoomerangs([4, 4, 4, 9, 9, 9, 9]) ➞ 0

Notes
[5, 5, 5] (triple identical digits) is NOT considered a boomerang because the middle digit is identical to the first and last.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.Arrays;
import java.util.stream.IntStream;

public class ChallengeTests {	
	public static int countBoomerangs(int[] arr) {
		IntStream filter = IntStream.range(0, arr.length).map(index -> {
			int v2 = index + 1;
			int v3 = index + 2;
			if (v2 < arr.length && v3 < arr.length) {
				if(arr[index] == arr[v3] && arr[index] != arr[v2]) {
					return index;
				}
			}
			
			return -1;
		}).filter(item -> item != -1);
		return (int) filter.count();
	}
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class ChallengeTests {
	public static int countBoomerangs(int[] arr) {
    int counter = 0;
    for (int i = 2; i < arr.length; i++) {
      counter += arr[i - 2] == arr[i] && arr[i - 1] != arr[i] ? 1 : 0;
    }
    return counter;
  }
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class ChallengeTests {
	public static int countBoomerangs(int[] arr) {
		if (arr.length < 3) {return 0;}
		return (int) java.util.stream.IntStream.range(0, arr.length - 2)
			.filter(i -> arr[i] == arr[i + 2] && arr[i] != arr[i + 1])
			.count();
	}
}


