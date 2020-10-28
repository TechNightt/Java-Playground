/*********************************************************************************************************************
 Find the Odd Integer

Create a function that takes an array and finds the integer which appears an odd number of times.

Examples
findOdd([1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5]) ➞ -1

findOdd([20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5]) ➞ 5

findOdd([10]) ➞ 10


Notes
There will always only be one integer that appears an odd number of times.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Challenge {
	 public static int findOdd(int[] arr) {
        Set<Integer> numbers = new HashSet<>();
        Arrays.stream(arr).forEach(i -> {
            if (numbers.contains(i)) {
                numbers.remove(i);
            } else {
                numbers.add(i);
            }
        });
        return numbers.iterator().next();
    }
}






//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	public static int findOdd(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count % 2 != 0) {
				return arr[i];
			}
		}
		return 0;
	}
}





//#############################################################
//#                        MY SOLUTION 3   



import java.util.*;

public class Challenge {
	public static int findOdd(int[] arr) {
		Map<Integer, Integer> d = new HashMap<Integer, Integer>();
		
		// add to dict
		for (int i : arr) {
			int count = 0;
			
			try {
				count = d.get(i);
			} catch (NullPointerException e) {}
			
			d.put(i, count + 1);
		}
		
		// evaluate
		for (Map.Entry<Integer, Integer> entry : d.entrySet()) {
			int key = entry.getKey();
			int value = entry.getValue();
			
			if (value % 2 != 0) {
				return key;
			}
		}
		
		return 666;
	}
}




//#############################################################
//#                        MY SOLUTION 4


import java.util.*;
public class LetterGroup {
	public static String[] threeLetterCollection(String s) {
		ArrayList<String> answer = new ArrayList<String>();
		for(int i = 2;i<s.length();i++){
			answer.add(s.substring(i-2,i+1));
		} 
		Collections.sort(answer);
		return answer.toArray(new String[answer.size()]);
	}
}