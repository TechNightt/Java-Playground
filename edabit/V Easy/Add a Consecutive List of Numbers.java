

/*********************************************************************************************************************
 
Add a Consecutive List of Numbers
Write a function that takes the last number of a consecutive list of numbers and returns the total of all numbers up to and including it.

Examples
addUpTo(3) ➞ 6
// 1 + 2 + 3 = 6

addUpTo(10) ➞ 55
// 1 + 2 + 3 + ... + 10 = 55

addUpTo(7) ➞ 28
// 1 + 2 + 3 + ... + 7 = 28
Notes
You will only be given valid inputs.
There are various ways of doing this; try finding them!
Remember to return the result.

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


public class Challenge {
	public static int addUpTo(int n) {
		if(n == 0) return 0;
    else return n + addUpTo(n-1);
  }
}




public class Challenge {
	public static int addUpTo(int n) {
		int sum=0;
		for(int i=0; i<=n; i++){
			sum+=i;
		}
		return sum;
  }
}





public class Challenge {
	public static int addUpTo(int n) {
		return n < 1 ? 0 : n + addUpTo(n - 1);
  }
}






public class Challenge {
	public static int addUpTo(int n) {
		if (n > 0)
			return n + addUpTo(n-1);
		return 0;
  }
}



public class Challenge {
	public static int addUpTo(int n) {
		int result = 0;
		int i = 0;
		while (i <= n) {
			result += i;
			i++;
		}
		return result;
  }
}