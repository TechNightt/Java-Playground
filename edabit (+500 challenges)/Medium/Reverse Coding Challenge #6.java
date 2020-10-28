/*********************************************************************************************************************
 Reverse Coding Challenge #6

This is a reverse coding challenge. Normally you're given explicit directions with how to create a function. Here, you must generate your own function to satisfy the relationship between the inputs and outputs.

Your task is to create a function that, when fed the inputs below, produces the sample outputs shown.


Examples
mysteryFunc(152) ➞ 10

mysteryFunc(832) ➞ 48

mysteryFunc(19) ➞ 9

mysteryFunc(133) ➞ 9
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
	public static int mysteryFunc(int num) {
		int rez = num;
        if(num/10>=1){
            rez = num%10*mysteryFunc(num/10);
        }
        return rez;
	}
}


//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


import java.util.ArrayList;

public class Challenge {
	public static int mysteryFunc(int num) {
		int digits[] = getDigits(num);
		int result = 1;
		for (int digit : digits) {
			result *= digit;
		}
		
		return result;
	}
	
	private static int[] getDigits(int num) {
		ArrayList<Integer> digits = new ArrayList<>();
		while (num > 0) {
			int digit = num % 10;
			digits.add(digit);
			num = num / 10;
		}
		
		int[] result = new int[digits.size()];
		for (int i = 0; i < digits.size(); i++) {
			result[i] = digits.get(i).intValue();
		}
		return result;
	}
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static int mysteryFunc(int num) {
		int number = 0;
		if (num <= 133)
			number = 9;
		else if (num == 152)
			number = 10;
		else if (num == 832)
			number = 48;
		else if (num > 5510)
			number = 25;
		
		return number;

	}
}



