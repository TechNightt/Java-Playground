/*********************************************************************************************************************
 Find the Index (Part 1)

Create a function that finds the index of a given item.

Examples
search([1, 5, 3], 5) ➞ 1

search([9, 8, 3], 3) ➞ 2

search([1, 2, 3], 4) ➞ -1

Notes
If the item is not present, return -1.
**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
    public static int search(int[] arr, int item) {
          for(int i=0 ; i<arr.length; i++){
              if(arr[i] == item)
                  return i;
          }
          return -1;
    }
  }








//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
    public static int search(int[] arr, int item) {
          if (arr == null) { 
              return -1; 
          } 
          int len = arr.length; 
          int i = 0; 
          while (i < len) { 
    
              if (arr[i] == item) { 
                  return i; 
              } 
              else { 
                  i = i + 1; 
              } 
          } 
          return -1; 
    }
  }




