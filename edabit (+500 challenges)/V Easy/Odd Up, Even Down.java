
/*********************************************************************************************************************
 
Odd Up, Even Down
Create a function that goes through the array, incrementing (+1) for each odd number and decrementing (-1) for each even number.

Examples
transform([1, 2, 3, 4, 5]) ➞ [2, 1, 4, 3, 6]

transform([3, 3, 4, 3]) ➞ [4, 4, 3, 4]

transform([2, 2, 0, 8, 10]) ➞ [1, 1, -1, 7, 9]

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#   SOLUTION 1

public class Challenge {
	public static int[] transform(int[] arr) {
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2 == 0){
				arr[i]=arr[i]-1;
			}
			else{
				arr[i]=arr[i]+1;
			}
		}
		return arr;
	}
}


//#   SOLUTION 2

public class Challenge {
	public static int[] transform(int[] arr) {
		int [] result = new int [arr.length];
		for (int i = 0; i < arr.length; i ++) {
			int res = arr[i];
			if (res%2 == 0) {
				result[i] = res-1;
			} else {
				result[i] = res+1;
			}
		}
		return result;
	}
}



//#   SOLUTION 3

public class Challenge {
	public static int[] transform(int[] arr) {
		int[] res = new int [arr.length];
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2 == 0) res[i] = arr[i]-1;
			else res[i] = arr[i]+1;
		}
		return res;
	}
}

