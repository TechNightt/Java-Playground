/*********************************************************************************************************************
 Two Distinct Elements

In each input array, every number repeats at least once, except for two. Write a function that returns the two unique numbers.

Examples
returnUnique([5, 4, 5, 1, 4, 3, 4, 6, 6, 6]) ➞ [1, 3]

returnUnique([1, 2, 1, 3, 1, 7, 1, 9, 7, 9]) ➞ [2, 3]

returnUnique([9, 5, 6, 8, 7, 7, 1, 1, 1, 1, 1, 9, 8]) ➞ [5, 6]

Notes
Keep the same ordering in the output.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
import java.util.stream.IntStream;

public class DistinctElements {
  public static int[] returnUnique(int[] n) {
    return IntStream.of(n).filter(i -> Arrays.toString(n)
     .indexOf(i+"") == Arrays.toString(n).lastIndexOf(i+"")).toArray();
  }
}



//#############################################################
//#                        MY SOLUTION 2   



import java.util.*;
public class DistinctElements {
  public static int[] returnUnique(int[] n) {
		int[] copy = Arrays.copyOf(n,n.length);
    Arrays.sort(n);
    int[] fin = new int[2];
    int[] last = new int[2];
    int c = 0; int b = 0;
    for(int i = 0; i < n.length; ++i){
      for(int x = 0;x < n.length; ++x){
        if(n[i] == n[x])c++; 
      }
      if(c == 1){fin[b] = n[i]; b++; c = 0;} 
			else c = 0;
    }
    int y = 0;
    for(int i = 0; i < copy.length; ++i){
      if(y == 0){
         if(copy[i] == fin[0] || copy[i] == fin[1]){
            last[y] = copy[i];
            y++;
         }
      }else if(copy[i] == fin[0] || copy[i] == fin[1]){
        last[y] = copy[i];
      }
    }return last;
	}
}



//#############################################################
//#                        MY SOLUTION 3   



public class DistinctElements {
    public static int[] returnUnique(int[] n) {
          int[] res = new int[2];
          int count = 0;
          int a = 0;
          for(int i = 0; i < n.length; i++){
              count = 0;
              for(int j = 0; j < n.length; j++){
                  if(n[i] == n[j]){
                      count++;
                  }
              }
              if(count == 1){
                  res[a] = n[i];
                  a++;
              }
          }
          return res;
      }
  }


