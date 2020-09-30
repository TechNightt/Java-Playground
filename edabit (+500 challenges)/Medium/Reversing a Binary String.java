/*********************************************************************************************************************
 Reversing a Binary String
Write a function that takes an integer n, reverses the binary representation of that integer, and returns the new integer from the reversed binary.

Examples
reversedBinaryInteger(10) ➞ 5
// 10 = 1010 -> 0101 = 5

reversedBinaryInteger(12) ➞ 3
// 12 = 1100 -> 0011 = 3

reversedBinaryInteger(25) ➞ 19
// 25 = 11001 -> 10011 = 19

reversedBinaryInteger(45) ➞ 45
// 45 = 101101 -> 101101 = 45

Notes
All values of n will be positive.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################






//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static int reversedBinaryInteger(int n) {
		return Integer.parseInt(new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
  }
}



//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
	public static int reversedBinaryInteger(int n) {
		String bin = Integer.toBinaryString(n);
		int ans=0;
			
		for(int i=0; i<bin.length(); i++){
			ans+=Math.pow(2, i)*(bin.charAt(i)=='1'?1:0);
		}
		
		return ans;
  }
}



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static int reversedBinaryInteger(int n) {
		    int rev = 0; 
        while (n > 0)  
        { 
            rev <<= 1; 
            if ((int)(n & 1) == 1) 
                rev ^= 1; 
            n >>= 1; 
        } 
        return rev; 
  }
}


