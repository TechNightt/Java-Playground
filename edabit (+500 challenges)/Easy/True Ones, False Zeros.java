/*********************************************************************************************************************
 True Ones, False Zeros

Create a function that returns a converted array of boolean values from a given bit string. Basically, a bit character 1 is true, otherwise, it's false.

Examples
integerBoolean("100101") ➞ [true, false, false, true, false, true]

integerBoolean("10") ➞ [true, false]

integerBoolean("001") ➞ [false, false, true]

Notes
Characters in the given bit string are obviously 1's and 0's only.
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################







//#############################################################
//#                        MY SOLUTION 1   


public class TrueOnesFalseZeroes {
	public static boolean[] integerBoolean(String bits) {
		boolean[] bool = new boolean[bits.length()];
		for(int i = 0; i < bits.length(); i++) bool[i] = bits.charAt(i) == '1' ? true : false;
		return bool;
	}
}






//#############################################################
//#                        MY SOLUTION 2   



import java.util.*;
public class TrueOnesFalseZeroes {
	public static boolean[] integerBoolean(String bits) {
		boolean[] list = new boolean[bits.length()];
		for(int i = 0; i<bits.length(); i++){
			if(bits.charAt(i)=='1'){
				list[i] = true;
			}else{
				list[i] = false;
			}
		}
		return list;
	}
}


