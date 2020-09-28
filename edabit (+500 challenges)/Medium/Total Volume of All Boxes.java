/*********************************************************************************************************************
 Total Volume of All Boxes
Given an array of boxes, create a function that returns the total volume of all those boxes combined together. A box is represented by an array with three elements: length, width and height.

For instance, totalVolume([2, 3, 2], [6, 6, 7], [1, 2, 1]) should return 266 since (2 x 3 x 2) + (6 x 6 x 7) + (1 x 2 x 1) = 12 + 252 + 2 = 266.

Examples
totalVolume([4, 2, 4], [3, 3, 3], [1, 1, 2], [2, 1, 1]) ➞ 63

totalVolume([2, 2, 2], [2, 1, 1]) ➞ 10

totalVolume([1, 1, 1]) ➞ 1

Notes
You will be given at least one box.
Each box will always have three dimensions included.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################





//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
import java.util.stream.IntStream;

public class ChallengeTests {
	public static int totalVolume(int[][] part) {
	  	int vol = 0;
		for (int i = 0; i < part.length; i++) {
		  vol = vol + part[i][0] * part[i][1] * part[i][2];
		}
	  	return vol;
	}
}





//#############################################################
//#                        MY SOLUTION 2   



import java.util.Arrays;
import java.util.stream.IntStream;

public class ChallengeTests {
	public static int totalVolume(int[][] part) {
		return Arrays.stream(part).map(intArray -> {
			return Arrays.stream(intArray).boxed().reduce(1, (ide, b) -> ide * b);
		}).mapToInt(i -> i).sum();
	}
}






//#############################################################
//#                        MY SOLUTION 3   



import java.util.Arrays;
import java.util.stream.IntStream;

public class ChallengeTests {
	public static int totalVolume(int[][] part) {
				Integer reduce = Arrays.stream(part)
			.map(item -> Arrays.stream(item)
								.reduce(1, (a,b) -> a * b))
			.reduce(0, (a,b) -> a + b);
		
		System.out.println(reduce);
		
		return reduce.intValue();
	}
}



//#############################################################
//#                        MY SOLUTION 4


import java.util.Arrays;
import java.util.stream.IntStream;

public class ChallengeTests {
	
	public static int totalVolume(int[][] part) {
	 IntStream stream = Arrays.stream(part)
		 								 .flatMapToInt(x -> IntStream
									   .of(Arrays.stream(x)
										 .reduce(1, (a, b) -> a * b)));

        return stream.sum();
	}
}



//#############################################################
//#                        MY SOLUTION 5


import java.util.Arrays;
import java.util.stream.IntStream;

public class ChallengeTests {
	public static int totalVolume(int[][] part) {
		
		int value = 0;
        int total = 0;
    
        for (int i = 0; i < part.length; i++) {
            for (int x = 0; x < part[i].length; x++) {
                if (x == 0) {
                    value = part[i][x];
                } else {
                    value = value * part[i][x];
                }
                
            }
            total = total + value;
            value = 0;
        }
        
        return(total);
    }
}