/*********************************************************************************************************************
 Convert a Number to Base-2
Create a function that returns a base-2 (binary) representation of a base-10 (decimal) string number. To convert is simple: ((2) means base-2 and (10) means base-10) 010101001(2) = 1 + 8 + 32 + 128.

Going from right to left, the value of the most right bit is 1, now from that every bit to the left will be x2 the value, value of an 8 bit binary numbers are (256, 128, 64, 32, 16, 8, 4, 2, 1).

Examples
binary(1) ➞ "1"
// 1*1 = 1

binary(5) ➞ "101"
// 1*1 + 1*4 = 5

binary(10) ➞ "1010"
// 1*2 + 1*8 = 10

Notes
Numbers will always be below 1024 (not including 1024).
The && operator could be useful.
The strings will always go to the length at which the most left bit's value gets bigger than the number in decimal.
If a binary conversion for 0 is attempted, return "0".
**********************************************************************************************************************/


//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



//#############################################################
//#                        MY SOLUTION 1   


public class Challenge {
	public static String binary(int decimal) {
		String out = "";
		if(decimal > 0) {
			while(decimal >= 1) {
				out += "" + decimal%2;
				decimal/=2;
			}
			return new StringBuilder(out).reverse().toString();
		}
		return "0";
	}
}




//#############################################################
//#                        MY SOLUTION 2   

public class Challenge {
	public static String binary(int decimal) {
		if(decimal == 0) return "0";
		
		StringBuilder binary = new StringBuilder();
		while(decimal > 0) {
			binary.append((decimal % 2) + "");
			decimal /= 2;
		}
		return binary.reverse().toString();
	}
}



//#############################################################
//#                        MY SOLUTION 3   


public class Challenge {
	public static String binary(int decimal) {
		if (decimal == 0){return "0";}
		String s = "";
		for (int x = 10; x >= 0; x--){
			if (Math.pow(2, x) <= decimal){
				decimal -= Math.pow(2, x);
				s += "1";
			}
			else if (!s.equals("")){s += "0";}
		}
		return s;
	}
}


//#############################################################
//#                        MY SOLUTION 4


public class Challenge {
	public static String binary(int decimal) {
		int max = 512;
		String number = "";
		do {
			if (decimal - max >= 0) {
				number += "1";
				decimal -= max;
			} else {
				if (number.length() > 0) {
					number += "0";
				}
			}
			max /= 2;
		} while (max >= 1);
		return number.length() == 0 ? "0" : number;
	}
}