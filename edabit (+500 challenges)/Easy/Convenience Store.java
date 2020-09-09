/*********************************************************************************************************************
 
Convenience Store
Given a total due and an array representing the amount of change in your pocket, determine whether or not you are able to pay for the item. Change will always be represented in the following order: quarters, dimes, nickels, pennies.

To illustrate: changeEnough([25, 20, 5, 0], 4.25) should yield true, since having 25 quarters, 20 dimes, 5 nickels and 0 pennies gives you 6.25 + 2 + .25 + 0 = 8.50.

Examples
changeEnough([2, 100, 0, 0], 14.11) ➞ false

changeEnough([0, 0, 20, 5], 0.75) ➞ true

changeEnough([30, 40, 20, 5], 12.55) ➞ true

changeEnough([10, 0, 0, 50], 3.85) ➞ false

changeEnough([1, 0, 5, 219], 19.99) ➞ false

Notes
quarter: 25 cents / $0.25
dime: 10 cents / $0.10
nickel: 5 cents / $0.05
penny: 1 cent / $0.01

**********************************************************************************************************************/



//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################




//#############################################################
//#                        MY SOLUTION 1   


import java.util.stream.IntStream;

public class Program {		
	public static boolean changeEnough(int[] change, double amountDue) {
		//quarter: 25 cents / $0.25
		//dime: 10 cents / $0.10
		//nickel: 5 cents / $0.05
		//penny: 1 cent / $0.01
		
		
		double[] value = new double[] {0.25, 0.10, 0.05, 0.01};
		
		boolean result = IntStream.range(0, change.length).mapToDouble(i -> change[i] * value[i]).sum() >= amountDue;
		System.out.println(result);
		
		return result;
	}	
}




//#############################################################
//#                        MY SOLUTION 2   



public class Program {		
	
    public static boolean changeEnough(int[] change, double amountDue) {
      return change[0] * 25 + change[1] * 10 + change[2] * 5 + change[3] >= amountDue * 100;
  }	
}



//#############################################################
//#                        MY SOLUTION 3   



import java.util.stream.IntStream;

public class Program {		
	public static boolean changeEnough(int[] change, double amountDue) {
		double quarter = change[0] * 0.25;
		double dime = change[1] * 0.10;
		double nickel = change[2] * 0.05;
		double penny = change[3] * 0.01;
		return (quarter + dime + nickel + penny) >= amountDue;
	}	
}



//#############################################################
//#                        MY SOLUTION 4


import java.util.stream.IntStream;

public class Program {		
	public static boolean changeEnough(int[] change, double amountDue) {
     double[] arr = new double[change.length];  
		
		arr[0] = change[0] * .25;
		arr[1] = change[1] * .10;
		arr[2] = change[2] * .05;
		arr[3] = change[3] * .01;
		
		double sum = 0.0;
		for(int counter = 0; counter < arr.length; counter++)
			sum += arr[counter];
		
		if(sum >= amountDue) return true;
		else return false;
		
	}	
}






//#############################################################
//#                        MY SOLUTION 5



import java.util.stream.IntStream;

public class Program {		
	public static boolean changeEnough(int[] change, double amountDue) {
	double dollas = 0;
		double q = 0;
		double d = 0;
		double n = 0;
		double p = 0;
		
		
			q = (double)(change[0]*25)/100;
			d =(double)(change[1]*10)/100;
			n = (double)(change[2]*5)/100;
			p = (double)(change[3]*1)/100;
		
		dollas = (q + d + n + p);
		return  dollas >= amountDue;
	}	
}