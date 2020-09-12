/*********************************************************************************************************************
 How Much is True?
Create a function which returns the number of true values there are in an array.

Examples
countTrue([true, false, false, true, false]) ➞ 2

countTrue([false, false, false, false]) ➞ 0

countTrue([]) ➞ 0

Notes
Return 0 if given an empty array.
All array items are of the type bool (true or false).

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.IntStream;

public class Challenge {
	public static int countTrue(boolean[] arr) {
		int coun = 0;
		for (boolean i : arr) if (i) coun += 1;
		return coun;
	}
}




//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
    public static int countTrue(boolean[] arr) {
      int count = 0;
      for (boolean b : arr) {
        if (b == true) {
          count++;
        }
      }
      return count;
    }
  }



//#############################################################
//#                        MY SOLUTION 3   


import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Challenge {
	public static int countTrue(boolean[] arr) {
        Stream<Boolean> stream = IntStream.range(0, arr.length)
                .mapToObj(idx -> arr[idx]);
        return (int) stream.filter(s -> s.equals(true)).count();
    }
}




//#############################################################
//#                        MY SOLUTION 4


import java.util.stream.IntStream;

public class Challenge {
	public static int countTrue(boolean[] arr) {
		int count = 0;
		if (arr.length == 0) return 0;
		else{
			for (boolean test:arr){
				if (test == true) count++;
			}
		}
		return count;
	}
}