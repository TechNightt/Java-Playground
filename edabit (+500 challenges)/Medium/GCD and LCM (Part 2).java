/*********************************************************************************************************************
 GCD and LCM (Part 2)
Create a function that takes two numbers as arguments and return the LCM of the two numbers.

Examples
lcm(3, 5) ➞ 15

lcm(14, 28) ➞ 28

lcm(4, 6) ➞ 12

Notes
Don't forget to return the result.
You may want to use the GCD function to make this a little easier.
LCM stands for least common multiple, the smallest multiple of both integers.
**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTION 1   
//#############################################################



public class Challenge {
	public static int lcm(int a, int b) {
		return (a * b) / gcd(a, b);
  }
	 public static int gcd(int a, int b) {
        if (b == 0) return a;
        else return gcd(b, a % b);
    }
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################



public class Challenge {
	public static int lcm(int a, int b) {
		int gcd=0;
		for(int i=1;i<=a&&i<=b;i++){
			if(a%i==0&&b%i==0){
				gcd=i;
				
			}
		}
		int lcm=a*b/gcd;
		return lcm;
  }
}





//#############################################################
//#                        MY SOLUTION 3   
//#############################################################



public class Challenge {
	public static int lcm(int a, int b) {
		for (int i = a; ; i+= a) { if (i % b == 0) return i;}
	}
}







//#############################################################
//#                        MY SOLUTION 4
//#############################################################



public class Challenge {
	public static int lcm(int a, int b) {
		int gcd = 0;

		for (int i = 1; i <= a && i <= b; i++) {
				if (a % i == 0 && b % i == 0) { gcd = i; }
		}

		return a * b / gcd;		
  }
}






//#############################################################
//#                        MY SOLUTION 5
//#############################################################


public class Challenge {
	public static int lcm(int a, int b) {
		int n=1;
		for(int i=0 ; i<n ; i++){
			if(b*n%a == 0 || a*n%b == 0){
				return Math.max(a*n,b*n);
			}
			else if(b*n%a !=0 || a*n%b !=0){
				n++;
			}	
		}
		return 0;
  }
}




//#############################################################
//#                        MY SOLUTION 6
//#############################################################




public class Challenge {
	public static int lcm(int a, int b) {
		int gcd = gcd(a, b);
		return gcd == 0 ? -1 : a * b / gcd;
  }
	
	private static int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}
}