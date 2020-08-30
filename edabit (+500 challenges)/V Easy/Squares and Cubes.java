

/*********************************************************************************************************************
 Squares and Cubes
Create a function that takes an array of two numbers and checks if the square root of the first number is equal to the cube root of the second number.

Examples
checkSquareAndCube([4, 8]) ➞ true

checkSquareAndCube([16, 48]) ➞ false

checkSquareAndCube([9, 27]) ➞ true
Notes
Remember to return either true or false.
All arrays contain two positive numbers.

**********************************************************************************************************************/




//#############################################################
//#                        MY SOLUTIONS                       #
//#############################################################



public class Challenge{
	public static boolean squaresAndCubes(int[] arr) {
		return (java.lang.Math.sqrt(arr[0]) == java.lang.Math.cbrt(arr[1]));
	}
}






import java.lang.*;

public class Challenge{
	public static boolean squaresAndCubes(int[] arr) {
    
		if(Math.sqrt(arr[0]) == Math.cbrt(arr[1]))
			return true;
		return false;
		
			
	}
}





public class Challenge{
	public static boolean squaresAndCubes(int[] arr) {
		if(Math.sqrt(arr[0]) * arr[0] == arr[1]) {
			return true; 
		} 
		return false; 
	}
}





public class Challenge{
	public static boolean squaresAndCubes(int[] arr) {
    int sr=arr[0];
		int cr=arr[1];
	 double x=Math.sqrt(sr);
		if(x*x*x==cr)
			return true;
		else
		return 	false;
	}
}