/*********************************************************************************************************************
 
Digits Sum Root
Create a function that takes a number and returns one digit that is the result of summing all the digits of the input number. When the sum of the digits consists of more than one digit, repeat summing until you get one digit.

Examples
digitRoot(123) ➞ 6
// 1 + 2 + 3 = 6

digitRoot(999888777L) ➞ 9

digitRoot(1238763636555555555L) ➞ 9

Notes
Recursion is allowed.

**********************************************************************************************************************/





//#############################################################
//#                        MY SOLUTION 1   



public class Root {
	public static int digitRoot(long n) {
		int x=0;
		while (n>0) {
			x+=n%10;
			n/=10;
		}
		return x<10 ? x : digitRoot(x);
	}
}




//#############################################################
//#                        MY SOLUTION 2   



public class Root {
    public static int digitRoot(long n) {
     int result = (int) (n % 9);
     return n == 0 ? 0 : result == 0 ? 9 : result;
   }
 }




//#############################################################
//#                        MY SOLUTION 3   



public class Root {
	public static int digitRoot(long n) {
		int sum = 0; 
		
		while(n > 0 || sum > 9) {
			if(n == 0) {
				n = sum; 
        sum = 0; 
			} 
			sum += n % 10; 
      n /= 10; 
		} 
		return sum; 
	}
}



//#############################################################
//#                        MY SOLUTION 4


public class Root {
	public static int digitRoot(long n) {
		long sum = 0;
		while (n > 0) {
			sum += n % 10;
			n = n / 10;
		}
		return sum < 10 ? (int) sum : digitRoot(sum);
	}
}