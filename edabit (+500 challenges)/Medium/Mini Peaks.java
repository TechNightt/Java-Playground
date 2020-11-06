/*********************************************************************************************************************
 Mini Peaks

Write a function that returns all the elements in an array that are strictly greater than their adjacent left and right neighbors.

Examples
miniPeaks([4, 5, 2, 1, 4, 9, 7, 2]) ➞ [5, 9]
// 5 has neighbours 4 and 2, both are less than 5.

miniPeaks([1, 2, 1, 1, 3, 2, 5, 4, 4]) ➞ [2, 3, 5]

miniPeaks([1, 2, 3, 4, 5, 6]) ➞ []

Notes
Do not count boundary numbers, since they only have one left/right neighbor.
If no such numbers exist, return an empty array.

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Program{
    public static int[] miniPeaks(int arr[]){
          int newLen = 0;
          for(int i = 1; i < arr.length - 1; i++)
          {
              if(arr[i] > arr[i - 1] && arr[i] > arr [i + 1])
              {
                  newLen++;
              }
          }
          int[] arr2 = new int[newLen];
          if(newLen != 0)
          {
              int x = 0;
              for(int i = 1; i < arr.length - 1; i++)
              {
                  if(arr[i] > arr[i - 1] && arr[i] > arr [i+1])
                  {
                      arr2[x] = arr[i];
                      x++;
                  }
              }
          }
          return arr2;
    }
  }


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



import java.util.ArrayList;

public class Program{
  public static int[] miniPeaks(int arr[]){
		ArrayList<Integer> lst = new ArrayList<>();
		for(int i=1;i<arr.length-1;i++)
			if (arr[i] > arr[i-1] && arr[i] > arr[i+1])
				lst.add(arr[i]);
		int i = lst.size();
		int[] result = new int[i];
		int p = 0;
		for(Integer k : lst){
			result[p] = k;
			p++;
		}

		return result;
  }
}

