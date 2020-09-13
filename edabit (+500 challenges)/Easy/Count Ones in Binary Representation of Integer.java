/*********************************************************************************************************************
 
Count Ones in Binary Representation of Integer
Count the amount of ones in the binary representation of an integer. So for example, since 12 is '1100' in binary, the return value should be 2.

Examples
countOnes(0) ➞ 0

countOnes(100) ➞ 3

countOnes(999) ➞ 8

Notes
The input will always be a valid integer (number).

**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   

public class Program {
    public static int countOnes(int n) {
        if (n == 0){
            return 0;
        }else{
            return (n & 1) + countOnes(n >> 1);
        }
    }
}





//#############################################################
//#                        MY SOLUTION 2   


public class Program {
    public static int countOnes(int n) {
		int count = 0;
		
		while (n != 0) {
			int reminder = n % 2;
			if (reminder == 1) {
				count ++;
			}
			n /= 2;
		}
	      return count;
    }
}




//#############################################################
//#                        MY SOLUTION 3   



public class Program {
    public static int countOnes(int n) {
      String binary = Integer.toString(n,2);
      int count = 0;
      for (int i = 0;i < binary.length(); i++){
        char c  = binary.charAt(i);
        if (c == '1')
          count++;
      }
      return count;
    }
}





//#############################################################
//#                        MY SOLUTION 4


public class Program {
    public static int countOnes(int n) {
    	int out = 0;
    	for (Character c : Integer.toBinaryString(n).toCharArray()) {
    		if (c == '1') {
    			out++;
    		}
    	}
    	return out;
    }    
}