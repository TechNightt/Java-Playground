/*********************************************************************************************************************
 The Recamán Sequence

The Recamán Sequence is a numeric sequence that starts always with 0. The position of a positive integer in the sequence, or Recamán Index, can be established with the following algorithm:

For every number to find, two variables are considered: the value of the last element of the sequence (last element from now on), and the actual sequence length (length from now on).
If the subtraction of the length from the last element returns a number greater than 0 and not already present in the sequence, it is added to the sequence.
When the conditions of the above statement are not met, will be added always the sum of the last element plus the length (even if it is a number already present in the sequence).
Repeat until the number of interest is found.
Look at example below for the steps to do for to establish the Recamán Index of number 2:

Sequence = [0]

Last - Length = 0 - 1 = -1 (lower than zero)
Last + Length = 0 + 1 = 1

Sequence = [0, 1]

Last - Length = 1 - 2 = -1 (lower than 0)
Last + Length = 1 + 2 = 3

Sequence = [0, 1, 3]

Last - Length = 3 - 3 = 0 (already present in sequence)
Last + Length = 3 + 3 = 6

Sequence = [0, 1, 3, 6]

Last - Length = 6 - 4 = 2 (greater than 0 and not already in sequence)

Sequence = [0, 1, 3, 6, 2]

// The Recaman Index of 2 is: 4
Given a positive integer n, implement a function that returns its Recamán Index.

Examples
recamanIndex(2) ➞ 4

recamanIndex(3) ➞ 2

recamanIndex(7) ➞ 5

Notes
The sequence starts always with 0.
The step with the subtraction Last Element - Sequence Length (verifying that is not already present in the sequence) has the precedence over the second step.
Remember: if the number to add is the result of a subtraction it can't be already in the sequence (first step), if it is the result of an addition it can be already present (second step).
Curiosity: the first number to repeat in the sequence is 42...
Curiosity: the first number with a BIG delay in the sequence is 19.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



import java.util.*;

public class Challenge {
	public static int recamanIndex(int n) {
		Set<Integer> numbersInSet = new HashSet();
		numbersInSet.add(0);
		int length = 1;
		int lastAdded = 0;
		
		while(true) {
			int sub = lastAdded - length;
			int add = lastAdded + length;
			if(sub > 0 && !numbersInSet.contains(sub)) {
				lastAdded = sub;
				numbersInSet.add(sub);
			} else {
				lastAdded = add;
				numbersInSet.add(add);
			}
			if (lastAdded == n) {
				return length;
			}
			length++;
		}
  }
}







//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.*;
public class Challenge {
	public static int recamanIndex(int n) {
		if (n <= 0) {
			return n;
		}
		Set<Integer> set = new HashSet<>();
		int last = 0;
		set.add(last);
		int count = 1;
		while (last != n) {
			int value = last - count;
			if (value <= 0 || set.contains(value)) {
				value = last + count;
			}
			set.add(value);
			count++;
			last = value;
		}
		return count - 1;
  }
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



import java.util.*;
	
public class Challenge {
	public static int recamanIndex(int n) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0,0);
		
		int index = 1;
		while(!map.containsValue(n)){
				int currentVal = map.get(index-1);
				int newVal = currentVal-index;
				if(newVal < 0 || map.containsValue(newVal)){
					map.put(index, currentVal+index);
				}
				else{
					map.put(index, newVal);
				}
				index++;
		}
		return index-1;
  }
}








//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static int recamanIndex(int n) 
{ 
    // Create an array to store terms 
    int arr[] = new int[1000000]; 
  
    // First term of the sequence is always 0 
    arr[0] = 0; 
    System.out.print(arr[0]+" ,"); 
  
    // Fill remaining terms using recursive 
    // formula. 
    for (int i = 1; i < 10000; i++) 
    { 
        int curr = arr[i - 1] - i; 
        int j; 
        for (j = 0; j < i; j++) 
        { 
            // If arr[i-1] - i is negative or 
            // already exists. 
            if ((arr[j] == curr) || curr < 0) 
            { 
                curr = arr[i - 1] + i; 
                break; 
            } 
        } 
  
        arr[i] = curr; 
        System.out.println(arr[i]);
    } 
    for(int j=0;j<arr.length;j++){
    if(arr[j]==n){
        return j;
    }
    }
    return 0;
    
   
}
    
}