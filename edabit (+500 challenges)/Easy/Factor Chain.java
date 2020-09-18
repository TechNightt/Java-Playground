/*********************************************************************************************************************
 Factor Chain
A factor chain is an array where each previous element is a factor of the next consecutive element. The following is a factor chain:

[3, 6, 12, 36]

// 3 is a factor of 6
// 6 is a factor of 12
// 12 is a factor of 36
Create a function that determines whether or not an array is a factor chain.

Examples
factorChain([1, 2, 4, 8, 16, 32]) ➞ true

factorChain([1, 1, 1, 1, 1, 1]) ➞ true

factorChain([2, 4, 6, 7, 12]) ➞ false

factorChain([10, 1]) ➞ false
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class ChallengeTests {	
	public static boolean factorChain(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] % arr[i-1] != 0) return false;
		}
		return true;
	}
}




//#############################################################
//#                        MY SOLUTION 2   


public class ChallengeTests {	
	public static boolean factorChain(int[] arr) {
		int count = 1;
		for(int i = 0; i< arr.length-1; i++){
			if(arr[i+1]%arr[i] == 0)count++;
		}
		return count == arr.length;
	}
}


//#############################################################
//#                        MY SOLUTION 3   


public class ChallengeTests {	
	public static boolean factorChain(int[] arr) {
		
		for(int i = 0; i < arr.length-1; i++)
		{
			if(!(arr[i+1] % arr[i] == 0))
			{
				return false;
			}
		}
		return true;
		
	}
}



//#############################################################
//#                        MY SOLUTION 4



public class ChallengeTests {	
	public static boolean factorChain(int[] arr) {
		int count=0;
		int dig=0;
		int num=arr[arr.length-1];
		for(int i=0;i<arr.length;i++)
		{
			if(num%arr[i]==0){
				count++;
			dig=count;
			}
		}
		if(dig==arr.length)
    return true;
		else
			return false;
	}
}