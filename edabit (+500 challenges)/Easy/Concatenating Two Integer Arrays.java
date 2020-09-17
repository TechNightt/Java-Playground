/*********************************************************************************************************************
 Concatenating Two Integer Arrays
Create a function to concatenate two integer arrays.

Examples
concat([1, 3, 5], [2, 6, 8]) ➞ [1, 3, 5, 2, 6, 8]

concat([7, 8], [10, 9, 1, 1, 2]) ➞ [7, 8, 10, 9, 1, 1, 2]

concat([4, 5, 1], [3, 3, 3, 3, 3]) ➞ [4, 5, 1, 3, 3, 3, 3, 3]

Notes
Don't forget to return the result.
See Resources tab for more info.
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int[] concat(int[] arr1, int[] arr2) {
		int[] arr3 = new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		return arr3;
	}
}


//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int[] concat(int[] arr1, int[] arr2) {
		int len = arr1.length + arr2.length;
		int[] bigArr = new int[len];
		int i = 0;
		int j = 0;
		int z = 0;
		while(i < bigArr.length){
			if(j < arr1.length){
				bigArr[i] = arr1[j];
				j++;
			}else{
				bigArr[i] = arr2[z];
				z++;
			}
			i++;
		}
		return bigArr;
	}
}




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int[] concat(int[] arr1, int[] arr2) {
		 int[] newArr = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i];
        }

        for (int i = arr1.length; i < newArr.length; i++) {
            newArr[i] = arr2[i - arr1.length];
        }

        return newArr;
	}
}
