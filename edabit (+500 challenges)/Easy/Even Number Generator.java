/*********************************************************************************************************************
 Even Number Generator
Create a function that finds all even numbers from 1 to the given number.

Examples
findEvenNums(8) ➞ [2, 4, 6, 8]

findEvenNums(4) ➞ [2, 4]

findEvenNums(2) ➞ [2]

Notes
If there are no even numbers, return an empty array.

**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.IntStream;
public class Challenge {
	public static int[] findEvenNums(int num) {
		return IntStream.iterate(2, x -> x + 2).limit(num/2).toArray();
	}
}



//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
	public static int[] findEvenNums(int num) {
		int[] e = new int[num/2];
		for(int i=2; i<=num; i+=2){
			e[i/2-1] = i;
		}
		return e;
	}
}


//#############################################################
//#                        MY SOLUTION 3   


import java.util.ArrayList;
import java.util.List;

public class Challenge {
	public static int[] findEvenNums(int num) {
		List<Integer> result = new ArrayList<>();
		for (int i = 1; i <= num; i++){
			if (i%2 == 0) {
				result.add(i);
			}
		}
		int[] finres = new int[result.size()];
		for (int i=0; i < finres.length; i++) {
        finres[i] = result.get(i).intValue();
    }
		return finres;
	}
}



//#############################################################
//#                        MY SOLUTION 4


import java.util.ArrayList;

public class Challenge {
	public static int[] findEvenNums(int num) {
		
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		for(int i = 2; i <= num; i+=2) {
			
			a.add(i);
		}
		
		int[] a1 = new int[a.size()];
		
		int j =0;
		
		for(int i : a) {
			 
			 a1[j] = a.get(j++);
		 }
		
		return a1;
	}
}