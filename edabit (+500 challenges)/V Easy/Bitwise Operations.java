
/*********************************************************************************************************************
 Bitwise Operations
A decimal number can be represented as a sequence of bits. To illustrate:

6 = 00000110
23 = 00010111
From the bitwise representation of numbers, we can calculate the bitwise AND, bitwise OR and bitwise XOR. Using the example above:

bitwiseAND(6, 23) ➞ 00000110

bitwiseOR(6, 23) ➞ 00010111

bitwiseXOR(6, 23) ➞ 00010001
Write three functions to calculate the bitwise AND, bitwise OR and bitwise XOR of two numbers.

Examples: 

bitwiseAND(7, 12) ➞ 4
bitwiseOR(7, 12) ➞ 15
bitwiseXOR(7, 12) ➞ 11

**********************************************************************************************************************/










//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################++


//#############################################################
//#  SOLUTION 1    

public class Challenge {
	public static int bitwiseAND(int n1, int n2) {
			int result = n1 & n2;
			return result;
	}
	
	public static int bitwiseOR(int n1, int n2) {
			int result = n1 | n2;
			return result;
	}
	
	public static int bitwiseXOR(int n1, int n2) {
			int result = n1 ^ n2;
			return result;
	} 
}

