/*********************************************************************************************************************
 Find the Index (Part #2)
Create a function that searches for the index of a given item in an array. If the item is present, it should return the index, otherwise, it should return -1.

Examples
search([1, 2, 3, 4], 3) ➞ 2

search([2, 4, 6, 8, 10], 8) ➞ 3

search([1, 3, 5, 7, 9], 11) ➞ -1

Notes
If the item is not present, return -1.
The given array is ordered.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   

public class Challenge {
    public static int search(int arr[], int item) {
          for (int i = 0; i < arr.length; i++) {
                  if(arr[i]==item)
                      return i;
              }
              return -1;
      }
  }







//#############################################################
//#                        MY SOLUTION 2   


public class Challenge {
  public static int search(int arr[], int item) {
		int startIndex = 0;
		int endIndex = arr.length-1;
		
		while(startIndex < endIndex){
			int middleIndex = (startIndex+endIndex)/2;
			int currentItem = arr[middleIndex];
			
			if(currentItem == item)
				return middleIndex;
			
			if(item > currentItem)
				startIndex = middleIndex+1;
			
			if(item < currentItem)
				endIndex = middleIndex-1;
			
		}
		
		return -1;
	}
}

// search([1, 2, 3, 4], 3) ➞ 2








//#############################################################
//#                        MY SOLUTION 3   


import java.util.HashMap;

public class Challenge {
  public static int search(int arr[], int item) {
		
		HashMap<Integer, Integer> x = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < arr.length; i++){
		x.put(arr[i], i);}
		
		for(int i = 0; i < arr.length; i++){
			if (arr[i] == item){
				return i;
			}
		}return -1;
		
		
	}
}









//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
    public static int search(int arr[], int item) {
          int i = 0;
          int len = arr.length;
          while (i < len && arr[i] < item)
              i++;
          if (i == len)
              return -1;
          if (arr[i] == item)
              return i;
          else
              return -1;
      }
  }