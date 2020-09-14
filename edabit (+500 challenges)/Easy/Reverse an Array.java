/*********************************************************************************************************************
 Reverse an Array

Write a function to reverse an array.

Examples
reverse([1, 2, 3, 4]) ➞ [4, 3, 2, 1]

reverse([9, 9, 2, 3, 4]) ➞ [4, 3, 2, 9, 9]

reverse([]) ➞ []

Notes
Don't forget to return the result.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.IntStream;


public class Challenge {
    public static int[] reverse(int[] arr) {
        int[] result = IntStream.rangeClosed(1, arr.length).map(i -> arr[arr.length - i]).toArray();
        return result;
    }
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int[] reverse(int[] arr) {
		int[] out=new int[arr.length];
		for (int i=0; i<arr.length; i++)
			out[arr.length-i-1]=arr[i];
		return out;
	}
}




//#############################################################
//#                        MY SOLUTION 3   


public class Challenge
{
	public static int[] reverse(int[] arr) 
	{
		if(arr.length==0)
			return arr;
		else
		{
			int count=0;
			int[] a=new int[arr.length];
			for(int i=arr.length-1;i>=0;i--)
				a[count++]=arr[i];
			return a;
		}
	}
}




//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static int[] reverse(int[] arr) {
		int [] x = arr;
		
		
		for(int i = 0; i < x.length / 2; i++) {
			int temp = x[i];
			x[i] = x[x.length - i - 1];
			x[x.length - i - 1] = temp;
		}
		return arr;
	}
}