/*********************************************************************************************************************
 Algorithms III: Binary Search

Welcome to part three of the collection for Computer Science Algorithms. Once more we'll be delving into recursion by covering the topic of Binary Searches.

A "Binary Search" is a search algorithm that is used on an already sorted array. It compares the target value to the middle element of an array. If they don't match, the half in which the target cannot lie is ignored and the search continues on the remaining half, again taking the middle element to compare to the target value, and repeating this until the target value is found. If the target value is not contained in the array eventually the left search index and the right search index will cross and that condition should terminate the search.

Algorithm
For the sake of simplicity I'll refer to the array as "arr", the beginning index as "left", the end index as "right", and the element that we're searching for as "elem". The input for left and right initially will be left = 0 and right = sizeOfArray - 1. The rest of the algorithm can be broken down in five steps:

If "left" > "right" then the search should end as being unsuccessful.
Set the middle index to the floor division of ("left" + "right") / 2.
If arr(middle) < "elem", set "left" = middle + 1 and start the algorithm over again.
Else if arr(middle) > "elem", set "right" = middle - 1 and start the algorithm over again.
Otherwise arr(middle) == "elem" and item you're looking for has been found.
Instructions
The recursive function for this challenge will use a binary search to find an element in a given array. If the inputted element is found then the function should return true. If it fails to find the element then it should return false.

Examples
binarySearch([0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10], left, right, 7) ➞ True

binarySearch([1, 11, 14, 15, 32, 64, 67, 88, 92, 94], left, right, 12) ➞ False

binarySearch([3, 6, 9, 12, 15, 18, 21, 24, 27, 30], left, right, 27) ➞ True


Notes
The array will be an int array and all integers will be positive.
Several of the challenges that will be covered in this collection on algorithms can be solved non-recursively and without implementing the algorithms described in each challenge. I implore anyone solving these challenges to do them as intended. Not understanding the concepts taught will be an obstacle to later challenges and won't aid anyone in advancing their skills as a programmer.
If you are stuck please check the Resources tab, Comments tab, or if you're really stuck, use the Solutions tab to unlock the answers.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
    public static boolean binarySearch(int arr[], int left, int right, int elem) {
          
          if (left > right){
              return false;
          }
          int mid = (left + right) / 2;
          if (arr[mid] < elem) {
              left = mid+1;
              return binarySearch(arr,left,right,elem);
          } else if (arr[mid] > elem) {
              right = mid-1;
              return binarySearch(arr,left,right,elem);
          } else {
              return true;
          }
      }
  }



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
    public static boolean binarySearch(int arr[], int left, int right, int elem) {
          boolean found = false;
          while (!found && left <= right)
          {
              int mid = (left + right)/2;
              if (arr[mid] > elem)	{right = mid-1;	}
              else if (arr[mid] < elem) { left = mid + 1;}
              else found = true;
          }
          return found;
      }
  }



//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static boolean binarySearch(int arr[], int left, int right, int elem) {
              //System.out.println(left+","+right); 
          
           // check if search is finished or element has been found
            if(right-left<=1){
                  if(arr[left]==elem || arr[right]==elem)
                      return true;
                  else
                      return false;
              }
          // zoom in and repeat search
            int mid = (left+right)/2;
            if(arr[mid]==elem)
                  return true;
            if(arr[mid]<elem)
                  return binarySearch(arr,mid,right,elem);
            else
                  return binarySearch(arr,left, mid, elem);
      }
  }




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static boolean binarySearch(int arr[], int left, int right, int elem) {
          if (arr.length > 0) {
              int middle = (left+right)/2;
              
              if (arr[middle] == elem) {
                  return true;
              }
              
              if (left > right || right <= left) {
                  return false;
              }
              
              if (arr[middle] < elem) {
                  left = middle + 1;
                  return binarySearch(arr, left, right, elem);
              } else {
                  right = middle - 1;
                  return binarySearch(arr, left, right, elem);
              }
          } 
          return false;
      }
  }