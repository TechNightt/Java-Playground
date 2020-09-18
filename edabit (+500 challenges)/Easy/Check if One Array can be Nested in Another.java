/*********************************************************************************************************************
 Check if One Array can be Nested in Another
Create a function that returns true if the first array can be nested inside the second.

arr1 can be nested inside arr2 if:

arr1's min is greater than arr2's min.
arr1's max is less than arr2's max.
Examples
canNest([1, 2, 3, 4], [0, 6]) ➞ true

canNest([3, 1], [4, 0]) ➞ true

canNest([9, 9, 8], [8, 9]) ➞ false

canNest([1, 2, 3, 4], [2, 3]) ➞ false

Notes
Note the strict inequality (see example #3).
**********************************************************************************************************************/

//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################


//#############################################################
//#                        MY SOLUTION 1   


import java.util.Arrays;
public class Challenge {
     public static boolean canNest(int[] arr1, int[] arr2) {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			 if(arr1[0] > arr2[0] && arr1[arr1.length-1]<arr2[arr2.length-1]){
				 return true;
			 }
			 return false;
    }
}



//#############################################################
//#                        MY SOLUTION 2   

import java.util.Arrays;

public class Challenge {
    public static boolean canNest(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        
        return arr1[0] > arr2[0] && arr1[arr1.length -1] < arr2[arr2.length -1];

    }
}



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
    public static boolean canNest(int[] arr1, int[] arr2) {
            int[] minmax1=minOfArray(arr1);
            int[] minmax2=minOfArray(arr2);
       return (minmax1[0]>minmax2[0] && minmax1[1]<minmax2[1]);
   }
   public static int[] minOfArray(int[]arr){
       int min=arr[0],max=arr[0];
       for(int i=0;i<arr.length;i++){
           if (arr[i]<min) min=arr[i];
           if (arr[i]>max) max=arr[i];
       }
       int result[]=new int[2];
       result[0]=min;result[1]=max;
       return result;
       
   }
}



//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
    public static boolean canNest(int[] arr1, int[] arr2) {
       //arr1 = sort(arr1);
       //arr2 = sort(arr2);
       showArrayData(arr1);
       System.out.println("");
       showArrayData(arr2);
       System.out.println("" + arr1[arr1.length-1]+" "+ arr2[arr2.length-1]);
       
      if(checkIsGrater(arr1[0],arr2[0]) && !checkIsGrater(arr1[arr1.length-1],arr2[arr2.length-1])) {
          return true;
      }
       
       return false;
            
   }
   
     public static int[] sort(int x[]) {
      for(int i = 0 ; i < x.length ; i++) {
          for(int j = i+1 ; j<x.length;j++) {
              if(x[i] > x[j]) {
                  int aux = x[i];
                  x[i] = x[j];
                  x[j] = aux;
              }
          }
      }
      return x;
  }
  
  public static void showArrayData(int x[]){
      for(int y : sort(x)) {
          System.out.print(y+ " ");
      }
  }
  
  public static boolean checkIsGrater(int x,int y){
      if(x > y) {
          return true;
      }
      return false;
  }
   
   
}