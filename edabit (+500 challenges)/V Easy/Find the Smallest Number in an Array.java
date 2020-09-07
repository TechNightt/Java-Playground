/*********************************************************************************************************************
 
Find the Smallest Number in an Array
Create a method that takes an array of integers and returns the smallest number in the set.

Examples
findSmallestNum([34, 15, 88, 2]) ➞ 2
findSmallestNum([34, -345, -1, 100]) ➞ -345
findSmallestNum([7, 7, 7]) ➞ 7

Notes
Test cases contain only positive and negative numbers.
If you get stuck on a challenge, find help in the Resources tab.
If you're really stuck, unlock solutions in the Solutions tab.

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   

public class SmallestIntegerFinder {
	public static int findSmallestInt(int[] args) {

		int min = args[0];

		for (int i = 0; i < args.length; i++) {
			if (args[i] <= min) {
				min = args[i];
			}
		}
		return min;
	}
}


//#############################################################
//#                        MY SOLUTION 2   


public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
			int min = Integer.MAX_VALUE;
  for(int i: args)
  {
    if(i < min)
      min = i;
  }
return min;
    }
}


//#############################################################
//#                        MY SOLUTION 3   


public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
			 Integer menor = null;
        for (int i = 0; i < args.length; i++) {
            menor = menor == null || menor.compareTo(args[i]) > 0 ? args[i] : menor;
        }
        return menor;
    }
}

