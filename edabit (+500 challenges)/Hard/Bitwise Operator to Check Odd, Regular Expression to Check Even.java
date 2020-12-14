/*********************************************************************************************************************
 Bitwise Operator to Check Odd, Regular Expression to Check Even
Create two functions:

The first is isOdd() to check if a given number is odd using bitwise operator.
The second is isEven() to check if a given input is even using regular expressions.
IMPORTANT
The use of the modulo (%) operator is not allowed.

Examples
isOdd(3) ➞ "Yes"
// Use Bitwise Operator

isOdd(58) ➞ "No"
// Use Bitwise Operator

isEven("0") ➞ "Yes"
// Use Regular Expression

isEven("-99") ➞ "No"
// Use Regular Expression


Notes
Input will only be integers (positive/negative/zero).
For the second function, input will be numbers in string.
For more info on regular expressions, check the Resources tab.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   



public class ParityCheck {
    public static String isOdd(int n) {
      return (n & 1) == 1 ? "Yes" : "No";
    }
    
    public static String isEven(String n) {
        return n.matches(".*[02468]$") ? "Yes" : "No"; 
    }
  }




//#############################################################
//#                        MY SOLUTION 2   


public class ParityCheck {
	public static String isOdd(int number) {
		if(number%2!=0){
			return "Yes";
		}else{
			return "No";
		}
	}

	public static String isEven(String number) {
		int number2=Integer.parseInt(number);
		if(number2%2==0){
			return "Yes";
		}else{
			return "No";
		}
	}
}



//#############################################################
//#                        MY SOLUTION 3   



public class ParityCheck {
	public static String isOdd(int number) {
		if(number % 2 == 1 || number % 2 == -1) {
			return "Yes";
		}else return "No";
	}

	public static String isEven(String number) {
        if(Integer.parseInt(number) % 2 == 0) {
            return "Yes";
        }else return "No";
    }
}




//#############################################################
//#                        MY SOLUTION 4



public class ParityCheck {
	public static String isOdd(int number) {
		if ((number ^ 1) == number + 1)
        return "No";
    else
        return "Yes";
	}

	public static String isEven(String number) {
		String a = number.substring(number.length() - 1);
		if(a.equals("0") || a.equals("2") || a.equals("4") || a.equals("6") || a.equals("8"))
			return "Yes";
		else
			return "No";
	}
}