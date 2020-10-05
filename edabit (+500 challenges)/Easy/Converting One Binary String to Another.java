/*********************************************************************************************************************
 Converting One Binary String to Another

Write a function that returns the minimum number of swaps to convert the first binary string into the second.

Examples
minSwaps("1100", "1001") ➞ 1

minSwaps("110011", "010111") ➞ 1

minSwaps("10011001", "01100110") ➞ 4

Notes
Both binary strings will be of equal length.
Both binary strings will have an equal number of zeroes and ones.
A swap is switching two elements in a string (swaps do not have to be adjacent).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


import java.util.stream.IntStream;

public class Challenge {
	public static int minSwaps(String s1, String s2) {
		return (int)IntStream.range(0, s1.length())
			.filter(i -> s1.charAt(i) != s2.charAt(i))
			.count()/2;
  }
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int minSwaps(String s1, String s2) {
	  int num_count = 0;
	  for (int i = 0; i < s1.length(); i ++)
	  {
		if (s1.charAt(i) != s2.charAt(i))
		{
		  num_count++;
		}
	  }
	  return num_count/2;
  }
}







//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
    public static int minSwaps(String s1, String s2) {
        int differenceCount = 0;
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                differenceCount++;
            }
        }
        return differenceCount == 0 ? 0 : differenceCount / 2;
    }
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
	public static int minSwaps(String s1, String s2) {
		if (s1.equals(s2)){
            return 0;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        return minSwaps(arr1, arr2);

    }

    public static int minSwaps(char[] arr1, char[] arr2){
        int swaps = 0;
        return minSwaps(arr1, arr2, swaps);
    }

    public static int minSwaps(char[] arr1, char[] arr2, int swaps){

        for(int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]){
                if (arr1[i] == '0'){
                    arr1[i] = '1';
                } else {
                    arr1[i] = '0';
                }
                swaps++;
                return minSwaps(arr1, arr2, swaps);
            }
        }
        return swaps / 2;
    }
  
}