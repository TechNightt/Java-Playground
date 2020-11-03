/*********************************************************************************************************************
 Carrying the Digits
Write a function that returns the number of times you must carry a digit when you sum together two integers.

Examples
carryDigits(36, 135) ➞ 1
// You carry the 1 when you sum 6 and 5 together.

carryDigits(671, 329) ➞ 3

carryDigits(1111, 3333) ➞ 0

carryDigits(53214, 56905) ➞ 3

Notes
Count all carry operations (even those on leading digits).
**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTION 1   



public class Challenge {
	public static int carryDigits(int n1, int n2) {
		int carry = 0;
		int count = 0;
		while (n1 > 0 && n2 > 0) {
			carry = (carry + (n1 % 10) + (n2 % 10))/10;
			count += (carry > 0) ? 1 : 0;
			n1 /= 10;
			n2 /= 10;
		}
		return count;
  }
}



//#############################################################
//#                        MY SOLUTION 2   



public class Challenge {
	
	public static int _carryDigits(int n1, int n2, int leftOver){
		if(n1 == 0 && n2 == 0){
			return 0;
		}
		
		int a = n1 % 10;
		int b = n2 % 10;
		int answer = a + b + leftOver;
		if(answer > 9){
			return 1 + _carryDigits(n1/10, n2/10, answer/10);
			}
		else{
			return _carryDigits(n1/10, n2/10, 0);
		}
		
	}
	
	public static int carryDigits(int n1, int n2) {
		return _carryDigits(n1,n2,0);
  }
}





//#############################################################
//#                        MY SOLUTION 3   



public class Challenge {
	public static int carryDigits(int n1, int n2) {
		int carrycount = 0;
        int carry = 0;
        int sum = 0;
        String s1 = Integer.toString(n1);
        String s2 = Integer.toString(n2);
        int s1len = s1.length();
        int s2len = s2.length();
        while (s1len != 0 || s2len != 0) {
            int x = 0, y = 0;
            if (s1len > 0)
            {
                x = s1.charAt(s1len - 1) - '0';
                s1len--;
            }
            if (s2len > 0)
            {
                y = s2.charAt(s2len - 1) - '0';
                s2len--;
            }

            sum = carry + x + y;
            if (sum >= 10) {
                carry = 1;
                carrycount++;
            }
            else carry=0;
        }

        return carrycount;
	}
  }





//#############################################################
//#                        MY SOLUTION 4



public class Challenge {
	public static int carryDigits(int n1, int n2) {
		boolean carryover = false;
		int count = 0;
		
		String s1 = Integer.toString(n1);
		String s2 = Integer.toString(n2);
		
		while(!s1.isEmpty() && !s2.isEmpty()) {
			int num1 = Integer.parseInt(s1.substring(s1.length()-1));
			int num2 = Integer.parseInt(s2.substring(s2.length()-1));
			
			if((num1 + num2 + (carryover ? 1 : 0)) >= 10) {
				carryover = true;
				count++;
			} else {
				carryover = false;
			}
			
			s1 = s1.substring(0, s1.length() - 1);
			s2 = s2.substring(0, s2.length() - 1);
		}
		
		return count;
  }
}