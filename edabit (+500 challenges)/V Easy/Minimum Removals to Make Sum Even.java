

/*********************************************************************************************************************
 
Minimum Removals to Make Sum Even
Create a function that returns the minimum number of removals to make the sum of all elements in an array even.

Examples
minimumRemovals([1, 2, 3, 4, 5]) ➞ 1

minimumRemovals([5, 7, 9, 11]) ➞ 0

minimumRemovals([5, 7, 9, 12]) ➞ 1
Notes
If the sum is already even, return 0 (see example #2).
The output will be either 0 or 1.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################

public class Challenge {
	public static int minimumRemovals(int[] arr) {
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			num += arr[i];
		}
		if (num%2 == 0) {
			return 0;
		}
		else {
			return 1;
		}
	}
}

//#############################################################

public class Challenge {
	public static int minimumRemovals(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++){
			count += arr[i];
		}
		
		if (count % 2 == 1) return 1;
		return 0;
	}
}


//#############################################################

public class Challenge {
	public static int minimumRemovals(int[] arr) {
		int sum = 0;
		for (int i = 0 ; i < arr.length ; i++) {
			sum += arr[i];
		}
		return sum % 2 == 0 ? 0 : 1;
	}
}

//#############################################################

public class Challenge {
	public static int minimumRemovals(int[] arr) {
		int sum = 0, count = 0;
		int[] rem = new int[arr.length-1];
		for(int i = 0; i < arr.length; i++)
			sum += arr[i];
		if(sum%2 == 0)
			return count;
		count++;
		return count;
	}
}

//#############################################################
