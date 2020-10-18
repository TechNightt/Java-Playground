/*********************************************************************************************************************
 Find The Second Largest Number

Write a function that takes an array of numbers and returns the second largest number.

Examples
secondLargest([10, 40, 30, 20, 50]) ➞ 40

secondLargest([25, 143, 89, 13, 105]) ➞ 105

secondLargest([54, 23, 11, 17, 10]) ➞ 23

Notes
Unique numbers are in the array, at least.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class NextToLargest {
	public static int secondLargest(int[] num) {
		  int temp, size;
      size = num.length;

      for(int i = 0; i<size; i++ ){
         for(int j = i+1; j<size; j++){

            if(num[i]>num[j]){
               temp = num[i];
               num[i] = num[j];
              num[j] = temp;
            }
         }
      }
		return num[size -2];
	}
}



//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.Arrays;
public class NextToLargest {
	public static int secondLargest(int[] num) {
		int largest = Arrays.stream(num).max().getAsInt();
		int second=0;
		for(int i = 0; i < num.length;++i) if(num[i]!=largest&&Math.abs(num[i])>second) second=num[i];
		return second;
	}
}


//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class NextToLargest {
	public static int secondLargest(int[] num) {
		int big1 = -100;
		int big2 = -100;
		for(int i = 0; i < num.length;i++){
			if(num[i] < big1 && num[i] > big2){
				big2 = num[i];
			}
			if(num[i] > big1){
				big2 = big1;
				big1 = num[i];
			}
		}
		return big2;
	}
}




//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class NextToLargest {
	public static int secondLargest(int[] num) {
		int largest = num[0];
		for(int i=0;i<num.length;i++){
			if(num[i]>largest){
				largest=num[i];
			}
		}
		int second;
		if(largest==num[0]){
			second=num[1];
		}else{
			second=num[0];
		}
		for(int j=0;j<num.length;j++){
			if(num[j]>second && num[j]<largest){
				second=num[j];
			}
		}
		return second;
	}
}