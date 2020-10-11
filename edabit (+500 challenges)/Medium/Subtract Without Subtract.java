/*********************************************************************************************************************
 Subtract Without Subtract
Create a function that subtracts one positive integer from another, without using any arithmetic operators such as -, %, /, +, etc.

Examples
mySub(5, 9) ➞ 4

mySub(10, 30) ➞ 20

mySub(0, 0) ➞ 0

Notes
Do not multiply by -1.
Use bitwise operations only: <<, |, ~, &, etc.
**********************************************************************************************************************/






//#############################################################
//#                        MY SOLUTION 1   
//#############################################################


public class Challenge {
	public static int mySub(int a, int b) {
   while (a!= 0) 
    { 
    int borrow = (~b) &a; 
  b =b ^ a; 
  a = borrow << 1; 
    } 
  return b; 
  }
}






//#############################################################
//#                        MY SOLUTION 2   
//#############################################################


public class Challenge {
	public static int mySub(int a, int b) {
		while (b != 0) {
			int debt = (~a) & b;
			a = a ^ b;
			b = debt << 1;
		}
    return (a ^ (a >> 31)) + (a >>> 31);
  }
}






//#############################################################
//#                        MY SOLUTION 3   
//#############################################################


public class Challenge {
	public static int mySub(int a, int b) {
		int count=-1;
		for(int i=a;i<=b;i++)
		{
			count++;
		}
		return count;
  }
}






//#############################################################
//#                        MY SOLUTION 4
//#############################################################


public class Challenge {
    public static int mySub(int y, int x) {
        if(x == y)
            return 0;
        if(x < y){
            int tmp = x;
            x = y;
            y = tmp;
        }
        int borrow;
        while(y != 0){
            borrow = (~x) & y;
            x = x ^ y;
            y = borrow << 1;
        }
        return x;
    }
}